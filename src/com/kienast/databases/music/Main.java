package com.kienast.databases.music;

import com.kienast.databases.music.model.Artist;
import com.kienast.databases.music.model.Datasource;
import com.kienast.databases.music.model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // open datasource
        Datasource datasource = new Datasource();

        if (!datasource.open()) {
            System.err.println("Can't open datasource");
            return;
        }

        // get all artists
        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);

        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        artists.forEach(a -> {
            System.out.println(a.getId() + " | " + a.getName());
        });

        // get all albums of artist
        List<String> albumNames = datasource.queryAlbumsForArtist("Pink Floyd", Datasource.ORDER_BY_DESC);

        if (albumNames == null) {
            System.out.println("No albums!");
            return;
        }

        albumNames.forEach(System.out::println);

        // get all artist with song name
        List<SongArtist> songArtists = datasource.queryArtistForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);

        if (songArtists == null) {
            System.out.println("No artists for song!");
            return;
        }

        songArtists.forEach(sa -> {
            System.out.println(sa.getArtistName() + " | " + sa.getAlbumName() + " | " + sa.getTrack());
        });

        // get songs meta data
        datasource.querySongsMetaData();

        // get number of songs
        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("#Songs: " + count);

        // create view for artists
        datasource.createViewForSongArtists();

        // get all artist with song name
        List<SongArtist> songArtistsFromView = datasource.querySongInfoView("Go Your Own Way");

        if (songArtistsFromView == null || songArtistsFromView.isEmpty()) {
            System.out.println("No artists for song!");
            return;
        }

        songArtistsFromView.forEach(sa -> {
            System.out.println(sa.getArtistName() + " | " + sa.getAlbumName() + " | " + sa.getTrack());
        });

        // insert artist, album and song in one transaction
        datasource.insertSong("Like A Rolling Stone", "Bob Dylan", "Bob Dylan's Greatest Hits", 5);

        // close datasource
        datasource.close();
    }

}
