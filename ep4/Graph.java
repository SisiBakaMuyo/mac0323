import java.util.*;

public class Graph {

    private static final String NEWLINE = System.getProperty("line.separator");

    private final int V;           
    private int E;                 
    private List<Integer>[] adj;   
    private int[] indegree;        
    

    public Graph(int V) {
        if (V < 0) throw new IllegalArgumentException("Numero de vertices nao pode ser negativo");
        this.V = V;
        this.E = 0;
        indegree = new int[V];
        adj = (List<Integer>[]) new ArrayList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new ArrayList<Integer>();
        }
    }

    public Graph(Graph G) {
        if (G == null) throw new IllegalArgumentException("argumento eh nulo");

        this.V = G.V();
        this.E = G.E();
        if (V < 0) throw new IllegalArgumentException("Numero de vertices nao pode ser negativo");

        // atualiza grau
        indegree = new int[V];
        for (int v = 0; v < V; v++)
            this.indegree[v] = G.indegree(v);

        // atualiza lista adjacencia
        adj = (List<Integer>[]) new ArrayList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new ArrayList<Integer>();
        }

        for (int v = 0; v < G.V(); v++) {
            Stack<Integer> reverse = new Stack<Integer>();
            for (int w : G.adj[v]) {
                reverse.push(w);
            }
            for (int w : reverse) {
                adj[v].add(w);
            }
        }
    }
        

    public int V() {
        return V;
    }


    public int E() {
        return E;
    }


    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertice " + v + " nao esta entre 0 e " + (V-1));
    }


    public void addEdge(int v, int w) {
        validateVertex(v);
        validateVertex(w);
        adj[v].add(w);
        indegree[w]++;
        E++;
    }


    public Iterable<Integer> adj(int v) {
        validateVertex(v);
        return adj[v];
    }


    public int outdegree(int v) {
        validateVertex(v);
        return adj[v].size();
    }


    public int indegree(int v) {
        validateVertex(v);
        return indegree[v];
    }


    public Graph reverse() {
        Graph reverse = new Graph(V);
        for (int v = 0; v < V; v++) {
            for (int w : adj(v)) {
                reverse.addEdge(w, v);
            }
        }
        return reverse;
    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " arestas " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(String.format("%d: ", v));
            for (int w : adj[v]) {
                s.append(String.format("%d ", w));
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

}
