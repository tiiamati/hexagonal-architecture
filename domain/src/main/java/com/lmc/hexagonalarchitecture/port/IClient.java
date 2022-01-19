package com.lmc.hexagonalarchitecture.port;

import com.lmc.hexagonalarchitecture.domain.Domain;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface IClient {
    Domain get(String domain);
    Domain add(Domain domain);
}
