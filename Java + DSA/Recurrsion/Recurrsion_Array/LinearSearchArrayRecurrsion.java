package Recurrsion.Recurrsion_Array;
import java.util.ArrayList;


public class LinearSearchArrayRecurrsion {
    
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<Integer>();
        int arr[] = {1,4,32,4,4,5};
        System.out.println(search(arr,0,4,list));
    }
    static ArrayList search(int arr[] , int index,int target,ArrayList<Integer> list) {
        // The list passed here in the parameter will be differet different refernce variable each time but will be pointing to the same object list.
        if(index==arr.length) {
            return list;
        }
       if(target==arr[index]) {
        list.add(index);
       }
       return search(arr,index+1,target,list);
            
    }
}
