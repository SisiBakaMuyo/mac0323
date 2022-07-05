import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    public void imprimeEntrada (int[][] entrada){
        for (int m = 0; m < entrada.length; m++)  {  
            for (int n = 0; n < entrada[0].length; n++)     { 
                System.out.print(entrada[m][n] + " "); 
            }  
            System.out.println(" "); 
          }  
    }

    public void imprimeSaida (char[][] saida){
        for (int m = 0; m < saida.length; m++)  {  
            for (int n = 0; n < saida[0].length; n++)     { 
                System.out.print(saida[m][n] + " "); 
            }  
            System.out.println(" "); 
          }  
    }

    public char[][] transformaTipo (int[][] entrada){
        char[][] saida = new char[entrada.length][entrada[0].length];

        for (int m = 0; m < entrada.length; m++)  {  
            for (int n = 0; n < entrada[0].length; n++)     { 
                if (entrada[m][n] == 0)
                    saida[m][n] = 'A';
                if (entrada[m][n] == 1)    
                    saida[m][n] = 'Z'; 
            }  
          } 
        return saida;
    }

    public int[][] capturaMatriz (String arg) throws Exception{
        try {
            Scanner scanner = new Scanner(new File(arg));
            List<int []> list = new ArrayList<int []>();
            
            while (scanner.hasNext()) {
                String [] linha = scanner.nextLine().split(" ");
                int[] parsed = new int[linha.length];
                for (int i = 0; i<linha.length; i++) parsed[i] = Integer.valueOf(linha[i]);
                list.add(parsed);
            }
            
            int[][]matriz = list.toArray(new int[0][]);

            return matriz;

        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
