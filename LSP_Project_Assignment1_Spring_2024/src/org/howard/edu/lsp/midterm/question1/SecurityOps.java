package org.howard.edu.lsp.midterm.question1;

/**
 * A class containing methods for text encryption.
 */
public class SecurityOps {
    /**
     * Encrypts a given text by rearranging characters based on their indices.
     * Even-indexed characters are placed before odd-indexed characters,
     * ignoring punctuation and whitespace.
     *
     * @param text The text to be encrypted.
     * @return The encrypted text.
     */
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        // Iterate through even-indexed characters
        for (int i = 0; i < text.length(); i += 2) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                encryptedText.append(ch);
            }
        }
        // Iterate through odd-indexed characters
        for (int i = 1; i < text.length(); i += 2) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                encryptedText.append(ch);
            }
        }
        return encryptedText.toString();
    }

    /**
     * Demonstrates the usage of the encrypt method by encrypting a sample text
     * and printing the result to the standard output.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        String text = "I love CSCI363";
        String encryptedText = encrypt(text);
        System.out.println(encryptedText);
    }
}
