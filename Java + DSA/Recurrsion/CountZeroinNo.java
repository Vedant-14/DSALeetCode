package Recurrsion;

public class CountZeroinNo {
    public static void main(String[] args) {
        zeroCount(1034067800);
        System.out.println(count);
        System.out.println(countZero(1034067800,0));
    }

    //  METHOD 1
    static int count = 0;
    static void zeroCount(int n) {
        if(n<10) {
            if(n==0) {
                count++;
            }
            return;
        }
        int rem = n%10;
        if(rem==0) {
            count++;
        }
        zeroCount(n/10);
    }

    // METHOD 2 
    static int countZero(int n , int count) {
        if(n==0) {
            return count;
        }
        int rem = n%10;
        if(rem==0) {
           return countZero(n/10,count+1);
        }
        return countZero(n/10,count);
        
        
    }
}
