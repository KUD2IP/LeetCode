class Solution {
    public String intToRoman(int num) {
        int n1000 = num / 1000;
        int n100 = (num / 100) % 10;
        int n10 = (num / 10) % 10;
        int n1 = num % 10;

        StringBuilder str = new StringBuilder();

        switch(n1000){
            case 1: str.append("M"); break;
            case 2: str.append("MM"); break;
            case 3: str.append("MMM"); break;
            default: break;
        }

        switch(n100){
            case 1: str.append("C"); break;
            case 2: str.append("CC"); break;
            case 3: str.append("CCC"); break;
            case 4: str.append("CD"); break;
            case 5: str.append("D"); break;
            case 6: str.append("DC"); break;
            case 7: str.append("DCC"); break;
            case 8: str.append("DCCC"); break;
            case 9: str.append("CM"); break;
            default: break;
        }

        switch(n10){
            case 1: str.append("X"); break;
            case 2: str.append("XX"); break;
            case 3: str.append("XXX"); break;
            case 4: str.append("XL"); break;
            case 5: str.append("L"); break;
            case 6: str.append("LX"); break;
            case 7: str.append("LXX"); break;
            case 8: str.append("LXXX"); break;
            case 9: str.append("XC"); break;
            default: break;
        }

        switch(n1){
            case 1: str.append("I"); break;
            case 2: str.append("II"); break;
            case 3: str.append("III"); break;
            case 4: str.append("IV"); break;
            case 5: str.append("V"); break;
            case 6: str.append("VI"); break;
            case 7: str.append("VII"); break;
            case 8: str.append("VIII"); break;
            case 9: str.append("IX"); break;
            default: break;
        }

        return str.toString();
    }
}