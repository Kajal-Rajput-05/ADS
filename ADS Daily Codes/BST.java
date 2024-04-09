
// search in BST
class BST {
    Node root;
	
	class Node {
		int key;
		Node left, right;
	 
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

    BST() {
        root = null;
    }
 
    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
 
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        return node;
    }
	    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key < key)
            return search(root.right, key);
        return search(root.left, key);
    }
	
		void printInorder(Node root){
		if(root == null)
			return;
		printInorder(root.left);
		System.out.print(root.key+" ");
		printInorder(root.right);
	}
	void Inorder(){
		printInorder(root);
	}
	

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 18);
        tree.insert(tree.root, 11);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 15);
        tree.insert(tree.root, 17);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 25);
		
		tree.Inorder();
		System.out.println();
		tree.insert(tree.root, 35);
		tree.Inorder();
		
		System.out.println();
        int key = 17;
        if (tree.search(tree.root, key) == null)
            System.out.println(key + " Fail to Find Key");
        else
            System.out.println(key + " Succefully Found the Key");
		
    }
}

//------------------------------------------------
/*
//delete in BST
class BST {
    Node root;
	
	class Node {
		int key;
		Node left, right;
	 
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

    BST() {
        root = null;
    }
 
    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
 
        if (key < node.key){
            node.left = insert(node.left, key);
		}
        else if (key > node.key){
            node.right = insert(node.right, key);
		}
        return node;
    }
	
	Node deletedata(Node root, int key){
		if(root == null)
			return root;
		if(key < root.key)
			root.left = deletedata(root.left, key);
		else if(key > root.key)
			root.right = deletedata(root.right, key);
		
		else{
			//leaf node LC=RC=null
			//single child LC-RC, RC-LC
			if(root.left == null)
				return root.right;
			if(root.right == null)
				return root.left;
			//two child node
			root.key = minvalue(root.right);
			root.right = deletedata(root.right, root.key);
		}
		return root;
	}
	int minvalue(Node root){
		int x = root.key;
		while(root.left != null){
			x = root.left.key;
			root = root.left;
		}
		return x;
	}
	
	void delete(int key){
		root = deletedata(root, key);
	}
	
		void printInorder(Node root){
		if(root == null)
			return;
		printInorder(root.left);
		System.out.print(root.key+" ");
		printInorder(root.right);
	}
	void Inorder(){
		printInorder(root);
	}
	

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 18);
		
        tree.insert(tree.root, 11);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 15);
        tree.insert(tree.root, 17);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 25);
		
		tree.Inorder();
		System.out.println();
		tree.delete(15);
		tree.Inorder();
		
    }
}
*/
//---------------------------------------------
/* 
//insert in BST
class BST {
    Node root;
	
	class Node {
		int key;
		Node left, right;
	 
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

    BST() {
        root = null;
    }
 
    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
 
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        return node;
    }
	
		void printInorder(Node root){
		if(root == null)
			return;
		printInorder(root.left);
		System.out.print(root.key+" ");
		printInorder(root.right);
	}
	void Inorder(){
		printInorder(root);
	}
	

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 50);
        
		tree.insert(tree.root, 11);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 15);
        tree.insert(tree.root, 17);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 25);
		
		tree.Inorder();
		System.out.println();
		tree.insert(tree.root, 35);
		tree.Inorder();
		
    }
}
*/