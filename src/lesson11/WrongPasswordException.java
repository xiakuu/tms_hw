package lesson11;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String text){
        super(text);
    }
    public WrongPasswordException(){
    }
}
