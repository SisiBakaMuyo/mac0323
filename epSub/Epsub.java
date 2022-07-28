import java.io.File;
import java.util.Scanner;

public class Epsub {

    private static final int R = 256;

    private Epsub() { }

    private static class Node implements Comparable<Node> {
        private final char ch;
        private final int freq;
        private final Node left, right;

        Node(char ch, int freq, Node left, Node right) {
            this.ch    = ch;
            this.freq  = freq;
            this.left  = left;
            this.right = right;
        }

        private boolean isLeaf() {
            assert ((left == null) && (right == null)) || ((left != null) && (right != null));
            return (left == null) && (right == null);
        }

        public int compareTo(Node that) {
            return this.freq - that.freq;
        }
    }

    public void compacta(String texto) throws Exception{
        try{
            BinaryStdOut.setTipo('t');

        
            char[] input = texto.toCharArray();

            // contagem de frequencia
            int[] freq = new int[R];
            for (int i = 0; i < input.length; i++){
                freq[input[i]]++;
            }    

            // monta trie
            Node root = buildTrie(freq);
            String[] st = new String[R];
            buildCode(st, root, "");
            writeTrie(root);
            BinaryStdOut.write(input.length);

            // Huffman para codificar
            for (int i = 0; i < input.length; i++) {
                String code = st[input[i]];
                for (int j = 0; j < code.length(); j++) {
                    if (code.charAt(j) == '0') {
                        BinaryStdOut.write(false);
                    }
                    else if (code.charAt(j) == '1') {
                        BinaryStdOut.write(true);
                    }
                }
            }
            BinaryStdOut.close();

        }catch (Exception e) {
            throw new Exception(e);
        }          
    }

    // monta trie com frequencias
    private Node buildTrie(int[] freq) {

        MinPQ<Node> pq = new MinPQ<Node>();
        for (char c = 0; c < R; c++)
            if (freq[c] > 0)
                pq.insert(new Node(c, freq[c], null, null));

        
        while (pq.size() > 1) {
            Node left  = pq.delMin();
            Node right = pq.delMin();
            Node parent = new Node('\0', left.freq + right.freq, left, right);
            pq.insert(parent);
        }
        return pq.delMin();
    }


    // escreve trie codificada
    private void writeTrie(Node x) throws Exception{
        if (x.isLeaf()) {
            BinaryStdOut.write(true);
            BinaryStdOut.write(x.ch, 8);
            return;
        }
        BinaryStdOut.write(false);
        writeTrie(x.left);
        writeTrie(x.right);
    }

    //monta tabela simbolos
    private void buildCode(String[] st, Node x, String s) {
        if (!x.isLeaf()) {
            buildCode(st, x.left,  s + '0');
            buildCode(st, x.right, s + '1');
        }
        else {
            st[x.ch] = s;
        }
    }


    public void descompacta(String binario) throws Exception{
        try{
            BinaryStdOut.setTipo('b');
            Node root = readTrie(); 
            int length = binario.length();

            // decode using the Huffman trie
            for (int i = 0; i < length; i++) {
                Node x = root;
                while (!x.isLeaf()) {
                    if (binario.charAt(i) == '1'){
                        x = x.right;
                    }else {
                        x = x.left;
                    }
                }
                BinaryStdOut.write(x.ch, 8);
            }

            BinaryStdOut.close();

        }catch (Exception e) {
            throw new Exception(e);
        }      
    }

    private static Node readTrie() {
        if (BinaryStdIn.readBoolean()) {
           char c = BinaryStdIn.readChar();
           return new Node(c, 0, null, null);
        }
        return new Node('\0', 0, readTrie(), readTrie());
     }

    public static void main(String[] args) throws Exception{
        try{
            Epsub huffman = new Epsub();
            String arquivo = args[0].substring(args[0].lastIndexOf(46) + 1);
            Scanner scanner = new Scanner(new File(args[0]));
            String texto = "";

            while (scanner.hasNext()) {
                String linha = scanner.nextLine();
                texto = texto + linha + "\n";
            }  

            if (arquivo.equals("txt")){
                huffman.compacta(texto);
            }
            if (arquivo.equals("bin")){
                huffman.descompacta(texto);
            }

        }catch (Exception e) {
            throw new Exception(e);
        }    
    }

}