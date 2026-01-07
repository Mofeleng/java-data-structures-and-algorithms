package data_structures.graphs.adj_lists;

public class AdjacencyList {
    /*
    Array list of linked lists
    Each linked list has a unique node at the head
    All adjacent neighbors to that node are added to that node's linked list

    Runtime complexity to check an edge: O(v)
    Space complexity: O(v + e)
     */

    public static void main(String[] args) {
        Graph graph = new Graph();

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
