package Recurrsion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345 ));
    }
    static int sumOfDigits(int n) {
        if(n<10) {
            return n;
        }
        int remainder = n%10;
        n = n/10;
        return remainder + sumOfDigits(n);
    }
}
