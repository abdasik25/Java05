package by.epam.java.training.lomat.coins;

import java.util.Random;

public class HeadsOrTrails {

    public static int NUMBER_OF_FLIPS = 2000;


    private static boolean getRandomResult() {
        return (new Random().nextBoolean());
    }


    public static int countNumberOfHeads() {

        int numberOfHeads = 0;

        for (int i = 0; i < NUMBER_OF_FLIPS; i++) {
            if (getRandomResult() == true) {
                numberOfHeads++;
            }
        }

        return numberOfHeads;
    }
}
