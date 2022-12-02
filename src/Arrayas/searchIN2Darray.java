package Arrayas;

public class searchIN2Darray {

    public static void main(String[] args) {
        int[][] mat = {{1,3}};
        int target=3;
        System.out.println( searchMatrix(mat,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target) return true;
            if(matrix[r][c]<target) r++;
            else c--;
        }
        return false;
    }
}
