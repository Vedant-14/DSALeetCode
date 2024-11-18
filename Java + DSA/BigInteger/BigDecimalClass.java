package BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class BigDecimalClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BD();
    }
    static void BD() {
        BigDecimal x = new BigDecimal("0.03");
        BigDecimal y = new BigDecimal("0.04");
        BigDecimal ans = y.subtract(x);
        System.out.println(ans);

        BigDecimal con= BigDecimal.ONE;
        System.out.println(con);

    }   
}
