package org.coderthoughts.primes.client;

import org.coderthoughts.primes.impl.PrimeNumbers;

public class PrimeClient {
    private PrimeNumbers primeGenerator = new PrimeNumbers();

    private void start() {
        new Thread(() -> {
            while (true) {
                System.out.print("First 10 primes: ");
                for (int i=0, p=1; i<10; i++) {
                    if (i > 0)
                        System.out.print(", ");
                    p = primeGenerator.nextPrime(p);
                    System.out.print(p);
                }
                System.out.println();
                try { Thread.sleep(1000); } catch (InterruptedException ie) {}
            }
        }).start();
    }

    public static void main(String[] args) {
        new PrimeClient().start();
    }
}
