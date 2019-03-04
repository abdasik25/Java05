package by.epam.java.training.lomat.coins;

public class Main {

    public static void main(String[] args) {

        int numberOfHeads = HeadsOrTrails.countNumberOfHeads();

        System.out.println("Coin is flipped " + HeadsOrTrails.NUMBER_OF_FLIPS + " times.\nThe result is: " + numberOfHeads
                + " heads and " + (HeadsOrTrails.NUMBER_OF_FLIPS - numberOfHeads) + " trails.");
    }
}
