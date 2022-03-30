package cz.trask.mnemeckova.training.spring.employeemanager.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);

    }
}
