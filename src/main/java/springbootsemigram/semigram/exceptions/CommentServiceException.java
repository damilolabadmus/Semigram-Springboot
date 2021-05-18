package springbootsemigram.semigram.exceptions;

public class CommentServiceException extends Exception {
    public CommentServiceException(String message) {
        super(message);
    }

    public CommentServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
