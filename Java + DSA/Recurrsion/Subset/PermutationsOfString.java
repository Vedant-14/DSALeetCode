package Recurrsion.Subset;
import java.util.*;
public class PermutationsOfString {
    public static void main(String[] args) {
        ArrayList<String> ans = permutationsReturn("","abc");
        System.out.println(ans);
    }
    static void permutations(String processed,String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for(int i =0;i<=processed.length();i++) {
            String first = processed.substring(0,i);
            // System.out.println(first+" = First String");
            String second = processed.substring(i,processed.length());
            // System.out.println(second+" = second String");
            permutations(first+ch+second,unprocessed.substring(1));
        }

    //     for(int j =0;j<unprocessed.length();j++) {
    //         char ch = unprocessed.charAt(j);
    //         unprocessed = unprocessed.substring(j);+
        
    //     for(int i =0;i<processed.length()+1;i++) {
    //         // Question - In how many places we can add letter 
    //         //  Ans - processed string length + 1 places we can add the letter. 
            
    //         processed = processed.substring(0,i) + ch+processed.substring(i,processed.length()); 
    //         if(unprocessed.isEmpty()) {
    //             System.out.println(processed);
    //             processed = "";
    //         }
    //         // System.out.println(processed);
    //      }
    //  }
        
    }

    // Now the subQuestion for me is to return the strings form above 
    static ArrayList<String> permutationsReturn(String processed,String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            // System.out.println(processed);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = unprocessed.charAt(0);
        for(int i =0;i<=processed.length();i++) {
            String first = processed.substring(0,i);
            // System.out.println(first+" = First String");
            String second = processed.substring(i,processed.length());
            // System.out.println(second+" = second String");
            ArrayList<String> list = new ArrayList<>();
            list = permutationsReturn(first+ch+second,unprocessed.substring(1));
            ans.addAll(list);
            // ans.add(processed); 
        }
        return ans;
        
        
}
}
