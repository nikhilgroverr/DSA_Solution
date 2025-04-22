class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        //Check if reshape possible
        if(rows * cols != r * c)
            return mat;
    
        //Flatten Original Array
        int[] flatArray = new int[rows * cols];
        int index = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                flatArray [index++] = mat[i][j];
            }
        }

        int[][] result = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                result[i][j] = flatArray[i * c + j];
            }
        }

        return result;

    }
}