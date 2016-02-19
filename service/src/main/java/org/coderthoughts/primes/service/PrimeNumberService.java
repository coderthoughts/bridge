package org.coderthoughts.primes.service;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface PrimeNumberService {
    String getServiceName();
    int nextPrime(int n);
}
