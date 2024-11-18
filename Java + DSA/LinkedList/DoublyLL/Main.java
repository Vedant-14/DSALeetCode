package LinkedList.DoublyLL;

public class Main { 
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.addFirst(23);
        list.addFirst(55);
        list.addFirst(44);
        list.addLast(34);
        list.addLast(22);
        list.addAtIndex(3,3);
        list.printList();
    }
}
