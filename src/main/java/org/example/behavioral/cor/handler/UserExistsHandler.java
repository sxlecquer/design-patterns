package org.example.behavioral.cor.handler;

import org.example.behavioral.cor.repository.UserRepository;

public class UserExistsHandler extends Handler {
    private final UserRepository userRepository;

    public UserExistsHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!userRepository.checkUsername(username)) {
            System.out.println("There is no user with such username. Sign up!");
            return false;
        }
        return handleNext(username, password);
    }
}
