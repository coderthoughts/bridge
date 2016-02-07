package org.coderthoughts.primes.impl2;

import org.coderthoughts.primes.service.PrimeNumberService;
import org.osgi.service.component.annotations.Component;

@Component
public class JustOnes implements PrimeNumberService {
    @Override
    public int nextPrime(int n) {
        return 1;
    }
}
