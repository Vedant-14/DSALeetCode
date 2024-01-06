package Others;
import java.util.Scanner;
public class fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // enter which no of fibonacchi you want 
        int n = in.nextInt();
        
        // a and b first two fibonacchi no 
        int a = 0;
        int b = 1;

        // loop to calculate next fibonacchi no and termination condition is the n which we took input

        for (int i = 2;i<n;i++) {
            // temporary variable to store value of b 
            int temp = b;
            b = a+b;
            a = temp;

        }
        
        // Print the b which is the nth fibonachi no we want 
        System.out.println("The "+ n+"th Fibonacchi no is : "+ b);
        

    }
}
