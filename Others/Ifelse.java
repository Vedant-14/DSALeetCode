package Others;
// class Ifelse{
//     public static void main(String[] args) {
//         // int salary = 25000;
//         // if(salary>20000) {
//         //     salary+=2000;
//         // }
//         // else {
//         //     salary+=1000;
//         // }
//         // System.out.println("Salary added with bonus is : "+salary);


//         // for(int i = 1;i<=10;i++) {
//         //     System.out.println("Hello World");
//         // }

//         int i = 1;
//         while(i<=10) {
//             System.out.println("Hello ");
//             i++;
//         }
//     }
// }


// PROGRAM TO FIND THE MAXIMUM OF THE THREE NUMBER ENTERED AS INPUT
import java.util.Scanner;
class Ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if(b>max) {
            max = b;
        }
        if(c>max) {
            max = c;
        }
        System.out.println("Max no of threee no is : "+ max);
    }
}


