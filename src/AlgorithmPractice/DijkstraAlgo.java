package AlgorithmPractice;
import java.util.*;
public class DijkstraAlgo {
    private int dist[];
    private int parent[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;
    private int V; // Number of vertices
    List<List<Node> > adj;

    public DijkstraAlgo(int V)
    {
        this.V = V;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<Node>(V, new Node());
    }

    // Function for Dijkstra's Algorithm
    public void dijkstra(List<List<Node>> adj, int src)
    {
        this.adj = adj;
        int parent = 0;

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        System.out.println("Path: ");

        // Add source node to the priority queue
        pq.add(new Node(src, 0));

        // Distance to the source is 0
        dist[src] = 0;
        while (settled.size() != V) {

            // remove the minimum distance node
            // from the priority queue
            int u = pq.remove().node;


            // adding the node whose distance is
            // finalized
//            settled.add(u);
            if(settled.add(u)) {
                System.out.print(u + " ");
//                Iterator itr = settled.iterator();
//                while(itr.hasNext()) {
//                    System.out.print(itr.next());
//                }
 //               System.out.println();
            }
            //System.out.println(settled);

            e_Neighbours(u);
        }
    }

    // Function to process all the neighbours
    // of the passed node
    private void e_Neighbours(int u)
    {
        int edgeDistance = -1;
        int newDistance = -1;

        // All the neighbors of v
        for (int i = 0; i < adj.get(u).size(); i++) {
            Node v = adj.get(u).get(i);

            // If current node hasn't already been processed
            if (!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                // If new distance is cheaper in cost
                if (newDistance < dist[v.node])
                    dist[v.node] = newDistance;


                // Add the current node to the queue
                pq.add(new Node(v.node, dist[v.node]));
             //   System.out.println(v.node);
            }

        }
    }

    // Driver code
    public static void main(String arg[])
    {
        int V = 11;
        int source = 0;

        // Adjacency list representation of the
        // connected edges
        List<List<Node> > adj = new ArrayList<List<Node> >();

        // Initialize list for every node
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }

        // Inputs for the DPQ graph
//        //A 0
//        adj.get(0).add(new Node(1, 12));
//        adj.get(0).add(new Node(2, 3));
//        adj.get(0).add(new Node(3, 7));
//        // B 1
//        adj.get(1).add(new Node(0, 12));
//        adj.get(1).add(new Node(2, 8));
//        adj.get(1).add(new Node(4, 15));
//        //C 2
//        adj.get(2).add(new Node(0, 3));
//        adj.get(2).add(new Node(1, 8));
//        adj.get(2).add(new Node(3, 6));
//        adj.get(2).add(new Node(4, 5));
//        adj.get(2).add(new Node(5, 2));
//        adj.get(2).add(new Node(6, 4));
//        //D 3
//        adj.get(3).add(new Node(0, 7));
//        adj.get(3).add(new Node(2, 6));
//        adj.get(3).add(new Node(6, 1));
//        //E 4
//        adj.get(4).add(new Node(1, 15));
//        adj.get(4).add(new Node(2, 5));
//        adj.get(4).add(new Node(5, 6));
//        adj.get(4).add(new Node(7, 9));
//        adj.get(4).add(new Node(8, 10));
//        //F 5
//        adj.get(5).add(new Node(2, 2));
//        adj.get(5).add(new Node(4, 6));
//        adj.get(5).add(new Node(6, 6));
//        adj.get(5).add(new Node(7, 10));
//        //G 6
//        adj.get(6).add(new Node(2, 4));
//        adj.get(6).add(new Node(3, 1));
//        adj.get(6).add(new Node(4, 6));
//        adj.get(6).add(new Node(7, 6));
//        adj.get(6).add(new Node(9, 9));
//        //H 7
//        adj.get(7).add(new Node(4, 9));
//        adj.get(7).add(new Node(5, 10));
//        adj.get(7).add(new Node(6, 6));
//        adj.get(7).add(new Node(8, 2));
//        adj.get(7).add(new Node(9, 5));
//        //I 8
//        adj.get(8).add(new Node(4, 10));
//        adj.get(8).add(new Node(7, 2));
//        adj.get(8).add(new Node(9, 12));
//        //J 9
//        adj.get(9).add(new Node(6, 9));
//        adj.get(9).add(new Node(7, 5));
//        adj.get(9).add(new Node(8, 12));

        //A 0
        adj.get(0).add(new Node(1, 22));
        adj.get(0).add(new Node(4, 8));
        adj.get(0).add(new Node(7, 14));
        // B 1
        adj.get(1).add(new Node(0, 22));
        adj.get(1).add(new Node(2, 29));
        adj.get(1).add(new Node(4, 19));
        //C 2
        adj.get(2).add(new Node(1, 29));
        adj.get(2).add(new Node(4, 26));
        adj.get(2).add(new Node(5, 7));
        adj.get(2).add(new Node(6, 18));
        adj.get(2).add(new Node(3, 24));
        //D 3
        adj.get(3).add(new Node(2, 24));
        adj.get(3).add(new Node(6, 23));
        adj.get(3).add(new Node(10, 3));
        //E 4
        adj.get(4).add(new Node(0, 8));
        adj.get(4).add(new Node(1, 19));
        adj.get(4).add(new Node(2, 26));
        adj.get(4).add(new Node(5, 30));
        adj.get(4).add(new Node(7, 12));
        adj.get(4).add(new Node(8, 1));
        //F 5
        adj.get(5).add(new Node(2, 7));
        adj.get(5).add(new Node(4, 30));
        adj.get(5).add(new Node(6, 15));
        adj.get(5).add(new Node(8, 9));
        //G 6
        adj.get(6).add(new Node(3, 23));
        adj.get(6).add(new Node(2, 18));
        adj.get(6).add(new Node(5, 15));
        adj.get(6).add(new Node(8, 11));
        adj.get(6).add(new Node(9, 6));
        adj.get(6).add(new Node(10, 27));
        //H 7
        adj.get(7).add(new Node(0, 14));
        adj.get(7).add(new Node(4, 12));
        adj.get(7).add(new Node(8, 28));

        //I 8
        adj.get(8).add(new Node(4, 1));
        adj.get(8).add(new Node(5, 9));
        adj.get(8).add(new Node(6, 11));
        adj.get(8).add(new Node(7, 28));
        adj.get(8).add(new Node(9, 25));
        //J 9
        adj.get(9).add(new Node(6, 6));
        adj.get(9).add(new Node(10, 5));
        adj.get(9).add(new Node(8, 25));
        //K 10
        adj.get(10).add(new Node(3, 3));
        adj.get(10).add(new Node(6, 27));
        adj.get(10).add(new Node(9, 5));

        // Calculate the single source shortest path
        DijkstraAlgo dpq = new DijkstraAlgo(V);
        dpq.dijkstra(adj, source);

        // Print the shortest path to all the nodes
        // from the source node
        System.out.println();
        System.out.println("The shorted path from node :");
        for (int i = 0; i < dpq.dist.length; i++)
            System.out.println(" u: " + i + "   D[u]: "
                    + dpq.dist[i]);
    }



}
