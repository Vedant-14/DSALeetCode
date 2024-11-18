package Recurrsion.Maze_and_BackTracking;

public class NKnights {
    public static void main(String[] args) {
        boolean[][] board = {
            {false,false,false,false},
            {false,false,false,false},
            {false,false,false,false},
            {false,false,false,false}
        };
        knights(board,0,0,4);
        // System.out.println(board.length);
    }

    static void knights(boolean[][] board, int row,int col,int knight) {
        if(knight==0) {
            printBoard(board);
            return;
        }

        if(row==board.length-1&&col==board.length) {
            return;
        }
        // Now to place the queen we need to go col by col means we need to check each position in the row 
        // for that we will use for loop for col
        if(col==board.length) {
            knights(board,row+1,0,knight);
            return;
        }
       
         if(positionValid(board,row,col)) {
            board[row][col] = true;
            knights(board,row,col+1,knight-1);
            board[row][col] = false;
        }

        knights(board,row,col+1,knight);
        
        return;
    }
    private static void printBoard(boolean[][] board) {
        for(boolean[] arr:board) {
            for(boolean element:arr) {
                if(element) {
                    System.out.print("G ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    private static boolean positionValid(boolean[][] board,int row,int col) {
        if(row>0&&col<=1) {
            if(board[row-1][col+2]) {
                return false;
            }
        }
        if(row>0 && col>=2) {
            if(board[row-1][col-2]) {
                return false;
            }
        }

        if(row>1 && col>0) {
            if(board[row-2][col-1]) {
                return false;
            }
        }
        if(row>1 && col<3) {
            if(board[row-2][col+1]) {
                return false;
            }
        }

        // Itni condition sae nai hua bhenchode fir kya direct true position is valid.
        return true;
    }   
}
