package StephenGrider;

import java.util.Arrays;

public class SG_9_PrintSteps {
    // --- Directions
    // Write a function that accepts a positive number N.
    // The function should console log a step shape
    // with N levels using the # character.  Make sure the
    // step has spaces on the right hand side!
    // --- Examples
    //   steps(2)
    //       '# '
    //       '##'
    //   steps(3)
    //       '#  '
    //       '## '
    //       '###'
    //   steps(4)
    //       '#   '
    //       '##  '
    //       '### '
    //       '####'
    // there is also a recursive way of doing this
    public static void main(String[] args){
        printSteps(2);
        printSteps(3);
        printSteps(4);
    }

    // un-initialized char arrays hold a value of zeros
    public static void printSteps(int steps){
        if(steps == 0) return;
        char[] level = new char[steps];
        // how to initialize an array with a default value
        Arrays.fill(level,' ');
        for(int i = 0; i < steps;i++){
            level[i] = '#';
            System.out.println(String.copyValueOf(level));
        }
    }
}
