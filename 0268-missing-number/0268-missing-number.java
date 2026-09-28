class Solution {
    public int missingNumber(int[] nums) {
        int x = nums.length;
        int sum = 0;
        for(int i = 0 ; i <= x ; i++){
            sum += i;
        }
        int xsum = 0;
        for(int j = 0 ; j < nums.length ; j++){
            xsum += nums[j];
        }
        return sum - xsum;
    }
}