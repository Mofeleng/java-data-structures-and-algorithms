package algorithms.search.breath_first_search;

public class BreadthFirstSearch {
    /*
    Search algorithm for traversing a tree or graph data structure
    Done one level at a time, rather than one branch at a time
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
        graph.breadthFirstSearch(2);
    }
}
