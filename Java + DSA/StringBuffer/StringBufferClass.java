import java.util.*;
public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // String buffer is the type of string which is mutable which means it can be changed and it dont make new object
        // sb.append("Vedant");
        // sb.append(" ");
        // sb.append("Hello");
        
        // System.out.println(sb);
        // sb.replace(1,5,"Gaprae");
        // String str = sb.toString();
        // System.out.println(str);
        RandomString rString = new RandomString();
       
        String randomString = RandomString.randomString(30);
        System.out.println(randomString);
    }
}