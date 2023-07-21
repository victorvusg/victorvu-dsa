package DataStructure.NonLinear.Graph;

import java.util.LinkedList;

public class Graph {

    int vertices;

    LinkedList<LinkedList<Integer>> adjacencyList;

    public static void main(String[] args) {
        //
    }

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new LinkedList<>();

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }
}
