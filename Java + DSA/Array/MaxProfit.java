package Array;
// The array contains the prices of the stocks at ith day 
// Problem is to return the max profit ie if buy on 1st day and sell on 3rd day gives max profit return it 
// Note you cant buy on 2nd day and sell it on 1st day 
public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] arr) {
        int maxP=0;
        for(int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if((arr[j]-arr[i])>maxP) {
                    maxP = arr[j]-arr[i];
                }
            }
        }
        return maxP;
    }
}
