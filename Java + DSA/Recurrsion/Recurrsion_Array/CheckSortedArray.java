package Recurrsion.Recurrsion_Array;

public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,0,3,4,8};
        boolean ans = check(0,arr);
        System.out.println(ans);
    }
    static boolean check(int i,int arr[]) {
        if(i==arr.length-1) {
            return true;
        }
        if(arr[i]<arr[i+1]) {
            return check(i+1,arr);
        }
        return false;
    }
}
