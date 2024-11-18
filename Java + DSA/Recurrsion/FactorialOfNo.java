package Recurrsion;

public class FactorialOfNo {
    public static void main(String[] args) {
        int ans = factorial(5   );
        // System.out.println(ans);
        System.out.println(1324/10);
        System.out.println(132/10);
    }
    static int factorial(int n) {
        if(n==1) {
            return n;
        }
        return n*factorial(n-1);
    }
}
