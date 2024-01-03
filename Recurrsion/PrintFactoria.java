package Recurrsion;

public class PrintFactoria {
    public static void main(String[] vedant) {
        int n = 5,fact =1;
        // printFactorial(n,fact);
        int ans = factorial(n);
        System.out.println(ans);
    }
    // public static void printFactorial(int n, int fact) {
    //     if(n==1) {
    //         System.out.println(fact);
    //         return;
    //     }
    //     fact*=n;
    //     printFactorial(n-1,fact);
        
    // }

    // ANOTHER WAY OR FUNCTION 
    public static int factorial(int n) {
        // BASE CONDITION 
        if(n==1 || n==0) {
            return 1;
        }
        int fact_nm1 = factorial(n-1);
        int fact_n= n*fact_nm1;
        return fact_n;
    }
}
