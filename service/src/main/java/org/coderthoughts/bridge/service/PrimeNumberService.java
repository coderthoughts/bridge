package org.coderthoughts.bridge.service;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface PrimeNumberService {
    int nextPrime(int n);
}
