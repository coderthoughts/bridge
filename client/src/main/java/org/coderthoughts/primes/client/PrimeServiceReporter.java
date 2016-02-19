package org.coderthoughts.primes.client;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.coderthoughts.primes.service.PrimeNumberService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component
public class PrimeServiceReporter {
    private Set<PrimeNumberService> services = ConcurrentHashMap.newKeySet();

    @Reference(cardinality=ReferenceCardinality.MULTIPLE, policy=ReferencePolicy.DYNAMIC)
    public void bindPrimeNumberService(PrimeNumberService svc) {
        services.add(svc);
        printServices();
    }

    public void unbindPrimeNumberService(PrimeNumberService svc) {
        services.remove(svc);
        printServices();
    }

    private void printServices() {
        System.out.print("Services now: ");
        for (PrimeNumberService svc : services) {
            System.out.print(svc.getClass().getSimpleName() + "(" + svc.getServiceName() + ") ");
        }
        System.out.println();
    }
}
