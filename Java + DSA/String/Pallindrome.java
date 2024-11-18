package String;

public class Pallindrome {
    public static void main(String[] args) {

    }
    static boolean checkPallindrome(String str) {
        // char[] arr = str.tocharArray();
        str = str.toLowerCase();
        for(int i =0;i<str.length()/2;i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end) {
                return false;
            }

        }
        return true;
    }
}
