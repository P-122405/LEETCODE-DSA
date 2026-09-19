class Solution {
    public int singleNumber(int[] nums) {
        int val = 0;
        for(int value : nums){
            val = val ^ value;
            
        }
        return val;
    }
}