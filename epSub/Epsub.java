public class Epsub {

    private static final int R = 256;
    private static String file;

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

    public void compacta() throws Exception{
        try{
            BinaryStdOut.setTipo('t');
            BinaryStdIn.setArquivo(file);

            // le entrada
            String s = BinaryStdIn.readString();
            char[] input = s.toCharArray();
        
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


    public void descompacta() throws Exception{
        try{
            BinaryStdOut.setTipo('b');
            BinaryStdIn.setArquivo(file);

            Node root = readTrie(); 
            int length = BinaryStdIn.readInt();

            // decode using the Huffman trie
            for (int i = 0; i < length; i++) {
                Node x = root;
                while (!x.isLeaf()) {
                    boolean bit = BinaryStdIn.readBoolean();
                    if (bit) x = x.right;
                    else     x = x.left;
                }
                BinaryStdOut.write(x.ch, 8);
            }

            BinaryStdOut.close();

        }catch (Exception e) {
            throw new Exception(e);
        }      
    }

    private static Node readTrie() throws Exception{
        if (BinaryStdIn.readBoolean()) {
           char c = BinaryStdIn.readChar();
           return new Node(c, 0, null, null);
        }
        return new Node('\0', 0, readTrie(), readTrie());
     }

    public static void main(String[] args) throws Exception{
        try{
            Epsub huffman = new Epsub();
            file = args[0];
            String arquivo = args[0].substring(args[0].lastIndexOf(46) + 1);


            if (arquivo.equals("txt")){
                huffman.compacta();
            }
            if (arquivo.equals("bin")){
                huffman.descompacta();
            }

        }catch (Exception e) {
            throw new Exception(e);
        }    
    }

}