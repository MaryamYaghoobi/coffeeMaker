package ir.dotin.exception;

public class ViolatedUpperBoundException extends Exception {
    public ViolatedUpperBoundException(){}
    public ViolatedUpperBoundException(String message){
        super(message);
    }
}
