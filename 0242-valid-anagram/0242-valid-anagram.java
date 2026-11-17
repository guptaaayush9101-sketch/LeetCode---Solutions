class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer>map1 = new HashMap<>();
        HashMap<Character,Integer>map2 = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch = t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        else{
            return false;
        }
    }
}