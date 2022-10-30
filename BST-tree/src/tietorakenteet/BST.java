package tietorakenteet;

public class BST {
	 
    class Node {
        int key;
        String data;
        Node left, right;
 
        public Node(int item, String data)
        {
            key = item;
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    BST() { root = null; }
 
    BST(int value, String data) { root = new Node(value, data); }
 
    void insert(int key, String data) { root = insertRec(root, key, data); }
 
    Node insertRec(Node root, int key, String data){
        if (root == null) {
            root = new Node(key, data);
            return root;
        } else if (key < root.key) {
            root.left = insertRec(root.left, key, data);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key, data);
        } else {
        	System.out.println("Arvo on jo puussa!");
        }

        return root;
    }

    public void search(int item) {
        boolean returnValue = search(this.root, item);
        if(!returnValue) {
        	System.out.println("Arvoa ei ole puussa!");
        }
    }

    private boolean search(Node root, int item) {
        if (root == null) {
            return false;
        } else if (root.key == item) {
        	System.out.println("Arvon teksti: " + root.data);
            return true;
        } else if (root.key > item) {
            return search(root.left, item);
        }
        return search(root.right, item);
    }
    
    void print() { inorderRec(root); }
 
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
}

