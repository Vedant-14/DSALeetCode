package LinearSearch;

public class LinearCode {
    public static void main(String[] args) {
        int arr[] = {2,34,5,6,721,67,9};
        System.out.println("Index returned : "+ linearsearch(arr,6));
    }
    static int linearsearch(int arr[], int target) {
        for(int i = 0; i<arr.length;i++) {
            if(target==arr[i])  return i;
 
        }
        return -1;
    }
}
