@SuppressWarnings({"unchecked", "rawtypes"})
public class TSVetor <Key extends Comparable<Key>, Item>{

   private Key[] keys;
   private Item[] vals;
   private int n;

   public TSVetor (int capacity) {
      keys = (Key[]) new Comparable[capacity];
      vals = (Item[]) new Object[capacity];
   }

   public void add (Key key, Item val){
      int i = rank(key);
      if (i < n && keys[i].compareTo(key) == 0) { 
         // acerto de busca
         vals[i] = val; 
         return; 
      }
      // falha de busca
      for (int j = n; j > i; j--) { 
         keys[j] = keys[j-1]; 
         vals[j] = vals[j-1]; 
      }
      keys[i] = key; 
      vals[i] = val;
      n++;
   }

   public Item value(Key key) {
      int i = rank(key);
      if (i < n && keys[i].compareTo(key) == 0) 
         return vals[i];
      else 
         return null;
   }

   public int rank(Key key) {
      int lo = 0, hi = n-1;
      while (lo <= hi){
         int mid = lo + (hi - lo) / 2;
         int cmp = key.compareTo(keys[mid]);
         if (cmp < 0)
            hi = mid - 1;
         else if (cmp > 0)
            lo = mid + 1;
         else
            return mid;
      }
      return lo;
   }

   public Key select (int k){
      return keys[k];
   }
    
}

