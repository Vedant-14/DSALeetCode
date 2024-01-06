package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {10,19,34,7,83,62,7};
        System.out.println(min(arr));

        // MinimumNumber obj = new MinimumNumber();
        // obj.min(arr);
    }
     static int min(int[] arr) {
        int min = arr[0];
        for(int i = 1; i<arr.length;i++)  {
            if(arr[i]<min) min = arr[i];
        }
        return min;
     }
}
