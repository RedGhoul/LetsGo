package ColtSteele;

public class CS_12_3_Recur_recursiveRange {
    // add up all the numbers to the number passed in recursively
    public static void main(String[] args){
        System.out.println(findRecursiveRange(6));
        System.out.println(findRecursiveRange(10));
    }

    public static int findRecursiveRange(int input){
        if(input == 1) return 1;
        return input + findRecursiveRange(input-1);
    }
}
