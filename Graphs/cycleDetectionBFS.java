import java.util.*;

public class cycleDetectionBFS {

    // Edge class
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    // Pair class to store node + parent (IMPORTANT for BFS)
    static class Pair {
        int node;
        int parent;

        Pair(int n, int p) {
            node = n;
            parent = p;
        }
    }

    // Create graph
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // BFS Cycle Detection
    public static boolean detectCycleBFS(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        Queue<Pair> q = new LinkedList<>();

        // handle disconnected graph
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                q.add(new Pair(i, -1));
                vis[i] = true;

                while (!q.isEmpty()) {
                    Pair curr = q.poll();

                    for (int j = 0; j < graph[curr.node].size(); j++) {
                        Edge e = graph[curr.node].get(j);

                        if (!vis[e.dest]) {
                            vis[e.dest] = true;
                            q.add(new Pair(e.dest, curr.node));
                        }
                        // visited neighbor and not parent → cycle
                        else if (e.dest != curr.parent) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        System.out.println(detectCycleBFS(graph)); // 
    }
}
