package com.kienast.databases.music;

import com.kienast.databases.music.model.Artist;
import com.kienast.databases.music.model.Datasource;
import com.kienast.databases.music.model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();

        if (!datasource.open()) {
            System.err.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);

        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        artists.forEach(a -> {
            System.out.println(a.getId() + " | " + a.getName());
        });

        List<String> albumNames = datasource.queryAlbumsForArtist("Pink Floyd", Datasource.ORDER_BY_DESC);

        if (albumNames == null) {
            System.out.println("No albums!");
            return;
        }

        albumNames.forEach(System.out::println);

        List<SongArtist> songArtists = datasource.queryArtistForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);

        if (songArtists == null) {
            System.out.println("No artists for song!");
            return;
        }

        songArtists.forEach(sa -> {
            System.out.println(sa.getArtistName() + " | " + sa.getAlbumName() + " | " + sa.getTrack());
        });

        datasource.querySongsMetaData();

        datasource.close();
    }

}
