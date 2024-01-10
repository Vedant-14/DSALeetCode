package TechMahindra;

public class SumOfDifferenceOfAdjacent {
    public static void main(String[] args) {
        int[] arr = {11,22,12,24,13,26,14};
        int ans = sumofDifferences(arr,arr.length,4);
        System.out.println(ans);
    }
    static int sumofDifferences(int[] arr,int size,int pos) {
        int sum = 0;
        for(int i = pos;i<arr.length;i++) {
            int diff = arr[i] - arr[i-1];
            if(diff<0) {
                diff = diff*-1;
            }
            sum = sum + diff;
        }
        return sum;
    }
}
