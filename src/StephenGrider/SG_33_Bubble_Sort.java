package StephenGrider;

import java.util.Arrays;

public class SG_33_Bubble_Sort {
    public static void main(String[] args){
        System.out.println(Arrays.toString(sort(new int[]{100, -40, 500, -124, 0, 21,7,66666})));
        System.out.println(Arrays.toString(sort(new int[]{100, -40, 500, -124, 0, 0,-2,-2})));
        System.out.println(Arrays.toString(sort(new int[]{1,1,-2})));
        System.out.println(Arrays.toString(sort(new int[]{1,-2})));
    }

    public static int[] sort(int[] input){
        if(input.length == 0) return input;
        for(int i =0; i < input.length;i++){
            for (int j =i+1; j <input.length;j++){
                int cur = input[i];
                int newright = input[j];
                if(cur > newright){
                    int temp = cur;
                    input[i] = newright;
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}
