package Heap;
import java.util.*;

public class Heap<T extends Comparable<T>> {
    // Comparable is an Interface which have only one method compareTo(Object);
    // It is used to compare the current object with the specified object;
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    // Swap Function 
    private void swap(int first, int second) {
        // first and second are the indices we got 
        T temp = list.get(first);  // get method only gives the element not remove the element 

        list.set(first,list.get(second));  // set method takes index and value as argurment

        list.set(second,temp);
    }
    // Function to return parent of any index
    private int parent(int index) {
        return (index-1)/2;
    }
    // Function to return left index of any node 
    private int left(int index) {
        return index*2+1;
    }
    private int right(int index) {
        return index*2+2;
    }

    // HEAP INSERTION FUNCTION 
    private void insert(T value) {
        // At start it will simply inset it at the end of list 
        list.add(value);
        upHeap(list.size()-1);
    }
    private void upHeap(int index) {
        if(index==0) {
            return;
        }
        int p = parent(index);
        if(list.get(p).compareTo(list.get(index))>0) {
            swap(index,p);
            upHeap(p);
        }
       
    }

    // HEAD DELETING AN ELEMENT FUNCTION 
    public T remove() throws Exception {
        if(list.isEmpty()) {
            throw new Exception("Cannot remove the item from empty Heap");
        }
        // remove function in heap alway remove the first item of list only 
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()) {
            list.add(0,last);
        }
          // this line removes the last element of the list and add it to the first element of the list.
        downHeap(0);
        return temp;    
    }
    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);
       
        if(left<list.size() && list.get(min).compareTo(list.get(left))>0)  {
            min = left;
        }
        // Same check is right lesser than the current index 
        if(right<list.size() && list.get(min).compareTo(list.get(right))>0) {
            min = right;
        }

        // if min is changed just swap the min index with actual index
        if(min!=index) {
            swap(min,index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        
        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    public void unsortedArrayAddding(T[] arr) {
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]);
        }
        // To get the minimum element at the top as to maintain the heap's promise
        for(int i=(list.size()-1)/2;i>=0;i--) {
            downHeap(i);
        }
    }
 }
