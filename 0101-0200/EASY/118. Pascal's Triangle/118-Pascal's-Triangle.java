class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        int i = 1;
        while (i <= numRows){

            List<Integer> list1 = new ArrayList<>();

            int b = 0;


            while(list1.size() < i){

                if(list1.size() == 0 || list1.size() + 1 == i){
                    list1.add(1);
                    continue;
                }

                if(i > 2){
                    list1.add(list.get(i - 2).get(b) + list.get(i - 2).get(++b));
                }
            }

            list.add(list1);

            i++;
        }

        return list;
    }
}