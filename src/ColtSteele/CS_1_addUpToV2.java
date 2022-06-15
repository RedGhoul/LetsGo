package ColtSteele;

public class CS_1_addUpToV2 {
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
     * Time complexity is constant O(1)
     * just a simple equation
     * (n+1)
     * -----
     *   2
     * **/
    public static int addUpTo(int n){
        return (n+1)/2;
    }
}
