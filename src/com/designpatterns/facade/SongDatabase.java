package com.designpatterns.facade;

/**
 * Some database where we will store the songs. This can be remote or local.
 *
 *
 */
public class SongDatabase {
    public byte[] findSong(String song) {
        return "Some random song".getBytes();
    }
}
