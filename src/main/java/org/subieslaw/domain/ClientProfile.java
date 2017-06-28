package org.subieslaw.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class ClientProfile {

    private final UUID id;
    private final String name;
    private final LocalDateTime creationTime;

    ClientProfile(UUID id, String name, LocalDateTime creationTime) {
        this.id = id;
        this.name = name;
        this.creationTime = creationTime;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public static ClientProfile create(String clientName){
        return new ClientProfileBuilder().setName(clientName).createClientProfile();
    }

}
