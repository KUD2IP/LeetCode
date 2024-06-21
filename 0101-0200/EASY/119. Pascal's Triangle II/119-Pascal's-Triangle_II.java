class Solution {
    public List<Integer> getRow(int rowIndex) {

        long a = 1;

        List<Integer> list = new ArrayList<>();

        list.add(1);

        if(rowIndex == 0){
            return list;
        }

        for(int i = 1; i <= rowIndex; i++){

            a = a * (rowIndex + 1 - i);
            a /= i;

            list.add((int) a );

        }

        return list;
    }
}