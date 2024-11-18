package SortingAlgos.CountSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {

   
    public static void countSort(int[] arr) {
        int max = findMax(arr);
        int[] frequencyArray = new int[max+1];

        // Making the Frequency Arary 
        for(int i=0;i<arr.length;i++) {
            frequencyArray[arr[i]]+=1;
        }
        // Now making the New array from frequency array which is the sorted version of the original array
        int j=0;
        for(int i=0;i<frequencyArray.length;i++) {
            if(frequencyArray[i]!=0) {
                for(int k=0;k<frequencyArray[i];k++) {
                    arr[j++] = i;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public void counSortHashMap(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer,Integer> countMap = new HashMap<>();
        for(int num :arr) {
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }
        int index=0;
        for(int i=min;i<=max;i++) {
            int count = countMap.getOrDefault(i,0);
            for(int j=0;j<count;j++) {
                arr[index]=i;
                index++;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,4,1,3,2,5,2,8};
        countSort(arr);
    }
}
