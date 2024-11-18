package Stacks;

public class DynamicStack extends CustomStack {
    // This Stack will never get full we will make it like that and elese its working will be same as CustomStack
    public DynamicStack() {
        super();  // Here it will call CustomStack(); without argument 
    }
    public DynamicStack(int size) {
        super(size); // Here it will call CustomStack(size); with argument
    }

    // In CustomStack we were just having the problem wiht push method 
    // So here we will just override that mehtod 
    // Here if the stack gets full we will make new Stack of double the size and copy all the elements in that 
    public boolean push(int item) {
        if(this.isFull()) { // Here this refers to object of DynamicStack
            int[] temp = new int[data.length*2];

            for(int i=0;i<data.length;i++) {
                // This loop is to copy the elements from data stack to temp stack 
                temp[i] = data[i];
            }
            data = temp;
             // to copy all the elements
        }
        // Here it will come when its not full 
        // Run the normal push method of customStack
        return super.push(item);
    }
}
