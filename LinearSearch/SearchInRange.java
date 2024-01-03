package LinearSearch;
import java.util.Scanner;


public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,2,4};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Start index : ");
        int start = in.nextInt();
        System.out.print(" Enter the End Index : ");
        int end = in.nextInt();
        int ans = linearsearch(arr, 7, start, end);
        System.out.println(ans);
    }
    static int linearsearch(int arr[], int target, int start , int end) {
        for(int i = start; i<=end;i++) {
            if(target==arr[i])  return i;
 
        }
        return -1;
    }
}
