package ColtSteele;

import java.util.Arrays;

public class CS_13_Quick_Sort {
    /**
     * The basic idea of this algo is not to sort everything
     * in a linear fashion. But rather break it up into chunks
     * similar to the way that Merge Sort Does it
     *
     * For Quick Sort it's all about the pivots.
     *
     * Take a random number, as your pivot, put everything that is less the
     * pivot on the left side, put everything greater than the pivot on the right side.
     *
     * Then apply the same idea on either side of the pivot over and over again, until
     * you end up with nothing left to use as a pivot. (Usually done recursively)
     *
     * At that point your array should be sorted.
     *
     * uses two layers of helper functions
     * 1st function is the initial helper function to create the recursion
     * 2nd function is a utility found that does the pivoting and modification of the array
     * (make sure you are going from the GIVEN start to the GIVEN end)
     * **/


    public static void main(String[] args){
        System.out.println(Arrays.toString(QuickSort(new int[]{4,6,9,1,2,5,3})));
    }
    public static int[] QuickSort(int[] input){
        QuickSortHelper(input,0, input.length-1);
        return input;
    }

    public static int[] QuickSortHelper(int[] input, int start, int end){
        if(start < end){
            int p = pivot(input,start,end);

            QuickSortHelper(input, 0,p-1);
            QuickSortHelper(input, p+1,end);
        }

        return input;
    }
    public static int pivot(int[] input, int start, int end){
        int curPivotVal = input[start];
        int curPivIndex = start;
        for(int i = start; i <= end; i++){
            if(curPivotVal > input[i]){
                curPivIndex++;
                int temp = input[i];
                input[i] = input[curPivIndex];
                input[curPivIndex] = temp;
            }
        }
        int temp = input[start];
        input[start] = input[curPivIndex];
        input[curPivIndex] = temp;
        return curPivIndex;
    }
}
