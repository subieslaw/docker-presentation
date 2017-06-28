package org.subieslaw.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class ClientProfile {

    private UUID id;
    private String name;
    private LocalDateTime creationTime;

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



}
