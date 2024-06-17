//Подход 1: объединение и сортировка
//Создайте новый массив с размером, равным общему количеству элементов в обоих входных массивах.
//Вставьте элементы из обоих входных массивов в новый массив.
//Отсортируйте новый массив.
//Найдите и верните медиану отсортированного массива.
//Временная сложность
//
//В худшем случае TC равен O ((n + m) * log(n + m)).
//
//Сложность пространства
//
//O(n + m), где ‘n’ и ‘m’ - размеры массивов.
//
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
