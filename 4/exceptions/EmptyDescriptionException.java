package exceptions;

public class EmptyDescriptionException extends RuntimeException {
    public EmptyDescriptionException(String message) {
        super(message);
    }
}
