package by.epam.java.training.lomat.numbers.natural;

public class NaturalNumbers {


    public static int findBiggestDigit(int number) {

        int biggestDigit = 0;

        while (number != 0) {
            if (number % 10 > biggestDigit) {
                biggestDigit = number % 10;
                number = (number - biggestDigit) / 10;
            } else {
                number = (number - number % 10) / 10;
            }
        }
        return biggestDigit;
    }

    public static boolean isPalindrome(int number) {

        int reversedNumber = 0;
        int originalNumber = number;
        int temp;
        while (originalNumber != 0) {
            temp = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + temp;
            originalNumber /= 10;
        }
        if (number == reversedNumber) {
            return true;
        }
        return false;

    }

    public static boolean isPrimeNumber(int number) {

        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String findAllPrimeDivisors(int number) {

        String result = "";

        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && isPrimeNumber(i)) {
                result += i + " ";
            }

        }

        return result;
    }

    public static int greatestCommonDivisor(int x, int y) {
        return (y == 0) ? x : greatestCommonDivisor(y, x % y);
    }

    public static int leastCommonMultiple(int x, int y) {
        return (x * y) / greatestCommonDivisor(x, y);
    }

    public static int findNumberOfDifferentDigits(int number) {
        int uniqueDigits = 0;
        for (int i = 0; i < 10; ++i) {
            int numberTemp = number;
            while (numberTemp != 0) {
                if (numberTemp % 10 == i) {
                    ++uniqueDigits;
                    break;
                }
                numberTemp /= 10;
            }
        }
        return uniqueDigits;
    }
}

