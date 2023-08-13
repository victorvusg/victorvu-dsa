package DataStructure.NonLinear.Graph;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //

        Graph<Character> graph = new Graph<>(1);

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');

        graph.addEdge(0, 1);

        graph.addEdge(1, 2);
//        graph.addEdge(1, 5);

        graph.addEdge(2, 3);
//        graph.addEdge(2, 4);

        graph.addEdge(3, 8);

        graph.addEdge(4, 5);
        graph.addEdge(4, 7);

        graph.addEdge(5, 6);

        graph.addEdge(7, 8);

        graph.addEdge(7, 3);
        graph.removeEdge(7, 3);

        graph.addEdge(6, 1);

        /**
         *  0(A)
         *  |
         *  1(B) - 2(C) -  3(D)
         *  |       |           \
         *  5(F) - 4(E) - 7(H) - 8(I)
         *  |
         *  6(G)
         */


//        System.out.println(graph.adjacencyList.toString());
//        System.out.println(graph.arrayValues.toString());
//        graph.depthFirstSearchTraverse(0);
//        graph.iterativeDepthFirstSearchTraverse(0);

            System.out.println(graph.hasCircleUndirectedGraph());

    }
}
