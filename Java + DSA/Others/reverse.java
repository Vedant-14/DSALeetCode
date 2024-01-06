package Others;
// PROGRAM TO REVERSE ANY ENTERED NUMBER 
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no to reverse : ");
        int n = in.nextInt();
        int rem;
        int ans =0;
    
        while (n>0) {
            rem = n%10;
            n = n/10;
            ans = ans *10 + rem;
        }
        System.out.println(ans);
    }
}
