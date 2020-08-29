package com.designpatterns.facade;

/**
 * Playing a given song will involve multiple smaller tasks. We dont wanna expose them to the clients.
 * Rather make a simple interface that he can use.
 */
public class SongLibrary {
    private final SongDatabase database;
    private final MusicParser parser;
    private final AuthoriserService authoriserService;
    public SongLibrary(SongDatabase database, MusicParser parser, AuthoriserService service) {
        this.database = database;
        this.parser = parser;
        this.authoriserService = service;
    }
    public void playSong(String song, String user) {
        if (!authoriserService.isUserAllowed(song, user)) {
            return;
        }
        final byte[] songBytes = database.findSong(song);
        //alternatively if not found, it can fetch some remote server too. or provide alternate songs
        parser.parse(songBytes);
    }
}
