package com.example.demo.secure;

import java.security.Principal;

import org.eclipse.microprofile.jwt.Claim;
import org.eclipse.microprofile.jwt.ClaimValue;
import org.eclipse.microprofile.jwt.JsonWebToken;

import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.SecurityContext;

/**
 *
 */
@Path("/protected")
@RequestScoped
public class ProtectedController {

    @Inject
    @Claim("custom-value")
    private ClaimValue<String> custom;

 
    @GET
    @RolesAllowed({"advanced","protected"}) 
    public String getJWTBasedValue(@Context SecurityContext sec) {
        Principal user = sec.getUserPrincipal();
        JsonWebToken jwtToken = (JsonWebToken)user;
        return "Protected Resource; Custom value : " + custom.getValue() + " ユーザーの情報は:" + user ;
    }
}
