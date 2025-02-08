
// Link : https://leetcode.com/problems/guess-number-higher-or-lower/description/


 public class Solution extends GuessGame {
    
    public int guessNumber(int n) {
        
        int start = 1;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) == -1){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return n;

    }
}