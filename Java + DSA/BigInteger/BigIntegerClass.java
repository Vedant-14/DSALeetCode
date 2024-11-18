package BigInteger;
import java.math.BigInteger;
// import java.util.Math;

public class BigIntegerClass {
    public static void main(String[] args) {
        // BigInteger x = new BigInteger("345778899021");
        // BigInteger y = new BigInteger("342124");
        // System.out.println(x.add(y));
        // System.out.println(x.subtract(y));
        // System.out.println(x.divide(y));
        // System.out.println(x.remainder(y));

        // if(y.compareTo(x)<0) {
        //     System.out.println("yes");
        // }else {
        //     System.out.println("No");
        // }
        
        // BigIntegerClass.factorial(150);
        BigIntegerClass.armStrongNumber(1);
    }
    public static void factorial(int number) {
        BigInteger ans = new BigInteger("1");

        for(int i=2;i<=number;i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        System.out.println(ans);
    }

    // ArmStrong Number Problem : ArmStrong number is number whose Sum of cubes of each digits is equal to number it self ex:153
    public static void armStrongNumber(int number) {
        int digit;
        int temp = number;
        int sumOfCube=0;
        while(temp!=0) {
            digit = temp%10;
            temp = temp/10;
            digit= digit*digit*digit;
            sumOfCube = sumOfCube+digit;
        }
        // Now chekck is Armstrong or not 
        if(sumOfCube==number) {
            System.out.println("Yes its an Armstrong number");
        }
        else {
            System.out.println("No it's not an Armstrong number");
        }
    }
}   
