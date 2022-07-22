package JosePortilla;

import java.util.Arrays;
import java.util.List;

public class JP_Array_4_Largest_Continuous_Sum {
    /**
     * This makes sense for a simple reason
     * If the array is not filled with negatives, that usually means that
     * the longest continuous sum is the sum of the whole array.
     *
     * If it is filled with more or bigger negatives, then the currentSum will
     * turn negatives. So you subtract & move up your left most pointer.
     * **/
    public static void main(String[] args){
        System.out.println(findLCS(Arrays.asList(1,2,-1,3,4,-1)));
        System.out.println(findLCSRightLeetCode(Arrays.asList(1,2,-1,3,4,-1)));
        System.out.println(findLCS(Arrays.asList(1,2,-1,3,4,10,10,-10,-1)));
        System.out.println(findLCSRightLeetCode(Arrays.asList(1,2,-1,3,4,10,10,-10,-1)));
        System.out.println(findLCS(Arrays.asList(-1,1)));
        System.out.println(findLCSRightLeetCode(Arrays.asList(-1,1)));
        System.out.println(findLCS(Arrays.asList(-2,1,-3,4,-1,2,1,-5,4)));
        System.out.println(findLCSRightLeetCode(Arrays.asList(-2,1,-3,4,-1,2,1,-5,4)));
        System.out.println(findLCS(Arrays.asList(5,4,-1,7,8)));
        System.out.println(findLCSRightLeetCode(Arrays.asList(5,4,-1,7,8)));
        System.out.println(findLCS(Arrays.asList(1)));
        System.out.println(findLCSRightLeetCode(Arrays.asList(1)));
    }

    // you can easily keep track of the indexes
    public static int findLCS(List<Integer> input){
        if(input == null || input.isEmpty()) return 0;
        if(input.size() == 1) return input.get(0);
        if(input.size() == 2){
            if(input.get(0) < input.get(1)){
                return input.get(1);
            }else{
                return input.get(0);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int p1 = 0;
        int currentSum = input.get(p1);

        for(int p2 = 1; p2 < input.size(); p2++){
            currentSum = currentSum + input.get(p2);
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum <= 0){ // "<=" cause once it hits less than
                // zero or equal to zero it's not worth caring about
                currentSum = currentSum - input.get(p1);
                p1++;
            }
        }
        return maxSum;
    }
    /**
     * At any given time just take the max, between what you just found (currentSum)
     * And what you were just given (current value). Because that would mean
     * that every thing behind you is too small to care about.
     *
     * Much simpler
     * **/
    public static int findLCSRightLeetCode(List<Integer> input){
        int curSum = 0;
        int maxSum = 0;
        for(int num: input){
            curSum = Math.max(curSum+num, num);
            maxSum = Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}
