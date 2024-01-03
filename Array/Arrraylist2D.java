package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrraylist2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // DEFINING THE SIZE OF 2D ARRAY 
        for(int i = 0; i<3  ; i++) {
            list.add(new ArrayList<>());
        }

        // TAKING VALUES INPUT IN 2D ARRAYLIST
        Scanner in = new Scanner(System.in);
       for (int row = 0 ; row < 3 ; row ++) {
            for (int col = 0 ; col <3 ; col ++) {
                list.get(row).add(in.nextInt());
            }
       }
       System.out.println(list);
    }
}
