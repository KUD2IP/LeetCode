class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = nums1.length - 1;

        int k = nums2.length - 1;

        while(k != -1){

            nums1[j] = nums2[k];
            k--;
            j--;

        }

        Arrays.sort(nums1);

    }
}