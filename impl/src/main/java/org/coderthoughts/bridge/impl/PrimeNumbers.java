package org.coderthoughts.bridge.impl;

public class PrimeNumbers {
    // Courtesy of http://stackoverflow.com/a/22083190
    public int nextPrime(int n) {
        boolean isPrime = false;

        if (n == 1)
            return 2;
        int start = 2; // start at 2

        while (!isPrime) {
            // always increment n at the beginning to check a new number
            n += 1;
            // redefine max boundary here
            int m = (int) Math.ceil(Math.sqrt(n));

            isPrime = true;
            // increment i by 1, not 2 (you're skipping numbers...)
            for (int i = start; i <= m; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return n;
    }

    // Courtesy of http://stackoverflow.com/a/20798440
    public boolean isPrime(int num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
