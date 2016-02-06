package org.coderthoughts.bridge.client;

import org.coderthoughts.bridge.impl.PrimeNumbers;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class PrimeClient {
    @Reference
    private PrimeNumbers primeGenerator;

    @Activate
    private void start() {
        System.out.println("First 10 primes:");
        for (int i=0, p=1; i<10; i++) {
            p = primeGenerator.nextPrime(p);
            System.out.println(p);
        }
    }
}
