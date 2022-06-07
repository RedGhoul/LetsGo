package StephenGrider;

import java.util.ArrayList;
import java.util.List;

public class SG_26_BFS_Trees {
    public static void main(String[] args){
        SG_24_TreeNode root = new SG_24_TreeNode("1");
        SG_24_TreeNode rootChild1 = new SG_24_TreeNode("2");
        SG_24_TreeNode rootChild2 = new SG_24_TreeNode("3");
        root.childern.add(rootChild1);
        root.childern.add(rootChild2);
        rootChild1.childern.add(new SG_24_TreeNode("4"));
        rootChild1.childern.add(new SG_24_TreeNode("5"));
        SG_25_Tree_Impl tree = new SG_25_Tree_Impl(root);
        List<SG_24_TreeNode> answer = doBFS(tree);
        for(SG_24_TreeNode node : answer){
            System.out.print(node.data + ", ");
        }
        System.out.println("");
        List<SG_24_TreeNode> answer1 = doBFSI(tree);
        for(SG_24_TreeNode node : answer1){
            System.out.print(node.data + ", ");
        }

    }

    public static List<SG_24_TreeNode> doBFS(SG_25_Tree_Impl tree){
        List<SG_24_TreeNode> answer = new ArrayList<>();
        List<SG_24_TreeNode> qq = new ArrayList<>();
        qq.add(tree.root);
        bfsHelper(answer,qq);
        return answer;
    }

    public static void bfsHelper(List<SG_24_TreeNode> answer, List<SG_24_TreeNode> qq){
        if(qq == null || qq.isEmpty()) return;
        SG_24_TreeNode curNode = qq.remove(0);
        qq.addAll(curNode.childern);
        answer.add(curNode);
        bfsHelper(answer,qq);
    }

    // you can also do this iteratively

    public static List<SG_24_TreeNode> doBFSI(SG_25_Tree_Impl tree){
        List<SG_24_TreeNode> answer = new ArrayList<>();
        List<SG_24_TreeNode> qq = new ArrayList<>();
        qq.add(tree.root);
        while(!qq.isEmpty()){
            SG_24_TreeNode curNode = qq.remove(0);
            qq.addAll(curNode.childern);
            answer.add(curNode);
        }
        return answer;
    }

}
