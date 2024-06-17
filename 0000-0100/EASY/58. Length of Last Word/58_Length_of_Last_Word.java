class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        String str = s.strip();
        int n = str.length()-1;
        while(str.charAt(n)!=' '){
            len++;
            if(n==0) break;
            n--;
        }
        return len;
    }
}