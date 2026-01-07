package data_structures.graphs.adj_matrix;

public class AdjacencyMatrix {
    /*
    2d array that stores 1s and 0s to represent edges
    # of rows = # unique nodes
    # of columns = # unique nodes

    Runtime complexity to check an edge: O(1)
    Space complexity: O(v^2)
     */

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1); //Edge between A and B
        graph.addEdge(1, 2); //Edge between B and C
        graph.addEdge(2, 3); //Edge between C and D
        graph.addEdge(2, 4); //Edge between C and E
        graph.addEdge(4, 0); //Edge between E and A
        graph.addEdge(4, 2); //Edge between E and C

        graph.print();
    }
}
