package academy.devdojo.exceptions.error;

public class LoginInvalidException extends RuntimeException{

    public LoginInvalidException(){};

    public LoginInvalidException(String message){
       super(message);
    }

}
