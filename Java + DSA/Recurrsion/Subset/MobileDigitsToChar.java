package Recurrsion.Subset;
import java.util.*;
public class MobileDigitsToChar {
    public static void main(String[] args) {
        ArrayList<String> ans = digitsToChar("","23");
        System.out.println(ans);
    }
    static int[] arr = {2,3,4,5,6,7,8,9};
    static String[] strArr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static ArrayList<String> digitsToChar(String processed,String digits) {
        if(digits.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            // System.out.println(processed);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = digits.charAt(0);
        int a = ch - '0';
        String str = strArr[a-2];
        for(int i =0;i<str.length();i++) {
           ans.addAll(digitsToChar(processed+str.substring(i,i+1),digits.substring(1)));
        }
        return ans;

    }
    static void letterCombinations(String processed,String digits) {
        if(digits.isEmpty()) {
            // System.out.println(processed);
            return;
        }
        ArrayList<String> ans = new ArrayList<>();
        String p = "";
        char ch = digits.charAt(0);
        int a = ch - '0';
        String str = strArr[a-2];
        for(int i =0;i<str.length();i++) {
            p = p+str.substring(i,i+1);
            letterCombinations(processed+str.substring(i,i+1),digits.substring(1));
            ans.add(p);
            p="";

        }
        // return ans;

    }

    static void digitsToCharNoReturn(String processed,String digits) {
        if(digits.isEmpty()) {
            System.out.println(processed);
            return;
        }
        // ArrayList<String> ans = new ArrayList<>();
        char ch = digits.charAt(0);
        int a = ch - '0';
        String str = strArr[a-2];
        for(int i =0;i<str.length();i++) {
           digitsToCharNoReturn(processed+str.substring(i,i+1),digits.substring(1));
        }
        // return ans;

    }
}
