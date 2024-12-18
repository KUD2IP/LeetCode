class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 > n2){
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0, hight = n1;

        while(low <= hight){

            int mid1 = (low + hight) / 2;
            int mid2 = ((n1 + n2 + 1) / 2) - mid1;

            int left1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int right1 = (mid1 == n1) ? Integer.MAX_VALUE : nums1[mid1];

            int left2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int right2 = (mid2 == n2) ? Integer.MAX_VALUE : nums2[mid2];

            if(left1 <= right2 && left2 <= right1){

                if((n1 + n2) % 2 == 0){
                    return (double)(Integer.max(left1, left2) + Integer.min(right1, right2)) / 2;

                }else{
                    return Integer.max(left1, left2);
                }


            }else if (left2 > right1){
                low = mid1 + 1;
            }else{
                hight = mid1 - 1;
            }
        }

        return 0.0;
    }
}