class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right= height.length - 1;
        int maxAre=0;

        while(left < right){
            int wid= right-left;
            int minheight = Math.min(height[left], height[right]);
            int area= wid * minheight;

            maxAre= Math.max(maxAre , area); 
        
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxAre;
    }
}