package LinearSearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {3,5,6,72},
            {1,7,9},
            {2,12,16,17},
            {23,26,27,28,29}
        };   
        int[] ans = search2d(arr,92);
        //  System.out.println("[row , col] : "+search2d(arr,28));
        System.out.println(Arrays.toString(ans));

        // PRINTING MAX VALUE IN 2D ARRAY
        System.out.println("Max value in 2d Array : " + max(arr));
        
    }
    static int[] search2d(int[][] arr,int target) {
        for(int row = 0;row<arr.length;row++) {
            for(int col = 0;col<arr[row].length;col++) {
                if(arr[row][col]==target) {
                    return new int[] {row,col};
                    // int[] ans = {row,col};
                    // return Arrays.toString(ans);
                }

            }
        } return new int[] {-1,-1};
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int[] subarray : arr){
            for(int element : subarray){
                if(element>max){
                    max=element;
                }
            }
        }return max;
    }
}

