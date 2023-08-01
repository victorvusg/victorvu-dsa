package DataStructure.NonLinear.Graph;

import java.util.LinkedList;
import java.util.List;

public class Graph<E> {

    int vertices;

    LinkedList<LinkedList<E>> adjacencyList;

    public static void main(String[] args) {
        //
    }

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new LinkedList<LinkedList<E>>();

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new LinkedList<E>());
        }

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        Integer val = list.get(0);
    }

    public void addEdge(int fromVertexIndex, int toVertexIndex) {
        this.adjacencyList.get(fromVertexIndex).add(toVertexIndex);
        this.adjacencyList.get(toVertexIndex).add(fromVertexIndex);
    }

    public void removeEdge(int fromVertex, int toVertex) {

    }
}
