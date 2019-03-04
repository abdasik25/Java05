package by.epam.java.training.lomat.numbers.perfect;

public class Main {

    public static long NUMBER = 33550336L;

    public static void main(String[] args) {
        System.out.println("Is " + NUMBER + " a perfect number? "
                + ((PerfectNumber.isPerfectNumber(NUMBER)) ? "Yes" : "No"));
    }
}
