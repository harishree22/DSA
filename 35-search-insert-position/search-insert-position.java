class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int Index = nums.length;
        while(start<=end){
            int mid = (start + end)/ 2;
            if(nums[mid]>=target){
                Index = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return Index;
    }
}