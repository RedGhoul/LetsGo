package ColtSteele;

import java.util.*;

// based on the - Adjacency list implementation
public class CS_26_Graphs {
    public Map<String, List<String>> adjacencyList;
    public CS_26_Graphs(){
        adjacencyList = new HashMap<>();
    }
    public static void main(String[] args){

    }

    public void addVertex(String input){
        if(!adjacencyList.containsKey(input)){
            adjacencyList.put(input, new ArrayList<>());
        }
    }

    public void addEdge(String vertex1, String vertex2){
        if(!adjacencyList.containsKey(vertex1) && !adjacencyList.containsKey(vertex2)){
            return;
        }
        List<String> vertex1List = adjacencyList.getOrDefault(vertex1, new ArrayList<>());
        if(!vertex1List.contains(vertex2)){
            vertex1List.add(vertex2);
            adjacencyList.put(vertex1,vertex1List);
        }

        List<String> vertex2List = adjacencyList.getOrDefault(vertex2, new ArrayList<>());
        if(!vertex2List.contains(vertex1)){
            vertex2List.add(vertex1);
            adjacencyList.put(vertex2,vertex2List);
        }

    }

    public void removeEdge(String vertex1, String vertex2){
        if(!adjacencyList.containsKey(vertex1) && !adjacencyList.containsKey(vertex2)){
            return;
        }
        List<String> vertex1List = adjacencyList.getOrDefault(vertex1, new ArrayList<>());
        vertex1List = vertex1List.stream().filter(x -> !Objects.equals(x, vertex2)).toList();
        adjacencyList.put(vertex1,vertex1List);

        List<String> vertex2List = adjacencyList.getOrDefault(vertex2, new ArrayList<>());
        vertex2List = vertex2List.stream().filter(x -> !Objects.equals(x, vertex1)).toList();
        adjacencyList.put(vertex2,vertex2List);
    }

    public void removeVertex(String vertex){
        if(!adjacencyList.containsKey(vertex)){
            return;
        }

        adjacencyList.remove(vertex);
        for (Map.Entry<String, List<String>> entry : adjacencyList.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            value = value.stream().filter(x -> !Objects.equals(x, vertex)).toList();
            adjacencyList.put(key,value);
        }
    }

}
