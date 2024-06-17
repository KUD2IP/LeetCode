class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();

        Map<Character, Integer> map = new HashMap<>();

        int max = 0;

        for (int i = 0; i < len; i++) {

            if (map.containsKey(s.charAt(i))) {

                i = map.get(s.charAt(i));
                map.clear();

            } else {

                map.put(s.charAt(i), i);
                max = Math.max(max, map.size());

            }
        }

        return max;
    }
}