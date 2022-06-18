package ColtSteele;

public class CS_9_minSubArrayLen {
    /**
     *
     * inputs: array and a positive int
     * return min length of a contiguous subarray of which the sum is
     * greater than or equal to the target
     *
     * example: 2,3,1,2,4,3 : 7
     *
     * 2,3,1,2 = 8
     * remove 2 = 6 (3,1,2)
     * 6+ 4 = 10 = 3,1,2,4
     * remove 3 = 7 (1,2,4)
     * add 3 = (1,2,4,3) = 10
     *
     *
     * any time you reach the end greater than equal to
     * move startP to the right,
     * once you hit the end keep moving startP to the right
     *
     * you were on the right track, but you made stuff too complicated
     * really do full examples to test your theories
     * **/

    public static void main(String[] args){
        System.out.println(minSubArrayLen(new int[]{2,3,1,2,4,3},7));
    }

    public static int minSubArrayLen(int[] input, int target){
        if(input.length == 0 ||
                (input.length == 1 && input[0] >= target)) return 0;
        int p1 = 0;
        int minLen = Integer.MAX_VALUE;
        int curSum = 0;

        for(int i = 0; i < input.length; i++){
            curSum = curSum + input[i];
            /**
             * This is exactly what you were thinking
             * reach a "curSum >= target"
             * then start moving right with the pointer until the
             * "curSum >= target" isn't true anymore.
             *
             * Except you were too scared that it would have negatively
             * affected the time complexity
             * **/
            while(curSum >= target){ // supposed to be a "while" loop, still gives use O(n) complexity
                if((i-p1+1) < minLen){
                    minLen = (i-p1+1);
                }
                curSum = curSum - input[p1];
                p1++;
            }
        }


        return minLen == Integer.MAX_VALUE ?  -1 : minLen;
    }
}
