package StephenGrider;

import java.util.ArrayList;
import java.util.List;

public class SG_28_Tree_Width {
    // --- Directions
    // Given the root node of a tree, return
    // an array where each element is the width
    // of the tree at each level.
    // --- Example
    // Given:
    //     0
    //   / |  \
    // 1   2   3
    // |       |
    // 4     5 2 1
    // Answer: [1, 3, 2]
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
        List<Integer> answer = findLevelWidth(tree);
        System.out.println(answer);
    }

    public static List<Integer> findLevelWidth(SG_25_Tree_Impl tree){
        List<SG_24_TreeNode> qq = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        qq.add(tree.root);
        qq.add(new SG_24_TreeNode("*"));
        int nodeCount = 0;
        while(true){
            SG_24_TreeNode curNode = qq.remove(0);
            if(curNode.data.equals("*")){
                answer.add(nodeCount);
                if(qq.size() == 0) {
                    break;
                }
                qq.add(new SG_24_TreeNode("*"));
                nodeCount = 0;
                continue;
            }
            nodeCount++;
            qq.addAll(curNode.childern);
        }
        return answer;
    }
}
