class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        int res = 0;

        int ind = 0;

        int oper = 1;

        int max = Integer.MAX_VALUE / 10;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '-' && i == 0){
                oper = -1;
                continue;
            } else if (s.charAt(i) == '+' && i == 0) {
                continue;
            }
            try {
                int parseInt = Integer.parseInt(String.valueOf(s.charAt(i)));

                if(parseInt > 7 && res >= max && oper == 1 || ind == 10 && oper == 1){
                    return Integer.MAX_VALUE;
                }else if(parseInt > 8 && res >= max && oper == -1 || ind == 10 && oper == -1){
                    return Integer.MIN_VALUE;
                }else if(res > max  && oper == 1){
                    return Integer.MAX_VALUE;
                }else if(res > max && oper == -1){
                    return Integer.MIN_VALUE;
                }


                if(res == 0 && parseInt == 0){
                    continue;
                }

                res = res * 10 + parseInt;
                ind++;
            }catch (Exception e){
                break;
            }

        }

        return res * oper;
    }
}