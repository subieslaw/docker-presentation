package org.subieslaw;

import org.subieslaw.domain.KYC;
import org.subieslaw.domain.KYCBuilder;

import javax.ws.rs.*;

@Path("kycrulez")
public class App {

    @GET
    @Produces("application/json")
    public KYC getHtml(@PathParam("kyc") String clientName) {
        return new KYCBuilder().setName(clientName).createKYC();
    }

}
