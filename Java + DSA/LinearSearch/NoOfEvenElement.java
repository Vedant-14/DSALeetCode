package LinearSearch;

import java.util.Scanner;

public class NoOfEvenElement {
    public static void main(String[] args) {
        // int[] arr = {2,3,4,5,6,7,8};
        int[] arr = new int[6];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements of array : ");
        for(int i = 0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Count of Even Elements in Array is : "+ evenCount(arr));

    }
    static int evenCount(int[] arr) {
       int count = 0;
       for(int element: arr) {
            if(element%2==0) count++;
       }
        return count;
    }
}
