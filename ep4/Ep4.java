import java.io.File;
import java.util.*;

public class Ep4 {

    public static void main (String[] args) throws Exception{
        try{
            
            Scanner scanner = new Scanner(new File(args[0]));
            String regex = "";
            List<String> palavras = new ArrayList<String>();

            int cont = 0;
            int n = 0;
            

            //Trata Input
            while (scanner.hasNext()) {
                String [] linha = scanner.nextLine().split(" ");
                
                if (cont == 0){
                    for (int i = 0; i < linha.length; i++){
                        regex = regex + linha[i];
                    }
                }if (cont == 1){
                    n = Integer.parseInt(linha[0]);
                }if (cont > 1){
                    palavras.add(linha[0]);
                }  
                cont++;  
            } 

            System.out.println("O regex usado foi: " + regex);
            //Cria automato e valida palavras
            Automato Automato = new Automato(regex);

            for (String pal : palavras){
                System.out.println(pal);
                
                if (Automato.valida(pal)){
                    System.out.println("S");
                }else{
                    System.out.println("N");
                }
            }    

        }catch (Exception e) {
            throw new Exception(e);
        }
    }         
}            