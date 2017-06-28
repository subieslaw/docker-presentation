package org.subieslaw;

import org.subieslaw.domain.ClientProfile;
import org.subieslaw.domain.ClientProfileBuilder;

import javax.ws.rs.*;

@ApplicationPath("/")
@Path("kycrulez")
public class App {

    @GET
    @Produces("application/json")
    public ClientProfile getClientProfile(@QueryParam("kyc") String clientName) {
        return new ClientProfileBuilder().setName(clientName).createKYC();
    }

}
