class Solution {
    public int climbStairs(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for(int i = 2; i < n; i++){
            list.add(list.get(i-1) + list.get(i-2));

        }

        return list.get(n-1);
    }
}