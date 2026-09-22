class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index = -1;
        for(int i = 0; i < matrix.length; i++){
            int left = 0;
            int right = matrix[i].length - 1;
            if(matrix[i][left] <= target && matrix[i][right] >= target){
                index = i;
                break;
            }
        }
        if(index == -1){
            return false;
        }

        int l = 0;
        int r = matrix[index].length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(matrix[index][mid] == target){
                return true;
            }else if(matrix[index][mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }
}
