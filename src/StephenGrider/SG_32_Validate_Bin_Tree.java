package StephenGrider;

public class SG_32_Validate_Bin_Tree {
    // --- Directions
    // Given a node, validate the binary search tree,
    // ensuring that every node's left hand child is
    // less than the parent node's value, and that
    // every node's right hand child is greater than
    // the parent

    public static void main(String[] args){

    }

    public static boolean validate(SG_29_Binary_Tree_Node node){
        if(node == null) return false;
        return validateHelper(node, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    /**
     * Your only validating one node in the tree at a time.
     * That new node has to be within the bounds of the current recursive call
     * 1) make sure your within bounds of max and min
     * 2) your current value becomes the max for the left-hand side recursion
     * 3) if it doesn't fail validating the left hand side it will move to the right hand side
     * 4) your current value becomes the min for the right-side side recursion
     * - the reason you want the validateHelper in the if clause, is cause you don't
     * want its output to effect the final boolean value. Since it could be
     * true for only a specific part of the tree.
     * **/
    private static boolean validateHelper(SG_29_Binary_Tree_Node node, int maxValue, int minValue) {
        // false conditions !
        if(node.data > maxValue) return false;
        if(node.data < minValue) return false;

        // makes sense to make node.data max value. since once you start going left
        // it the top values should be the greatest thing there
        // and if the left node is greater than the last node's value you know you
        // don't have a valid binary tree
        if(node.left != null && !validateHelper(node.left,node.data,minValue)){
            return false;
        }
        // here if your right value of a node is less than the min
        // which was the previous node you know that its not a valid binary tree.
        // since every nod on the has to be greater than the previous nodes value
        if(node.right != null && !validateHelper(node.right,minValue,node.data)){
            return false;
        }
        // and only if we get through all the recursive calls do we return true
        // and if we do return true in another of the recursive calls we don't say
        // its a valid binary tree right away. we just skip the returning false
        // part and keep moving
        return true;
    }
}
