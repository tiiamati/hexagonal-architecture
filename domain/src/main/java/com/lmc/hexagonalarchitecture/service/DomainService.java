package com.lmc.hexagonalarchitecture.service;

import com.lmc.hexagonalarchitecture.domain.Domain;
import com.lmc.hexagonalarchitecture.port.IClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainService {

    @Autowired
    private IClient iClient;

    public Domain getDomain(String domain) {
        return iClient.get(domain);
    }

    public Domain addDomain(Domain domain) {
        return iClient.add(domain);
    }
}
