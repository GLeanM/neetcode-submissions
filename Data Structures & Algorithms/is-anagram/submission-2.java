class Solution {
    public boolean isAnagram(String s, String t) {
        int word1 = s.length(), word2 = t.length();
        if(word1 != word2) return false;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < word1; i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            char c2 = t.charAt(i);
            map2.put(c2, map2.getOrDefault(c2, 0) + 1);
        }
        
        return map.equals(map2);
    }
}
