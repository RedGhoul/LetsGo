package StephenGrider;

import java.util.Arrays;

public class SG_34_Sort_By_Selection {

    public static void main(String[] args){
        System.out.println(Arrays.toString(sort(new int[]{100, -40, 500, -124, 0, 21,7,66666})));
        System.out.println(Arrays.toString(sort(new int[]{100, -40, 500, -124, 0, 0,-2,-2})));
        System.out.println(Arrays.toString(sort(new int[]{1,1,-2})));
        System.out.println(Arrays.toString(sort(new int[]{1,-2})));
        System.out.println(Arrays.toString(sort(new int[]{1})));
    }
    /**
     * I am going to assume that my current value is the smallest
     * Then I am going to go through the rest of the array to see
     * If I am wrong, at the end I will make the switch
     * Time complexity: Double For Loop so O(n^2)
     * **/
    public static int[] sort(int[] input){
        if(input.length == 0) return input;
        for(int i =0; i < input.length; i++){
            int curCon = input[i];
            int finalI = 0;
            for(int j = i+1; j < input.length; j++){
                if(input[j] < curCon){
                    curCon = input[j];
                    finalI = j;
                }
            }
            if(finalI != 0){
                int temp = input[i];
                input[i] = input[finalI];
                input[finalI] = temp;
            }
        }

        return input;
    }

}
