package FileHandeling;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderClass
 {
    public static void main(String[] args){
        try(FileReader fr = new FileReader("ved.txt")) {
            int letters = fr.read();
            while(fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }
            System.out.println();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}