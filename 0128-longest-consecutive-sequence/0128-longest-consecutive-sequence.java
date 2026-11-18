
class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxi = 0;

        for(int elem : set) {

            if(elem == Integer.MIN_VALUE || !set.contains(elem - 1)) {

                int count = 1;
                int startpoint = elem;

                while(startpoint != Integer.MAX_VALUE &&
                      set.contains(startpoint + 1)) {

                    count++;
                    startpoint++;
                }

                maxi = Math.max(maxi, count);
            }
        }

        return maxi;
    }
}
