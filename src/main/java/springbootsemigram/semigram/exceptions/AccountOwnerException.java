package springbootsemigram.semigram.exceptions;

public class AccountOwnerException extends Exception {
    public AccountOwnerException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountOwnerException(Throwable cause) {
        super(cause);
    }
}
