package org.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public void main() {
        boolean[] primes = new boolean[(int) 1e6];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        int lim = (int) 1e6;

        for (int i = 2; i < lim; i++) {
            if (primes[i]) {
                for (int j = 2 * i; j < lim; j += i) {
                    primes[j] = false;
                }
            }
        }

        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }
    }
}

public class PrimeNumberInRange {
    public static void main(String[] args) {
        new Solution().main();
    }
}
