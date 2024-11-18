package Recurrsion.Maze_and_BackTracking;

import java.util.*;

public class RecurrsionMaze {
    public static void main(String[] args){
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] flow = new int[maze.length][maze[0].length];
        allpathsStep("",maze,0,0,flow,1);
    }
    static ArrayList<String> allpath(String processed,boolean[][] maze, int row,int col) {
        if(row==maze.length-1 && col==maze[0].length-1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            // System.out.println(processed);
            return ans;
            
        }
        ArrayList<String> list = new ArrayList<>();
        if(row<maze.length-1 ) {
            list.addAll(allpath(processed+'D',maze,row+1,col));
        }
        if(col<maze[0].length-1) {
            list.addAll(allpath(processed+'R',maze,row,col+1));
        }
        return list;
        // return left+right;
    }



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


// Now make all paths available for going ie up , down ,right ,left

static ArrayList<String> allpaths(String processed,boolean[][] maze, int row,int col) {
    if(row==maze.length-1 && col==maze[0].length-1) {
        ArrayList<String> ans = new ArrayList<>();
        ans.add(processed);
        // System.out.println(processed);
        return ans;
    }
    // Check if the cell is false retur from there as it is already visited 
    if(!maze[row][col]) {
        return new ArrayList<>();
    }
    // Whenever it visits the cell mark it as visited so that recurrsion call dont go on that again
    maze[row][col] = false; 
    ArrayList<String> list = new ArrayList<>();
    //Down
    if(row<maze.length-1 ) {
        list.addAll(allpaths(processed+'D',maze,row+1,col));
    }
    //Right
    if(col<maze[0].length-1) {
        list.addAll(allpaths(processed+'R',maze,row,col+1));
    }
    //Up
    if(row>0) {
        list.addAll(allpaths(processed+'U',maze,row-1,col));
    }
    //Left
    if(col>0) {
        list.addAll(allpaths(processed+'L',maze,row,col-1));
    }
    // Whenever the function or path is returning back mark the cell again to true 
    maze[row][col] = true;
    return list;
    // return left+right;

}
// Now i am going to print paths with the steps it took 

static void allpathsStep(String processed,boolean[][] maze, int row,int col,int[][] flow,int step) {
    if(row==maze.length-1 && col==maze[0].length-1) {
        // ArrayList<String> ans = new ArrayList<>();
        flow[row][col]=step;
        for(int[] route:flow) {
            System.out.println(Arrays.toString(route));
        }
        System.out.println(processed);
        
        System.out.println();
        return ;
    }
    // Check if the cell is false retur from there as it is already visited 
    if(!maze[row][col]) {
        return;
    }
    flow[row][col]=step;
    // Whenever it visits the cell mark it as visited so that recurrsion call dont go on that again
    maze[row][col] = false; 
    ArrayList<String> list = new ArrayList<>();
    //Down
    if(row<maze.length-1 ) {
        allpathsStep(processed+'D',maze,row+1,col,flow,step+1);
    }
    //Right
    if(col<maze[0].length-1) {
        allpathsStep(processed+'R',maze,row,col+1,flow,step+1);
    }
    //Up
    if(row>0) {
        allpathsStep(processed+'U',maze,row-1,col,flow,step+1);
    }
    //Left
    if(col>0) {
        allpathsStep(processed+'L',maze,row,col-1,flow,step+1);
    }
    // Whenever the function or path is returning back mark the cell again to true 
    maze[row][col] = true;
    flow[row][col]=0;
    return;
    // return left+right;

}
}
