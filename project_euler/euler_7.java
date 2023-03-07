package project_euler;

import java.util.ArrayList;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 */

public class euler_7 {
    public static void main(String[] args) {
        int n = 10001;

        ArrayList<Integer> listOfPrimes = new ArrayList<>();
        listOfPrimes.add(2);
        listOfPrimes.add(3);

        int index = 2;
        while (index < n) {
            listOfPrimes.add(getNextPrime(listOfPrimes));
            index++;
        }

        System.out.println(listOfPrimes.get(listOfPrimes.size() - 1));
    }

    private static int getNextPrime(ArrayList<Integer> list) {
        if (list.size() < 1)
            return -1;
        int candidate = list.get(list.size() - 1) + 2;
        while(!checkCandidate(candidate, list)) {
            candidate += 2;
        }
        return candidate;
    }

    private static boolean checkCandidate(int candidate, ArrayList<Integer> list) {
        for (int n : list) {
            if (n > Math.floor(Math.sqrt(candidate)))
                return true;
            if (candidate % n == 0)
                return false;
        }
        return true;
    }
}
