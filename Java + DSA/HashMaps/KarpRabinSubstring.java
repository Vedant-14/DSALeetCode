package HashMaps;
import java.lang.Math;
public class KarpRabinSubstring {
    private final int PRIME = 101;

    private double hashCalculate(String str) {
        double hash=0;
        for(int i=0;i<str.length();i++) {
            hash = hash + str.charAt(i) * Math.pow(PRIME,i);
        }
        return hash;
    }

    private double updateHash(double prevHash,char oldChar,char newChar,int patternLength) {
        double newHash = (prevHash-oldChar)/PRIME;
        newHash = newHash + newChar * Math.pow(PRIME,patternLength-1);
        return newHash;
    }

    // Karp Rabin Algorithm 
    public void search(String text, String pattern) {
        int patternLength = pattern.length();
        double patternHash = hashCalculate(pattern);
        double textHash = hashCalculate(text.substring(0,patternLength));
        for(int i=0;i<(text.length()-patternLength);i++) {
            if(textHash==patternHash) {
                // Check if the char are also equal 
                if(text.substring(i,i+patternLength).equals(pattern)) {
                    System.out.println("Pattern found in the text at index : "+i);
                }
            }
            if(i<text.length()-patternLength) {
                textHash = updateHash(textHash,text.charAt(i), text.charAt(i+patternLength),patternLength);
            }
        }
    }
    public static void main(String[] args) {
        // System.out.println(Math.pow(2,2));
        KarpRabinSubstring karpRabin = new KarpRabinSubstring();
        karpRabin.search("VedantNidhiPushpa","Nidhi");
    }
}
