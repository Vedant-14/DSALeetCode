package Recurrsion.Subset;
import java.util.ArrayList;
public class SubsetOfString {
    public static void main(String[] args) {
        // ArrayList<String> ans = subsetReturn("","abcdef+");
        // System.out.println(ans);
        subsetWithAscii(" ","abc");
    }
    static void subset(String processed , String unprocessed ) {
        
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        // char ch = unprocessed.charAt(0);
        
        subset(processed+unprocessed.charAt(0),unprocessed.substring(1));
        subset(processed,unprocessed.substring(1));
    }

    static ArrayList<String> subsetReturn(String processed , String unprocessed ) {
        
        if(unprocessed.isEmpty()) {

            ArrayList<String> list = new ArrayList<String>();
            list.add(processed);
            return list;
        }
        // char ch = unprocessed.charAt(0);
        
        ArrayList<String> left = subsetReturn(processed+unprocessed.charAt(0),unprocessed.substring(1));
        ArrayList<String> right = subsetReturn(processed,unprocessed.substring(1));

        left.addAll(right);
        return left;
    }

    // Printing the Asci value of the character too 
    // For that we were making Tree of two branches now we will make tree of three branches which means three Recurrsion calls in the function 

    static void subsetWithAscii(String processed , String unprocessed ) {
        
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        // char ch = unprocessed.charAt(0);
        
        subsetWithAscii(processed+unprocessed.charAt(0),unprocessed.substring(1));
        subsetWithAscii(processed,unprocessed.substring(1));
        subsetWithAscii(processed+(unprocessed.charAt(0)+0),unprocessed.substring(1));
    }
}
