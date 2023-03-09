package project_euler;

/**
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class euler_9 {
    public static void main(String[] args) {
        int n = 1000;

        /* easy to show, that
         * c = n/2 - ab/n, thus
         * ab % n = 0
         */

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (
                    i > j &
                    i * j > n &
                    (i * j) % n == 0
                ) {
                    int c = (n / 2) - (i * j) / n;
                    if (i * i + j * j == c * c) {
                        System.out.println((long) i * j * c);
                        return;
                    }
                }
            }
        }
    }
}
