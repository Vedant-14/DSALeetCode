// THIS SOLUTION IS CORRECT FOR 55 TEST CASES OUT OF 88 ie NOT CORRECT SOLUTION 
package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosIncorrect {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int[] ans = firstAndLastPos(arr,7);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] firstAndLastPos(int[] arr , int target) {
        int s = 0 ;
        int e = arr.length-1;
        int first =0, last = 0;
        while (s<=e) {
            int mid = s + (e-s)/2;
            if(arr[mid] == target) {
                first = mid;
                last = mid;
                while(arr[first]==target) {
                    if(first==-1) {
                        break;
                    }
                    first--;
                }
                while(arr[last]==target) {
                    if(last==-1) {
                        break;
                    }
                    last++;
                }
                return new int[] {first+1,last-1};
            }
            else if(target > arr[mid]) {
                s = mid +1;
            }
            else {
                e = mid -1;
            }
        }return new int[] {-1,-1};
    }
    // static int lastPos(int[] arr,int target) {
    //     int s = 0 ;
    //     int e = arr.length-1;
    //     while (s<=e) {
    //         int mid = s + (e-s)/2;
    //         if(arr[mid] == target) {
    //             while(arr[mid]==target) {
    //                 mid++;
    //             }
    //             return mid-1;
    //         }
    //         else if(target > arr[mid]) {
    //             s = mid +1;
    //         }
    //         else {
    //             e = mid -1;
    //         }
    //     }return -1;
    // }

}
