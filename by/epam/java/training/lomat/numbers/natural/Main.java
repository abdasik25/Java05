package by.epam.java.training.lomat.numbers.natural;

public class Main {

    public static int NUMBER1 = 131131;
    public static int NUMBER2 = 952;
    public static void main(String[] args) {


        System.out.println("Greatest common divisor of " + NUMBER1 + " and " + NUMBER2 + ": "
                + NaturalNumbers.greatestCommonDivisor(NUMBER1, NUMBER2)
                + "\nPrime divisors of " + NUMBER1 + ": "
                + NaturalNumbers.findAllPrimeDivisors(NUMBER1)
                + " \nBiggest digit of " + NUMBER1 + ": "
                + NaturalNumbers.findBiggestDigit(NUMBER1)
                + "\nLeast common multiple of " + NUMBER1 + " and " + NUMBER2 + ": "
                + NaturalNumbers.leastCommonMultiple(NUMBER1, NUMBER2)
                + "\nNumber of different digits in " + NUMBER1 + ": "
                + NaturalNumbers.findNumberOfDifferentDigits(NUMBER1)
                + "\nIs " + NUMBER1 + " a palindrome? "
                + ((NaturalNumbers.isPalindrome(NUMBER1)) ? "Yes" : " No")
                + "\nIs" + NUMBER2 + "a prime number? "
                + ((NaturalNumbers.isPrimeNumber(NUMBER2)) ? "Yes" : " No"));

    }
}
