package com.overpayment.models;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5960756030063141940L;
	private final String jwt;
	private final String userName;

    public AuthenticationResponse(String jwt,String userName) {
        this.jwt = jwt;
        this.userName = userName;
    }

    public String getJwt() {
        return jwt;
    }

	public String getUserName() {
		return userName;
	}
    
    
}
