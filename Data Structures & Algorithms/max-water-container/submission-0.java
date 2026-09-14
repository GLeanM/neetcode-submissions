class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int volume = 0;

        while(left < right){
            int height = Math.min(heights[left], heights[right]);
            volume = Math.max(volume, height*(right - left));
            if(heights[left] > heights[right]){
                right--;
            }else{
                left++;
            }
        }
        return volume;
    }
}
