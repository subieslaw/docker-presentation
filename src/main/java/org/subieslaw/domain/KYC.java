package org.subieslaw.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class KYC {

    private UUID id;
    private String name;
    private LocalDateTime creationTime;

    KYC(UUID id, String name, LocalDateTime creationTime) {
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
