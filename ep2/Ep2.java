import java.io.File;
import java.util.Scanner;

public class Ep2 {

    public static void main (String[] args) throws Exception{
        try{

            TSVetor<String, String> tsvet = null;
            TSBinaria<String, String> tsbin = new TSBinaria<String, String>();;
            TSTreaps<String, String> tstrp = new TSTreaps<String, String>();;
            TS23<String, String> ts23 = new TS23<String, String>();
            TSRubro<String, String> tsru = new TSRubro<String, String>();

            int cont = 0;
            int i = 0;
            int aux = 0;
            int numPal = 0;
            boolean entra = false;
            int quantOper = 0;
            String estrutura = "";
            String [] palavras = null;
            Scanner scanner = new Scanner(new File(args[0]));

            //Trata Input
            while (scanner.hasNext()) {
                String [] linha = scanner.nextLine().split(" ");
                //Pega qual a estrutura
                if (cont == 0){
                    estrutura = linha[0];
                }
                //Pega numero de palavras
                if (cont == 1){
                    numPal = Integer.parseInt(linha[0]);
                    palavras = new String [numPal];
                    tsvet = new TSVetor<String, String>(numPal);
                }
                //Separa num vetor todas as palavras
                if (cont >= 2 && i < numPal){
                    for (int j = 0; j < linha.length; j++){
                        palavras[i] = linha[j].toLowerCase();
                        palavras[i] = palavras[i].replaceAll("\\p{Punct}", "");
                        i++;
                    }
                    cont++;
                    entra = false;
                }
                //Pega a quantidade de operacoes a serem feitas
                if (i > 0 && entra && quantOper == 0){
                    quantOper = Integer.parseInt(linha[0]);
                    entra = false;
                }
                //Faz as operações
                if (i > 0 && entra){
                    switch (estrutura){
                        case "VO":{
                            switch (linha[0]){
                                case "1":{
                                    for (int k = aux; k < Integer.parseInt(linha[1]); k++){
                                        tsvet.add(palavras[k],String.valueOf(k)); 
                                    }
                                    aux = aux + Integer.parseInt(linha[1]);
                                    break;
                                }
                                case "2":{
                                    System.out.println(tsvet.value(linha[1]));
                                    break;
                                }
                                case "3":{
                                    System.out.println(tsvet.rank(linha[1]));
                                    break;
                                }
                                case "4":{
                                    System.out.println(tsvet.select(Integer.parseInt(linha[1])));
                                    break;
                                }
                            }
                            break;
                        }
                        case "ABB":{
                            switch (linha[0]){
                                case "1":{
                                    for (int k = aux; k < Integer.parseInt(linha[1]); k++){
                                        tsbin.add(palavras[k],String.valueOf(k)); 
                                    }
                                    aux = aux + Integer.parseInt(linha[1]);
                                    break;
                                }
                                case "2":{
                                    System.out.println(tsbin.value(linha[1]));
                                    break;
                                }
                                case "3":{
                                    System.out.println(tsbin.rank(linha[1]));
                                    break;
                                }
                                case "4":{
                                    System.out.println(tsbin.select(Integer.parseInt(linha[1])));
                                    break;
                                }
                            }
                            break;
                        }
                        case "TR":{
                            switch (linha[0]){
                                case "1":{
                                    for (int k = aux; k < Integer.parseInt(linha[1]); k++){
                                        tstrp.add(palavras[k],String.valueOf(k)); 
                                    }
                                    aux = aux + Integer.parseInt(linha[1]);
                                    break;
                                }
                                case "2":{
                                    System.out.println(tstrp.value(linha[1]));
                                    break;
                                }
                                case "3":{
                                    System.out.println(tstrp.rank(linha[1]));
                                    break;
                                }
                                case "4":{
                                    System.out.println(tstrp.select(Integer.parseInt(linha[1])));
                                    break;
                                }
                            }
                            break;
                        }
                        case "A23":{
                            switch (linha[0]){
                                case "1":{
                                    for (int k = aux; k < Integer.parseInt(linha[1]); k++){
                                        ts23.add(palavras[k],String.valueOf(k)); 
                                    }
                                    aux = aux + Integer.parseInt(linha[1]);
                                    break;
                                }
                                case "2":{
                                    System.out.println(ts23.value(linha[1]));
                                    break;
                                }
                                case "3":{
                                    System.out.println(ts23.rank(linha[1]));
                                    break;
                                }
                                case "4":{
                                    System.out.println(ts23.select(Integer.parseInt(linha[1])));
                                    break;
                                }
                            }
                            break;
                        }
                        case "ARN":{
                            switch (linha[0]){
                                case "1":{
                                    for (int k = aux; k < Integer.parseInt(linha[1]); k++){
                                        tsru.add(palavras[k],String.valueOf(k)); 
                                    }
                                    aux = aux + Integer.parseInt(linha[1]);
                                    break;
                                }
                                case "2":{
                                    System.out.println(tsru.value(linha[1]));
                                    break;
                                }
                                case "3":{
                                    System.out.println(tsru.rank(linha[1]));
                                    break;
                                }
                                case "4":{
                                    System.out.println(tsru.select(Integer.parseInt(linha[1])));
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
                entra = true;  
                cont++;  
            }
            
        }catch (Exception e) {
            throw new Exception(e);
        }
    }    
    
}
