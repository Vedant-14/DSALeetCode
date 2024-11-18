package String;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i<26;i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        // builder.reverse();
        System.out.println(builder.toString());
        System.out.println(builder.length());
        builder.replace(0,0,"vedant");
        System.out.println(builder.toString());
    }
}
