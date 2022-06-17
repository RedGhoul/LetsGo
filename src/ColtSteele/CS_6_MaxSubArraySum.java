package ColtSteele;

public class CS_6_MaxSubArraySum {

    public static void main(String[] args){
//        System.out.println(maxSubArraySum(new int[]{1,2,5,2,8,1,5},2));
//        System.out.println(maxSubArraySum(new int[]{1,2,5,2,8,1,5},4));
//        System.out.println(maxSubArraySum(new int[]{4,2,1,6},1));
        System.out.println(maxSubArraySum(new int[]{4,2,1,6,2},4));
        System.out.println(maxSubArraySum(new int[]{},4));
    }
    /**
     * given an array and number n.
     * find the max sum of n contiguous elements in the array.
     **/
    public static int maxSubArraySum(int[] array, int sumSize){
        if(array.length == 0 || sumSize == 0) return 0;
        if(sumSize > array.length-1) return 0;
        int currentSum = 0;
        for(int i = 0; i < sumSize; i++){
            currentSum = currentSum + array[i];
        }
        int maxSum = Integer.MIN_VALUE;
        // have to do an initial check here to figure out
        // if the base currentSum is the biggest
        if(currentSum > maxSum){
            maxSum = currentSum;
        }
        int backPointer = 0;
        for(int i = 0; i <= array.length-sumSize-1; i++){
            int subTract = array[backPointer];
            int add = array[i+sumSize];
            currentSum = currentSum - subTract;
            currentSum = currentSum + add;
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            backPointer++;
        }
        return maxSum;
    }
}
