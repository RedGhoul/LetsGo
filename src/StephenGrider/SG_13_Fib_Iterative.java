package StephenGrider;

public class SG_13_Fib_Iterative {
    // same thing as SG_1 except you can't use recursion
    // have to use iterative approach
    public static void main(String[] args){
        System.out.println(fib_iter1(8));
        System.out.println(fib_iter1(10));
        System.out.println(fib_iter1(12));
        System.out.println(fib_iter1(14));
        System.out.println(fib_iter2(8));
        System.out.println(fib_iter2(10));
        System.out.println(fib_iter2(12));
        System.out.println(fib_iter2(14));
    }

    public static int fib_iter1(int n){
        int p1 = 0;
        int p2 = 1;
        for(int i =2; i < n; i++){
            int temp = p2;
            p2 = p1 + p2;
            p1 = temp;// has to be temp
        }
        return p2;
    }

    public static int fib_iter2(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for(int i =2; i < n; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[arr.length-1];
    }
}
