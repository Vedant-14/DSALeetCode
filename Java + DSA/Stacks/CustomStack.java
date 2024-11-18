package Stacks;
public class CustomStack {
    // Stack is nothing but an array 
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    
    //Stack will have an pointer to add and delete the element from the stack
    int ptr = -1;

    // Custructors 
    public CustomStack() {
        // This will call the cunstructor with the Size
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    // FUNCTION TO ADD THE ITEM IN THE STACK 
    public boolean push(int num) throws StackException{
        if(isFull()) {
            throw new StackException("Cannot Insert in Full Stack");
        }
        ptr++;
        data[ptr] = num;
        return true;
    }
    public boolean isFull() {
        if(ptr==data.length-1) {
            return true;
        }
        return false;
    }

    // FUNCTION TO REMOVE ELEMENT FROM THE STACK 
    public int pop() throws StackException{
        if(isEmpty()) {
            throw new StackException("Cannot pop from Empty Stack");
        }
        int var = data[ptr];
        ptr--;
        return var;
    }
    public boolean isEmpty() {
        // if this expression is true then it will return true else will return false
        return ptr==-1;
    }

    // FUNCTION WHICH RETURNS PEEK ELEMENT OF STACK 
    public int peek() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot peek in the empty Stack");
        }
        return data[ptr];
    }
}

