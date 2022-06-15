package ColtSteele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CS_4_SumZero {
    /**
     * Write a function called sumZero which accepts a
     * sorted array of integers. The function should
     * find the first pair where the sum is 0.
     * Return an array that includes both values
     * that sum to zero or undefined if a pair does not exist
     *
     *
     * time: O(n)
     * space: O(1) because we are not making anything new
     * **/

    public static void main(String[] args){

       System.out.println(sumZero(Arrays.asList(-3,-2,-1,0,1,2,3)));
       System.out.println(sumZero(Arrays.asList(-2,0,1,3)));
       System.out.println(sumZero(Arrays.asList(1,2,3)));

    }

    public static List<Integer> sumZero(List<Integer> input){
        if(input == null || input.size() <= 1) return input;
        int target = 0;
        int smallP = 0;
        int bigP = input.size()-1;
        while(smallP < bigP){
            int smallVal = input.get(smallP);
            int bigVal = input.get(bigP);
            int sum = smallVal + bigVal;
            if(sum < target){
                smallP++;
            }else if(sum > target){
                bigP--;
            } else {
                return new ArrayList<>(Arrays.asList(smallP, bigP));
            }
        }
        return new ArrayList<>();
    }
}
