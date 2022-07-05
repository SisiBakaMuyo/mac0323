public class Pentamino {

    char [][] saida;
    boolean[] usadas = new boolean [12];

    //marcadores das posições utilizadas em cada peça inserida
    int f = 0; // 1 a 8
    int i = 0; // 1 a 2
    int l = 0; // 1 a 8
    int n = 0; // 1 a 8
    int p = 0; // 1 a 8
    int t = 0; // 1 a 4
    int u = 0; // 1 a 4
    int v = 0; // 1 a 4
    int w = 0; // 1 a 4
    int x = 0; // 1
    int y = 0; // 1 a 8
    int z = 0; // 1 a 4

    //marcadores da aij na matriz de cada pentamino inserido
    int fi, fj  = 0;
    int ii, ij = 0;
    int li, lj = 0;
    int ni, nj = 0;
    int pi, pj = 0;
    int ti, tj = 0;
    int ui, uj = 0;
    int vi, vj = 0;
    int wi, wj = 0;
    int xi, xj = 0;
    int yi, yj = 0;
    int zi, zj = 0;


    //Função que dado a posição na matriz, tenta encaixar o pentamino especifico naquela posição. 
    //Usando todas as rotações possiveis de cada peça
    //Se couber, ele insere e retona true. Se não couber apenas retorna false.
    public boolean cabePentamino (String pentamino, int i, int j, Pentamino penta){
        
        switch (pentamino){
            case "F": // 8 posições
            //f1 
            if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.f < 1 && penta.usadas[0] == false){
                if (penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A'){
                    penta.fi = i;
                    penta.fj = j;
                    penta.f = 1;
                    penta.saida[i][j+1] = 'F';
                    penta.saida[i][j+2] = 'F';
                    penta.saida[i+1][j] = 'F';
                    penta.saida[i+1][j+1] = 'F';
                    penta.saida[i+2][j+1] = 'F';
                    return true;
                }
            }

            //f2 
            if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.f < 2 && penta.usadas[0] == false){
                if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j+2] == 'A'){
                    penta.fi = i;
                    penta.fj = j;
                    penta.f = 2;
                    penta.saida[i][j+1] = 'F';
                    penta.saida[i+1][j] = 'F';
                    penta.saida[i+1][j+1] = 'F';
                    penta.saida[i+1][j+2] = 'F';
                    penta.saida[i+2][j+2] = 'F';
                    return true;
                }
            }

            //f3
            if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.f < 3 && penta.usadas[0] == false){
                if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A'){
                    penta.fi = i;
                    penta.fj = j;
                    penta.f = 3;
                    penta.saida[i][j+1] = 'F';
                    penta.saida[i+1][j+1] = 'F';
                    penta.saida[i+1][j+2] = 'F';
                    penta.saida[i+2][j] = 'F';
                    penta.saida[i+2][j+1] = 'F';
                    return true;
                }
            }

            //f4
            if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.f < 4 && penta.usadas[0] == false){
                if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j+1] == 'A'){                    
                    penta.fi = i;
                    penta.fj = j;
                    penta.f = 4;
                    penta.saida[i][j] = 'F';
                    penta.saida[i+1][j] = 'F';
                    penta.saida[i+1][j+1] = 'F';
                    penta.saida[i+1][j+2] = 'F';
                    penta.saida[i+2][j+1] = 'F';
                    return true;
                }
            }

            //f5
            if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.f < 5 && penta.usadas[0] == false){
                if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j+1] == 'A'){
                    penta.fi = i;
                    penta.fj = j;
                    penta.f = 5;
                    penta.saida[i][j] = 'F';
                    penta.saida[i][j+1] = 'F';
                    penta.saida[i+1][j+1] = 'F';
                    penta.saida[i+1][j+2] = 'F';
                    penta.saida[i+2][j+1] = 'F';   
                    return true;
                }
            }

            //f6
            if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.f < 6 && penta.usadas[0] == false){
                if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j] == 'A'){
                    penta.fi = i;
                    penta.fj = j;
                    penta.f = 6;
                    penta.saida[i][j+1] = 'F';
                    penta.saida[i+1][j] = 'F';
                    penta.saida[i+1][j+1] = 'F';
                    penta.saida[i+1][j+2] = 'F';
                    penta.saida[i+2][j] = 'F';
                    return true;
                }
            }

            //f7
            if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.f < 7 && penta.usadas[0] == false){
                if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+2][j+2] == 'A'){                    
                    penta.fi = i;
                    penta.fj = j;
                    penta.f = 7;
                    penta.saida[i][j+1] = 'F';
                    penta.saida[i+1][j] = 'F';
                    penta.saida[i+1][j+1] = 'F';
                    penta.saida[i+2][j+1] = 'F';
                    penta.saida[i+2][j+2] = 'F';
                    return true;
                }
            }

            //f8
            if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.f < 8 && penta.usadas[0] == false){
                if (penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j+1] == 'A'){                    
                    penta.fi = i;
                    penta.fj = j;
                    penta.f = 8;
                    penta.saida[i][j+1] = 'F';
                    penta.saida[i+1][j] = 'F';
                    penta.saida[i+1][j+1] = 'F';
                    penta.saida[i+2][j+1] = 'F';
                    penta.saida[i+2][j+2] = 'F';
                    return true;
                }
            }
            break;
            
            case "I":// 2 posições
                //i1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && i+4 < penta.saida.length && penta.i < 1 && penta.usadas[1] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+3][j] == 'A' && penta.saida[i+4][j] == 'A'){
                        penta.ii = i;
                        penta.ij = j;
                        penta.i = 1;
                        penta.saida[i][j] = 'I';
                        penta.saida[i+1][j] = 'I';
                        penta.saida[i+2][j] = 'I';
                        penta.saida[i+3][j] = 'I';
                        penta.saida[i+4][j] = 'I';
                        return true;
                    }
                }

                //i2
                if (j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && j+4 < penta.saida[0].length && penta.i < 2 && penta.usadas[1] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i][j+3] == 'A' && penta.saida[i][j+4] == 'A'){                        
                        penta.ii = i;
                        penta.ij = j;
                        penta.i = 2;
                        penta.saida[i][j] = 'I';
                        penta.saida[i][j+1] = 'I';
                        penta.saida[i][j+2] = 'I';
                        penta.saida[i][j+3] = 'I';
                        penta.saida[i][j+4] = 'I';   
                        return true;
                    }
                }
            break;
            
            case "L":// 8 posições
                //l1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.l < 1 && penta.usadas[2] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+3][j] == 'A' && penta.saida[i+3][j+1] == 'A'){                        
                        penta.li = i;
                        penta.lj = j;
                        penta.l = 1;
                        penta.saida[i][j] = 'L';
                        penta.saida[i+1][j] = 'L';
                        penta.saida[i+2][j] = 'L';
                        penta.saida[i+3][j] = 'L';
                        penta.saida[i+3][j+1] = 'L';                        
                        return true;    
                    }
                }

                //l2
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.l < 2 && penta.usadas[2] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i][j+3] == 'A' && penta.saida[i+1][j] == 'A'){                        
                        penta.li = i;
                        penta.lj = j;
                        penta.l = 2;
                        penta.saida[i][j] = 'L';
                        penta.saida[i][j+1] = 'L';
                        penta.saida[i][j+2] = 'L';
                        penta.saida[i][j+3] = 'L';
                        penta.saida[i+1][j] = 'L';
                        return true;    
                    }
                }

                //l3
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.l < 3 && penta.usadas[2] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+3][j+1] == 'A'){                        
                        penta.li = i;
                        penta.lj = j;
                        penta.l = 3;
                        penta.saida[i][j] = 'L';
                        penta.saida[i][j+1] = 'L';
                        penta.saida[i+1][j+1] = 'L';
                        penta.saida[i+2][j+1] = 'L';
                        penta.saida[i+3][j+1] = 'L';   
                        return true;    
                    }
                }

                //l4
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.l < 4 && penta.usadas[2] == false){
                    if (penta.saida[i][j+3] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+1][j+3] == 'A'){                        
                        penta.li = i;
                        penta.lj = j;
                        penta.l = 4;
                        penta.saida[i][j+3] = 'L';
                        penta.saida[i+1][j] = 'L';
                        penta.saida[i+1][j+1] = 'L';
                        penta.saida[i+1][j+2] = 'L';
                        penta.saida[i+1][j+3] = 'L';
                        return true;    
                    }
                }

                //l5
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.l < 5 && penta.usadas[2] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+3][j] == 'A' && penta.saida[i+3][j+1] == 'A'){
                        penta.li = i;
                        penta.lj = j;
                        penta.l = 5;
                        penta.saida[i][j+1] = 'L';
                        penta.saida[i+1][j+1] = 'L';
                        penta.saida[i+2][j+1] = 'L';
                        penta.saida[i+3][j] = 'L';
                        penta.saida[i+3][j+1] = 'L';
                        return true;    
                    }
                }

                //l6
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.l < 6 && penta.usadas[2] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+1][j+3] == 'A'){                        
                        penta.li = i;
                        penta.lj = j;
                        penta.l = 6;
                        penta.saida[i][j] = 'L';
                        penta.saida[i+1][j] = 'L';
                        penta.saida[i+1][j+1] = 'L';
                        penta.saida[i+1][j+2] = 'L';
                        penta.saida[i+1][j+3] = 'L';                        
                        return true;    
                    }
                }

                //l7
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.l < 7 && penta.usadas[2] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+3][j] == 'A'){                        
                        penta.li = i;
                        penta.lj = j;
                        penta.l = 7;
                        penta.saida[i][j] = 'L';
                        penta.saida[i][j+1] = 'L';
                        penta.saida[i+1][j] = 'L';
                        penta.saida[i+2][j] = 'L';
                        penta.saida[i+3][j] = 'L';
                        return true;    
                    }
                }

                //l8
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.l < 8 && penta.usadas[2] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i][j+3] == 'A' && penta.saida[i+1][j+3] == 'A'){                       
                        penta.li = i;
                        penta.lj = j;
                        penta.l = 8;
                        penta.saida[i][j] = 'L';
                        penta.saida[i][j+1] = 'L';
                        penta.saida[i][j+2] = 'L';
                        penta.saida[i][j+3] = 'L';
                        penta.saida[i+1][j+3] = 'L';           
                        return true;    
                    }
                }
            break;
            
            case "N":// 8 posições
                //n1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.n < 1 && penta.usadas[3] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+3][j] == 'A'){                        
                        penta.ni = i;
                        penta.nj = j;
                        penta.n = 1;
                        penta.saida[i][j+1] = 'N';
                        penta.saida[i+1][j+1] = 'N';
                        penta.saida[i+2][j] = 'N';
                        penta.saida[i+2][j+1] = 'N';
                        penta.saida[i+3][j] = 'N';              
                        return true;    
                    }
                }

                //n2
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.n < 2 && penta.usadas[3] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+1][j+3] == 'A'){                        
                        penta.ni = i;
                        penta.nj = j;
                        penta.n = 2;
                        penta.saida[i][j] = 'N';
                        penta.saida[i][j+1] = 'N';
                        penta.saida[i+1][j+1] = 'N';
                        penta.saida[i+1][j+2] = 'N';
                        penta.saida[i+1][j+3] = 'N';                        
                        return true;    
                    }
                }

                //n3
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.n < 3 && penta.usadas[3] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+3][j] == 'A'){                        
                        penta.ni = i;
                        penta.nj = j;
                        penta.n = 3;
                        penta.saida[i][j+1] = 'N';
                        penta.saida[i+1][j] = 'N';
                        penta.saida[i+1][j+1] = 'N';
                        penta.saida[i+2][j] = 'N';
                        penta.saida[i+3][j] = 'N';                        
                        return true;    
                    }
                }

                //n4
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.n < 4 && penta.usadas[3] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+1][j+3] == 'A'){                        
                        penta.ni = i;
                        penta.nj = j;
                        penta.n = 4;
                        penta.saida[i][j] = 'N';
                        penta.saida[i][j+1] = 'N';
                        penta.saida[i][j+2] = 'N';
                        penta.saida[i+1][j+2] = 'N';
                        penta.saida[i+1][j+3] = 'N';                        
                        return true;    
                    }
                }

                //n5
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.n < 5 && penta.usadas[3] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+3][j+1] == 'A'){                        
                        penta.ni = i;
                        penta.nj = j;
                        penta.n = 5;
                        penta.saida[i][j] = 'N';
                        penta.saida[i+1][j] = 'N';
                        penta.saida[i+2][j] = 'N';
                        penta.saida[i+2][j+1] = 'N';
                        penta.saida[i+3][j+1] = 'N';                        
                        return true;    
                    }
                }

                //n6
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.n < 6 && penta.usadas[3] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i][j+3] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A'){                        
                        penta.ni = i;
                        penta.nj = j;
                        penta.n = 6;
                        penta.saida[i][j+1] = 'N';
                        penta.saida[i][j+2] = 'N';
                        penta.saida[i][j+3] = 'N';
                        penta.saida[i+1][j] = 'N';
                        penta.saida[i+1][j+1] = 'N';                        
                        return true;    
                    }
                }

                //n7
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.n < 7 && penta.usadas[3] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+3][j+1] == 'A'){                        
                        penta.ni = i;
                        penta.nj = j;
                        penta.n = 7;
                        penta.saida[i][j] = 'N';
                        penta.saida[i+1][j] = 'N';
                        penta.saida[i+1][j+1] = 'N';
                        penta.saida[i+2][j+1] = 'N';
                        penta.saida[i+3][j+1] = 'N';                       
                        return true;    
                    }
                }

                //n8
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.n < 8 && penta.usadas[3] == false){
                    if (penta.saida[i][j+2] == 'A' && penta.saida[i][j+3] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A'){                        
                        penta.ni = i;
                        penta.nj = j;
                        penta.n = 8;
                        penta.saida[i][j+2] = 'N';
                        penta.saida[i][j+3] = 'N';
                        penta.saida[i+1][j] = 'N';
                        penta.saida[i+1][j+1] = 'N';
                        penta.saida[i+1][j+2] = 'N';                        
                        return true;    
                    }
                }
            break;
            
            case "P":// 8 posições
                //p1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && penta.p < 1 && penta.usadas[4] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A'){                        
                        penta.pi = i;
                        penta.pj = j;
                        penta.p = 1;
                        penta.saida[i][j] = 'P';
                        penta.saida[i][j+1] = 'P';
                        penta.saida[i+1][j] = 'P';
                        penta.saida[i+1][j+1] = 'P';
                        penta.saida[i+2][j] = 'P'; 
                        return true;    
                    }
                }

                //p2
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.p < 2 && penta.usadas[4] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A'){                        
                        penta.pi = i;
                        penta.pj = j;
                        penta.p = 2;
                        penta.saida[i][j] = 'P';
                        penta.saida[i][j+1] = 'P';
                        penta.saida[i][j+2] = 'P';
                        penta.saida[i+1][j+1] = 'P';
                        penta.saida[i+1][j+2] = 'P'; 
                        return true;    
                    }
                }

                //p3
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && penta.p < 3 && penta.usadas[4] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A'){                        
                        penta.pi = i;
                        penta.pj = j;
                        penta.p = 3;
                        penta.saida[i][j+1] = 'P';
                        penta.saida[i+1][j] = 'P';
                        penta.saida[i+1][j+1] = 'P';
                        penta.saida[i+2][j] = 'P';
                        penta.saida[i+2][j+1] = 'P';     
                        return true;    
                    }
                }

                //p4
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.p < 4 && penta.usadas[4] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A'){                       
                        penta.pi = i;
                        penta.pj = j;
                        penta.p = 4;
                        penta.saida[i][j] = 'P';
                        penta.saida[i][j+1] = 'P';
                        penta.saida[i+1][j] = 'P';
                        penta.saida[i+1][j+1] = 'P';
                        penta.saida[i+1][j+2] = 'P';            
                        return true;    
                    }
                }

                //p5
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && penta.p < 5 && penta.usadas[4] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A'){                        
                        penta.pi = i;
                        penta.pj = j;
                        penta.p = 5;
                        penta.saida[i][j] = 'P';
                        penta.saida[i][j+1] = 'P';
                        penta.saida[i+1][j] = 'P';
                        penta.saida[i+1][j+1] = 'P';
                        penta.saida[i+2][j+1] = 'P';                        
                        return true;    
                    }
                }

                //p6
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.p < 6 && penta.usadas[4] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A'){                        
                        penta.pi = i;
                        penta.pj = j;
                        penta.p = 6;
                        penta.saida[i][j+1] = 'P';
                        penta.saida[i][j+2] = 'P';
                        penta.saida[i+1][j] = 'P';
                        penta.saida[i+1][j+1] = 'P';
                        penta.saida[i+1][j+2] = 'P';                        
                        return true;    
                    }
                }

                //p7
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && penta.p < 7 && penta.usadas[4] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A'){                       
                        penta.pi = i;
                        penta.pj = j;
                        penta.p = 7;
                        penta.saida[i][j] = 'P';
                        penta.saida[i+1][j] = 'P';
                        penta.saida[i+1][j+1] = 'P';
                        penta.saida[i+2][j] = 'P';
                        penta.saida[i+2][j+1] = 'P';          
                        return true;    
                    }
                }

                //p8
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.p < 8 && penta.usadas[4] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A'){                        
                        penta.pi = i;
                        penta.pj = j;
                        penta.p = 8;
                        penta.saida[i][j] = 'P';
                        penta.saida[i][j+1] = 'P';
                        penta.saida[i][j+2] = 'P';
                        penta.saida[i+1][j] = 'P';
                        penta.saida[i+1][j+1] = 'P';                      
                        return true;    
                    }
                }
            break;
            
            case "T":// 4 posições
                //t1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.t < 1 && penta.usadas[5] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A'){                        
                        penta.ti = i;
                        penta.tj = j;
                        penta.t = 1;
                        penta.saida[i][j] = 'T';
                        penta.saida[i][j+1] = 'T';
                        penta.saida[i][j+2] = 'T';
                        penta.saida[i+1][j+1] = 'T';
                        penta.saida[i+2][j+1] = 'T';                        
                        return true;    
                    }
                }

                //t2
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.t < 2 && penta.usadas[5] == false){
                    if (penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j+2] == 'A'){                        
                        penta.ti = i;
                        penta.tj = j;
                        penta.t = 2;
                        penta.saida[i][j+2] = 'T';
                        penta.saida[i+1][j] = 'T';
                        penta.saida[i+1][j+1] = 'T';
                        penta.saida[i+1][j+2] = 'T';
                        penta.saida[i+2][j+2] = 'T';                       
                        return true;    
                    }
                }

                //t3
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.t < 3 && penta.usadas[5] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+2][j+2] == 'A'){                       
                        penta.ti = i;
                        penta.tj = j;
                        penta.t = 3;
                        penta.saida[i][j+1] = 'T';
                        penta.saida[i+1][j+1] = 'T';
                        penta.saida[i+2][j] = 'T';
                        penta.saida[i+2][j+1] = 'T';
                        penta.saida[i+2][j+2] = 'T';                     
                        return true;    
                    }
                }

                //t4
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.t < 4 && penta.usadas[5] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j] == 'A'){                       
                        penta.ti = i;
                        penta.tj = j;
                        penta.t = 4;
                        penta.saida[i][j] = 'T';
                        penta.saida[i+1][j] = 'T';
                        penta.saida[i+1][j+1] = 'T';
                        penta.saida[i+1][j+2] = 'T';
                        penta.saida[i+2][j] = 'T';         
                        return true;    
                    }
                }
            break;
            
            case "U":// 4 posições
                //u1
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.u < 1 && penta.usadas[6] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A'){                       
                        penta.ui = i;
                        penta.uj = j;
                        penta.u = 1;
                        penta.saida[i][j] = 'U';
                        penta.saida[i][j+2] = 'U';
                        penta.saida[i+1][j] = 'U';
                        penta.saida[i+1][j+1] = 'U';
                        penta.saida[i+1][j+2] = 'U';                   
                        return true;    
                    }
                }

                //u2
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && penta.u < 2 && penta.usadas[6] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A'){                        
                        penta.ui = i;
                        penta.uj = j;
                        penta.u = 2;
                        penta.saida[i][j] = 'U';
                        penta.saida[i][j+1] = 'U';
                        penta.saida[i+1][j] = 'U';
                        penta.saida[i+2][j] = 'U';
                        penta.saida[i+2][j+1] = 'U';                       
                        return true;    
                    }
                }

                //u3
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.u < 3 && penta.usadas[6] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+2] == 'A'){                       
                        penta.ui = i;
                        penta.uj = j;
                        penta.u = 3;
                        penta.saida[i][j] = 'U';
                        penta.saida[i][j+1] = 'U';
                        penta.saida[i][j+2] = 'U';
                        penta.saida[i+1][j] = 'U';
                        penta.saida[i+1][j+2] = 'U';                       
                        return true;    
                    }
                }

                //u4
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && penta.u < 4 && penta.usadas[6] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A'){                        
                        penta.ui = i;
                        penta.uj = j;
                        penta.u = 4;
                        penta.saida[i][j] = 'U';
                        penta.saida[i][j+1] = 'U';
                        penta.saida[i+1][j+1] = 'U';
                        penta.saida[i+2][j] = 'U';
                        penta.saida[i+2][j+1] = 'U';                 
                        return true;    
                    }
                }
            break;
            
            case "V":// 4 posições
                //v1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.v < 1 && penta.usadas[7] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+2][j+2] == 'A'){                        
                        penta.vi = i;
                        penta.vj = j;
                        penta.v = 1;
                        penta.saida[i][j] = 'V';
                        penta.saida[i+1][j] = 'V';
                        penta.saida[i+2][j] = 'V';
                        penta.saida[i+2][j+1] = 'V';
                        penta.saida[i+2][j+2] = 'V';                        
                        return true;    
                    }
                }

                //v2
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.v < 2 && penta.usadas[7] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+2][j] == 'A'){                       
                        penta.vi = i;
                        penta.vj = j;
                        penta.v = 2;
                        penta.saida[i][j] = 'V';
                        penta.saida[i][j+1] = 'V';
                        penta.saida[i][j+2] = 'V';
                        penta.saida[i+1][j] = 'V';
                        penta.saida[i+2][j] = 'V';                        
                        return true;    
                    }
                }

                //v3
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.v < 3 && penta.usadas[7] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j+2] == 'A'){                        
                        penta.vi = i;
                        penta.vj = j;
                        penta.v = 3;
                        penta.saida[i][j] = 'V';
                        penta.saida[i][j+1] = 'V';
                        penta.saida[i][j+2] = 'V';
                        penta.saida[i+1][j+2] = 'V';
                        penta.saida[i+2][j+2] = 'V';
                        return true;    
                    }
                }

                //v4
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.v < 4 && penta.usadas[7] == false){
                    if (penta.saida[i][j+2] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+2][j+2] == 'A'){                        
                        penta.vi = i;
                        penta.vj = j;
                        penta.v = 4;
                        penta.saida[i][j+2] = 'V';
                        penta.saida[i+1][j+2] = 'V';
                        penta.saida[i+2][j] = 'V';
                        penta.saida[i+2][j+1] = 'V';
                        penta.saida[i+2][j+2] = 'V';           
                        return true;    
                    }
                }
            break;
            
            case "W":// 4 posições
                //w1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.w < 1 && penta.usadas[8] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+2][j+2] == 'A'){                        
                        penta.wi = i;
                        penta.wj = j;
                        penta.w = 1;
                        penta.saida[i][j] = 'W';
                        penta.saida[i+1][j] = 'W';
                        penta.saida[i+1][j+1] = 'W';
                        penta.saida[i+2][j+1] = 'W';
                        penta.saida[i+2][j+2] = 'W';            
                        return true;    
                    }
                }

                //w2
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.w < 2 && penta.usadas[8] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A'){                       
                        penta.wi = i;
                        penta.wj = j;
                        penta.w = 2;
                        penta.saida[i][j+1] = 'W';
                        penta.saida[i][j+2] = 'W';
                        penta.saida[i+1][j] = 'W';
                        penta.saida[i+1][j+1] = 'W';
                        penta.saida[i+2][j] = 'W';                      
                        return true;    
                    }
                }

                //w3
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.w < 3 && penta.usadas[8] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j+2] == 'A'){                                                
                        penta.wi = i;
                        penta.wj = j;
                        penta.w = 3;
                        penta.saida[i][j] = 'W';
                        penta.saida[i][j+1] = 'W';
                        penta.saida[i+1][j+1] = 'W';
                        penta.saida[i+1][j+2] = 'W';
                        penta.saida[i+2][j+2] = 'W';             
                        return true;    
                    }
                }

                //w4
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.w < 4 && penta.usadas[8] == false){
                    if (penta.saida[i][j+2] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A'){                       
                        penta.wi = i;
                        penta.wj = j;
                        penta.w = 4;
                        penta.saida[i][j+2] = 'W';
                        penta.saida[i+1][j+1] = 'W';
                        penta.saida[i+1][j+2] = 'W';
                        penta.saida[i+2][j] = 'W';
                        penta.saida[i+2][j+1] = 'W';                       
                        return true;    
                    }
                }
            break;
            
            case "X":// 1 posição
                //x1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.usadas[9] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j+1] == 'A'){                       
                        penta.xi = i;
                        penta.xj = j;
                        penta.x = 1;
                        penta.saida[i][j+1] = 'X';
                        penta.saida[i+1][j] = 'X';
                        penta.saida[i+1][j+1] = 'X';
                        penta.saida[i+1][j+2] = 'X';
                        penta.saida[i+2][j+1] = 'X';                       
                        return true;    
                    }
                }
            break;
            
            case "Y":// 8 posições
                //y1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.y < 1 && penta.usadas[10] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+3][j+1] == 'A'){                        
                        penta.yi = i;
                        penta.yj = j;
                        penta.y = 1;
                        penta.saida[i][j+1] = 'Y';
                        penta.saida[i+1][j] = 'Y';
                        penta.saida[i+1][j+1] = 'Y';
                        penta.saida[i+2][j+1] = 'Y';
                        penta.saida[i+3][j+1] = 'Y';                        
                        return true;    
                    }
                }

                //y2
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.y < 2 && penta.usadas[10] == false){
                    if (penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+1][j+3] == 'A'){                        
                        penta.yi = i;
                        penta.yj = j;
                        penta.y = 2;
                        penta.saida[i][j+2] = 'Y';
                        penta.saida[i+1][j] = 'Y';
                        penta.saida[i+1][j+1] = 'Y';
                        penta.saida[i+1][j+2] = 'Y';
                        penta.saida[i+1][j+3] = 'Y';                       
                        return true;    
                    }
                }

                //y3
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.y < 3 && penta.usadas[10] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+3][j] == 'A'){                       
                        penta.yi = i;
                        penta.yj = j;
                        penta.y = 3;
                        penta.saida[i][j] = 'Y';
                        penta.saida[i+1][j] = 'Y';
                        penta.saida[i+2][j] = 'Y';
                        penta.saida[i+2][j+1] = 'Y';
                        penta.saida[i+3][j] = 'Y';                        
                        return true;    
                    }
                }

                //y4
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.y < 4 && penta.usadas[10] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i][j+3] == 'A' && penta.saida[i+1][j+1] == 'A'){                       
                        penta.yi = i;
                        penta.yj = j;
                        penta.y = 4;
                        penta.saida[i][j] = 'Y';
                        penta.saida[i][j+1] = 'Y';
                        penta.saida[i][j+2] = 'Y';
                        penta.saida[i][j+3] = 'Y';
                        penta.saida[i+1][j+1] = 'Y';                       
                        return true;    
                    }
                }

                //y5
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.y < 5 && penta.usadas[10] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+3][j] == 'A'){                       
                        penta.yi = i;
                        penta.yj = j;
                        penta.y = 5;
                        penta.saida[i][j] = 'Y';
                        penta.saida[i+1][j] = 'Y';
                        penta.saida[i+1][j+1] = 'Y';
                        penta.saida[i+2][j] = 'Y';
                        penta.saida[i+3][j] = 'Y';                        
                        return true;    
                    }
                }

                //y6
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.y < 6 && penta.usadas[10] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i][j+3] == 'A' && penta.saida[i+1][j+2] == 'A'){                        
                        penta.yi = i;
                        penta.yj = j;
                        penta.y = 6;
                        penta.saida[i][j] = 'Y';
                        penta.saida[i][j+1] = 'Y';
                        penta.saida[i][j+2] = 'Y';
                        penta.saida[i][j+3] = 'Y';
                        penta.saida[i+1][j+2] = 'Y';                       
                        return true;    
                    }
                }

                //y7
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && i+3 < penta.saida.length && j+1 < penta.saida[0].length && penta.y < 7 && penta.usadas[10] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+3][j+1] == 'A'){                        
                        penta.yi = i;
                        penta.yj = j;
                        penta.y = 7;
                        penta.saida[i][j+1] = 'Y';
                        penta.saida[i+1][j+1] = 'Y';
                        penta.saida[i+2][j] = 'Y';
                        penta.saida[i+2][j+1] = 'Y';
                        penta.saida[i+3][j+1] = 'Y';          
                        return true;    
                    }
                }

                //y8
                if (i+1 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && j+3 < penta.saida[0].length && penta.y < 8 && penta.usadas[10] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+1][j+3] == 'A'){                       
                        penta.yi = i;
                        penta.yj = j;
                        penta.y = 8;
                        penta.saida[i][j+1] = 'Y';
                        penta.saida[i+1][j] = 'Y';
                        penta.saida[i+1][j+1] = 'Y';
                        penta.saida[i+1][j+2] = 'Y';
                        penta.saida[i+1][j+3] = 'Y';                        
                        return true;    
                    }
                }
            break;

            case "Z":// 4 posições
                //z1
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.z < 1 && penta.usadas[11] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i][j+1] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j+1] == 'A' && penta.saida[i+2][j+2] == 'A'){                       
                        penta.zi = i;
                        penta.zj = j;
                        penta.z = 1;
                        penta.saida[i][j] = 'Z';
                        penta.saida[i][j+1] = 'Z';
                        penta.saida[i+1][j+1] = 'Z';
                        penta.saida[i+2][j+1] = 'Z';
                        penta.saida[i+2][j+2] = 'Z';                        
                        return true;    
                    }
                }

                //z2
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.z < 2 && penta.usadas[11] == false){
                    if (penta.saida[i][j+2] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j] == 'A'){                       
                        penta.zi = i;
                        penta.zj = j;
                        penta.z = 2;
                        penta.saida[i][j+2] = 'Z';
                        penta.saida[i+1][j] = 'Z';
                        penta.saida[i+1][j+1] = 'Z';
                        penta.saida[i+1][j+2] = 'Z';
                        penta.saida[i+2][j] = 'Z';                       
                        return true;    
                    }
                }

                //z3
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.z < 3 && penta.usadas[11] == false){
                    if (penta.saida[i][j+1] == 'A' && penta.saida[i][j+2] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+2][j] == 'A' && penta.saida[i+2][j+1] == 'A'){                       
                        penta.zi = i;
                        penta.zj = j;
                        penta.z = 3;
                        penta.saida[i][j+1] = 'Z';
                        penta.saida[i][j+2] = 'Z';
                        penta.saida[i+1][j+1] = 'Z';
                        penta.saida[i+2][j] = 'Z';
                        penta.saida[i+2][j+1] = 'Z';                        
                        return true;    
                    }
                }

                //z4
                if (i+1 < penta.saida.length && i+2 < penta.saida.length && j+1 < penta.saida[0].length && j+2 < penta.saida[0].length && penta.z < 4 && penta.usadas[11] == false){
                    if (penta.saida[i][j] == 'A' && penta.saida[i+1][j] == 'A' && penta.saida[i+1][j+1] == 'A' && penta.saida[i+1][j+2] == 'A' && penta.saida[i+2][j+2] == 'A'){                        
                        penta.zi = i;
                        penta.zj = j;
                        penta.z = 4;
                        penta.saida[i][j] = 'Z';
                        penta.saida[i+1][j] = 'Z';
                        penta.saida[i+1][j+1] = 'Z';
                        penta.saida[i+1][j+2] = 'Z';
                        penta.saida[i+2][j+2] = 'Z';                       
                        return true;    
                    }
                }
            break;
        }

        return false;
    }

    //Função utilizada pelo backtrack para apagar o pentamino errado
    public void retiraPentamino (String pentamino, int i, int j, Pentamino penta){

        switch (pentamino){
            case "F": // 8 posições
                //f1 
                if (penta.f == 1){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.fi = 0;
                    penta.fj = 0;
                }

                //f2 
                if (penta.f == 2){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.fi = 0;
                    penta.fj = 0;
                }

                //f3
                if (penta.f == 3){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.fi = 0;
                    penta.fj = 0;
                }

                //f4
                if (penta.f == 4){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.fi = 0;
                    penta.fj = 0;
                }

                //f5
                if (penta.f == 5){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.fi = 0;
                    penta.fj = 0;
                }

                //f6
                if (penta.f == 6){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.fi = 0;
                    penta.fj = 0;
                }

                //f7
                if (penta.f == 7){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.fi = 0;
                    penta.fj = 0;
                }

                //f8
                if (penta.f == 8){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.f = 0;
                    penta.fi = 0;
                    penta.fj = 0;
                }
            break;
                
            case "I":// 2 posições
                //i1
                if (penta.i == 1){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+3][j] = 'A';
                    penta.saida[i+4][j] = 'A';
                    penta.ii = 0;
                    penta.ij = 0;
                }

                //i2
                if (penta.i == 2){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i][j+3] = 'A';
                    penta.saida[i][j+4] = 'A';
                    penta.i = 0;
                    penta.ii = 0;
                    penta.ij = 0;
                }
            break;
                
            case "L":// 8 posições
                //l1
                if (penta.l == 1){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+3][j] = 'A';
                    penta.saida[i+3][j+1] = 'A';
                    penta.li = 0;
                    penta.lj = 0;
                }

                //l2
                if (penta.l == 2){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i][j+3] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.li = 0;
                    penta.lj = 0;
                }

                //l3
                if (penta.l == 3){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+3][j+1] = 'A';
                    penta.li = 0;
                    penta.lj = 0;
                }

                //l4
                if (penta.l == 4){
                    penta.saida[i][j+3] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+1][j+3] = 'A';
                    penta.li = 0;
                    penta.lj = 0;
                }

                //l5
                if (penta.l == 5){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+3][j] = 'A';
                    penta.saida[i+3][j+1] = 'A';
                    penta.li = 0;
                    penta.lj = 0;
                }

                //f6
                if (penta.l == 6){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+1][j+3] = 'A';
                    penta.li = 0;
                    penta.lj = 0;
                }

                //l7
                if (penta.l == 7){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+3][j] = 'A';
                    penta.li = 0;
                    penta.lj = 0;
                }

                //l8
                if (penta.l == 8){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i][j+3] = 'A';
                    penta.saida[i+1][j+3] = 'A';
                    penta.l = 0;
                    penta.li = 0;
                    penta.lj = 0;
                }
            break;
            
            case "N":// 8 posições
                //n1
                if (penta.n == 1){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+3][j] = 'A';
                    penta.ni = 0;
                    penta.nj = 0;
                }

                //n2
                if (penta.n == 2){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+1][j+3] = 'A';
                    penta.ni = 0;
                    penta.nj = 0;
                }

                //n3
                if (penta.n == 3){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+3][j] = 'A';
                    penta.ni = 0;
                    penta.nj = 0;
                }

                //n4
                if (penta.n == 4){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+1][j+3] = 'A';
                    penta.ni = 0;
                    penta.nj = 0;
                }

                //n5
                if (penta.n == 5){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+3][j+1] = 'A';
                    penta.ni = 0;
                    penta.nj = 0;
                }

                //n6
                if (penta.n == 6){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i][j+3] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.ni = 0;
                    penta.nj = 0;
                }

                //n7
                if (penta.n == 7){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+3][j+1] = 'A';
                    penta.ni = 0;
                    penta.nj = 0;
                }

                //n8
                if (penta.n == 8){
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i][j+3] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.n = 0;
                    penta.ni = 0;
                    penta.nj = 0;
                }
            break;
                
            case "P":// 8 posições
                //p1
                if (penta.p == 1){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.pi = 0;
                    penta.pj = 0;
                }

                //p2
                if (penta.p == 2){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.pi = 0;
                    penta.pj = 0;
                }

                //p3
                if (penta.p == 3){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.pi = 0;
                    penta.pj = 0;
                }

                //p4
                if (penta.p == 4){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.pi = 0;
                    penta.pj = 0;
                }

                //p5
                if (penta.p == 5){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.pi = 0;
                    penta.pj = 0;
                }

                //p6
                if (penta.p == 6){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.pi = 0;
                    penta.pj = 0;
                }

                //p7
                if (penta.p == 7){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.pi = 0;
                    penta.pj = 0;
                }

                //p8
                if (penta.p == 8){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.p = 0;
                    penta.pi = 0;
                    penta.pj = 0;
                }
            break;
            
            case "T":// 4 posições
                //t1
                if (penta.t == 1){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.ti = 0;
                    penta.tj = 0;
                }

                //t2
                if (penta.t == 2){
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.ti = 0;
                    penta.tj = 0;
                }

                //t3
                if (penta.t == 3){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.ti = 0;
                    penta.tj = 0;
                }

                //t4
                if (penta.t == 4){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.t = 0;
                    penta.ti = 0;
                    penta.tj = 0;
                }
            break;
                
            case "U":// 4 posições
                //u1
                if (penta.u == 1){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.ui = 0;
                    penta.uj = 0;
                }

                //u2
                if (penta.u == 2){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.ui = 0;
                    penta.uj = 0;
                }

                //u3
                if (penta.u == 3){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.ui = 0;
                    penta.uj = 0;
                }

                //u4
                if (penta.u == 4){
                    penta.saida[i][j] = 'U';
                    penta.saida[i][j+1] = 'U';
                    penta.saida[i+1][j+1] = 'U';
                    penta.saida[i+2][j] = 'U';
                    penta.saida[i+2][j+1] = 'U';
                    penta.u = 0;
                    penta.ui = 0;
                    penta.uj = 0;
                }
            break;
                
            case "V":// 4 posições
                //v1
                if (penta.v == 1){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.vi = 0;
                    penta.vj = 0;
                }

                //v2
                if (penta.v == 2){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.vi = 0;
                    penta.vj = 0;
                }

                //v3
                if (penta.v == 3){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.vi = 0;
                    penta.vj = 0;
                }

                //v4
                if (penta.v == 4){
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.v = 0;
                    penta.vi = 0;
                    penta.vj = 0;
                }
            break;
                
            case "W":// 4 posições
                //w1
                if (penta.w == 1){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.wi = 0;
                    penta.wj = 0;
                }

                //w2
                if (penta.w == 2){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.wi = 0;
                    penta.wj = 0;
                }

                //w3
                if (penta.w == 3){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.wi = 0;
                    penta.wj = 0;
                }

                //w4
                if (penta.w == 4){
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.w = 0;
                    penta.wi = 0;
                    penta.wj = 0;
                }
            break;
            
            case "X":// 1 posição
                //x1
                penta.saida[i][j+1] = 'A';
                penta.saida[i+1][j] = 'A';
                penta.saida[i+1][j+1] = 'A';
                penta.saida[i+1][j+2] = 'A';
                penta.saida[i+2][j+1] = 'A';
                penta.x = 0;
                penta.xi = 0;
                penta.xj = 0;
            break;
            
            case "Y":// 8 posições
                //y1
                if (penta.y == 1){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+3][j+1] = 'A';
                    penta.yi = 0;
                    penta.yj = 0;
                }

                //y2
                if (penta.y == 2){
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+1][j+3] = 'A';
                    penta.yi = 0;
                    penta.yj = 0;
                }

                //y3
                if (penta.y == 3){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+3][j] = 'A';
                    penta.yi = 0;
                    penta.yj = 0;
                }

                //y4
                if (penta.y == 4){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i][j+3] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.yi = 0;
                    penta.yj = 0;
                }

                //y5
                if (penta.y == 5){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+3][j] = 'A';
                    penta.yi = 0;
                    penta.yj = 0;
                }

                //y6
                if (penta.y == 6){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i][j+3] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.yi = 0;
                    penta.yj = 0;
                }

                //y7
                if (penta.y == 7){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+3][j+1] = 'A';
                    penta.yi = 0;
                    penta.yj = 0;
                }

                //y8
                if (penta.y == 8){
                    penta.saida[i][j+1] = 'Y';
                    penta.saida[i+1][j] = 'Y';
                    penta.saida[i+1][j+1] = 'Y';
                    penta.saida[i+1][j+2] = 'Y';
                    penta.saida[i+1][j+3] = 'Y';
                    penta.y = 0;
                    penta.yi = 0;
                    penta.yj = 0;
                }
            break;

            case "Z":// 4 posições
                //z1
                if (penta.z == 1){
                    penta.saida[i][j] = 'A';
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.zi = 0;
                    penta.zj = 0;
                }

                //z2
                if (penta.z == 2){
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.zi = 0;
                    penta.zj = 0;
                }

                //z3
                if (penta.z == 3){
                    penta.saida[i][j+1] = 'A';
                    penta.saida[i][j+2] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+2][j] = 'A';
                    penta.saida[i+2][j+1] = 'A';
                    penta.zi = 0;
                    penta.zj = 0;
                }

                //z4
                if (penta.z == 4){
                    penta.saida[i][j] = 'A';
                    penta.saida[i+1][j] = 'A';
                    penta.saida[i+1][j+1] = 'A';
                    penta.saida[i+1][j+2] = 'A';
                    penta.saida[i+2][j+2] = 'A';
                    penta.z = 0;
                    penta.zi = 0;
                    penta.zj = 0;
                }
            break;
        }            
    }
    
    public boolean vetorConcluido (boolean [] usados){
        if (usados[0] == true && usados[1] == true && usados[2] == true && usados[3] == true && usados[4] == true && usados[5] == true && usados[6] == true && usados[7] == true && usados[8] == true && usados[9] == true && usados[10] == true && usados[11] == true)
            return true;
        return false;    
    }

    public char[][] retornaTabuleiroPreenchido (int [][] entrada){

        Stack<String> pilha = new Stack<String>();
        String pentamino = "";
        boolean deuvolta = false;
        boolean concluido = false;
        int p = 0;
        int m = 0;
        int n = 0;
        boolean inseriu = false;
        String[] pecas = new String [12];
        pecas[0] = "F";
        pecas[1] = "I";
        pecas[2] = "L";
        pecas[3] = "N";
        pecas[4] = "P";
        pecas[5] = "T";
        pecas[6] = "U";
        pecas[7] = "V";
        pecas[8] = "W";
        pecas[9] = "X";
        pecas[10] = "Y";
        pecas[11] = "Z";
        Pentamino penta = new Pentamino();
        Input in = new Input();
        for (int i = 0; i < 12; i++){
            penta.usadas[i] = false;
        }

        //transforma a matriz de int em char, sendo 0=A e 1=Z
        penta.saida = in.transformaTipo(entrada);

        while(!concluido){ 
            System.out.println("m = " + m + " n = " + n);
            if (penta.saida[m][n] == 'A' || penta.saida[m][n] == 'Z'){ 
                inseriu = false;;
                while (p < 11){ 
                    pentamino = pecas[p];  
                    if (penta.cabePentamino(pentamino, m, n, penta) == true){
                        pilha.push(pentamino);
                        penta.usadas[p] = true;
                        inseriu = true;
                        p = 0;
                        in.imprimeSaida(penta.saida);
                        for (int i = 0; i < penta.usadas.length; i++){
                            System.out.println(penta.usadas[i]);
                        }
                        System.out.println("    ");;
                        break;
                    }
                    p++;
                    if (p == 11 && !deuvolta){
                        p = 0;
                        deuvolta = true;
                    }
                }
                deuvolta = false;
                if (!vetorConcluido(penta.usadas) && inseriu == false && n != penta.saida[0].length-1){
                    System.out.println("Back");
                    //backtracking
                    if (!pilha.isEmpty()){
                        pentamino = pilha.pop();
                        if (pentamino == "F"){
                            m = penta.fi;
                            n = penta.fj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[0] = false;
                            p = 1;
                        }
                        if (pentamino == "I"){
                            m = penta.ii;
                            n = penta.ij;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[1] = false;
                            p = 2;
                        }
                        if (pentamino == "L"){
                            m = penta.li;
                            n = penta.lj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[2] = false;
                            p = 3;
                        }  
                        if (pentamino == "N"){
                            m = penta.ni;
                            n = penta.nj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[3] = false;
                            p = 4;
                        }
                        if (pentamino == "P"){
                            m = penta.pi;
                            n = penta.pj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[4] = false;
                            p = 5;
                        }
                        if (pentamino == "T"){
                            m = penta.ti;
                            n = penta.tj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[5] = false;
                            p = 6;
                        }
                        if (pentamino == "U"){
                            m = penta.ui;
                            n = penta.uj;
                            retiraPentamino(pentamino, m, n, penta); 
                            penta.usadas[6] = false;  
                            p = 7;
                        } 
                        if (pentamino == "V"){
                            m = penta.vi;
                            n = penta.vj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[7] = false;
                            p = 8;
                        }
                        if (pentamino == "W"){
                            m = penta.wi;
                            n = penta.wj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[8] = false;
                            p = 9;
                        }
                        if (pentamino == "X"){
                            m = penta.xi;
                            n = penta.xj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[9] = false;
                            p = 10;
                        }
                        if (pentamino == "Y"){
                            m = penta.yi;
                            n = penta.yj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[10] = false;
                            p = 11;
                        }
                        if (pentamino == "Z"){
                            m = penta.zi;
                            n = penta.zj;
                            retiraPentamino(pentamino, m, n, penta);
                            penta.usadas[11] = false;
                            p = 0;
                        }
                        in.imprimeSaida(penta.saida);
                    }else{
                        System.out.println("Não foi possível encaixar as 12 peças nesse tabuleiro");
                        return penta.saida;
                    }
                }
                if (vetorConcluido(penta.usadas))
                    return penta.saida;
            }
            n++;
            if (n == penta.saida[0].length - 1){
                m++; 
                n = 0;
            }
            if (m == penta.saida.length - 1 && n == penta.saida[0].length - 1)
                concluido = true;
        }
        return penta.saida;
    }


    public static void main (String[] args) throws Exception{
        try{
            Pentamino penta = new Pentamino();
            Input in = new Input();
            int[][] matriz = in.capturaMatriz(args[0]);
            in.imprimeEntrada(matriz);
            System.out.println("");

            char[][] retorno = penta.retornaTabuleiroPreenchido(matriz);
            in.imprimeSaida(retorno);

        }catch (Exception e) {
            throw new Exception(e);
        }
    } 
}
