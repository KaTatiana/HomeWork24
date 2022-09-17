package pro.sky.registration.exceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message){
        super(message);
    }
}
