package pro.sky.registration.exceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message){
        super(message);
    }
}
