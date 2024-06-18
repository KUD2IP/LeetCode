//Подход 4: бинарный поиск (ВЕРНОЕ РЕШЕНИЕ)
//
//Используйте двоичный поиск, чтобы разделить меньший из двух входных массивов на две части.
//Найдите раздел большего массива таким образом, чтобы сумма элементов в левой части раздела
//в обоих массивах составляла половину от общего количества элементов.
//Проверьте, допустимо ли это разделение, проверив,
//является ли наибольшее число в левой части меньше наименьшего числа в правой части.
//Если разбиение допустимо, вычислите и верните медиану.
//Временная сложность
//
//O(log(min(m, n)))
//
//Сложность пространства
//
//O(1)

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