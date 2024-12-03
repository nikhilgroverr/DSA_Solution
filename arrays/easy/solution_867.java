public class solution_867 {
    
    public int[][] transpose(int[][] matrix) {

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[][] mat = new int[numCols][numRows];

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                mat[j][i] = matrix[i][j];
            }
        }
        
        return mat;

    }

}
