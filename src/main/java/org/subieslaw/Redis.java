package org.subieslaw;

import org.subieslaw.data.RedisService;
import org.subieslaw.domain.ClientProfile;
import javax.inject.Inject;
import javax.ws.rs.*;

@Path("redis")
public class Redis {

    @Inject
    private final
    RedisService redisService;

    @GET
    @Produces("application/json")
    public ClientProfile getClientProfile(@QueryParam("kyc") String clientName) {
        return redisService.readClientProfile(clientName);
    }

    @POST
    @Produces("application/json")
    public ClientProfile createAndPersistClientProfile(@QueryParam("kyc") String clientName) {
        return redisService.createAndPersistClientProfile(clientName);
    }


}
