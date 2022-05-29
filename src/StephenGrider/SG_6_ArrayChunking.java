package StephenGrider;

import java.util.ArrayList;
import java.util.Arrays;

public class SG_6_ArrayChunking {
    // --- Directions
    // Given an array and chunk size, divide the array into many subarrays
    // where each subarray is of length size
    // --- Examples
    // chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
    // chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
    // chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
    // chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
    // chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
    public static void main(String[]  args){
        System.out.println(chunk(new ArrayList<>(Arrays.asList(1, 2, 3, 4)),2));
        System.out.println(chunk(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)),2));
        System.out.println(chunk(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)),3));
        System.out.println(chunk(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)),4));
        System.out.println(chunk(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)),10));
    }

    public static ArrayList<ArrayList<Integer>> chunk(ArrayList<Integer> arr, int size){
        if(arr == null) return null;
        ArrayList<ArrayList<Integer>> finalAnswer = new ArrayList<ArrayList<Integer>>();
        if(size == 0){
            return finalAnswer;
        }
        if(size > arr.size()) return finalAnswer;
        ArrayList<Integer> temp = new ArrayList<>();
        int sizeCount = 0;
        for(int i = 0; i < arr.size(); i++){
            sizeCount++;
            if(sizeCount == size){
                finalAnswer.add(temp);
                /*
                 * The reason you got this wrong was cause:
                 * 1) you didn't properly trace your code
                 * 2) you were adding to the final answer, without adding the current
                 * index's value to the temp array
                 * */
                temp.add(arr.get(i));
                temp = new ArrayList<>();
                sizeCount = 0;
            }else{
                temp.add(arr.get(i));
            }
        }
        if(temp.size() > 0){
            finalAnswer.add(temp);
        }
        return finalAnswer;
    }
}
