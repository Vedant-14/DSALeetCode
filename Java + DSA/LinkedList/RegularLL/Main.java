package LinkedList.RegularLL;

// import LinkedList.RegularLL.LL.Node;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();  // After this statement we have successfully initialized head and tail pointer and size variable
        ll.addFirst(12); 
        ll.addFirst(5); 
        ll.addFirst(4); 
        ll.addLast(13);
        ll.addLast(14);
        ll.addLast(15);
        ll.addLast(16);
        ll.addAtPerticularIndex(44,7);
        ll.addAtPerticularIndex(42,5);
        ll.deleteAtIndex(2);
        ll.deleteAtFirst();
        ll.deleteAtLast();
        ll.recurr(10,0);

        
        ll.printLinkedList(); 
        // ll.reverseDisplay();
    }
}
