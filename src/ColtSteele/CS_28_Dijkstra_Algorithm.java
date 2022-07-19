package ColtSteele;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WeightedGraphNode {
    public String vertex;
    public int weight;
    public WeightedGraphNode(String vertex, int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
}
// example of how to make a weighted
// graph using an adjacency list
public class CS_28_Dijkstra_Algorithm {
    public Map<String, List<WeightedGraphNode>> adjacencyList;
    public CS_28_Dijkstra_Algorithm(){
        this.adjacencyList = new HashMap<>();
    }
    public static void main(String[] args){

    }

    public void AddVertex(String vertex){
        if(!this.adjacencyList.containsKey(vertex)){
            this.adjacencyList.put(vertex, new ArrayList<>());
        }
    }

    public void AddEdge(String vertex1, String vertex2, int weight){
        this.adjacencyList.get(vertex1).add(new WeightedGraphNode(vertex2, weight));
        this.adjacencyList.get(vertex2).add(new WeightedGraphNode(vertex1, weight));
    }

}
