

// Link : https://leetcode.com/problems/kth-missing-positive-number/description/s


class Solution {
    public int findKthPositive(int[] arr, int k) {

        /*
            // Brute Force

            int num = 1, index = 0, count = 0;

            while(count < k){
                if(index < arr.length && arr[index] == num){
                    index++;
                }else{
                    count++;
                }
                num++;
            }
            return num - 1;
        */

        // Optimized Solution

        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int missingCount = arr[mid] - (mid + 1);

            if(missingCount < k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return start + k;


    }
}