package Recurrsion.Subset;
public class AmazonDiceQuestion  {
    public static void main(String[] args) {
        noOfWays("",4);
    }
    // No of ways to add dice no to get the target sum which is 4 
    static void noOfWays(String p,int target) {
        if(target==0) {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++) {
            noOfWays(p+i,target-i);
        }   
    }
}