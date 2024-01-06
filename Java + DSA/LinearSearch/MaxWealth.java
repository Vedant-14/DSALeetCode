package LinearSearch;
import java.util.Arrays;
public class MaxWealth {
   public static void main(String[] args) {
    int[][] arr = {
         {1,2,6},
         {2,4,10},
         {2,2,1},
    };
    int[] ans = maxWealth(arr);
    System.out.print("Max Wealth between all acoounts is : "+ Arrays.toString(ans));
   }
   static int[] maxWealth(int[][] accounts) {
      int maxwealth =0,whose=0;
      // for(int[] account : accounts) {
      //    int wealth = 0;
      //    for(int money : account) {
      //       wealth += money;
      //    }
      //    if(wealth>maxwealth) {
      //       maxwealth = wealth;
      //    }

      // }
      // return maxwealth;

      for(int person = 0;person<accounts.length;person++) {
         int wealth = 0;
         for(int account = 0;account < accounts[person].length ;account++) {
            wealth += accounts[person][account];
         }
         if(maxwealth<wealth) {
            maxwealth = wealth;
            whose = person;
         } 

      }
      return new int[] {maxwealth,whose};
   }
}
