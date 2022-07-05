public class TSRubro <Key extends Comparable<Key>, Item>{

   private Node root;

   private static final boolean RED = true;
   private static final boolean BLACK = false;
   
   public class Node {
      Key key;
      Item val;
      Node left, right;
      int n;
      boolean color;
   
      Node(Key key, Item val, int n, boolean color){
         this.key = key;
         this.val = val;
         this.n = n;
         this.color = color;
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
    
   private boolean isRed(Node x){
      if (x == null)
            return false;
      return x.color == RED;
   }

   private Node rotateLeft(Node h){
      Node x = h.right;
      h.right = x.left;
      x.left = h;
      x.color = h.color;
      h.color = RED;
      x.n = h.n;
      h.n = 1 + size(h.left) + size(h.right);
      return x;
   }

   private Node rotateRight(Node h){
      Node x = h.left;
      h.left = x.right;
      x.right = h;
      x.color = h.color;
      h.color = RED;
      x.n = h.n;
      h.n = 1 + size(h.left) + size(h.right);
      return x;
   }

   void flipColors(Node h){
      h.color = RED;
      h.left.color = BLACK;
      h.right.color = BLACK;
   }
        
   public void add(Key key, Item val){
      root = put(root, key, val);
      root.color = BLACK;
   }

   private Node put(Node h, Key key, Item val){
      if (h == null)
         return new Node(key, val, 1, RED);
      
      int cmp = key.compareTo(h.key);
      if (cmp < 0)
         h.left = put(h.left, key, val);
      else if (cmp > 0)
         h.right = put(h.right, key, val);
      else
         h.val = val;
      
      if (isRed(h.right) && !isRed(h.left))
         h = rotateLeft(h);
      if (isRed(h.left) && isRed(h.left.left)) 
         h = rotateRight(h);
      if (isRed(h.left) && isRed(h.right))
         flipColors(h);
      
      h.n = size(h.left) + size(h.right) + 1;
      return h;
         
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
