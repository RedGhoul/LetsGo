package JosePortilla;

import java.util.HashMap;
import java.util.Stack;

public class JP_SQD_Balanced_Parentheses {
    public static void main(String[] args){
        System.out.println(check("[](){([[[]]])}("));
        System.out.println(check("[{{{(())}}}]((()))"));
        System.out.println(check("[[[]])]"));
    }

    public static Boolean check(String input){
        if(input == null || input.isBlank()) return false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bag = new HashMap<>();
        bag.put(')', '(');
        bag.put(']', '[');
        bag.put('}', '{');
        for(Character value: input.toCharArray()){
            if(value != ')' && value != ']' && value != '}'){
                stack.add(value);
            }else{
                if(stack.isEmpty()) return false;
                Character valueOffStack = stack.pop();
                if(valueOffStack != bag.get(value)) return false;
            }
        }
        return stack.isEmpty();
    }

}
