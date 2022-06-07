package StephenGrider;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SG_24_TreeNode {
    public List<SG_24_TreeNode> childern;
    public String data;
    public SG_24_TreeNode(String dataIn){
        data = dataIn;
        childern = new ArrayList<>();
    }

    public void add(String nodeValue){
        childern.add(new SG_24_TreeNode(nodeValue));
    }

    public void remove(SG_24_TreeNode node){
        childern = childern.stream().filter(ele -> !ele.data.equals(node.data))
                .collect(Collectors.toList());
    }
}
