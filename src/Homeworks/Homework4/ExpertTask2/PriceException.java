package Homeworks.Homework4.ExpertTask2;

public class PriceException extends  Exception{
    public PriceException() {
    }

    public PriceException(String message) {
        super(message);
    }

    public PriceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PriceException(Throwable cause) {
        super(cause);
    }

    public PriceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
