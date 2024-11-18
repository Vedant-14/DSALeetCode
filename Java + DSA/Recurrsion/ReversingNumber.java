package Recurrsion;

public class ReversingNumber {
   public static void main(String[] args) {
    // int ans = reverseNumber(12345,10000);
    // System.out.println(ans);

    revNumber(1234);
    System.out.println(sum);

   }
   // METHOD 1
   static int reverseNumber(int n,int m) {
    if(n<10) {
        return n;
    }
     int rem = n%10;
    n = n/10;
    return rem*m + reverseNumber(n,m/10);
   } 
   static int sum = 0;

   // METHOD 2
   static void revNumber(int n) {
    if(n==0) {
        return;
    }
    int remainder = n%10;                                          
    sum = sum*10 + remainder;
    revNumber(n/10);
   }
}
