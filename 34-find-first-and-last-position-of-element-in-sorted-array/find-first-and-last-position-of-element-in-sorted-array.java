class Solution {
    public static int firstOcc(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int Index = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target){
                Index = mid;
                e = mid-1;
            }else if(nums[mid]<target){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
            
        }
        return Index;
    }
public static int lastOcc(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int Index = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target){
                Index = mid;
                s = mid +1;
            }else if(nums[mid]<target){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
            return Index;
        
    }
    
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int a = firstOcc(nums,target);
        int b = lastOcc(nums, target);
        int ans[] = new int[] {a, b};
        return ans;
        }
    }
