package BinarySearch;
import java.util.Arrays;
public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int[] ans = searchIn2dArray(arr,33);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchIn2dArray(int[][] arr,int target) {

        int row = 0;
        int col = arr[row].length-1;
        while(row <= arr.length-1 && col>=0) {
            if(target==arr[row][col]) {
                return new int[] {row,col};
            }
            else if(target<arr[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }

        
        return new int[] {-1,-1};
    }
}