package LinearSearch;
import java.util.*;
public class EvenElementDigits {
    // public static void main(String[] args) {
    //     int var = 4567;
    //     int count = 0,evencount = 0;
    //     while(var!=0) {
    //         var= var/10;
    //         count++;
    //     }
    //     if(count%2==0) evencount++;
    //     System.out.println(count);
    //     System.out.println(evencount);
    // }
    public static void main(String[] args) {
        int[] arr = {1234,456,123,12};
        System.out.println("No of Elements in Array having Even Digits are : "+evenDgitsElement(arr));
    }
    static int evenDgitsElement(int[] arr ) {
        int evencount=0;
        for(int element : arr) {
            int count=0;
            while(element!=0) {
                element/=10;
                count++;
            }
            if(count%2==0) {
                evencount++;
            }
        }
        return evencount;
    }
}
