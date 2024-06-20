class Solution {
    public int myAtoi(String s) {

        int i = 0;

        int oper = 1;

        int res = 0;

        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            oper = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i < s.length()){
            if(!Character.isDigit(s.charAt(i))){
                break;
            }

            char c = s.charAt(i++);
            int pre = res;

            res *= 10;

            if(pre != res / 10){
                return (oper == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res += (c - '0');

            if(res < 0){
                return (oper == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        return res * oper;
    }
}