import java.util.Random;

public class TSTreaps <Key extends Comparable<Key>, Item> {
   
   private Node root;
   
   public class Node {
      Key key;
      Item val;
      Node left, right;
      int priority;
      int n;

      Node(Key key, Item val, int n){
         this.key = key;
         this.val = val;
         this.n = n;
         this.priority = new Random().nextInt(100);
         this.left = this.right = null;
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

   public Node rotateLeft(Node h){
      Node r = h.right;
      Node x = h.right.left;

      r.left = h;
      h.right = x;
      return r;
   }

   public Node rotateRight(Node h){
      Node l = h.left;
      Node y = h.left.right;

      l.right = h;
      h.left = y;
      return l;
   }

   public void add(Key key, Item val){
      root = put(root, key, val);
   }

   public Node put(Node x, Key key, Item val){
      if (x == null){
         return new Node(key, val, 1);
      }
   
      int cmp = key.compareTo(x.key);
      if (cmp < 0){
         x.left = put(x.left, key, val);

         if (x.left != null && x.left.priority > x.priority) {
               x = rotateRight(x);
         }
      }
      else if (cmp > 0) {
         x.right = put(x.right, key, val);

         if (x.right != null && x.right.priority > x.priority) {
               x = rotateLeft(x);
         }
      }
      else{
         x.val = val;
      }
      x.n = size (x.left) + size (x.right) + 1;
      return x;
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