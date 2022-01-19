package com.lmc.hexagonalarchitecture.mapper;

import com.lmc.hexagonalarchitecture.domain.Domain;
import com.lmc.hexagonalarchitecture.presentation.representation.DomainRepresentation;
import com.lmc.hexagonalarchitecture.presentation.representation.DomainRequestRepresentation;

public class DomainMapper {

    public static Domain toDomain(String domain) {
        return Domain.builder()
                .domain(domain)
                .build();
    }

    public static Domain toDomain(DomainRequestRepresentation domain) {
        return Domain.builder()
                .domain(domain.domain)
                .build();
    }

    public static Domain toDomain(Domain domain) {
        return Domain.builder()
                .domain(domain.getDomain())
                .build();
    }

    public static DomainRepresentation toRepresentation(Domain domain) {
        return DomainRepresentation.builder()
                .domain(domain.getDomain())
                .build();
    }
}
