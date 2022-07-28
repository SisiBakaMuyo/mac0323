import java.util.*;

public class Automato { 

    private Graph graph;     // grafo e-transicoes
    private String regex;     
    private final int m;       //numero caracteres regex


    public Automato(String regex) {

        this.regex = regex;
        m = regex.length();
        Stack<Integer> operadores = new Stack<Integer>(); 
        graph = new Graph(m+1); 


        for (int i = 0; i < m; i++) { 
            int lp = i; 
            if (regex.charAt(i) == '(' || regex.charAt(i) == '|' || regex.charAt(i) == '[' || regex.charAt(i) == '^')  
                operadores.push(i); 
            // caso ) e |    
            else if (regex.charAt(i) == ')' || regex.charAt(i) == ']') {
                int or = operadores.pop(); 

                if (regex.charAt(or) == '^'){
                    graph.addEdge(i, i+1);
                }

                if (regex.charAt(or) == '|') { 
                    lp = operadores.pop();
                    graph.addEdge(lp, or+1);
                    graph.addEdge(or, i);
                }
                else if (regex.charAt(or) == '(' || regex.charAt(or) == '[')
                    lp = or;
                else assert false;
            } 

            // caso *, ? e +
            if (i < m-1 && ( regex.charAt(i+1) == '*' || regex.charAt(i+1) == '+' || regex.charAt(i+1) == '?')) { 
                graph.addEdge(lp, i+1); 
                graph.addEdge(i+1, lp); 
            }  
    

            if (regex.charAt(i) == '(' || regex.charAt(i) == '*' || regex.charAt(i) == ')' || regex.charAt(i) == '[' || regex.charAt(i) == ']') 
                graph.addEdge(i, i+1);
        }
    } 


    public boolean valida(String txt) {

        DFS dfs = new DFS(graph, 0);
        List<Integer> pc = new ArrayList<Integer>();

        for (int v = 0; v < graph.V(); v++)
            if (dfs.marked(v)) pc.add(v);

        // Computa possivel estado para txt[i+1]
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == '*' || txt.charAt(i) == '|' || txt.charAt(i) == '(' || txt.charAt(i) == ')' || txt.charAt(i) == '[' || txt.charAt(i) == ']' || txt.charAt(i) == '+' || txt.charAt(i) == '^' || txt.charAt(i) == '?')
                throw new IllegalArgumentException("texto contem caracter '" + txt.charAt(i) + "' invalido");

            List<Integer> match = new ArrayList<Integer>();
            for (int v : pc) {
                if (v == m) continue;
                if ((regex.charAt(v) == txt.charAt(i)) || regex.charAt(v) == '.' || regex.charAt(v) == '-')
                    match.add(v+1); 
            }
            if (match.isEmpty()) continue;

            dfs = new DFS(graph, match); 
            pc = new ArrayList<Integer>();
            for (int v = 0; v < graph.V(); v++)
                if (dfs.marked(v)) pc.add(v);

            // optimizacao se nao acha estados
            if (pc.size() == 0) return false;
        }

        // confirma estado
        for (int v : pc)
            if (v == m) return true;
        return false;
    }


} 

