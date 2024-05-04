package org.example.structural.decorator.notifier.decorators;

import org.example.structural.decorator.notifier.INotifier;
import org.example.structural.decorator.repository.UserRepository;

public abstract class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapped;
    protected UserRepository userRepository;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        this.userRepository = new UserRepository();
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
