package Others;
public class practical1
{
public static void main(String[] args)
{
String str = "Hello Rupesh";
int len = str.length();
// Using bitwise AND operation with 127
for (int i = 0; i < len; i++)
{
System.out.print((char) (str.charAt(i) & 127));
}
System.out.println();
// Using bitwise XOR operation with 127
for (int i = 0; i < len; i++)
{
System.out.print((char) (str.charAt(i) ^ 127));
}
System.out.println();
}
}