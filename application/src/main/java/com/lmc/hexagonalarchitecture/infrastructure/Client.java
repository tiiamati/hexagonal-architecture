package com.lmc.hexagonalarchitecture.infrastructure;

import com.lmc.hexagonalarchitecture.domain.Domain;
import com.lmc.hexagonalarchitecture.mapper.DomainMapper;
import com.lmc.hexagonalarchitecture.port.IClient;
import org.springframework.stereotype.Service;

@Service
public class Client implements IClient {
    @Override
    public Domain get(String domain) {
        return DomainMapper.toDomain(domain);
    }

    @Override
    public Domain add(Domain domain) {
        return DomainMapper.toDomain(domain);
    }
}
