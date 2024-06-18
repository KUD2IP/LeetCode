class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || s.length() == numRows){
            return s;
        }

        int ind = 0, d = 1;

        List<Character>[] list = new ArrayList[numRows];

        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<>();
        }

        for(char c : s.toCharArray()){
            list[ind].add(c);

            if(ind == 0){
                d = 1;
            }else if(ind == numRows - 1){
                d = -1;
            }

            ind += d;
        }

        StringBuilder str = new StringBuilder();

        for(List<Character> l : list){
            for(char c : l){
                str.append(c);
            }
        }

        return str.toString();

    }
}