package ColtSteele;

public class CS_12_1_Recur_Power {
    /**
     * Write a function called power which accepts a base and an exponent.
     * The function should return the power of the base to the exponent.
     * This function should mimic the functionality of Math.pow()
     * **/

    public static void main(String[] args){
        System.out.println(recur_power(2, 4));
        System.out.println(recur_power(2, 5));
    }

    public static int recur_power(int base, int expo){
        if(expo == 0) return 1;
        return base * recur_power(base, expo-1);
    }
}
