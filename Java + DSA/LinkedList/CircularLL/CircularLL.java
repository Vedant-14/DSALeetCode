package LinkedList.CircularLL;

public class CircularLL {
    private Node head;
    private Node tail;
    // private int size;

    public void add(int value) {
        Node node = new Node(value);
        if(head==null) {
            head = node;
            tail = node;
            node.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int value) {
        // Check if the head is that value 
        if(head.value == value) {
            head = head.next;
            tail.next = head;
        }

        // If the value is not head and somwhere in the circular list 
        Node temp = head;
        do {
            if(temp.next.value != value) {
                temp = temp.next;
            }
            else {
                if(temp.next== tail) {
                    temp.next = head;
                    return;
                }
                temp.next = temp.next.next;
            }
        } while (temp!=tail);
    }

    public void display() {
        Node temp = head;
        System.out.print(temp.value+" -> ");
        temp = temp.next;
        while(temp!=head) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
