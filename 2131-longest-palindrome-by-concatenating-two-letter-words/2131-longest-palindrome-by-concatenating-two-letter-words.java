class Solution {
    public int longestPalindrome(String[] words) {
        int n = words.length;
        int count = 0;
        
        HashMap<String,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            String rev = reverse(words[i]); 
            if (map.getOrDefault(rev, 0) > 0) {
    count += 4;
    map.put(rev, map.get(rev) - 1);
} else {
    map.put(words[i], map.getOrDefault(words[i], 0) + 1);
}
        }
        for(String str : map.keySet()){
            if(str.equals(reverse(str)) && map.get(str) > 0){
                count += 2;
                break;
            }
        }


        return count;
    }
    public String reverse(String s) {
        String news = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            news += s.charAt(i);
        }
        return news;
    }
}