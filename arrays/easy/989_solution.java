class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        int n = num.length;
        int i = n - 1;
        List<Integer> result = new ArrayList<>();

        while(i >= 0 || k > 0){
            if(i >= 0){
                result.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
                i--;
            }else{
                result.add(k % 10);
                k /= 10;
            }
        }

        Collections.reverse(result);
        return result;

    }
}