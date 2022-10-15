package com.kienast.intro.playingCats;

public class PlayingCats {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature < 25) {
            System.out.println("It's too cold outside for the cats to play.");
            return false;
        }

        if ((summer && temperature <= 45) || (!summer && temperature <= 35)) {
            System.out.println("It's nice outside so the cats are playing.");
            return true;
        }

        System.out.println("It's too hot outside for the cats to play.");
        return false;
    }

}
