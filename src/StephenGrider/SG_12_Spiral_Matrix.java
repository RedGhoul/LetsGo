package StephenGrider;

import java.util.Arrays;

public class SG_12_Spiral_Matrix {
    // --- Directions
// Write a function that accepts an integer N
// and returns a NxN spiral matrix.
// --- Examples
//   matrix(2)
//     [[1, 2],
//     [4, 3]]
//   matrix(3)
//     [[1, 2, 3],
//     [8, 9, 4],
//     [7, 6, 5]]
//  matrix(4)
//     [[1,   2,  3, 4],
//     [12, 13, 14, 5],
//     [11, 16, 15, 6],
//     [10,  9,  8, 7]]
    // can't believe I didn't it on my first try
    public static void main(String[] args){
        int[][] ff = genSpiral(66);
        for (int[] row : ff)
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] genSpiral(int n){
        int[][] newS = new int[n][n];
        // for loop for n*n spaces
        // neck is killing me
        // you keep going straight right
        int startC = 0;
        int endC = n-1;
        int startR = 0;
        int endR = n-1;
        int count = 1;
        while(count <= n*n){
            for(int j = startC; j <= endC; j++){
                newS[startR][j] = count;
                count++;
            }
            startR++;

            for(int j = startR; j <= endR; j++){
                newS[j][endC] = count;
                count++;
            }
            endC--;

            for(int j = endC; j >= startC; j--){
                newS[endR][j] = count;
                count++;
            }
            endR--;

            for(int j = endR; j >= startR; j--){
                newS[j][startC]=count;
                count++;
            }
            startC++;
        }

        return newS;
    }
}
