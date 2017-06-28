package org.subieslaw.domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class ClientProfile {

    private final UUID id;
    private final String name;
    private final Date creationTime;

    ClientProfile(UUID id, String name, Date creationTime) {
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

    public Date getCreationTime() {
        return (Date) creationTime.clone();
    }

    public static ClientProfile create(String clientName){
        return new ClientProfileBuilder().setName(clientName).createClientProfile();
    }

}
