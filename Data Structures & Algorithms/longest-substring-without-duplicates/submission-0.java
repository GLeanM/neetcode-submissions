class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        // Set that keeps track of the elements
        // Need to track where in the array we are
        // zxyzxyz
        // abcb
        int count = 1;
        int total = 1;
        int l = 0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        for(int r = 1; r < s.length(); r++){
            char c = s.charAt(r);
            if(set.add(c)){
                total = Math.max(total, r - l + 1);
            }else{
                while(!set.add(c)){
                    set.remove(s.charAt(l));
                    l++;
                }
                total = Math.max(total, r - l + 1);
            }
        }
        return total;
    }
}
