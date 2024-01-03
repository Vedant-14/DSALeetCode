package Recurrsion;

public class PrintSum {
    public static void main(String[] vedant) {
      printsum(1,10,0);
    }
    public static void printsum(int i , int n , int sum) {
        // BASE CASE 
        if(i==n) {
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printsum(i+1,n,sum);
    }
}
    