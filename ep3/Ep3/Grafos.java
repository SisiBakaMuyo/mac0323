import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Grafos {
    
    public int cnt;
    public int pre [];
    public int cc [];
    public int dist [];
    public boolean marked [];


    static private class Node { 
        Vertex w; 
        Link next; 
    };

    static Link newNode(Vertex w, Link next) { 
        Link a = new Link();

        a.val = w; 
        a.next = next;    

        return a;                         
    }

    Graph iniGraph(int V) { 
        Graph G = new Graph();
        Vertex v = new Vertex();

        G.V = V; 
        G.A = 0;
        G.adj = new Link[V];
        for (v.vertex = 0; v.vertex < V; ++v.vertex) 
           G.adj[v.vertex] = null;

        pre = new int[G.V];
        cc = new int[G.V];  
        dist = new int [G.V];
        marked = new boolean[G.V];

        return G;
    }

    void insereArco(Graph G, Vertex v, Vertex w) {
        Link a = new Link();
        
        for (a = G.adj[v.vertex]; a != null; a = a.next) 
            if (a.val == w) return;

        G.adj[v.vertex] = newNode( w, G.adj[v.vertex]);
        G.A++;
    }

    void dfs(Graph G) { 
        cnt = 0;
        Vertex v = new Vertex();

        for (v.vertex = 0; v.vertex < G.V; ++v.vertex) 
            pre[v.vertex] = -1;
        for (v.vertex = 0; v.vertex < G.V; ++v.vertex)
            if (pre[v.vertex] == -1) 
                dfsR(G, v); 
    }

    void dfsR(Graph G, Vertex v) { 
        pre[v.vertex] = cnt++; 
        Vertex w = new Vertex();
        Link a = new Link();
        
        for (a = G.adj[v.vertex]; a != null; a = a.next) {
            w = a.val;
            if (pre[w.vertex] == -1)
                dfsR( G, w); 
        }
    }

    
    void bfsDistancia(Graph G, Vertex s) { 
        Queue<Vertex> fila = new Queue<Vertex>();
        Vertex ant = new Vertex();
        Vertex w = new Vertex();
        Link a = new Link();

        for (int i = 0; i < G.V; i++){
            dist[i] = -1;
            marked[i] = false;
        }    

        dist[s.vertex] = 0; 
        marked[s.vertex] = true;
        fila.enqueue(s); 

        while (!fila.isEmpty()) {
            ant = fila.dequeue();

            for (a = G.adj[ant.vertex]; a != null; a = a.next){
                w = a.val;
                if (!marked[w.vertex]) {
                    dist[w.vertex] = dist[ant.vertex] + 1; 
                    marked[w.vertex] = true;
                    fila.enqueue(w);
                }  
            }      
        } 
    }


    int componeteConexa(Graph G) { 
        int id = 0;
        Vertex v = new Vertex();

        for (v.vertex = 0; v.vertex < G.V; ++v.vertex) 
            cc[v.vertex] = -1;
        for (v.vertex = 0; v.vertex < G.V; ++v.vertex)
            if (cc[v.vertex] == -1) 
                componenteConexaRec(G, v, id++);
        return id;
    }

    void componenteConexaRec(Graph G, Vertex v, int id) { 
        cc[v.vertex] = id;
        Link a = new Link();
        Vertex aux = new Vertex();

        for (a = G.adj[v.vertex]; a != null; a = a.next) {
            if (cc[a.val.vertex] == -1) {
                aux.vertex = a.val.vertex;
                componenteConexaRec(G, aux, id); 
            }   
        }     
    }



}
