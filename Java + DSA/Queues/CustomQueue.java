package Queues;

public class CustomQueue {
    private int[] data;
    private  static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    // Pointer of the queue
    int end = 0;

    public boolean isFull() {
        if(end==data.length) {
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if(end==-1) {
            return true;
        }
        return false;
    }

    // FUNCTION TO INSERT ELEMENT IN THE QUEUE 
    public boolean insert(int item) throws Exception {
        if(isFull()) {
            throw new Exception("Queue is Already Full");
        }
        data[end++] = item;
        return true;
    }

    // FUNCTION TO REMOVE ELEMENT FROM THE QUEUE 
    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot Delete from Empty Queue");
        }
        int removed = data[0];

        // You need to shift other elements to left side by 1 
        for(int i=1;i<=end;i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public void printQueue() {
        for(int i=0;i<end;i++) {
            System.out.print(this.data[i] + " ");
        }
        System.out.println();
    }       
}
