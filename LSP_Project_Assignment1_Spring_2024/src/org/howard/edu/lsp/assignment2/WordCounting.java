package org.howard.edu.lsp.assignment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
//import java.util.Map;

public class WordCounting {
	
	public static void main(String[] args) {
		String filePath = "src/org/howard/edu/lsp/assignment2/words.txt"; // Relative Path
		
		// HashMap to store word counts
		HashMap<String, Integer> wordCounts = new HashMap<>();
		
		try {
			// Reads each line of the file
			Files.lines(Paths.get(filePath))
				.forEach(line -> {
					// Convert to lowercase and split into words, filtering out non-letter characters
					String [] words = line.toLowerCase().split("[^a-z']+");
					for (String word : words) {
						if (word.length() > 3 && !word.matches(".*\\d.*")) { // Check word length and numeric
							wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
						}
					}
				});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Print the word counts
		System.out.println("Word counts:");
		wordCounts.forEach((word, count) -> System.out.println(word + ":" + count));
	}

}
