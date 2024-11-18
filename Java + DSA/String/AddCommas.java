package String;
import java.util.*;
public class AddCommas {
    public static void main(String[] args){
        String ans = addCommas(100000);
        System.out.println(ans);
    }
    static String addCommas(int num) {
        String newString = Integer.toString(num);
        
        String str = new String();
        
        
        for(int i = 0;i<newString.length();i++) {
            str +=newString.charAt(i);
            if(newString.length()%2==0) {
                if(i%2==0 && i<newString.length()-3) {
                    str=str+",";
                }
            }
            else {
                if(i%2!=0 && i<newString.length()-3) {
                    str=str+",";
                }
            }
        }
        return str;
    }
}

