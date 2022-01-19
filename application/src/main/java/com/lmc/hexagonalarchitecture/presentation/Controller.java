package com.lmc.hexagonalarchitecture.presentation;

import com.lmc.hexagonalarchitecture.mapper.DomainMapper;
import com.lmc.hexagonalarchitecture.presentation.representation.DomainRepresentation;
import com.lmc.hexagonalarchitecture.presentation.representation.DomainRequestRepresentation;
import com.lmc.hexagonalarchitecture.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private DomainService domainService;;

    @GetMapping("/domains/{domain}")
    public ResponseEntity<DomainRepresentation> getDomain(@PathVariable("domain") String domain) {
        return ResponseEntity.ok().body(
                DomainMapper.toRepresentation(
                        domainService.getDomain(domain)
                )
        );
    }

    @PostMapping("/domains")
    public ResponseEntity<DomainRepresentation> addDomain(@PathVariable("domain") DomainRequestRepresentation domain) {
        return ResponseEntity.ok().body(
                DomainMapper.toRepresentation(
                        domainService.addDomain(
                                DomainMapper.toDomain(domain)
                        )
                )
        );
    }

}
