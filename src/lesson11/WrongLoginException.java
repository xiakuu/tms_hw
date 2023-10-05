package lesson11;

public class WrongLoginException extends Exception{
    public WrongLoginException(String text){
        super(text);
    }

    public WrongLoginException(){
    }
}
