class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            arr.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            arr.add(nums2[i]);
        }

        arr.sort((Integer::compareTo));


        if (arr.size() % 2 == 0) {
            return ((double) (arr.get(arr.size() / 2) + arr.get(arr.size() / 2 - 1))) / 2;
        }
        else {
            return arr.get(arr.size() / 2);
        }

    }
}
