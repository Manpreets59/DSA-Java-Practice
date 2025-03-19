//You have given an N which mean n number of queen on n*n board
// Now you have to place these queen in such a order that they don't intersect each other diagonal, row wise and column wise using backtracking
// .
public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and column
        for(int col = 0; col < board.length; col++){
            // place the queen if it is safe
            if(isSafe(board, row , col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical row
        for(int i = 0; i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for(int i = 1 ;i <= maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        //diagonal Right
        int maxRight = Math.min(row, board.length-col-1);
        for(int i = 1 ;i <= maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}


// Time complexity
//T(N) = N * T(N - 1) + O(N^2) = O(N^3 + N factorial) = O(N factorial).
