package LinkedList.DoublyLL;

public class DoublyLL {
    private int size;
    private Node head;
    private Node tail;
    DoublyLL() {
        size =0;
    }

    // METHODS OF DOUBLY LL CLASS
    //                                  ADDING ELEMENTS METHOD

    public void addFirst(int value) {
        Node node = new Node(value);
        if(head==null) {
            head = node;
            tail = node;
            size+=1;
            return;
        }
        node.next = head;
        head.previous = node;
        head = node;
        size+=1;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if(tail==null) {
            tail=node;
            head = node;
            return;
        }
        tail.next = node;
        node.previous = tail;
        tail = node;
        
    }
    public void addAtIndex(int value,int index) {
        Node node = new Node(value);
        Node temp = head;
        for(int i = 1;i<index;i++) {
            temp = temp.next;
        }
        node.previous=temp;
        node.next = temp.next;
        temp.next.previous = node;
        temp.next = node;
    }
    //                              PRINTING THE DOUBLY LINKED LIST METHOD
    public void printList() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(" <- "+temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
            next = null;
            previous = null;
        }
    }
}
