class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();

        int max = 0;
        int ind = 0;
        int size = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < len; i++) {
            set.add(s.charAt(i));
            size++;

            if(set.size() == size){
                max = Math.max(max, size);
            }else{

                i = ind;
                set.clear();
                ind ++;
                size = 0;

            }

        }

        return max;
    }
}