package StephenGrider;

import java.util.Arrays;

public class SG_10_pyramid {
    // --- Directions
    // Write a function that accepts a positive number N.
    // The function should console log a pyramid shape
    // with N levels using the # character.  Make sure the
    // pyramid has spaces on both the left *and* right hand sides
    // --- Examples
    //   pyramid(1)
    //       '#'
    //   pyramid(2)
    //       ' # '
    //       '###'
    //   pyramid(3)
    //       '  #  '
    //       ' ### '
    //       '#####'
    //       #######
    public static void main(String[] args){
        printPyramid(33);
    }

    public static void printPyramid(int layers){
        int maxArrSize = (layers * 2)-1;
        char[] layer = new char[maxArrSize];
        Arrays.fill(layer,'*');
        int p1 = layer.length / 2;
        int p2 = p1;
        for(int i =0; i < layers;i++){
            layer[p1]='#';
            layer[p2]='#';
            p1--;
            p2++;
            System.out.println(String.copyValueOf(layer));
        }

    }
}
