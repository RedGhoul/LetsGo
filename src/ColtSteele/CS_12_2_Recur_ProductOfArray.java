package ColtSteele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CS_12_2_Recur_ProductOfArray {
    public static void main(String[] args){
        System.out.println(findProductOfArray(new ArrayList<>(Arrays.asList(1,2,3))));
        System.out.println(findProductOfArray(new ArrayList<>(Arrays.asList(1,2,3,10))));
    }

    public static int findProductOfArray(ArrayList<Integer> input){
        if(input.isEmpty()) return 1;
        int curInt = input.remove(0);
        return curInt * findProductOfArray(input);
    }
}
