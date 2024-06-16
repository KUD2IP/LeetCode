class Solution {
    public String addBinary(String a, String b) {
        int n = a.length() - 1;
        int m = b.length() - 1;
        String sum = "";
        String ans = "0";
        while (n >= 0 && m >= 0) {
            if (ans.equals("0")) {
                if (a.charAt(n) == '1' && b.charAt(m) == '1') {
                    sum = "0" + sum;
                    ans = "1";
                } else if (a.charAt(n) == '1' && b.charAt(m) == '0'
                        || a.charAt(n) == '0' && b.charAt(m) == '1') {
                    sum = "1" + sum;
                    ans = "0";
                } else if (a.charAt(n) == '0' && b.charAt(m) == '0') {
                    sum = "0" + sum;
                    ans = "0";
                }
            }
            else if (ans.equals("1")) {
                if (a.charAt(n) == '1' && b.charAt(m) == '1') {
                    sum = "1" + sum;
                    ans = "1";
                } else if (a.charAt(n) == '1' && b.charAt(m) == '0'
                        || a.charAt(n) == '0' && b.charAt(m) == '1') {
                    sum = "0" + sum;
                    ans = "1";
                } else if (a.charAt(n) == '0' && b.charAt(m) == '0') {
                    sum = "1" + sum;
                    ans = "0";
                }
            }
            n--;
            m--;
        }

        if(n == -1){
            while(m >= 0){
                if(ans.equals("0")){
                    if(b.charAt(m) == '1'){
                        sum = "1" + sum;
                        ans = "0";
                    }
                    else if(b.charAt(m) == '0'){
                        sum = "0" + sum;
                        ans = "0";
                    }
                }
                else if(ans.equals("1")){
                    if(b.charAt(m) == '1'){
                        sum = "0" + sum;
                        ans = "1";
                    }
                    else if(b.charAt(m) == '0'){
                        sum = "1" + sum;
                        ans = "0";
                    }
                }
                m--;
            }
        }
        else if(m == -1){
            while(n >= 0){
                if(ans.equals("0")){
                    if(a.charAt(n) == '1'){
                        sum = "1" + sum;
                        ans = "0";
                    }
                    else if(a.charAt(n) == '0'){
                        sum = "0" + sum;
                        ans = "0";
                    }
                }
                else if(ans.equals("1")){
                    if(a.charAt(n) == '1'){
                        sum = "0" + sum;
                        ans = "1";
                    }
                    else if(a.charAt(n) == '0') {
                        sum = "1" + sum;
                        ans = "0";
                    }
                }
                n--;
            }
        }

        if(ans.equals("1"))
            return ans + sum;
        return sum;
    }
}