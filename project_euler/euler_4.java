package project_euler;

import java.util.ArrayList;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class euler_4 {
    public static void main(String[] args) {
        ArrayList<Integer> palindromesList = new ArrayList<>();
        int candidate;

        for (int l = 100; l < 1000; l++) {
            for (int m = 100; m < 1000; m++) {
                candidate = l * m;
                if (isPalindrome(candidate))
                    palindromesList.add(candidate);
            }
        }

        int max = 0;
        for (int n: palindromesList) {
            if (n > max)
                max = n;
        }
        System.out.println(max);
    }

    private static boolean isPalindrome(int n) {
        if (n < 100000 || n > 998001) {
            return false;
        }

        String[] numbers = String.valueOf(n).split("(?!^)");
        if (n >= 100000) {
            return numbers[0].equals(numbers[5]) && numbers[1].equals(numbers[4]) && numbers[2].equals(numbers[3]);
        } else
            return numbers[0].equals(numbers[4]) && numbers[1].equals(numbers[3]);
    }
}
