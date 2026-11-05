class Solution {
    public int findMin(int[] nums) {
        int ans = -1;
        int mini = Integer.MAX_VALUE;
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            ans = nums[mid];
            mini = Math.min(mini,ans);
            if(nums[mid]>nums[end]){
                start = mid+1;
            }
            else{
                end = mid -1 ;
            }
        }
        return mini;
    }
}