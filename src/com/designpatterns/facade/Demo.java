package com.designpatterns.facade;

public class Demo {
    public static void main(String[] args) {

        //The clients can simply use the library without worrying about the authorization, searching the database
        //or additional activities (like decompression etc)
        SongLibrary songLibrary = new SongLibrary(new SongDatabase(), new MusicParser(), new AuthoriserService());

        songLibrary.playSong("Balle balle", "himanshu");
    }
}
