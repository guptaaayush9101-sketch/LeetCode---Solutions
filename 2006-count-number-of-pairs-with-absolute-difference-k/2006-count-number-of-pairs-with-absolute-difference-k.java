class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        int count = 0;
        for(int j=0;j<n;j++){
            int req1 = nums[j]+k;
            int req2 = nums[j]-k;
            if(map.containsKey(req1)){
                count += map.getOrDefault(req1,0);
            } 
            if(map.containsKey(req2)){
                count += map.getOrDefault(req2,0);
            } 
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            
        }
        return count;
    }
}