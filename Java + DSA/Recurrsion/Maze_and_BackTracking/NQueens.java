package Recurrsion.Maze_and_BackTracking;
public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = {
            {false,false,false,false},
            {false,false,false,false },
            {false,false,false,false },
            {false,false,false,false }
            // {false,false,false,false ,false,false,false,false},
            // {false,false,false,false ,false,false,false,false},
            // {false,false,false,false ,false,false,false,false},
            // {false,false,false,false ,false,false,false,false}
        };
        queens(board,0);
        // System.out.println(board.length);
    }
    static void queens(boolean[][] board, int row) {
        if(row==board.length) {
            printBoard(board);
            return;
        }

        // Now to place the queen we need to go col by col means we need to check each position in the row 
        // for that we will use for loop for col
        for(int c=0;c<board.length;c++) {
            if(positionValid(board,row,c)) {
                board[row][c] = true;
                queens(board,row+1);
                board[row][c] = false;
            }
        } 
        return;
    }
    private static void printBoard(boolean[][] board) {
        for(boolean[] arr:board) {
            for(boolean element:arr) {
                if(element) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    private static boolean positionValid(boolean[][] board,int row,int c) {
        for(int i =0;i<row;i++) {
            if(board[i][c]) {
                return false;
            }
        }
        // check for the left diagonal 
        // find the minimum in the current row and col 
        int minLeft = Math.min(row,c);
        for(int i=1;i<=minLeft;i++) {
            if(board[row-i][c-i]==true) {
                return false;
            }
        }
        
        // Now check for  the right diagonal 
        int maxRight = Math.min(row,board.length-c-1);
        for(int i=1;i<=maxRight;i++) {
            if(board[row-i][c+i]) {
                return false;
            }
        }
        return true;
    }
}
