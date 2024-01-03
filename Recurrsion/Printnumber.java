package Recurrsion;

public class Printnumber {
    public static void main(String[] args) {
        printnumber(5);
    }
    static void printnumber(int n) {
        if(n==0) return;
        System.out.println(n);
        printnumber(n-1);
    }
}
