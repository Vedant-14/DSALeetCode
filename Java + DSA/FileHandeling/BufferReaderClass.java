package FileHandeling;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;
public class BufferReaderClass {
    public static void main(String[] args) {
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        //     System.out.println("You Typed : "+br.readLine());
        // }
        // catch(IOException e) {
        //     System.out.println(e.getMessage());
        // }
        try(BufferedReader br = new BufferedReader(new FileReader("./FileHandeling/ved.txt"))) {
            // while(br.ready()) {
            //     System.out.println((char)br.read());
            // }
            System.out.println("You Typed : "+br.readLine());
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
