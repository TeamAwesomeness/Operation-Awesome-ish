package exceptions;

public class ProgramControlException extends Exception {
    
    public ProgramControlException() {
        System.out.println("I'm sorry, you've typed the wrong character. Please type again.");
    }

    public ProgramControlException(String message) {
        super(message);
    }

    public ProgramControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProgramControlException(Throwable cause) {
        super(cause);
    }

    public ProgramControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
