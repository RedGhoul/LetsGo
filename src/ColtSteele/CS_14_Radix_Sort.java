package ColtSteele;

import java.util.ArrayList;
import java.util.Arrays;

public class CS_14_Radix_Sort {
    /**
     * Special since it goes beyond the limits of "compare"
     * based sorts, which have a limit of O(n*log(n)) of time complexity.
     *
     * Stops comparing, and starts grouping
     *
     * Basic idea is that we group values into buckets based on their first digit
     * Then we flatten out the buckets, and do it again based on their second digit.
     * And we keep doing that, till we can't.
     * Then the resulting flattened array will be sorted
     *
     * Time complexity:
     * double for loop, but then you have the outside loop
     * acting on an array of buckets based on the max int in the list of numbers (n)
     * Then on the inside loop you are acting on the list of numbers (k)
     *
     * So it ends up being O(n*k)
     *
     * Space complexity:
     * two big lists n + k
     * **/

     public static void main(String[] args){
        System.out.println(getDigit(12345,0));
        System.out.println(getDigit(12345,1));
        System.out.println(getDigit(12345,2));

        System.out.println(radixSort(new ArrayList<>(
                Arrays.asList(1556,4,3556,593,408,4386,902,7,8157,86,9637,29, 999999))));
     }

     public static ArrayList<Integer> radixSort(ArrayList<Integer> list){
         if(list.isEmpty()) return null;
         // getting the max size
         int maxArraySize = getMaxSizeOfNumber(list);
         ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
         for(int k = 0; k < maxArraySize;k++){
             buckets.add(k,new ArrayList<>());
         }
         for(int k = 0; k <= maxArraySize; k++){

             for(int i =0; i < list.size(); i++){
                 int curVal = list.get(i);
                 int sizeOfVal = getDigit(curVal,k);
                 buckets.get(sizeOfVal).add(curVal);
             }

             ArrayList<Integer> interAnswer = new ArrayList<>();
             for(int b = 0; b < buckets.size();b++){
                 interAnswer.addAll(buckets.get(b));
             }
             list = interAnswer;
             buckets = new ArrayList<ArrayList<Integer>>();
             for(int j = 0; j <= maxArraySize;j++){
                 buckets.add(j,new ArrayList<>());
             }
         }

         return list;
     }

     public static int getMaxSizeOfNumber(ArrayList<Integer> list){
         int max = Integer.MIN_VALUE;
         for(Integer curVal: list){
             int curMax = digitCount(curVal);
             if(curMax > max){
                 max =curMax;
             }
         }
         return max;
     }

     public static int digitCount(int num){
         if(num == 0) return 1;
         return (int) (Math.floor(Math.log(Math.abs(num)))+1);
     }
     public static int getDigit(int curDigit, int place){
         if(curDigit == 0) return 0;
         char[] curVal = String.valueOf(curDigit).toCharArray();
         if(place > curVal.length - 1) return 0;
         return Integer.parseInt(String.valueOf(curVal[(curVal.length-1)-place]));
     }

     // the other way of doing this
     public static int getDigitMath(int num, int i){
         return (int) (Math.floor(Math.abs(num)/Math.pow(num,i)) % 10);
     }


}
