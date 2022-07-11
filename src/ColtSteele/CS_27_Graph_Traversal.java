package ColtSteele;

import java.util.*;

public class CS_27_Graph_Traversal {
    public Map<String, List<String>> adjacencyList = new HashMap<>();
    public static void main(String[] args){
        CS_27_Graph_Traversal gg = new CS_27_Graph_Traversal();

        gg.adjacencyList.put("A", Arrays.asList("B","C"));
        gg.adjacencyList.put("B", Arrays.asList("A","D"));
        gg.adjacencyList.put("C", Arrays.asList("A","E"));
        gg.adjacencyList.put("D", Arrays.asList("B","E","F"));
        gg.adjacencyList.put("E", Arrays.asList("C","D","F"));
        gg.adjacencyList.put("F", Arrays.asList("D","E"));

        System.out.println(gg.DFSRecursive("A"));
        System.out.println(gg.DFSInter("A"));
    }

    public String DFSInter(String vertex){
        List<String> viewed = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Stack<String> sss = new Stack<>();
        sss.push(vertex);
        while(!sss.isEmpty()){
            String curVertex = sss.pop();
            if(!visited.contains(curVertex)){
                viewed.add(curVertex);
                visited.add(curVertex);
                for(String vet : adjacencyList.get(curVertex)) {
                    if(!visited.contains(vet)) {
                        sss.push(vet);
                    }
                }
            }
        }
        return String.join(",",viewed);
    }

    public String DFSRecursive(String vertex){
        List<String> viewed = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        DFSRecursiveHelper(vertex, visited, viewed);
        return String.join(",",viewed);
    }

    public void DFSRecursiveHelper(String vertex, Set<String> visited, List<String> viewed){
        if(vertex == null) return;
        //if(visited.contains(vertex)) return; - no point since your only
        // gonna call your self if you haven't seen your self
        visited.add(vertex);
        viewed.add(vertex);
        for(String vet : adjacencyList.get(vertex)) {
            if(!visited.contains(vet)) {
                DFSRecursiveHelper(vet, visited, viewed);
            }
        }
    }

}
