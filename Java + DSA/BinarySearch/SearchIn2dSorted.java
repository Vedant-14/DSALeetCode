package BinarySearch;
import java.util.Arrays;
public class SearchIn2dSorted {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int[] ans =  search(arr,99);
        System.out.println(Arrays.toString(ans));
    }


    static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        // Condition for if there is only single row present 
        if(row==1) {
            return binarySearch(arr,target,row-1,0,col-1);
        }
        int rStart = 0;
        int rEnd = row-1;
        int cMid = (col/2)-1;
        while(rStart<(rEnd-1)) {
            int mid = rStart + (rEnd-rStart)/2;
            if(target==arr[mid][cMid]) {
                return new int[] {mid,cMid};
            }
            if(target<arr[mid][cMid]) {
                rEnd = mid;
            }
            else {
                rStart = mid;
            }
        }
        // Now we have only two rows left
        // NOW CHECK WHETHER THE TARGET IS IN THE MID COLUMN
        if(target==arr[rStart][cMid]) {
            return new int[] { rStart,cMid};
        }
        if(target==arr[rStart+1][cMid]) {
            return new int[] {rStart+1,cMid};
        }

        // SEARCH IN THE FIRST HARLF 
        if(target<=arr[rStart][cMid-1]) {
            return binarySearch(arr,target,rStart,0,cMid-1);
        }
        // Search in the Second Half 
        if(target>=arr[rStart][cMid+1] && target<=arr[rStart][col-1]) {
            return binarySearch(arr,target,rStart,cMid+1,col-1);

        }
        // Search in third half 
        if(target<=arr[rStart+1][cMid-1]) {
            return binarySearch(arr,target,rStart+1,0,cMid-1);
        }
        // Search in fourth half 
        else {
            return binarySearch(arr,target,rStart+1,cMid+1,col-1);
        } 
    }


    
    static int[] binarySearch(int[][] arr,int target,int row , int colS,int colE) {
        while(colS<=colE) {
            int mid = colS + (colE-colS)/2;
            if(arr[row][mid]==target) {
                return new int[] {row,mid};
            }
            else if(target>arr[row][mid]){
                colS = mid+1;
            }
            else {
                colE = mid-1;
            }
        }
        return new int[] {-1,-1};
    } 
}
