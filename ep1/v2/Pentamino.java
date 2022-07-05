public class Pentamino {

    public void criaPecas(Peca [] pecas){

        //F
        pecas[0].letra = 'F';
        pecas[0].referencia = 1;
        pecas[0].rotacao = 4;
        pecas[0].linha = 3;
        pecas[0].coluna = 3;
        pecas[0].matriz = new char [pecas[0].linha][pecas[0].coluna];
        pecas[0].matriz[0][0] = '0'; 
        pecas[0].matriz[0][1] = 'F'; 
        pecas[0].matriz[0][2] = 'F';
        pecas[0].matriz[1][0] = 'F';
        pecas[0].matriz[1][1] = 'F';
        pecas[0].matriz[1][2] = '0';
        pecas[0].matriz[2][0] = '0'; 
        pecas[0].matriz[2][1] = 'F';
        pecas[0].matriz[2][2] = '0';

        //I
        pecas[1].letra = 'I';
        pecas[1].referencia = 0;
        pecas[1].rotacao = 2;
        pecas[1].coluna = 1; 
        pecas[1].linha = 5;
        pecas[1].matriz = new char[pecas[1].linha][pecas[1].coluna];
        pecas[1].matriz[0][0] = 'I';
        pecas[1].matriz[1][0] = 'I';
        pecas[1].matriz[2][0] = 'I';
        pecas[1].matriz[3][0] = 'I';
        pecas[1].matriz[4][0] = 'I';

        //L
        pecas[2].letra = 'L';
        pecas[2].referencia = 1;
        pecas[2].rotacao = 4;
        pecas[2].linha = 4;
        pecas[2].coluna = 2;
        pecas[2].matriz =new char[pecas[2].linha][pecas[2].coluna];
        pecas[2].matriz[0][0] = 'L';
        pecas[2].matriz[1][0] = 'L';
        pecas[2].matriz[2][0] = 'L';
        pecas[2].matriz[3][0] = 'L';
        pecas[2].matriz[0][1] = '0';
        pecas[2].matriz[1][1] = '0';
        pecas[2].matriz[2][1] = '0';
        pecas[2].matriz[3][1] = 'L';

        //N
        pecas[3].letra = 'N';
        pecas[3].referencia = 1;
        pecas[3].rotacao = 4;
        pecas[3].linha = 2;
        pecas[3].coluna = 4;
        pecas[3].matriz = new char[pecas[3].linha][pecas[3].coluna];
        pecas[3].matriz[0][0] = 'N';
        pecas[3].matriz[0][1] = 'N';
        pecas[3].matriz[0][2] = '0';
        pecas[3].matriz[0][3] = '0';
        pecas[3].matriz[1][0] = '0';
        pecas[3].matriz[1][1] = 'N';
        pecas[3].matriz[1][2] = 'N';
        pecas[3].matriz[1][3] = 'N';
      
        //P
        pecas[4].letra = 'P';
        pecas[4].referencia = 1;
        pecas[4].rotacao = 4;
        pecas[4].linha = 3;
        pecas[4].coluna = 2;
        pecas[4].matriz = new char[pecas[4].linha][pecas[4].coluna];
        pecas[4].matriz[0][0] = 'P';
        pecas[4].matriz[0][1] = 'P';
        pecas[4].matriz[1][0] = 'P';
        pecas[4].matriz[1][1] = 'P';
        pecas[4].matriz[2][0] = 'P';
        pecas[4].matriz[2][1] = '0';

        //T
        pecas[5].letra = 'T';
        pecas[5].referencia = 0;
        pecas[5].rotacao = 4;
        pecas[5].linha = 3;
        pecas[5].coluna = 3;
        pecas[5].matriz = new char[pecas[5].linha][pecas[5].coluna];
        pecas[5].matriz[0][0] = 'T';
        pecas[5].matriz[0][1] = 'T';
        pecas[5].matriz[0][2] = 'T';
        pecas[5].matriz[1][0] = '0';
        pecas[5].matriz[1][1] = 'T';
        pecas[5].matriz[1][2] = '0';
        pecas[5].matriz[2][0] = '0';
        pecas[5].matriz[2][1] = 'T';
        pecas[5].matriz[2][2] = '0';

        //U
        pecas[6].letra = 'U';
        pecas[6].referencia = 0;
        pecas[6].rotacao = 4;
        pecas[6].linha = 2;
        pecas[6].coluna = 3;
        pecas[6].matriz = new char[pecas[6].linha][pecas[6].coluna];
        pecas[6].matriz[0][0] = 'U';
        pecas[6].matriz[0][1] = '0';
        pecas[6].matriz[0][2] = 'U';
        pecas[6].matriz[1][0] = 'U';
        pecas[6].matriz[1][1] = 'U';
        pecas[6].matriz[1][2] = 'U';

        //V
        pecas[7].letra = 'V';
        pecas[7].referencia = 0;
        pecas[7].rotacao = 4;
        pecas[7].linha = 3;
        pecas[7].coluna = 3;
        pecas[7].matriz = new char[pecas[7].linha][pecas[7].coluna];
        pecas[7].matriz[0][0] = 'V';
        pecas[7].matriz[0][1] = '0';
        pecas[7].matriz[0][2] = '0';
        pecas[7].matriz[1][0] = 'V';
        pecas[7].matriz[1][1] = '0';
        pecas[7].matriz[1][2] = '0';
        pecas[7].matriz[2][0] = 'V';
        pecas[7].matriz[2][1] = 'V';
        pecas[7].matriz[2][2] = 'V';
      
        //W
        pecas[8].letra = 'W';
        pecas[8].referencia = 0;
        pecas[8].rotacao = 4;
        pecas[8].linha = 3;
        pecas[8].coluna = 3;
        pecas[8].matriz = new char[pecas[8].linha][pecas[8].coluna];
        pecas[8].matriz[0][0] = 'W';
        pecas[8].matriz[0][1] = '0';
        pecas[8].matriz[0][2] = '0';
        pecas[8].matriz[1][0] = 'W';
        pecas[8].matriz[1][1] = 'W';
        pecas[8].matriz[1][2] = '0';
        pecas[8].matriz[2][0] = '0';
        pecas[8].matriz[2][1] = 'W';
        pecas[8].matriz[2][2] = 'W';
      
        //X
        pecas[9].letra = 'X';
        pecas[9].referencia = 0;
        pecas[9].rotacao = 1;
        pecas[9].linha = 3;
        pecas[9].coluna = 3;
        pecas[9].matriz = new char[pecas[9].linha][pecas[9].coluna];
        pecas[9].matriz[0][0] = '0';
        pecas[9].matriz[0][1] = 'X';
        pecas[9].matriz[0][2] = '0';
        pecas[9].matriz[1][0] = 'X';
        pecas[9].matriz[1][1] = 'X';
        pecas[9].matriz[1][2] = 'X';
        pecas[9].matriz[2][0] = '0';
        pecas[9].matriz[2][1] = 'X';
        pecas[9].matriz[2][2] = '0';
      
        //Y
        pecas[10].letra = 'Y';
        pecas[10].referencia = 1;
        pecas[10].rotacao = 4;
        pecas[10].linha = 2;
        pecas[10].coluna = 4;
        pecas[10].matriz = new char[pecas[10].linha][pecas[10].coluna];
        pecas[10].matriz[0][0] = '0';
        pecas[10].matriz[0][1] = '0';
        pecas[10].matriz[0][2] = 'Y';
        pecas[10].matriz[0][3] = '0';
        pecas[10].matriz[1][0] = 'Y'; 
        pecas[10].matriz[1][1] = 'Y';
        pecas[10].matriz[1][2] = 'Y';
        pecas[10].matriz[1][3] = 'Y';
      
        //Z
        pecas[11].letra = 'Z';
        pecas[11].referencia = 1;
        pecas[11].rotacao = 2;
        pecas[11].linha = 3;
        pecas[11].coluna = 3;
        pecas[11].matriz = new char[pecas[11].linha][pecas[11].coluna];
        pecas[11].matriz[0][0] = 'Z';
        pecas[11].matriz[0][1] = 'Z';
        pecas[11].matriz[0][2] = '0';
        pecas[11].matriz[1][0] = '0';
        pecas[11].matriz[1][1] = 'Z';
        pecas[11].matriz[1][2] = '0';
        pecas[11].matriz[2][0] = '0';
        pecas[11].matriz[2][1] = 'Z';
        pecas[11].matriz[2][2] = 'Z';

    }

    public char [][] gira (char [][] mat, int lin, int col){
        char [][] nova;
        int i, j;
      
        nova = new char[col][lin];
        for (i = 0; i < col; i++){
            for (j = 0; j < lin; j++){
                nova[i][j]=mat[lin-j-1][i];
            }
        }
        return nova;
    }
    
    public char [][] reflete (char [][] mat, int lin, int col){
        char [][] nova;
        int i,  j;
      
      
        nova = new char[lin][col];
        for (i = 0; i < lin; i++){
            for(j = 0; j < col; j++){
                nova[i][j] = mat[i][col-j-1];
            }
        }
      
        return nova;
    }
    
    //Procura o menor buraco e confere se é menor que 5
    public boolean busca(char [][] tabela, int m, int n, Posicao posicao){
        
        int cont;
        int dl [] = {1,-1,0,0};
        int dc [] = {0,0,1,-1};
        int l, c, i;
        Queue<Posicao> fila = new Queue<Posicao>();
        Posicao p = new Posicao();
      
      
        tabela[posicao.linha][posicao.coluna] = '1';
        cont = 1;
        fila.enqueue(posicao);;
      
        while (!fila.isEmpty()){
            posicao = fila.dequeue();
      
            for (i = 0; i < 4; i++){
                l = posicao.linha + dl[i]; 
                c = posicao.coluna + dc[i];
                if (l >= 0 && l < m && c >= 0 && c < n && tabela [l][c] == '0'){
                    p.linha = l;
                    p.coluna = c;
                    fila.enqueue(p);
                    cont++;
                    tabela [l][c] = '1';
                }
            }
        }

        if (cont >= 5) 
            return false;
        return true; 
    }

    //Confere se o menor buraco disponivel tem pelo menos 5 espaços livres
    public boolean confereEspaco(char [][] tabela, int m, int n){
        
        int i, j = 0;
        boolean busca = false;
        char [][] matrizero = new char [m][n];
        Posicao posicao = new Posicao();
      
            
        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                if(tabela [i][j] == '0'){
                    matrizero [i][j] = '0';
                }
                else{
                    matrizero [i][j] = '1';
                }
            }
        }

        for (i = 0; i < m && busca == false; i++){
            for (j = 0; j < n && busca == false; j++){
                if (matrizero [i][j] == '0'){
                    posicao.linha = i;
                    posicao.coluna = j;
                    busca = busca (matrizero, m, n, posicao); //Verifica se existe um buraco menor que 5 espaços
                }
            }
        }
            
        return (busca);
    }
    
    //Tenta inserir as pecas no tabuleiro
    public boolean encaixa (char [][] tab, Peca p, int indice, int rot, int ref, int m, int n, PecaEncaixe pos){ 

        int i, j = 0;
        boolean encaixou, vazio = false;
        int l, c = 0;
        int refl, rota = 0;
        int nlin = p.linha;
        int ncol = p.coluna; 
        int aux, tl, tc, pl, pc;
        char [][] matrizPeca;
        
        matrizPeca = new char [nlin][ncol];
        
        //matriz auxiliar
        for (i = 0; i < p.linha; i++){
            for(j = 0; j < p.coluna; j++){
                matrizPeca[i][j] = p.matriz[i][j];
            }
        }
        
        //reflexao da peca
        for (refl = 0; refl < ref; refl++){ 
            matrizPeca = reflete (matrizPeca, nlin, ncol);
        }
        
        //rotacao da peca
        for (rota = 0; rota < rot; rota++){ 
            matrizPeca = gira (matrizPeca, nlin, ncol);
            aux = nlin;
            nlin = ncol;
            ncol = aux;
        }
        
        for (refl = ref; refl <= p.referencia; refl++){
            for (rota = rot; rota < p.rotacao; rota++){
                encaixou = true;
                //Tenta encaixar a peça no primeiro espaço disponivel
                vazio = false;
                //primeiro espaço disponivel
                for (i = 0; i < m; i++){ 
                    for (j = 0; j < n; j++){
                        if (tab[i][j] == '0'){
                            vazio = true;
                            break;
                        }
                    }
                    if(vazio) break;
                }
        
                vazio = false;
                //primeiro bloco de pecas
                for (l = 0; l < nlin; l++){ 
                    for (c = 0; c < ncol; c++){
                        if (matrizPeca[l][c] != '0'){
                            vazio = true;
                            break;
                        }
                    }
                    if(vazio) 
                        break;
                }
            
                //guardando as posições livres
                tl = i;
                tc = j;
                pl = l;
                pc = c;
        
                for (i = i-l, l = 0;l < nlin && encaixou ; i++, l++){
                    for (j = j-c, c = 0; c < ncol; j++, c++){
                        if (i < 0 || i >= m || j < 0 || j >= n || (tab[i][j] != '0' && matrizPeca[l][c] != '0')){
                            encaixou = false;
                            break;
                        }
                    }
                }
        
                //encaixando no tabuleiro
                if (encaixou){ 
                    pos.peca = indice;
                    pos.referencia = refl;
                    pos.rotacao = rota;
            
                    for ( tl = tl-pl, pl = 0 ; pl < nlin; tl++, pl++){
                        for (tc = tc-pc, pc = 0 ; pc < ncol; pc++, tc++){
                            if (matrizPeca[pl][pc] != '0')
                                tab[tl][tc] = matrizPeca[pl][pc];
                        }
                    }
                    return true;
                }
        
                //se nada encaixou tenta rodar
                matrizPeca = gira (matrizPeca, nlin, ncol); 
                aux = nlin;
                nlin = ncol;
                ncol = aux;
            }
        
            //se nada encaixou tenta refletir
            matrizPeca = reflete(matrizPeca, nlin, ncol); 
        }
        return false;
    }
    
    //tira a peça do tabuleiro
    public void desencaixa (char [][] tab, Peca [] pecas, PecaEncaixe pos, int m, int n){
        
        int i,j;
        char letra;

        letra = pecas[pos.peca].letra;

        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                if (tab[i][j] == letra) 
                    tab[i][j] = '0';
            }
        }
    }

    public char [][] pentaminos (char [][] tab, int m, int n, boolean gira){

        int cont = 0;
        boolean [] colocadas = new boolean[12];
        int i, j, inicio = 0;
        int rot = 0;
        int ref = 0;
        Peca [] pecas = new Peca[12];
        Stack<PecaEncaixe> p = new Stack<PecaEncaixe>();
        PecaEncaixe pos = new PecaEncaixe();
      
        for (i = 0; i < 12; i++){
            pecas[i] = new Peca();
        }

        criaPecas(pecas);

        //pecas ja usadas
        for (i = 0; i < 12; i++)
            colocadas[i] = false; 
      
        //primeiro giro, se m < n
        if (gira){ 
            tab = gira(tab, m, n);
            i = m;
            m = n;
            n = i;
        }
      
        //enquato existe uma peça disponivel pra encaixar
        while (cont < 12){ 
            for (i = inicio; i < 12; i++){
                if (colocadas[i] && encaixa(tab, pecas[i], i, rot, ref, m, n, pos) && cont < 12){
                    cont++;
                    p.push(pos);;
                    colocadas[i] = true;
      
                    if (inicio != 0){
                        inicio = 0;
                        i = -1; 
                    }
      
                    if (confereEspaco(tab, m, n)) 
                        break;
                    //Existe um espaço com menos de 5 espaços -> backtracking
                }
                rot = 0;
                ref = 0;
            }
      
            //Backtracking
            if (cont < 12){                                   
                if (!p.isEmpty()){
                    pos = p.pop();
                    desencaixa(tab, pecas, pos, m, n);
                  
                    colocadas[pos.peca] = false;
                    //tenta começar por essa peça
                    inicio = pos.peca; 
                    //se for possivel rotacionar, rotaciona
                    if (pos.rotacao < pecas[pos.peca].rotacao - 1){
                        rot = pos.rotacao + 1;
                        ref = pos.referencia;
                    }
                    //se não for possivel, reflete
                    else{ 
                        rot = 0;
                        ref = pos.referencia + 1;
                    }
                    cont--;
                }
                else{
                    System.out.println("Não é possível preeencher esse tabuleiro com os 12 pentaminós");
                    return tab;
                }
            }
        }
          
        //desrotaciona se m < n
        if (gira){
            for (i = 0; i < 3; i++) { 
                tab = gira(tab, m, n);
                j = m;
                m = n;
                n = j;
            }
        }
      
        // for (i = 0; i < m; i++){
        //     for (j = 0; j < n; j++){
        //         if (tab[i][j] == '1')
        //             System.out.print("* ");
        //         else
        //             System.out.print(tab[i][j]);
        //     }
        //     System.out.print(" ");
        // }
        return tab;
    }
    
    public static void main (String[] args) throws Exception{
        try{
            Pentamino penta = new Pentamino();
            Input in = new Input();
            int[][] entrada = in.capturaMatriz(args[0]);
            int m, n;
            in.imprimeEntrada(entrada);
            System.out.println("");

            //transforma a matriz de int em char, sendo 0=A e 1=Z
            char[][] matriz = in.transformaTipo(entrada);
            m = matriz.length;
            n = matriz[0].length;
            matriz = penta.pentaminos(matriz, m, n, m < n);;
            in.imprimeSaida(matriz);

        }catch (Exception e) {
            throw new Exception(e);
        }
    } 
}
