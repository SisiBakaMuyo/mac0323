public class TSBinaria <Key extends Comparable<Key>, Item> {

   private Node root;
 
   private class Node {
      private Key key;
      private Item val;
      private Node left, right;
      private int n;
      public Node(Key key, Item val, int n) {
         this.key = key;
         this.val = val;
         this.n = n;
      }
   }

   public int size(){
      return size(root);
   }

   private int size(Node x){
      if (x == null)
         return 0;
      else
         return x.n;
   }

   public Item value(Key key) {
      return get(root, key);
   }

   private Item get(Node x, Key key) {
      // Considera apenas a subárvore que tem raiz x
      if (x == null) return null;
      int cmp = key.compareTo(x.key);
      if      (cmp < 0) return get(x.left, key);
      else if (cmp > 0) return get(x.right, key);
      else return x.val;
   }
   

   public void add(Key key, Item val) {
      root = put(root, key, val);
   }

   private Node put(Node x, Key key, Item val) {
      // Considera apenas a subárvore com raiz x
      // Devolve a raiz da nova subárvore
      if (x == null) return new Node(key, val, 1);
      int cmp = key.compareTo(x.key);
      if      (cmp < 0) x.left = put(x.left, key, val);
      else if (cmp > 0) x.right = put(x.right, key, val);
      else x.val = val;
      x.n = size (x.left) + size (x.right) + 1;
      return x;
   }

   public Key select (int k){
      if (k < 0 || k >= size())
         throw new IllegalArgumentException();
      Node x = select(root, k);
      return x.key;
   }

   private Node select(Node x, int k){
      if (x == null)
         return null;
      int t = size(x.left);
      if (t > k)
         return select(x.left, k);
      else if (t < k)
         return select(x.right, k-t-1);
      else 
         return x;
   }

   public int rank(Key key){
      return rank(key, root);
   }

   private int rank(Key key, Node x){
      if (x == null)
         return 0;
      int cmp = key.compareTo(x.key);
      if (cmp < 0)
         return rank(key, x.left);
      else if (cmp > 0)
         return 1 + size(x.left) + rank(key, x.right);
      else
         return size(x.left);
   }
    
}