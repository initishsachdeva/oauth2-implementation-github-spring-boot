package com.example.oauthimplementationspringboot.restcontrollers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/" )
    public String home(OAuth2AuthenticationToken token) {
        System.out.println(token.getDetails());
        System.out.println(token.getAuthorizedClientRegistrationId());
        System.out.println(token.getPrincipal());
        return "Hey User ! Welcome to Homepage!!";
    }
}