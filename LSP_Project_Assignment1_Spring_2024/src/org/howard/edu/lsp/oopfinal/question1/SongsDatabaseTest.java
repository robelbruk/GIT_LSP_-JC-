package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @BeforeEach
    void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
    }

    @Test
    void testAddSong() {
        db.addSong("Rap", "Gin and Juice");
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));
    }

    @Test
    void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Unknown Song"));
    }

    @Test
    void testGetSongs() {
        Set<String> jazzSongs = db.getSongs("Jazz");
        assertTrue(jazzSongs.contains("Always There"));
        assertEquals(1, jazzSongs.size());
    }
}
