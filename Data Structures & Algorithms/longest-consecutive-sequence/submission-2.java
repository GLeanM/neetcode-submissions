class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        for(int num : nums){
            System.out.println(num);
        }
        int total = 1;
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] == nums[i] + 1){
                count++;
                total = Math.max(total, count);
            }else if(nums[i] == nums[i+1]){
                total = Math.max(total,count);
            }else{
                count = 1;
            }
        }
        return total;
    }
}
