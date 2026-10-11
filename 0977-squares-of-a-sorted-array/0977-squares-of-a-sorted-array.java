class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squ = new int[nums.length];
        for(int i = 0 ; i <= nums.length - 1 ; i++){
            if(nums[i] == 0){
                squ[i]= 0;
            }else{
                squ[i]= nums[i] * nums[i];
            }
        }
        Arrays.sort(squ);
        return squ;
    }
}