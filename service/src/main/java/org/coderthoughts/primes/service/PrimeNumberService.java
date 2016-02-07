package org.coderthoughts.primes.service;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface PrimeNumberService {
    int nextPrime(int n);
}
