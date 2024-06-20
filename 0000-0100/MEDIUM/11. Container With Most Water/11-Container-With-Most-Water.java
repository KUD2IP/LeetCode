class Solution {
    public int maxArea(int[] height) {

        int max = 0;
        int k = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            k = Math.min(height[left], height[right]) * (right - left);
            max = (k > max) ? k : max;

            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return max;

    }
}