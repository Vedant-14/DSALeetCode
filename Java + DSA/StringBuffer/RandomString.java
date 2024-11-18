import java.util.Random;
public class RandomString {
    static String randomString(int size) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<size;i++) {
            sb.append((char) ((int)(97+ random.nextFloat()*26)));
        }
        return sb.toString();
    }   
}
