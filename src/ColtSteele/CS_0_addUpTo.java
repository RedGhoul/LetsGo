package ColtSteele;

public class CS_0_addUpTo {
    /**
     * Write a function that calculates the sum of all numbers from 1 up to
     * and including to some number "n"
     *
     * **/
    public static void main(String[] args){
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(11));
        System.out.println(addUpTo(13));
        System.out.println(addUpTo(10));
    }
    /**
     * Doing it the basic linear way
     * Has a time complexity of O(n)
     * Time grows as input grows linearly
     * **/
    public static int addUpTo(int n){
        int answer = 0;
        for(int i = 1; i <= n; i++){
            answer = answer + i;
        }
        return answer;
    }
}
