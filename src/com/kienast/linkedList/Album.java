package com.kienast.linkedList;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private boolean findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean addSong(String title, double duration) {
        if (!findSong(title)) {
            Song song = new Song(title, duration);
            songs.add(song);
            return true;
        }
        return false;
    }

    public boolean addSong(String title, double duration, int position) {
        if (!findSong(title)) {
            Song song = new Song(title, duration);
            for (int i = 0; i < songs.size(); i++) {
                if (i == position - 1) {
                    for (int j = songs.size(); j > i; j--) {
                        songs.set(j, songs.get(j-1));
                    }
                    songs.set(i, song);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
