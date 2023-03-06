package project_euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class euler_5 {
    public static void main(String[] args) {
        int n = 1;

        //The desired number can't be smaller than the result of primes
        int[] primes = {3, 5, 7, 11, 13, 17, 19};
        for (int k: primes) {
            n = n * k;
        }

        //If the umber is odd, make it even
        //This guarantees that the number is evenly divisible by 6, 10, 14 and 15 (the result of primes 3 and 5)
        if (n % 2 != 0)
            n = n * 2;
        if (n % 9 != 0)
            n = n * 3;
        if (n % 4 != 0)
            n = n * 2;
        if (n % 8 != 0)
            n = n * 2;
        if (n % 16 != 0)
            n = n * 2;
        System.out.println(n);
    }
}
