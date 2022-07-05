import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ErdosRenyi {
	
	public static void main(String[] args) throws IOException {
		int arestas = 0; 
		Path path = FileSystems.getDefault().getPath("");
		String directoryName = path.toAbsolutePath().toString();

		FileWriter arq = new FileWriter(directoryName + "/random.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		if (args.length != 2) {
			System.out.println("Uso: <probabilidade das arestas> <número de vértices>");
			return;
		}
		double prob = Double.parseDouble(args[0]);
		int N = Integer.parseInt(args[1]);
		if (prob <= 0 || prob > 1) {
			System.out.println("Probabilidade das arestas = " + prob + ": deve estar entre (0, 1]");
			return;
		}
		if (N <= 0) {
			System.out.println("Número de vértices: " + N + ": deve ser positivo");
			return;
		}
		
		int[][] graph = new int[N][N];
	
		
		// Gera um grafo aleatório com N vértices e probabilidade p de 2 vértices estarem conectados 
		for(int i=0; i < N; i++){
			for(int j=i+1; j< N; j++){
				double rand = Math.random();
				if(rand <= prob){
					graph[i][j]=1;
					graph[j][i]= 1;
				}	
			}
		}
		
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if (graph[i][j] == 1){
					gravarArq.println(i + " " + j);
					arestas++;
				}	
			}
		}
		gravarArq.println("vertices: " + N + " arestas: " + arestas);

		arq.close();		
		
	}

}