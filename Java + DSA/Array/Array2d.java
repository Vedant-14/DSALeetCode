package Array;
import java.util.*;

public class Array2d {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);

        for (int i = 0 ; i<arr.length;i++) {
            for (int j = 0;j<arr.length;j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));   
 }
}
