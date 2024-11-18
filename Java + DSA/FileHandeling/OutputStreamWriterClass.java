package FileHandeling;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class OutputStreamWriterClass {
    public static void main(String args[]) {
       try(OutputStreamWriter os = new OutputStreamWriter(System.out)) {
            os.write("Hello mother fucker ");
            os.write(10);
            os.write(97);
            char[] arr = "Hello bhadkhau".toCharArray();
            os.write(arr);
       }catch(IOException e) {
        System.out.println(e.getMessage());
       }
    }
}
