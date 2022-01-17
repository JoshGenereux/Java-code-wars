package Easy;

import java.util.HashMap;

public class twoNumberSum {

    public static int[] twoNumberSumSimple(int[] array, int targetSum){
        int[] newArray = new int[2];
        for(int i = 0; i < array.length; i++){
            for (int s = 0; s < array.length; s++){
                if(array[i] + array[s] == targetSum && array[s] != array[i]){
                    newArray[0] = array[i];
                    newArray[1] = array[s];
                    return newArray;
                }
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSumComplex(int[] array, int targetSum){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] newArray = new int[2];
        for(int i = 0; i < array.length; i++){
            int val = targetSum - array[i];
            if(map.containsValue(val)){
                newArray[0] = array[i];
                newArray[1] = map.get(val);
                return newArray;
            } else {
                map.put(array[i], array[i]);
            }
        }
        return new int[0];
    }

}
