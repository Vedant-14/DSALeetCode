package Stacks;

public class StackException extends Exception{
    // This is the child class of Exception
    public StackException(String message) {
        // This calls the cunstructor of parent class Exception using super method
        super(message);
    }
}
