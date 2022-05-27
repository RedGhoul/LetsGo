package StephenGrider;

public class SG_1_Fibonacci {
    public static void main(String[] args){
        System.out.println(findFib(0));
        System.out.println(findFib(1));
        System.out.println(findFib(2));
        System.out.println(findFib(5));
    }
    // This takes into account negative numbers
    public static int findFib(int num){
        if(num <= 0){
            return 0;
        } else if(num == 1) return 1;
        return findFib(num - 2) + findFib(num-1);
    }
}
