package org.coderthoughts.bridge.impl;

import org.coderthoughts.bridge.service.PrimeNumberService;
import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Component;

@ProviderType
@Component
public class PrimeNumbers implements PrimeNumberService {
    // Courtesy of http://stackoverflow.com/a/22083190
    public int nextPrime(int n) {
        boolean isPrime = false;

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
}
