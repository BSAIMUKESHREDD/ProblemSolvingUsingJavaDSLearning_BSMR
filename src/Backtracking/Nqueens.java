package Backtracking;

public class Nqueens {

    public static void main(String[] args) {
        int input = 4;
        var expected = 2;
        int actual = nonAttackingQueens(input);
        System.out.println(actual);
    }

    public static int nonAttackingQueens(int n) {
        // Write your code here.
        boolean[][] board = new boolean[n][n];
       int c =  Queens(0,board);
        return c;
    }

    public static int Queens(int row,boolean[][] board) {
        // Write your code here.
       // System.out.println(row);
       // System.out.println(board.length);

        if (row == board.length) {

            return 1;
        }
        int count=0;
        for (int col = 0; col < board.length; col++) {
            System.out.println(row+""+col);

            //System.out.println(row);
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count+=Queens(row+1,board);

                board[row][col] = false;   //for back tracking step very imp

            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

}
