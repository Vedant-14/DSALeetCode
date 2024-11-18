package Queues;

public class CircularQueue {
    protected int[] data;
    private  static final int DEFAULT_SIZE = 10;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }
    // Pointer of the queue
    protected  int front =0;
    protected int end = 0;;
    protected int size = 0;

    public boolean isEmpty() {
        if(size==0) {
            return true;
        }
        return false; 
    }
    public boolean isFull() {
        return size==data.length;
    }

    // FUNCITON FOR ADDITON IN CIRCULAR QUEUE 
    public void insert(int item) throws Exception {
        if(isFull()) {
            throw new Exception("Cannot Insert in Full Queue");
        }
        data[end++] = item;
        size++;
        end = end%data.length;
    }
    public int remove() throws Exception{
        if(isEmpty()) {
            throw new Exception("Cannot remove from empty Queue");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i=front;
        do {
            System.out.print(data[i] + " ->");
            i++;
            i = i%data.length;
        }while(i!=end);
        System.out.println("End");
    }
}
