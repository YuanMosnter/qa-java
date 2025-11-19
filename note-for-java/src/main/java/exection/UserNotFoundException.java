package exection;

public class UserNotFoundException extends BaseException {
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super( cause);
    }
    public UserNotFoundException(String message) {
        super( message);
    }
}
