package Others;

public class Pallindrome {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        // First reverse the number which has given 
        int reversedNumber = reverseNumber(x);
        if(reversedNumber == x) {
            return true;
        }
        return false;
    }
    private int reverseNumber(int n) {
        int ans = 0;
        int rem =0;
        while(n!=0) {
            rem = n%10;
            ans = ans*10 + rem;
            n /=10;
        }
        return ans;
       

    }
}
