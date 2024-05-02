package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, Set<String>> genreToSongsMap = new HashMap<>();
    private Map<String, String> songToGenreMap = new HashMap<>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        genreToSongsMap.putIfAbsent(genre, new HashSet<>());
        genreToSongsMap.get(genre).add(songTitle);
        songToGenreMap.put(songTitle, genre);
    }

    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        return songToGenreMap.get(songTitle);
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        return genreToSongsMap.getOrDefault(genre, new HashSet<>());
    }
}
