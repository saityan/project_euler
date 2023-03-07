package project_euler;

/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class euler_6 {
    public static void main(String[] args) {
        int n = 100;
        int dif = 0;

        //square of the sum contains squares of the numbers, thus
        //dif = 2 * ((1 * 2) + (1 * 3) + ... + (99 * 100))
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    continue;
                dif += i * j;
            }
        }
        System.out.println(dif);
    }
}
