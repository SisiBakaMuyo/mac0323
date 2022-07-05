import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ep3 {

    int vertice;
    int aresta;

    //Dado um vértice v calcula a distância de v até todos os vértices de G;
    int [] calculaDistancias (Graph G, Vertex v, Grafos graph){
        int [] retorno;

        graph.bfsDistancia(G, v);

        retorno = graph.dist;

        return retorno;
    }

    //Dado um grafo G determina o número de componentes conexas e o tamanho de cada componente
    int [] determinaConexas (Graph G, Grafos graph, PrintWriter gravarArq){
        int retorno = 0;
        int cont;
        int [] tam;

        retorno = graph.componeteConexa(G);
        tam = new int[retorno];

        gravarArq.println("Número de componentes conexas: " + retorno);

        for (int i = 0; i < retorno; i++){
            cont = 0;
            for (int j = 0; j < vertice ; j++){
                if (graph.cc[j] == i){
                    gravarArq.print(" " + j + " ");
                    cont++;
                }    
            }
            gravarArq.println(" -> tamanho da componente: " + cont);
            tam[i] = cont;   
        }

        return tam;
    }


    public static void main (String[] args) throws Exception{
        try{

            Ep3 ep = new Ep3();
            int dist [];
            boolean linha1 = true;
            ep.vertice = 0;
            ep.aresta = 0;
            Scanner scanner = new Scanner(new File(args[0]));
            List<Vertex []> listPares = new ArrayList<Vertex []>();
            Grafos graph = new Grafos();
            int conexas = 0;
            Vertex all [];
            Path path = FileSystems.getDefault().getPath("");
		    String directoryName = path.toAbsolutePath().toString();
            FileWriter arq = new FileWriter(directoryName + "/saidaEp3.txt");
		    PrintWriter gravarArq = new PrintWriter(arq);
            

            //Trata Input
            while (scanner.hasNext()) {
                String [] linha = scanner.nextLine().split(" ");
                
                
                //Pega numero de vertices e arestas
                if (linha1){
                    ep.vertice = Integer.parseInt(linha[0]);
                    ep.aresta = Integer.parseInt(linha[1]);
                    linha1 = false;
                }else{
                    Vertex[] par = new Vertex[2];
                    par[0] = new Vertex();
                    par[1] = new Vertex();

                    //Lista arestas
                    par[0].vertex = Integer.parseInt(linha[0]);
                    par[1].vertex = Integer.parseInt(linha[1]);
                    listPares.add(par);
                }    
            }  
            
            //Imprime entrada
            gravarArq.println("Vértices: " + ep.vertice + " Arestas: " + ep.aresta);
            for (Vertex [] v : listPares){
                gravarArq.println(v[0].vertex + "->" + v[1].vertex);
            }
            gravarArq.println(" ");

            //Inicializa Grafo e Vetor de vertices do grafo
            Graph G = graph.iniGraph(ep.vertice);
            all = new Vertex[G.V];
            for (int i = 0; i < G.V; i++){
                all[i] = new Vertex();
                all[i].vertex = i;
            }

            //Insere vertices
            for (Vertex [] v : listPares){
                graph.insereArco(G, v[0], v[1]);
            }

            //Determina conexas
            conexas = ep.determinaConexas(G, graph, gravarArq).length;
            gravarArq.println(" ");

            //Determina distancias
            for (int i = 0; i < G.V; i++){
                gravarArq.println("Distâncias do vértice " + i + ":");
                dist = ep.calculaDistancias(G, all[i], graph);
                int cont = 0;
                for (int j : dist){
                    gravarArq.println(cont + ": " + j );
                    cont++;
                }
                gravarArq.println(" ");
            }    

            arq.close();	

        }catch (Exception e) {
            throw new Exception(e);
        }
    }    
    
}
