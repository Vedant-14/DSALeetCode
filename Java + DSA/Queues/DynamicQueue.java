package Queues;
public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }

    // Override the insert function of the circular Queue
    public void insert(int item) throws Exception {
        if(this.isFull()) {
            int[] temp = new int[size*2];
            // Copy the elements of data in temp
            int i = front;
            int j=0;
            do {
                temp[j++] = data[i++];
                i = i%data.length;
            }while(i!=end);
            front = 0;
            end = data.length;
            data = temp;
        }
        super.insert(item);
    }

}