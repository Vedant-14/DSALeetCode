package Recurrsion.Maze_and_BackTracking;
import java.util.*;
public class Maze {
    public static void main(String[] args) {
        // int ans = maze(3,3);
        // System.out.println(ans);
        // mazePath("",3,3);
        ArrayList<String> ans = mazePathDiagonal("",3,3);
        System.out.println(ans);
    }
    // Function that will return the no of paths to reach towards the target from the start in a maze 
    // our start will be 4,4
    // our target will be 1,1
    // Valid moves are right,left,down only 

    static int maze(int row,int col) {
        if(row==1||col==1) {
            return 1;
        }
        int left = maze(row-1,col);
        int right = maze(row,col-1);
        return left+right;
    }

// Now we want to return the path to reach the destination 
    static void mazePath(String processed, int row,int col) {
        if(row==1 && col==1) {
            System.out.println(processed);
            return;
            
        }
        if(row>1) {
            mazePath(processed+'D',row-1,col);
        }
        if(col>1) {
            mazePath(processed+'R',row,col-1);
        }
        // return left+right;
    }

    //Let's put this all paths in an ArrayList
    static ArrayList<String> mazePathArrayList(String processed, int row,int col) {
        if(row==1 && col==1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            // System.out.println(processed);
            return ans;
            
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1) {
            list.addAll(mazePathArrayList(processed+'D',row-1,col));
        }
        if(col>1) {
            list.addAll(mazePathArrayList(processed+'R',row,col-1));
        }
        return list;
        // return left+right;
    }

    // Now in the maze you can go diagonally tooo 
    // For that you need to make third recurrsion call 
    // In that you will minus row and col togetheer
    static ArrayList<String> mazePathDiagonal(String processed, int row,int col) {
        if(row==1 && col==1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            // System.out.println(processed);
            return ans;
        }
        // This is the check when thier is obstatcle at 2,2 so no path should go by 2,2 
        if(row==2&&col==2) {
            processed="";
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1) {
            list.addAll(mazePathDiagonal(processed+'D',row-1,col));
        }
        if(col>1) {
            list.addAll(mazePathDiagonal(processed+'R',row,col-1));
        }
        if(row>1&&col>1) {
            list.addAll(mazePathDiagonal(processed+'d',row-1,col-1));
        }
        return list;
        // return left+right;
    }

}
