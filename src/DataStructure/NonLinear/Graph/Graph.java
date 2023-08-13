package DataStructure.NonLinear.Graph;

import java.sql.Array;
import java.util.*;

public class Graph<E> {

    int vertices;

    LinkedList<LinkedList<Integer>> adjacencyList;

    ArrayList<E> arrayValues;

    public static void main(String[] args) {
        //
    }

    public Graph(int vertices) {
        this.vertices = vertices;
        arrayValues = new ArrayList<E>(vertices);
        this.adjacencyList = new LinkedList<LinkedList<Integer>>();

        for (int i = 0; i < vertices - 1; i++) {
            adjacencyList.add(new LinkedList<Integer>());
        }
    }

    public void addVertex(E value) {
        this.adjacencyList.add(new LinkedList<>());
        this.arrayValues.add(value);
        this.vertices++;
    }

    public void addEdge(int fromVertex, int toVertex) {
        this.adjacencyList.get(fromVertex).add(toVertex);
        this.adjacencyList.get(toVertex).add(fromVertex);
    }

    public void removeEdge(int fromVertex, int toVertex) {
        this.adjacencyList.get(fromVertex).removeIf(n -> n == toVertex);
        this.adjacencyList.get(toVertex).removeIf(n -> n == fromVertex);
    }

    public void breadthFirstSearchTraverse(int start) {
        if (this.adjacencyList.size() == 0) return;

        boolean[] visitedVertices = new boolean[this.vertices];

        Queue<Integer> traversalQueue = new ArrayDeque<>();
        traversalQueue.add(start);
        visitedVertices[start] = true;

        while (traversalQueue.size() > 0) {
            int value = traversalQueue.poll();
            System.out.print(value + " ");

            // Children

            for (int nextVal : this.adjacencyList.get(value)) {
                if (!visitedVertices[nextVal]) {
                    traversalQueue.add(nextVal);
                    visitedVertices[nextVal] = true;
                }
            }
        }
    }

    public void depthFirstSearchTraverse(int start) {
        if (this.adjacencyList.size() == 0) return;

        boolean[] visitedVertices = new boolean[this.vertices];

        Stack<Integer> traversalQueue = new Stack<>();
        traversalQueue.add(start);
        visitedVertices[start] = true;

        while (traversalQueue.size() > 0) {
            int value = traversalQueue.pop();
            System.out.print(value + " ");

            // Children

            for (int nextVal : this.adjacencyList.get(value)) {
                if (!visitedVertices[nextVal]) {
                    traversalQueue.add(nextVal);
                    visitedVertices[nextVal] = true;
                }
            }
        }
    }

    public void iterativeDepthFirstSearchTraverse(int start) {
        boolean[] visitedVertices = new boolean[this.vertices];

        this.iterativeDepthFirstSearchTraverse(start, visitedVertices);
    }

    public void iterativeDepthFirstSearchTraverse(int start, boolean[] visitedVertices) {
        System.out.print(start + " ");
        visitedVertices[start] = true;

        for (int vertex : this.adjacencyList.get(start)) {
            if (!visitedVertices[vertex]) {
                iterativeDepthFirstSearchTraverse(vertex, visitedVertices);
            }
        }
    }

    public void breadthFirstSearchTraverseDisconnected(int start) {

    }

    public void breadthFirstSearchTraverseDisconnected(int start, boolean[] visitedVertices) {
        visitedVertices[start] = true;
        System.out.print(start + " ");

        Iterator<Integer> iterator = this.adjacencyList.get(start).iterator();
        while (iterator.hasNext()) {
            int vertex = iterator.next();
            if (!visitedVertices[vertex]) {
                breadthFirstSearchTraverseDisconnected(vertex, visitedVertices);
            }
        }
    }

    public boolean hasCircleUndirectedGraph() {
        int start = this.adjacencyList.get(0).get(0);
        return this.hasCircleUndirectedGraph(start, new boolean[this.vertices], 0);
    }

    public boolean hasCircleUndirectedGraph(int start, boolean[] visitedVertices, int parent) {
        visitedVertices[start] = true;

        for (int nextVertex : this.adjacencyList.get(start)) {
            if (visitedVertices[nextVertex] && nextVertex != parent) {
                return true;
            } else if (!visitedVertices[nextVertex] && hasCircleUndirectedGraph(nextVertex, visitedVertices, start)) {
                return true;
            }
        }

        return false;
    }





}
