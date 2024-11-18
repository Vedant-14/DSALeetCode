package Pattern;

public class SimpleStar {
    public static void main(String[] args) {
        pattern4(4);
    }
   public static void pattern1(int n) {
        for(int row = 0 ; row < n; row++) {
            for(int col =0;col<=row;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n ) {
        for (int i =0;i<n;i++) {
            for(int j=n;j>i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        for(int row = 0 ; row < n; row++) {
            for(int col =0;col<=row;col++) {
                System.out.print(col+1+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n) {
       for(int i=0;i<2*n;i++) {

       }
    }
}
