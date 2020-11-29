import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root;             // root of BST
    int size = 0;
    int nodeCount;

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public Solution() {

        root = null;
    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
       
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
      return size;
       
    }

    // return number of key-value pairs in BST rooted at x
    

    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    
    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        if(key == null){
            throw new IllegalArgumentException("argument to get value() is null");
        }
        Node curNode = root;
        while(curNode.key != key){
            int cmp = key.compareTo(curNode.key);
            if(cmp < 0){
                curNode = curNode.left;
            }
            else if(cmp > 0){
                curNode = curNode.right;
            }
        }
        if(curNode.key == key){
            System.out.println(curNode.val);
        }
        return curNode.val;
    }



    public Node getNode(Node x, Key key){
        Node node = null;
        if (key == null) {
            throw new IllegalArgumentException("Key is Null");   
        }
        while( x!= null) {
            int cmp = key.compareTo(x.key);
            if (cmp == 0) {
                return x;
            }
            if (cmp > 0) {
                node = x;
                x = x.right;
            }
            else {
                x = x.left;
            }
        }
        return node;
    }


    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old 
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value val) {
        if(key == null) {
            throw new IllegalArgumentException("Argument to get value() is null");    
        }
        else {
            Node newest = new Node(key,val);
            if(root == null){
                root = newest;
            }
            else{
                Node x = root;
                Node parent;
                while( x!=null ){
                    parent = x;
                    int cmp = key.compareTo(x.key);
                    if(cmp < 0){
                        x = x.left;
                        if(x == null){
                            parent.left = newest;
                            size = size + 1;
                            return;
                        }
                        else if(x.key == key){
                            x.val = val;
                            return;
                        }
                    }
                    else if(cmp > 0){
                        x = x.right;
                        if(x == null){
                            parent.right = newest;
                            size = size + 1;
                            return;
                        }
                        else if(x.key == key){
                            x.val = val;
                            return;
                        }
                    }
                }
            }
            size = size + 1;   
        }

    }
 
       
    

    // private Node put(Node x, Key key, Value val) {
        
    // }

    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
        if(isEmpty()){
        throw new NoSuchElementException("no element in the symbol table");
       }
       else{
            Node x = root;
            while(x.left != null){
                x = x.left;
            }
            return x.key;
       }
        
    } 
    
   

    /**
     * Returns the largest key in the symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in the symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    

    public Key floor(Key key) {

        Node x = getNode(root, key);
        Node temp = x;
        if (key == null) {
            throw new IllegalArgumentException("Key is Null"); 
        }   
        else if (size() == 0) {
            throw new NoSuchElementException("No such Key");
        }
        if (x==null) {
            return null;
        } 
        if(x.left!=null){
            temp = x.left;
            
            while(temp.right!=null){
                temp = temp.right;
            }
        }
        return temp.key;
    }
    

    // // private Node floor(Node x, Key key) {
    // //     return null;
       
    // // } 

    
    

    // /**
    //  * Return the key in the symbol table whose rank is {@code k}.
    //  * This is the (k+1)st smallest key in the symbol table.
    //  *
    //  * @param  k the order statistic
    //  * @return the key in the symbol table of rank {@code k}
    //  * @throws IllegalArgumentException unless {@code k} is between 0 and
    //  *        <em>n</em>–1
    //  */
     public Key select(int k) {
        nodeCount=0;
        if ((k<0) || k>=size()) {
            throw new IllegalArgumentException("Rank should be between 0 and its size");
        }
        return select(root, k+1).key;
    }
    
    // Return key of rank k. 
     private Node select(Node x, int k) {
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while (!stack.empty() || curr != null)
        {
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                curr = stack.pop();
                nodeCount++;
                if(nodeCount == k)
                    break;
                curr = curr.right;
            }
        }
        return curr;
    } 
    
    // // Return key of rank k. 
    // private Node select(Node x, int k) {
        
         
    // } 

    

    // /**
    //  * Returns all keys in the symbol table in the given range,
    //  * as an {@code Iterable}.
    //  *
    //  * @param  lo minimum endpoint
    //  * @param  hi maximum endpoint
    //  * @return all keys in the symbol table between {@code lo} 
    //  *         (inclusive) and {@code hi} (inclusive)
    //  * @throws IllegalArgumentException if either {@code lo} or {@code hi}
    //  *         is {@code null}
    //  */
    
    public Iterable<Key> keys(Key lo, Key hi) {
        if (lo == null || hi == null) {
            throw new IllegalArgumentException("Argument is null!!!");
        }
        Queue<Key> queue = new LinkedList<Key>();
        keys(root, queue, lo, hi);
        return queue;
    }

    private void keys(Node x,Queue<Key> queue, Key lo, Key hi) { 
        if (x == null) {
            return;
        }
        Node node1 = x;
        while (node1 != null){
            int cmp = node1.key.compareTo(hi);
            int cmp1 = node1.key.compareTo(lo);

            if (node1.left == null) {
                if (cmp <= 0 && cmp1 >= 0) queue.offer(node1.key);
                node1 = node1.right;
            }
            else {
                Node node2 = node1.left;
                while (node2.right != null && node2.right != node1)
                    node2= node2.right;
                if (node2.right == null) {
                    node2.right = node1;
                    node1 = node1.left;
                }
                else {
                    node2.right = null;
                    if (cmp <= 0 && cmp1>=0) queue.offer(node1.key);
                    node1 = node1.right;
                }
            }
        }
    }

   
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
  
    public static void main(String[] args) { 
      Solution <String, Integer> bst = new Solution <String, Integer>();
        bst.put("ABDUL",1);
        bst.get("ABDUL");
        bst.put("HRITHIK",2);
        bst.put("SAI",3);
        bst.put("SAMAL",6);
        bst.get("SAI"); 
        bst.put("TASHI",4);
        System.out.println(bst.size());
        System.out.println(bst.min());
        System.out.println(bst.floor("HRITHIK"));
        System.out.println(bst.floor("HAHA"));
        System.out.println(bst.select(2));
        System.out.println(bst.keys("ABDUL", "TASHI"));
        bst.put("CHIMI",5);
        bst.put("SAMAL",4);
        bst.get("SAMAL");
        bst.put("NIMA",7);
        System.out.println(bst.size());
        System.out.println(bst.floor("CHIMA"));
        bst.put("SONAM",8); 
        System.out.println(bst.keys("ABDUL","TASHI"));
    }
}
