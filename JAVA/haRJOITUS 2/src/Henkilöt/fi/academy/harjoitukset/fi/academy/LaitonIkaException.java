package Henkilöt.fi.academy.harjoitukset.fi.academy;


public class LaitonIkaException extends RuntimeException{
    public LaitonIkaException() {
        super("laiton ikä");
    }

    public LaitonIkaException(String message) {
        super(message);
    }

    public LaitonIkaException(String message, Throwable cause) {
        super(message, cause);
    }

    public LaitonIkaException(Throwable cause) {
        super(cause);
    }

    public LaitonIkaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
