package Arrayas;

public class RotateAnArrayL48 {
    public void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }


        public void rotate(int[][] matrix) {
        transpose(matrix);
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length/2;j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[matrix.length-1-i][i];
                    matrix[matrix[0].length-1-i][i] = temp;
                }
            }
    }
}
