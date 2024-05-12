package org.example.behavioral.cor.handler;

public class RoleCheckHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        if(username.equals("admin")) {
            System.out.println("Admin page is loaded!");
            return true; // stop passing the request along the chain
        }
        System.out.println("Default page is loaded!");
        return handleNext(username, password);
    }
}
