package org.example.behavioral.cor.service;

import org.example.behavioral.cor.handler.Handler;

public class AuthenticationService {
    private final Handler handler;

    public AuthenticationService(Handler handler) {
        this.handler = handler;
    }

    public void login(String username, String password) {
        if(handler.handle(username, password)) {
            System.out.println("Logged in successfully!");
        } else {
            System.out.println("Error page is loaded!");
        }
    }
}
