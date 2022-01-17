package Easy;

import java.util.Arrays;

public class SortedSquaredArray {

    public static void main(String[] args) {
        int [] array = {-5, -4, -3, -2, -1};
        array = sortedSquaredArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortedSquaredArray(int[] array) {
        int [] sortedArray = new int[array.length];
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            int value = array[i];
            value *= value;
            sortedArray[i] = value;
            count++;
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }

}
