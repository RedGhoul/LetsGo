package StephenGrider;

import java.util.HashMap;

public class SG_14_Fib_Memo {
    public static void main(String[] args){
        System.out.println(fib_memo(8));
        System.out.println(fib_memo(10));
        System.out.println(fib_memo(12));
        System.out.println(fib_memo(14));
    }

    public static int fib_memo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib_memo_helper(n, new HashMap<>());
    }

    public static int fib_memo_helper(int n, HashMap<Integer,Integer> bag){
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(bag.containsKey(n)) {
            return bag.get(n);
        }
        int value = fib_memo_helper(n-1, bag) + fib_memo_helper(n-2,bag);
        bag.put(n,value);
        return value;
    }
}
