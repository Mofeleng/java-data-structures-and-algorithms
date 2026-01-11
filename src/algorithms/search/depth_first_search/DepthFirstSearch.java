package algorithms.search.depth_first_search;

public class DepthFirstSearch {
    //Search algorithm for traversing a tree or a graph data structure
    /*
        1. Pick a route
        2. Keep going until you reach a dead end or a previously visited node
        3. Backtrack to the last node that has unvisited adjacent neighbours
        4. Repeat
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

        graph.depthFirstSearch(0);
    }
}
