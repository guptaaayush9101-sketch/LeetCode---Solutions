class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
         if(n == 0) return 0;
        Arrays.sort(nums);
        int elem = nums[0];
        int count = 1;
        int maxi =1;
        for(int i=1;i<n;i++){
            if(nums[i] == elem+1){
                count++;
                elem = nums[i];
                maxi = Math.max(maxi,count);
            }
            else if(nums[i] == elem) {
                continue;
            }
            else {
                elem = nums[i];
                count = 1;
            }
        }
        return maxi;
    }
}