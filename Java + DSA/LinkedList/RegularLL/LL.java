package LinkedList.RegularLL;

public class LL {
    // Now i need to head and tail pointer 
    private Node head = null;
    private Node tail = null;
    private int size;

    LL() {
        this.size = 0;
    }

    // Lets make an simple function to add the element at first of the linked list 

    /*          INSERTION FUNCTIONS             */
    public void addFirst(int value) {
        Node node = new Node(value); 
        if(head==null) {
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
        size +=1;
       
    }
    public void addAtPerticularIndex(int value , int index) {
        Node node = new Node(value);
        if(head==null && tail==null) {
            head = node;
            tail = node;
            size+=1;
            return;
        }
        Node temp = head;
        int i = 1;
        while(i<index-1) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
        size+=1;
    }

   public  void addLast(int value) {
        Node node = new Node(value);
        if(head==null && tail==null) {
            head = node;
            tail = node;
            size+=1;
            return;
        }
        tail.next = node;
        tail = node;
        size+=1;

    }
    public void recurr(int value,int index) {
        Node temp = head;
        addViaRecurrsion(value,index,temp);
    }

    public void addViaRecurrsion(int value , int index, Node temp) {
        if(index==0) {
            // IT MEANS USER WANT TO INSERT AT POSITION 1 
            Node node = new Node(value);
            node.next = head;
            head = node;
            return;
        }
        if(index==1) {
            Node node = new Node(value);
            node.next = temp.next;
            temp.next = node;
            return;
        }
        addViaRecurrsion(value,index-1,temp.next);
    }

    public void printLinkedList() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    /*          DELETION FUNCTIONS              */
    public void deleteAtFirst() {
        if(head==null) {
            System.out.println("no items to delete");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }
    public void deleteAtLast() {
        if(tail==null) {
            System.out.println("no items to delete");
            return;
        }
        Node temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }
    public void deleteAtIndex(int index) {
        
        Node temp = head;
        for(int i = 1;i<index;i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size-=1;
        
    }
    //        REVERSING THE LIST 
   
    // Node temp = head;                                   
    public void reverseDisplay() {
         
        // Node temp = head;
        //First task is to travel from head to tail 
        if(head==null) {
            // System.out.print(temp.value + "->");
            return;
        }
        head = head.next;
        reverseDisplay();
        System.out.print(head.value+"->");

    }
    public Node sortList(Node head) {
        Node ans = mergeSort(head,null);
        return ans;
    }
    private Node mergeSort(Node head, Node tail) {
        if(head==tail || head.next==tail) {
            return head;
        }

        Node mid = getmid(head,tail);
        Node left = mergeSort(head,mid);
        Node right = mergeSort(mid.next , tail);

        Node mergeHead = mergeTwoLists(left, right);
        return mergeHead;
    }

    private Node getmid(Node head,Node end) {
        // if(head==end || head.next == end) {
        //     return head;
        // }
        Node slow = head;
        Node fast = head;
        while(fast!=end && fast.next!=end) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
     private Node mergeTwoLists(Node list1, Node list2) {
        Node h = null;
        Node t = null;
        while(list1!=null && list2!=null) {
            if(list1.value<=list2.value) {
                Node node = new Node(list1.value);
                if(h==null) {
                    h = node;
                    t = node;
                }
                else {
                    t.next = node;
                    t = node;
                }
                list1 = list1.next;
            }
            else  {
                Node node = new Node(list2.value);
                if(h==null) {
                    h = node;
                    t = node;
                }
                else {
                    t.next = node;
                    t = node;
                }
                list2 = list2.next;
            }
        }
            if(list2!=null) {
                t.next = list2;
            }
            if(list1!=null) {
                t.next = list1;
            }
        return h;
    }

    // Linked List Cycle Detectio n

    public boolean isCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) {
                return true;
                // Yes cycle is present 
            }
        }
        return false;
    }

        // RETURN LENGHT OF CYCLE // 
        public int lengthOfCycle(Node head) {
            Node fast = head;
            Node slow = head;
            while(fast!=null && fast.next!=null) {
                fast = fast.next.next;
                slow = slow.next;
                if(fast==slow) {
                    int length = 0;
                    slow = slow.next;
                    while(slow!=fast) {
                        length +=1;
                        slow = slow.next;
                    }
                    return length;
                    // Yes cycle is present 
                }
            }
            return -1;
        }

        // HAPPY NUMBER PROBLEM // 

            public boolean isHappy(int n) {
                int  slow = n;
                int fast = n;
                do {
                    slow = findSquare(slow);
                    fast = findSquare(findSquare(fast));

                    if(slow==1) {
                        return true;
                    }
                }while(slow!=fast);
                
                return false;
            }  
            private int findSquare(int n) {
                int rem = 0;
                int ans = 0;
                while(n!=0) {
                    rem = n%10;
                    n = n/10;
                    ans = ans + (rem*rem);
                }
                return ans;
            } 

            // BUBBLE SORT IN LINKED LIST   // 
            public Node bubbleSort1(Node head) {
                // At first we need to calculate length of the linked list 
                int length = lengthOfList(head);
                Node temp = head;
                for(int i =0;i<length-2;i++) {
                    for(int j=0;j<length-i-1;j++) {
                        if(temp.value>temp.next.value) {
                            int x = temp.value;
                            temp.value = temp.next.value;
                            temp.next.value = x;
                            temp = temp.next;
                        }
                        else {
                            temp = temp.next;
                        }
                    }
                    temp = head;
                }
                return head;
            }
            private int lengthOfList(Node head) {
                Node fast = head;
                int length = 1;
                while(fast!=null && fast.next!=null) {
                    fast = fast.next.next;
                    length+=2;
                }
                if(fast==null) {
                    return length-1;
                }
                System.out.println(length);
                return length;
            }

            // BUBBLE SORT PART 2 LINKED LIST // 
                public Node bubble(Node head) {
                    bubbleSort(size-1,0);
                    return head;
                }
                private void bubbleSort(int row , int col) {
                    if(row==0) {
                        return ;
                    }

                    if(col<row) {
                        Node first = get(col);
                        Node second = get(col+1);
                        if(first.value>second.value) {
                            if(first==head) {
                                head = second;
                                first.next = second.next;
                                second.next = first;
                            }
                            else if(second==tail) {
                                Node prev = get(col-1);
                                prev.next = first.next;
                                tail = first;
                                first.next = null;
                                second.next = tail;
                            }
                            else {
                                Node prev = get(col-1);
                                prev.next = first.next;
                                first.next = second.next;
                                second.next = first;
                            }
                            bubbleSort(row,col+1);
                        }
                        else {
                            bubbleSort(row,col+1);
                        }
                    }
                    else {
                        bubbleSort(--row,0);
                    }
                }
                private Node get(int index) {
                    Node temp = head;
                    while(index!=0) {
                        temp=temp.next;
                        index--;
                    }
                    return temp;
                }
                
                // REVERSING THE SINGLY LINKED LIST USING RECURRSION // 
                public void reverse(Node temp) {
                    if(temp==tail) {
                        head = tail;
                        return;
                    }
                    reverse(temp.next);
                    //  HERE THE RECURRSION CALLS WILL START COMING OUT //
                    tail.next = temp;
                    tail = temp;
                    tail.next = null;
                }
                // REVERSING THE LINKED LIST USING ITTERATION APPROACH //
                public Node reverseList(Node head) {
                    Node temp = head;
                    Node previous = null;
                    while(temp!=null) {
                        if(temp==head) {
                            temp = temp.next;
                            head.next = null;
                            previous = head;
                        }
                        previous = temp;
                        temp = temp.next;
                        previous.next = head;
                        head = previous;
                    }
                    return head;
                }
                // REVERS THE LINKED LIST FROM THE LEFT AND RIGHT INDEX IS GIVEN 
                // THIS SOLUTION NEEDS MORE MODIFICATION TO UPLOAD ON LEETCODE

                public Node reverseBetween(Node head, int left, int right) {
                    if(left==right) {
                        return head;
                    }
                    Node current =head ;
                    Node previous = null;
                    // We will skip till until we go till left 
                    for(int i =0;current!=null && i<left-1;i++) {
                        previous = current;
                        current = current.next;
                    }
                    Node last = previous;
                    Node newEnd = current;
                    previous = null;
                    Node next = current.next;

                    for(int i=0;current!=null && i<right-left+1;i++) {
                        current.next = previous;
                        previous = current;
                        current = next;
                        if(next!=null) {
                            next = next.next;
                        }
                    }

                    // Now the previous is on the right index and current is on right's next indx

                    last.next = previous;
                    newEnd.next = current;
                    return head;
                    
                    
                }

                public boolean isPallindrome(Node head) {
                    // STEP 1 : FIND THE MIDDLE OF THE LINKED LIST 
                    if(head==null) {
                        return false;
                    }
                    Node slow= head;
                    Node fast = head;
                    while(fast!=null && fast.next!=null) {
                        slow = slow.next;
                        fast =fast.next.next;
                    }
                    if(fast==slow) {
                        return false;
                    }

                    // STEP 2 : REVESE THE SECOND HALF OF THE LINKED LIST 
                    Node mid = slow;
                    if(mid.next==null) {
                        if(mid.value==head.value) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                    Node previous = null;
                    Node current = mid.next;
                    Node next = current.next;

                    while(current!=null) {
                        current.next = previous;
                        previous = current;
                        current = next;
                        if(next!=null) {
                            next = next.next;
                        }
                    }
                    mid.next = previous;
                    // printLinkedList();
                    // STEP 3 START COMPARING FIRST HALF NODES AND SECOND HALF NODES
                    Node first = head;
                    Node second = mid.next;
                    while(first!=mid) {
                        if(first.value==second.value) {
                            first = first.next;
                            second= second.next;
                        }
                        else {
                            return false;
                        }
                    }
                    return true;

                }

                //  REORDER LIST QUESTION  LEETCODE //
                public void reorderList(Node head) {

                    // Step 1 : Just find the mid of the list 
                    Node mid = getmid(head,null);
                    System.out.println(mid.value);
                    Node reverseHead = reverseListNodes(mid.next);
                    mid.next = reverseHead;
                    // System.out.println(mid.next.value);
                    Node first = head;
                    Node second = mid.next;
                    while(first!=mid && second!=null) {
                        mid.next = second.next;
                        second.next = first.next;
                        first.next = second;
                        first = second.next;
                        second = mid.next;
                    }
                    printLinkedList();
                }
                private Node reverseListNodes(Node head) {
                    if(head==null) {
                        return head;
                    }
                    Node previous = null;
                    
                    Node current = head;
                    Node next =current.next;
                    while(current!=null) {
                        current.next= previous;
                        previous = current;
                        current = next;
                        if(next!=null){
                            next = next.next;
                        }
                    }
                    head = previous;
                    // printLinkedList();0
                    return head;
                }

                // REVERSE THE K ELEMETS //

                public Node reverseKGroup(Node head, int k) {
                    if(k<=1 && head==null) {
                        return head;
                    }
                    Node previousHead = head;
                    Node nextHead= nextHead(previousHead,k);
                    if(nextHead==previousHead) {
                        nextHead = null;
                    }
                    // System.out.println(nextHead.value);
                    Node previous;
                    Node current;
                    Node next;
                    Node last = null;
                    while(true) {
                         previous = null;
                         current = previousHead;
                         next  =  current.next;
                        while(current!=nextHead && current!=null) {
                            current.next = previous;
                            previous = current;
                            current = next;
                            if(next!=null) {
                                next = next.next;
                            }
                        } 
                        if(previousHead==head) {
                            last = previousHead;
                            head = previous;
                        }
                        else {
                            last.next = previous;
                            last = previousHead;
                        }
                        previousHead.next = nextHead;
                        previousHead = nextHead;
                        if(nextHead==null) {
                            break;
                        }
                        nextHead = nextHead(nextHead,k);
                        if(nextHead==null) {
                            // return head;
                            break;
                        }else if(nextHead==previousHead) {
                            nextHead = null;
                        }
                    }
                    return head;
                }
                private Node nextHead(Node head,int k) {
                    if(head==null) {
                        return null;
                    }
                    Node temp=head;
                    while(k!=0 && temp!=null) {
                        temp = temp.next;
                        k--;
                    }
                    if(k!=0) {
                        return null;
                    }
                    else {
                        if(temp==null) {
                            return head;
                        }
                        return temp;
                    }
                }

                // REVERSE K ELEMETS ALTERNATELY // 
                public Node reversKNodeAlternately(Node head,int k) {
                    
                    int counter = 1;
                    Node current = head;
                    Node next = current.next;
                    Node previous = null;
                    Node last = head;
                    
                    while(current!=null) {
                        // System.out.println(counter%2);
                        if(counter%2==1) {
                            for(int i=0;i<k && current!=null;i++) {
                                // Start Reversing the elements 
                                current.next = previous;
                                previous = current;
                                current = next;
                                if(next!=null) {
                                    next = next.next;
                                }
                            } 
                            if(last==head) {
                                head = previous;
                                last.next = current;
                                previous = last;
                            }
                            else {
                                last.next = previous;
                            }
                            counter++;
                        }
                        else {
                            for(int i =0;i<k && current!=null;i++) {
                                current=current.next;
                                previous = previous.next;
                                if(next!=null) {
                                    next = next.next;
                                }
                            }
                            last = previous;
                            previous = null;
                            counter++;
                        }
                    }
                    return head;
                }

                // ROTATING THE LIST FROM LAST K TIMES // 
                // public Node rotateRight(Node head, int k) {
                //     if(head==null || head.next==null) {
                //         return head;
                //     }
                //     while(k!=0) {
                //         // Firstly to find the second last node every time 
                //         Node temp = head;
                //         while(temp.next.next!=null) {
                //             temp = temp.next;
                //         }
                //         Node secondLast=temp;
                //         // Second this is to swap the last element to the first and update the head 
                //         secondLast.next.next = head;
                //         head = secondLast.next;
                //         secondLast.next = null;
                //         k--;
                //     }
                //     return head;
                // }


                public Node rotateRight(Node head, int k) {
                    // Step 1 is to find the last node of the list 
                    // For that we will loop through it 
                    Node tail = head;
                    int length = 1;
                    
                    while(tail.next!=null) {
                        tail = tail.next;
                        length++;
                    }
                    // Here the tail will be pointing to the last node of the list 
                    // Now we will just simply connect the last node with the first node of the list and form the cycle 
                    tail.next = head;
                    // Now we will simply itterate for k times and will move the head and tail ahead 
                    if(k>length) {
                        k = k%length;
                        // System.out.println(k);
                    }
                    for(int i=0;i<length-k;i++) {
                        head = head.next;
                        tail = tail.next;
                    }
                    // At the end just point the tail again to the null and head will be at its correct position 
                    tail.next = null;
                    return head;
                }

    private class Node {
        private int value; // Its made private so that no other can access it 
        private Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        // list.addLast(6);
        // list.addLast(7);
        // list.addLast(8);
        // list.addLast(9);
        list.printLinkedList();
        list.head = list.rotateRight(list.head,20001);
        list.printLinkedList();

        
       
    }
}
