package org.example.behavioral.cor.handler;

import org.example.behavioral.cor.repository.UserRepository;

public class ValidPasswordHandler extends Handler {
    private final UserRepository userRepository;

    public ValidPasswordHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!userRepository.checkPassword(username, password)) {
            System.out.println("The password is incorrect!");
            return false;
        }
        return handleNext(username, password);
    }
}
