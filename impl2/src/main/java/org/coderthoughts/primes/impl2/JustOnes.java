package org.coderthoughts.primes.impl2;

import org.coderthoughts.primes.service.PrimeNumberService;
import org.osgi.service.component.annotations.Component;

@Component(property="service.ranking:Integer=1")
public class JustOnes implements PrimeNumberService {
    @Override
    public String getServiceName() {
        return "JustOnes";
    }

    @Override
    public int nextPrime(int n) {
        return 1;
    }
}
