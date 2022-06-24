package StephenGrider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SG_35_Merge_Sort {
    public static void main(String[] args){
        // O(N*log(N)) since you have N element
        // and your gonna cut the array (Log(N)) times
        System.out.println(sort(new ArrayList<>(Arrays.asList(100, -40, 500, -124, 0, 21,7,66666))));
        System.out.println(sort(new ArrayList<>(Arrays.asList(100, -40, 500, -124, 0, 0,-2,-2))));
        System.out.println(sort(new ArrayList<>(Arrays.asList(1,1,-2))));
        System.out.println(sort(new ArrayList<>(Arrays.asList(1,-2))));
        System.out.println(sort(new ArrayList<>(Arrays.asList(1))));
    }

    public static List<Integer> sort(List<Integer> input){
        if(input == null || input.size() == 0) return input;
        return split(input);
    }

    /**
     * Two parts:
     * A cutter
     * A joiner
     *
     * Cutter keeps cutting the array in half
     * Joiner takes two arrays, and just joins them
     * from smallest to biggest
     *
     * You keep recursively cutting arrays till, you only have two numbers.
     * Then it is really simple to put the smallest before the
     * largest in the array
     *
     * So the cutter lives in the joiner, to a point where the recursive
     * calls keep returning half's of the array, in sorted form.
     *
     * Recursive Type Algo
     *
     * Log(n) <- since we are cutting stuff in half
     * n <- because we are cutting the array in half
     * for every element in the array
     *
     * Time complexity is O(n*log(n))
     *
     * **/
    public static List<Integer> split(List<Integer> input){
        if(input.size() <= 1) return input;
        List<Integer> input1 = new ArrayList<>();
        List<Integer> input2 = new ArrayList<>();
        if(input.size() == 2){
            input2 = new ArrayList<>(Arrays.asList(input.remove(0)));
            input1 = new ArrayList<>(Arrays.asList(input.remove(0)));
        }else{
            int midPoint = (input.size()-1) / 2;
            input1 = new ArrayList<>(input.subList(0,midPoint));
            input2 = new ArrayList<>(input.subList(midPoint,input.size()));
        }

        return sitch(split(input1),split(input2));
    }

    public static List<Integer> sitch(List<Integer> input1, List<Integer> input2){
        List<Integer> finalAn = new ArrayList<>();
        List<Integer> input11 = new ArrayList<>(input1);
        List<Integer> input22 = new ArrayList<>(input2);
        while(!input11.isEmpty() && !input22.isEmpty()){
            int input1V = input11.remove(0);
            int input2V = input22.remove(0);
            if(input1V < input2V){
                finalAn.add(input1V);
                input22.add(0,input2V);

            }else{
                finalAn.add(input2V);
                input11.add(0,input1V);
            }
        }
        finalAn.addAll(input22);
        finalAn.addAll(input11);

        return finalAn;
    }
}
