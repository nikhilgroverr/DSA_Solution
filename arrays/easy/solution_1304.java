public class solution_1304 {
    
    public int[] sumZero(int n) {
        
        int[] ans = new int[n];

        for(int i = 0; i < n - 1; i += 2){
            ans[i] = (i + 1);
            ans[i + 1] = -(i + 1);
        }
        return ans;
    }

}
