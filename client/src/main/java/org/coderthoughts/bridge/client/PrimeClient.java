package org.coderthoughts.bridge.client;

import org.coderthoughts.bridge.impl.PrimeNumbers;

public class PrimeClient {
    private PrimeNumbers primeGenerator = new PrimeNumbers();

    private void start() {
        System.out.println("First 10 primes:");
        for (int i=0, p=1; i<10; i++) {
            p = primeGenerator.nextPrime(p);
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        new PrimeClient().start();
    }
}
