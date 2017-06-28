package org.subieslaw;

import com.google.gson.Gson;
import org.subieslaw.domain.ClientProfile;
import redis.clients.jedis.Jedis;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ws.rs.*;

@Stateless
@Path("redis")
public class Redis {

    private Jedis redis = new Jedis("redis");

    public Redis() { }

    @GET
    @Produces("application/json")
    public ClientProfile getClientProfile(@QueryParam("kyc") String clientName) {
        return readClientProfile(clientName);
    }

    @POST
    @Produces("application/json")
    public ClientProfile createAndPersistClientProfile(@QueryParam("kyc") String clientName) {
        return createAndPersist(clientName);
    }

    private void save(ClientProfile clientProfile){
        redis.set(clientProfile.getId().toString(), new Gson().toJson(clientProfile));
    }

    private ClientProfile readClientProfile(String clientName) {
        String redisValue = redis.get(clientName);
        return new Gson().fromJson(redisValue,ClientProfile.class);
    }

    private ClientProfile createAndPersist(String clientName) {
        ClientProfile clientProfile = ClientProfile.create(clientName);
        save(clientProfile);
        return clientProfile;

    }

}
