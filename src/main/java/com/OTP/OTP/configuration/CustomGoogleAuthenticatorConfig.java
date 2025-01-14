package com.OTP.OTP.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.OTP.OTP.service.CredentialRepository;
import com.warrenstrange.googleauth.GoogleAuthenticator;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class CustomGoogleAuthenticatorConfig {
    private final CredentialRepository credentialRepository;

    @Bean
    public GoogleAuthenticator gAuth() {
        GoogleAuthenticator googleAuthenticator = new GoogleAuthenticator();
        googleAuthenticator.setCredentialRepository(credentialRepository);
        return googleAuthenticator;
    }

}
