package org.subieslaw.domain;

import java.time.*;
import java.util.UUID;

public class ClientProfileBuilder {

    private final UUID id = UUID.randomUUID();
    private String name;
    private final LocalDateTime creationTime = LocalDateTime.now();

    public ClientProfileBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ClientProfile createClientProfile() {
        return new ClientProfile(id, name, creationTime);
    }
}