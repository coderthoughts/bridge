package org.coderthoughts.primes.client;

import org.coderthoughts.primes.service.PrimeNumberService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicyOption;

@Component
public class PrimeClient {
    @Reference(policyOption=ReferencePolicyOption.GREEDY)
    private PrimeNumberService primeGenerator;

    private volatile boolean keepRunning = false;

    @Activate
    private void start() {
        keepRunning = true;
        new Thread(() -> {
            while (keepRunning) {
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

    @Deactivate
    private void stop() {
        keepRunning = false;
    }
}
