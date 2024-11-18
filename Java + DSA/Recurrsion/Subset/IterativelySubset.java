package Recurrsion.Subset;
import java.util.*;
public class IterativelySubset {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        ArrayList<ArrayList<Integer>> ans =  subSetDuplicate(arr);
        for(int i =0;i<ans.size();i++) {
            System.out.println(ans.get(i));
        }

    }
    static ArrayList<ArrayList<Integer>> subSet(int[] arr){
        // Step 1 is to create the outer ArrayList which will store n number of arraylist in it
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr) {
            int size = outer.size();
            for(int i =0;i<size;i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
    // {1,2,2}
    static ArrayList<ArrayList<Integer>> subSetDuplicate(int[] arr){
        // Sort the array to place the duplicates adjacent to each other 
        Arrays.sort(arr);
        // Step 1 is to create the outer ArrayList which will store n number of arraylist in it
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end = 0;

        for(int i=0;i<arr.length;i++) {
            int size = outer.size();
            if( i>0 && arr[i]==arr[i-1]) {
                start = end+1;
            }
            end = outer.size()-1;
            for(int j =start;j<size;j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
