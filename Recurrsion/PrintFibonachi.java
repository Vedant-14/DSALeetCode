package Recurrsion;

public class PrintFibonachi {
    public static void main(String[] args) {
        // n HERE REPRESENTS NO OF FIBONACHI TERMS FROM START 
        int a=0,b=1,n=10;
        
        System.out.println(a);
        System.out.println(b);
        printFibonachi(a,b,n-2);
    }
    /*static void fibonachi(int a , int b,int n) {
       // BASE CONDITION TO STOP THE RECURSION 
       
        int c = a+b;
        if(c>=n) return ;
        System.out.println(c);
        fibonachi(b,c,n);
    }*/

    public static void printFibonachi(int a , int b , int n) {
        //BASE CONDITION TO STOP RECURRSION 
        if(n==0) {
             return;
        }
        int c = a+b;
        System.out.println(c);
        printFibonachi(b,c,n-1);
    }
}
