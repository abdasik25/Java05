package by.epam.java.training.lomat.numbers.perfect;

public class PerfectNumber {

    public static boolean isPerfectNumber(long number) {
        long sumOfDivisors = 0;
        for (long i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return number == sumOfDivisors;
    }
}
