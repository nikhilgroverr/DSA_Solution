class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int[] target = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            // Shift elements to the right to make space at index[i]
            for (int j = target.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            // Place the number in the target array
            target[index[i]] = nums[i];
        }
        return target;

    }
}