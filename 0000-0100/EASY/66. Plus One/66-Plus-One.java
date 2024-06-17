class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + 1;
            if(num>9){
                if(i == 0){
                    int[] digits2 = new int[digits.length+1];
                    digits2[0] = 1;
                    return digits2;
                }
                digits[i] = num%10;
            }else{
                digits[i] = num;
                break;
            }
        }
        return digits;
    }
}