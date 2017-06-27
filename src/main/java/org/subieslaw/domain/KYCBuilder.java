package org.subieslaw.domain;

import java.time.*;
import java.util.UUID;

public class KYCBuilder {

    private UUID id = UUID.randomUUID();
    private String name;
    private LocalDateTime creationTime = LocalDateTime.now();

    public KYCBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public KYC createKYC() {
        return new KYC(id, name, creationTime);
    }
}