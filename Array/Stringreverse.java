package Array;
public class Stringreverse {
    public static void main(String[] args) {
        String str = "Chutiyaaa";
        char arr[] = str.toCharArray();
        

        for(int i = arr.length-1;i>=0;i--) {
            System.out.print(arr[i]);
        }
    }
}
