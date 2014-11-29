package exceptions;

public class InventoryControlException extends Exception {
    
    public InventoryControlException() {
        System.out.println("I'm sorry, you've typed the wrong character. Please type again.");
    }

    public InventoryControlException(String message) {
        super(message);
    }

    public InventoryControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryControlException(Throwable cause) {
        super(cause);
    }

    public InventoryControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
