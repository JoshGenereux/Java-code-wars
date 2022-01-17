package LeetCode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] string = {"flower", "flow", "flight"};
        String answer = longestCommonPrefix(string);
        System.out.println(answer);
    }

    public static String longestCommonPrefix(String [] strs){
        int min = strs[0].length();
        String smallest = strs[0];
        for(int i = 1; i < strs.length; i++){
            if(min > strs[i].length()){
                min = strs[i].length();
                smallest = strs[i];
            }
        }
        for(int i = 0; i < min; i++){
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != smallest.charAt(i)){
                    return smallest.substring(0, i);
                }
            }
        }
        return smallest;
    }

}
