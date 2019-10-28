import java.util.*;

public class Graph {

    static class GraphNode{
        int value;
        GraphNode(int value) {
            this.value = value;
        }
    }

    private final HashMap<GraphNode,ArrayList<GraphNode>> adjacencyList;

    Graph(HashMap<GraphNode,ArrayList<GraphNode>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    void bfs (GraphNode root) {
        HashMap<GraphNode,Boolean> visited = createVisitedMap();
        runBFS(root,visited);
    }

    boolean isConnected() {
        HashMap<GraphNode, Boolean> visited = createVisitedMap();
        runBFS(adjacencyList.keySet().iterator().next(),visited);
        for (GraphNode node: visited.keySet()) {
            if (!visited.get(node)) {
                return false;
            }
        }
        return true;
    }

    int shortestPathLength(GraphNode first, GraphNode second) {
        boolean shortestPathFound = false;
        HashMap<GraphNode,Boolean> visited = createVisitedMap();
        HashMap<GraphNode,GraphNode> previous = new HashMap<>();
        //previous.put()
        Queue<GraphNode> currentLayer = new ArrayDeque<>();
        currentLayer.add(first);
        visited.put(first,true);
        Queue<GraphNode> nextLayer = new ArrayDeque<>();
        while (!currentLayer.isEmpty()){
            GraphNode nextNode = nextLayer.peek();
            shortestPathFound = (nextNode == second ? true : false);
            if (shortestPathFound) {
                break;
            }
            ArrayList<GraphNode> tempList = adjacencyList.get(currentLayer.poll());
            for (GraphNode node : tempList) {
                if (!visited.get(node)) {
                    nextLayer.add(node);
                    visited.put(node,true);
                   // previous.put(node);
                }
            }
            if (currentLayer.isEmpty()) {
                currentLayer = nextLayer;
                nextLayer = new ArrayDeque<>();
            }

        }
        return 0;

    }

    private HashMap<GraphNode,Boolean> createVisitedMap() {
        HashMap<GraphNode,Boolean> visited = new HashMap<>();
        for (GraphNode node: visited.keySet()) {
            visited.put(node,false);
        }
        return visited;
    }

    private void runBFS(GraphNode root, HashMap<GraphNode,Boolean> visited){
        Queue<GraphNode> currentLayer = new ArrayDeque<>();
        currentLayer.add(root);
        visited.put(root,true);
        Queue<GraphNode> nextLayer = new ArrayDeque<>();
        while (!currentLayer.isEmpty()){
            ArrayList<GraphNode> tempList = adjacencyList.get(currentLayer.poll());
            for (GraphNode node : tempList) {
                if (!visited.get(node)) {
                    nextLayer.add(node);
                    visited.put(node,true);
                }
            }
            if (currentLayer.isEmpty()) {
                currentLayer = nextLayer;
                nextLayer = new ArrayDeque<>();
            }
        }
    }


    private void runDFS(GraphNode root, HashMap<GraphNode, Boolean> visited, int number){
        Stack<GraphNode> currentLayer = new Stack<>();
        currentLayer.add(root);
        visited.put(root,true);

        Stack<GraphNode> nextLayer = new Stack<>();

        while (!currentLayer.isEmpty()){
            ArrayList<GraphNode> tempList = adjacencyList.get(currentLayer.peek());
            for (GraphNode node : tempList) {
                if (!visited.get(node)) {
                    nextLayer.add(node);
                    visited.put(node,true);
                }
            }
            if (currentLayer.isEmpty()) {
                currentLayer = nextLayer;
                nextLayer = new Stack<>();
            }
        }
    }

    void DFS(GraphNode root, int number) {
        HashMap <GraphNode, Boolean> visited = createVisitedMap();
        runDFS(root,visited, number);

    }

    public int connectedComponent(GraphNode root) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
