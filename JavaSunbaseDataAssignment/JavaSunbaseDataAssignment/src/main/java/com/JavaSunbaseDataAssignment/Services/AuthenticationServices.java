package com.JavaSunbaseDataAssignment.Services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationServices {
    public boolean authenticate(String loginId, String password){
        boolean isValidLoginId = loginId.equalsIgnoreCase("test@sunbasedata.com");
        boolean isValidPassword = password.equalsIgnoreCase("Test@123");

        return isValidPassword && isValidLoginId ;
    }
}
