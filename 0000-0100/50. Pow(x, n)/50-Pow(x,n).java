class Solution {
    public double myPow(double x, int n) {
        if(x == 1 || x == -1 || n == 0) return 1;
        else if(x == -1 && n%2 != 0) return -1;
        double num = 1;
        int minus = 1;
        if(n < 0) {
            n = -n;
            minus = -1;
        }
        while (n != 0){
            num *= x;
            n--;
        }
        if (minus == -1) return 1/num;
        return num;
    }
}