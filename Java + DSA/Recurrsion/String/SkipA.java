package Recurrsion.String;

public class SkipA {
    public static void main(String[] args) {
        skipA("badadgah","");
        String ans = skipAppifNotApple("appdasapplebas");
        System.out.println(ans);

    }
    static void skipA(String str ,String ans) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if(ch=='a') {
            skipA(str.substring(1),ans);
        }else {
            skipA(str.substring(1),ans+ch);
        }
    }

    static String skipAReturn(String str) {

        if(str.isEmpty()) {
             return "";
        }
        char ch = str.charAt(0);
        if(ch=='a') {
            return  skipAReturn(str.substring(1));
        }else {
            return ch + skipAReturn(str.substring(1));
        }
    }
// Skip apple from the string if 
    static String skipApple(String str) {

        if(str.isEmpty()) {
             return "";
        }
        // char ch = str.charAt(0);
        if(str.startsWith("apple")) {
            return  skipApple(str.substring(5));
        }else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    // Now skip app only when its not apple 

    static String skipAppifNotApple(String str) {

        if(str.isEmpty()) {
             return "";
        }
        // char ch = str.charAt(0);
        if(str.startsWith("app")&& !str.startsWith("apple")) {
            return  skipAppifNotApple(str.substring(3));
        }else {
            return str.charAt(0) + skipAppifNotApple(str.substring(1));
        }
    }
}
