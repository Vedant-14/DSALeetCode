package Others;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
                        
        }
       //String fruit = in.next();
        // System.out.println(fruit);

        // switch (fruit) {
        //     case "Apple":
        //         System.out.println("REd");
        //         break;
        
        //     case "Mango":
        //         System.out.println("Yellow");
        //         break;

        //     default:
        //     System.out.println("Not valid fruit ");
        //         break;
        //}
    }
}
