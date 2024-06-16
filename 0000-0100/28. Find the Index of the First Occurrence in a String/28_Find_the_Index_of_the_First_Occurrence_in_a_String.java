class Solution {
    public int strStr(String haystack, String needle) {
        int j = 0;

        if(needle.length() > haystack.length()){
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {

            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }else if(j>0 && haystack.charAt(i) != needle.charAt(j)){
                i = i - j;
                j = 0;
            }

            if (j == needle.length()) {
                j = i - j + 1;
                break;
            }else if (i > j && i == haystack.length() - 1 ){
                j = -1;
                break;
            }
        }
        return j;
    }
}