package ColtSteele;

public class CS_7_Search_Bin {
    /**
     * Given an ordered array b, and element n.
     * Find n in b. return the index of n.
     * Just have to do binary search
     *
     * Could consider this a divide and conquer problem
     * time complexity is O(log(n))
     * space complexity is O(1)
     * **/
    public static void main(String[] args){
        System.out.println(bin(new int[]{1,2,3,4,5,6},4));
        System.out.println(bin(new int[]{1,2},2));
        System.out.println(bin(new int[]{1,2,3,4,5,6},6));
        System.out.println(bin(new int[]{1,2,3,4,5,6},11));
    }
    public static int bin(int[] array, int target){
        if(array.length == 0) return array.length;
        int start = 0;
        int end = array.length-1;
        while((end - start) > 0){
            // mid can also just be (int)Math.floor((end+start)/2);
            int mid = start + ((end-start)/2) + 1;
            int midVal = array[mid];
            if(target > midVal){
                start = mid+1;
            }else if (target < midVal){
                end = mid-1;
            } else{
                return mid;
            }
        }
        return -1;
    }


}
