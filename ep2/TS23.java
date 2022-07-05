public class TS23 <Key extends Comparable<Key>, Item>{

   public Node root;
 
   private class Node {
      Node left, right;
      int size;

      Node(int size) {
          this.size = size;
      }
  }

   private class TwoNode extends Node {
      Key key;
      Item value;

      TwoNode(Key key, Item value, int size) {
          super(size);
          this.key = key;
          this.value = value;
      }
  }

  private class ThreeNode extends Node {
      Node middle;

      Key leftKey;
      Item leftValue;

      Key rightKey;
      Item rightValue;

      ThreeNode(Key leftKey, Item leftValue, Key rightKey, Item rightValue, int size) {
          super(size);

          this.leftKey = leftKey;
          this.leftValue = leftValue;
          this.rightKey = rightKey;
          this.rightValue = rightValue;
      }
  }

   private boolean is2Node(Node node) {
      if (node == null) {
         return false;
      }

      return node instanceof TS23.TwoNode;
   }

   private boolean is3Node(Node node) {
      if (node == null) {
         return false;
      }

      return node instanceof TS23.ThreeNode;
   }

   private ThreeNode generate3Node(TwoNode parentNode, TwoNode newNode) {
         boolean isLeftNode = parentNode.key.compareTo(newNode.key) > 0;

         ThreeNode newThreeNode;
         int newSize = parentNode.size;
         if (isLeftNode) {
            newThreeNode = new ThreeNode(newNode.key, newNode.value, parentNode.key,
                     parentNode.value, newSize);
            newThreeNode.left = newNode.left;
            newThreeNode.middle = newNode.right;
            newThreeNode.right = parentNode.right;
         } else {
            newThreeNode = new ThreeNode(parentNode.key, parentNode.value, newNode.key,
                     newNode.value, newSize);
            newThreeNode.left = parentNode.left;
            newThreeNode.middle = newNode.left;
            newThreeNode.right = newNode.right;
         }

         return newThreeNode;
   }

   public int size(){
      return size(root);
   }

   private int size(Node x){
      if (x == null)
         return 0;
      else
         return x.size;
   }

   public Item value(Key key) {
      return get(root, key);
   }


   public void add(Key key, Item value) {
      if (key == null) {
          return;
      }

      if (value == null) {
          return;
      }

      root = put(root, null, key, value);
  }

  private Node put(Node node, Node parent, Key key, Item value) {
      if (node == null) {
          TwoNode newNode = new TwoNode(key, value, 1);

          if (parent == null) {
              return newNode;
          } else if (is2Node(parent)) {
              TwoNode parentNode = (TwoNode) parent;
              return generate3Node(parentNode, newNode);
          }
      }

      if (is2Node(node)) {
          TwoNode twoNode = (TwoNode) node;

          int compare = key.compareTo(twoNode.key);

          if (compare < 0) {
              Node newNode = put(node.left, node, key, value);

              if (is2Node(newNode)) {
                  node.left = newNode;
              } else {
                  ThreeNode newThreeNode = (ThreeNode) newNode;

                  if (containsKey(newThreeNode, twoNode.key)) {
                      node = newNode;
                  } else {
                      node.left = newNode;
                  }
              }
          } else if (compare > 0) {
              Node newNode = put(node.right, node, key, value);

              if (is2Node(newNode)) {
                  node.right = newNode;
              } else {
                  ThreeNode newThreeNode = (ThreeNode) newNode;

                  if (containsKey(newThreeNode, twoNode.key)) {
                      node = newNode;
                  } else {
                      node.right = newNode;
                  }
              }
          } else {
              twoNode.value = value;
          }
      } else {
          //Parent is a 3-node
          ThreeNode threeNode = (ThreeNode) node;

          int compareLeft = key.compareTo(threeNode.leftKey);

          if (compareLeft < 0) {
              if (threeNode.leftKey.compareTo(key) == 0) {
                  threeNode.leftValue = value;
              } else if (threeNode.rightKey.compareTo(key) == 0) {
                  threeNode.rightValue = value;
              }
          }
      }

      if (!is3Node(node)) {
          node.size = size(node.left) + 1 + size(node.right);
      } else {
          ThreeNode threeNode = (ThreeNode) node;
          threeNode.size = size(threeNode.left) + 2 + size(threeNode.middle) + size(threeNode.right);
      }
      return node;
  }

   private boolean containsKey(ThreeNode threeNode, Key key) {
      if ((threeNode.leftKey != null && threeNode.leftKey.compareTo(key) == 0)
              || (threeNode.rightKey != null && threeNode.rightKey.compareTo(key) == 0)) {
          return true;
      } else {
          return false;
      }
   }

   public Item get(Key key) {
      if (key == null) {
          return null;
      }

      return get(root, key);
   }

   private Item get(Node node, Key key) {
      if (node == null) {
          return null;
      }

      if (is2Node(node)) {
          TwoNode twoNode = (TwoNode) node;

          int compare = key.compareTo(twoNode.key);
          if (compare < 0) {
              return get(twoNode.left, key);
          } else if (compare > 0) {
              return get(twoNode.right, key);
          } else {
              return twoNode.value;
          }
      } else {
          ThreeNode threeNode = (ThreeNode) node;

          int compareLeft = key.compareTo(threeNode.leftKey);
          int compareRight = key.compareTo(threeNode.rightKey);

          if (compareLeft < 0) {
              return get(threeNode.left, key);
          } else if (compareLeft > 0 && compareRight < 0) {
              return get(threeNode.middle, key);
          } else if (compareRight > 0) {
              return get(threeNode.right, key);
          } else {
              if (compareLeft == 0) {
                  return threeNode.leftValue;
              } else {
                  return threeNode.rightValue;
              }
          }
      }
   }

   public Key select(int index) {
      if (index >= size()) {
          throw new IllegalArgumentException("Index is higher than tree size");
      }

      Node selectedNode = select(root, index);
      return ((TwoNode) selectedNode).key;
   }

   private Node select(Node node, int index) {
      int leftSubtreeSize = size(node.left);

      if (is2Node(node)) {
         if (leftSubtreeSize == index) {
            return node;
         } else if (leftSubtreeSize > index) {
            return select(node.left, index);
         } else {
            return select(node.right, index - leftSubtreeSize - 1);
         }
      } else {
         ThreeNode threeNode = (ThreeNode) node;
         int middleSubtreeSize = size(threeNode.middle);

         if (leftSubtreeSize == index) {
            return new TwoNode(threeNode.leftKey, threeNode.leftValue, threeNode.size);
         } else if (leftSubtreeSize + 1 + middleSubtreeSize == index) {
            return new TwoNode(threeNode.rightKey, threeNode.rightValue, threeNode.size);
         } else if (leftSubtreeSize > index) {
            return select(node.left, index);
         } else if (leftSubtreeSize + 1 + middleSubtreeSize > index) {
            return select(threeNode.middle, index - leftSubtreeSize - 1);
         } else {
            return select(node.right, index - leftSubtreeSize - 1 - middleSubtreeSize - 1);
         }
      }
   }

   public int rank(Key key) {
      return rank(root, key);
   }

   private int rank(Node node, Key key) {
      if (node == null) {
         return 0;
      }

      //Returns the number of keys less than node.key in the subtree rooted at node
      if (is2Node(node)) {
         TwoNode twoNode = (TwoNode) node;

         int compare = key.compareTo(twoNode.key);
         if (compare < 0) {
            return rank(node.left, key);
         } else if (compare > 0) {
            return size(node.left) + 1 + rank(node.right, key);
         } else {
            return size(node.left);
         }
      } else {
         ThreeNode threeNode = (ThreeNode) node;

         int compareLeft = key.compareTo(threeNode.leftKey);
         int compareRight = key.compareTo(threeNode.rightKey);

         if (compareLeft < 0) {
            return rank(threeNode.left, key);
         } else if (compareLeft > 0 && compareRight < 0) {
            return size(threeNode.left) + 1 + rank(threeNode.middle, key);
         } else if (compareRight > 0) {
            return size(threeNode.left) + 1 + size(threeNode.middle) + 1 + rank(threeNode.right, key);
         } else {
            if (compareLeft == 0) {
                  return size(node.left);
            } else {
                  return size(node.left) + 1 + size(threeNode.middle);
            }
         }
      }
   }
    
}
