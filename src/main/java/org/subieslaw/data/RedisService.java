package org.subieslaw.data;

import com.google.gson.Gson;
import org.subieslaw.domain.ClientProfile;
import redis.clients.jedis.Jedis;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class RedisService {

    private Jedis redis;

    @PostConstruct
    public void setupDatabase(){
        redis = new Jedis("redis");
    }

    private void save(ClientProfile clientProfile){
        redis.set(clientProfile.getId().toString(), new Gson().toJson(clientProfile));
    }

    public ClientProfile readClientProfile(String clientName) {
        String redisValue = redis.get(clientName);
        return new Gson().fromJson(redisValue,ClientProfile.class);
    }

    public ClientProfile createAndPersistClientProfile(String clientName) {
        ClientProfile clientProfile = ClientProfile.create(clientName);
        save(clientProfile);
        return clientProfile;

    }
}
