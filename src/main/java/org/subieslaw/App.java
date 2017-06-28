package org.subieslaw;

import org.subieslaw.domain.ClientProfile;

import javax.ws.rs.*;

@Path("kycrulez")
public class App {

    @GET
    @Produces("application/json")
    public ClientProfile getClientProfile(@QueryParam("kyc") String clientName) {
        return ClientProfile.create(clientName);
    }

}
