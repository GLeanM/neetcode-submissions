class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]arr = new int[n];
        Arrays.fill(arr, 1);
        int prefix = 1;

        for(int i = 1; i < n; i++){
            prefix = prefix * nums[i-1];
            arr[i] = prefix;
        }
        int suffix = nums[n-1];
        for(int i = n - 2; i >= 0; i--){
            arr[i]*=suffix;
            suffix*=nums[i];
        }
        return arr;
    }
}  
