package JosePortilla;

import java.util.ArrayList;
import java.util.List;

public class JP_Array_5_Sentence_Reversal {
    // apparently a leet code medium
    // cannot use a split or trim
    public static void main(String[] args){
        System.out.println(reversalHard("     space before"));
        System.out.println(reversalHard("space after     "));
        System.out.println(reversalHard("   Hello John    how are you   "));
        System.out.println(reversalHard("1"));
        System.out.println(reversalHardEasy("     space before"));
        System.out.println(reversalHardEasy("space after     "));
        System.out.println(reversalHardEasy("   Hello John    how are you   "));
        System.out.println(reversalHardEasy("1"));
    }

    // lets try a while loop
    // translated from python
    public static String reversalHardEasy(String input){
        if(input == null || input.isEmpty()) return "";
        int index = 0;
        char[] inputArr = input.toCharArray();
        List<String> hss = new ArrayList<>();
        while(index < inputArr.length-1){
            char curChar = inputArr[index];
            if(curChar != ' '){
                int start = index;
                while(index < inputArr.length-1 && inputArr[index] != ' '){
                    index++;
                }
                hss.add(input.substring(start,index));
            }
            index++;// to move forward
        }
        String finalAnswer = "";
        for(int i = 0; i < hss.size(); i++){
            if(i == 0){
                finalAnswer =  hss.get(i) + finalAnswer;
            }else{
                finalAnswer = hss.get(i) + " "  + finalAnswer;
            }

        }
        return finalAnswer;
    }

    // this actually worked wow
    // could have done it the easy by using a while loop
    public static String reversalHard(String input){
        if(input == null || input.isEmpty()) return "";
        char[] inputArr = input.toCharArray();
        List<String> stringList = new ArrayList<>();
        int lastGoodIndex = 0;
        for(int i = 0; i < inputArr.length; i++){
            char curChar = inputArr[i];
            if(curChar != ' ' && inputArr[lastGoodIndex] == ' '){
                lastGoodIndex = i;
            }
            if((curChar == ' ' || (curChar != ' ' && i == inputArr.length-1))
                    && inputArr[lastGoodIndex] != ' '){
                if(i == inputArr.length-1){
                    stringList.add(input.substring(lastGoodIndex,i+1));
                }else{
                    stringList.add(input.substring(lastGoodIndex,i));
                }
                lastGoodIndex = i;
            }
        }
        String finalAnswer = "";
        for(int i = 0; i < stringList.size(); i++){
            if(i == 0){
                finalAnswer =  stringList.get(i) + finalAnswer;
            }else{
                finalAnswer = stringList.get(i) + " "  + finalAnswer;
            }

        }

        return finalAnswer;
    }
    public static String reversalRight(String input){
        if(input == null || input.isEmpty()) return "";
        input = input.trim();
        String[] inputArr = input.split(" ");
        int p1 = 0;
        int p2 = inputArr.length-1;
        while(p1 < p2){
            String temp = inputArr[p1];
            inputArr[p1] = inputArr[p2];
            inputArr[p2] = temp;
            p1++;
            p2--;
        }
        return String.join(" ", inputArr);
    }


    // wrong I guess you just want to reverse the words not letters
    public static String reversal(String input){
        if(input == null || input.isEmpty()) return "";
        input = input.trim();
        char[] inputArr = input.toCharArray();
        int p1 = 0;
        int p2 = inputArr.length-1;
        while(p1 <p2){
            char temp = inputArr[p1];
            inputArr[p1] = inputArr[p2];
            inputArr[p2] = temp;
            p1++;
            p2--;
        }
        return String.valueOf(inputArr);
    }
}
