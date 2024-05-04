package org.example.structural.decorator.notifier;

import org.example.structural.decorator.repository.UserRepository;

public class Notifier implements INotifier {
    private final UserRepository userRepository;
    private final String username;

    public Notifier(String username) {
        this.username = username;
        this.userRepository = new UserRepository();
    }

    @Override
    public void send(String message) {
        String mail = userRepository.getMailByUsername(username);
        System.out.println("The message '" + message + "' was sent to " + mail + "!");
    }

    @Override
    public String getUsername() {
        return username;
    }
}
