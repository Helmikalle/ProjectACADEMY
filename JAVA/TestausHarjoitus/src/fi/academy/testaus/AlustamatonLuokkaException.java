package fi.academy.testaus;

/**
 * Created by Administrator on 5.10.2017.
 */
public class AlustamatonLuokkaException extends RuntimeException {
    public AlustamatonLuokkaException() {
    }

    public AlustamatonLuokkaException(String message) {
        super(message);
    }

    public AlustamatonLuokkaException(String message, Throwable cause) {
        super(message, cause);
    }
}
