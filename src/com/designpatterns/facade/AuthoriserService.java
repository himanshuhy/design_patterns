package com.designpatterns.facade;

/**
 * Checks if a given user has access to the song or not.
 */
public class AuthoriserService {
    public boolean isUserAllowed(String song, String user) {
        return true;
    }
}
