package org.subieslaw.domain;

import java.time.*;
import java.util.UUID;

public class ClientProfileBuilder {

    private UUID id = UUID.randomUUID();
    private String name;
    private LocalDateTime creationTime = LocalDateTime.now();

    public ClientProfileBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ClientProfile createKYC() {
        return new ClientProfile(id, name, creationTime);
    }
}