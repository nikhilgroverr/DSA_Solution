class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int rows = image.length;
        int cols = image[0].length;
        int[][] result = new int[rows][cols];

        //Flip Image
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = image[i][cols - 1 - j];
            }
        }

        //Invert Image
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(result[i][j] == 1)
                    result[i][j] = 0;
                else
                    result[i][j] = 1;
            }
        }

        return result;
    }
}