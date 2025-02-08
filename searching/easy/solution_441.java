
// Link : https://leetcode.com/problems/arranging-coins/

class Solution {
    public int arrangeCoins(int n) {

        /* 
         
            //Brute Force
            
            int i = 1;
            while(n >= i){
                n = n - i;
                i++;
            }
            return i - 1;
            
        */

        // Optimized Solution Using Binary Search

        int start = 0;
        int end = n;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if((long)mid * (mid + 1) / 2 == n){
                return mid;
            }else if((long)mid * (mid + 1) / 2 < n){
                start  = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return end;



    }
}