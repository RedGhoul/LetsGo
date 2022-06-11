package StephenGrider;

import java.util.ArrayList;
import java.util.List;

public class SG_27_DFS_Trees {
    public static void main(String[] args){
        SG_24_TreeNode root = new SG_24_TreeNode("20");
        SG_24_TreeNode rootChild1 = new SG_24_TreeNode("0");
        SG_24_TreeNode rootChild2 = new SG_24_TreeNode("40");
        SG_24_TreeNode rootChild3 = new SG_24_TreeNode("-15");
        root.childern.add(rootChild1);
        root.childern.add(rootChild2);
        root.childern.add(rootChild3);
        rootChild1.childern.add(new SG_24_TreeNode("12"));
        rootChild1.childern.add(new SG_24_TreeNode("-2"));
        rootChild1.childern.add(new SG_24_TreeNode("1"));
        rootChild3.childern.add(new SG_24_TreeNode("-2"));

        SG_25_Tree_Impl tree = new SG_25_Tree_Impl(root);
        List<SG_24_TreeNode> answer = doDFS(tree);
        for(SG_24_TreeNode node : answer){
            System.out.print(node.data + ", ");
        }
        System.out.println("");
        List<SG_24_TreeNode> answer1 = doDFSIter(tree);
        for(SG_24_TreeNode node : answer1){
            System.out.print(node.data + ", ");
        }
    }

    private static List<SG_24_TreeNode> doDFS(SG_25_Tree_Impl tree) {
        List<SG_24_TreeNode> answer = new ArrayList<>();
        List<SG_24_TreeNode> stack = new ArrayList<>();
        stack.add(tree.root);
        dfsHelper(answer,stack);
        return answer;
    }

    private static void dfsHelper(List<SG_24_TreeNode> answer, List<SG_24_TreeNode> stack) {
        if(stack == null || stack.isEmpty()) return;
        SG_24_TreeNode curNode = stack.remove(0);
        // basically allows us to add this at
        // the very beginning of the list
        stack.addAll(0,curNode.childern);
        answer.add(curNode);
        dfsHelper(answer,stack);
    }


    private static List<SG_24_TreeNode> doDFSIter(SG_25_Tree_Impl tree) {
        List<SG_24_TreeNode> answer = new ArrayList<>();
        List<SG_24_TreeNode> stack = new ArrayList<>();
        stack.add(tree.root);
        while(!stack.isEmpty()){
            SG_24_TreeNode curNode = stack.remove(0);
            stack.addAll(0,curNode.childern);
            answer.add(curNode);
        }
        return answer;
    }
}
