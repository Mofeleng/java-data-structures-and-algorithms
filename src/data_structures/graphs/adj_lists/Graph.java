package data_structures.graphs.adj_lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> arrList;

    Graph() {
        arrList = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        arrList.add(currentList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> currentList = arrList.get(src); //returns linked list
        Node dstNode = arrList.get(dst).get(0); //Gets the head node of the target from its linked list
        currentList.add(dstNode); // adds that head to the current list's tail
    }
    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = arrList.get(src);
        Node dstNode = arrList.get(dst).get(0);

        for (Node node: currentList) {
            if (node == dstNode) {
                return true;
            }
        }

        return false;
    }

    public void print() {
        for (LinkedList<Node> currentList: arrList) {
            for (Node node: currentList) {
                System.out.print(node.data + " =>");
            }
            System.out.println(" ");
        }
    }
}
