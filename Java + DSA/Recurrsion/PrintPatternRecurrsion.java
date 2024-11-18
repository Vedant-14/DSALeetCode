package Recurrsion;

public class PrintPatternRecurrsion {
    public static void main(String[] args) {
        printPattern(4,0);
    }
    static void printPattern(int row , int column) {
        if(row<1) { // Terminating condition
            return;
        }

        if(column<row) {
            printPattern(row,++column);
            System.out.print('*');
        }
        else {
            printPattern(--row,0);
            System.out.println();
        }
    }
}
