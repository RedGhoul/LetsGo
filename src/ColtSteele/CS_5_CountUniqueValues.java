package ColtSteele;

public class CS_5_CountUniqueValues {
    public static void main(String[] args){
        System.out.println(countUniqueValues(new int[]{1,1,1,1,1,2}));
        System.out.println(countUniqueValues(new int[]{1,2,3,4,4,4,7,7,12,12,13}));
        System.out.println(countUniqueValues(new int[]{}));
        System.out.println(countUniqueValues(new int[]{-2,-1,-1,0,1}));
    }

    public static int countUniqueValues(int[] input){
        if(input.length <= 1) return input.length;
        int baseP = 0;
        int uCount = 1;
        for(int comP = 0; comP < input.length; comP++){
            int baseVal = input[baseP];
            int newVal = input[comP];
            if(baseVal != newVal){
                uCount++;
                baseP = comP;
            }
        }
        return uCount;
    }
}
