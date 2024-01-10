package TechMahindra;

public class DifferenceOfOddNEvenIndex {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int ans = sumofDifferences(arr,arr.length);
        System.out.println(ans);
    }
    static int sumofDifferences(int[] arr,int size) {
        
        int even = 0,odd = 0;
        for(int i = 0;i<arr.length;i++) {
            if(i%2==0) {
                even +=arr[i];
            }
            else {
                odd+=arr[i];
            }
            
        }
        int ans = even -odd;
        
        if(ans<0) {
            ans*=-1;
        }
        return ans;
    }
}
