package org.example.behavioral.cor;

import org.example.behavioral.cor.handler.Handler;
import org.example.behavioral.cor.handler.RoleCheckHandler;
import org.example.behavioral.cor.handler.UserExistsHandler;
import org.example.behavioral.cor.handler.ValidPasswordHandler;
import org.example.behavioral.cor.repository.UserRepository;
import org.example.behavioral.cor.service.AuthenticationService;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        Handler handler = new UserExistsHandler(repository);
        handler.setNextHandler(new ValidPasswordHandler(repository))
                .setNextHandler(new RoleCheckHandler());
        AuthenticationService service = new AuthenticationService(handler);

        service.login("admin", "admin123");
        System.out.println();
        service.login("admin", "wrong");
        System.out.println();
        service.login("wrong", "admin123");
        System.out.println();
        service.login("user", "password");
    }
}
