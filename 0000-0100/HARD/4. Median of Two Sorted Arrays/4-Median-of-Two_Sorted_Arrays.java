class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        int n = (l1 + l2) / 2 + 1;

        int[] arr = new int[n];

        int i = 0, j = 0, k = 0;

        while(i <= l1 && j <= l2 && k < n){

            if(i == l1 && j == l2){
                break;
            }

            if(i == l1){
                arr[k++] = nums2[j];
                j++;
                continue;
            }
            if(j == l2){
                arr[k++] = nums1[i];
                i++;
                continue;
            }

            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i];
                i++;
            }else{
                arr[k++] = nums2[j];
                j++;
            }
        }

        if((nums1.length + nums2.length) % 2 == 0){
            return (arr[n - 1] + arr[n - 2]) / 2.0;
        }else{
            return(double) arr[n - 1];
        }


    }
}