package LeetCode;

import java.util.HashMap;

public class RomanInteger {

    public static void main(String[] args) {
        String s = "XXVII";
        int roman = romanToInt(s);
        System.out.println(roman);
    }

    public static int romanToInt(String s){
        int intValue = 0;
        for(int i = 0; i < s.length() -1; i++){
            if(getValue(s.charAt(i)) < getValue(s.charAt(i+1))){
                intValue -= getValue(s.charAt(i));
            } else {
                intValue += getValue(s.charAt(i));
            }
        }
        return intValue += getValue(s.charAt(s.length()-1));
    }

    public static int getValue(char ch){
        int res = 0;
        switch (ch) {
            case 'I' : res = 1;
                break;
            case 'V': res = 5;
                break;
            case 'X' : res = 10;
                break;
            case 'L' : res  = 50;
                break;
            case 'C' : res  = 100;
                break;
            case 'D' : res = 500;
                break;
            case 'M' : res = 1000;
                break;
        }
        return res;
    }
}
