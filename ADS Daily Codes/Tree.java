
//postorder traversal-right left root
class Tree{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	Tree(){
		root = null;
	}
	Tree(int d){
		root = new Node(d);
	}
	
	void printPostorder(Node root){
		if(root == null)
			return;
		printPostorder(root.right);
		printPostorder(root.left);
		System.out.println(root.data+" ");
	}
	void Postorder(){
		printPostorder(root);
	}
	
	public static void main(String args []){
		Tree t1 = new Tree();
		t1.root = new Node(5);
		t1.root.left = new Node(11);
		t1.root.right = new Node(15);
		t1.root.left.left = new Node(17);
		t1.root.left.right = new Node(20);
		
		t1.Postorder();
	}
}

//--------------------------------------------
/*
//postorder traversal-left right root
class Tree{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	Tree(){
		root = null;
	}
	Tree(int d){
		root = new Node(d);
	}
	
	void printPostorder(Node root){
		if(root == null)
			return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.println(root.data+" ");
	}
	void Postorder(){
		printPostorder(root);
	}
	
	public static void main(String args []){
		Tree t1 = new Tree();
		t1.root = new Node(5);
		t1.root.left = new Node(11);
		t1.root.right = new Node(15);
		t1.root.left.left = new Node(17);
		t1.root.left.right = new Node(20);
		
		t1.Postorder();
	}
}
*/
//--------------------------------------------
/*
//preorder traversal-root right left
class Tree{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	Tree(){
		root = null;
	}
	Tree(int d){
		root = new Node(d);
	}
	
	void printPreorder(Node root){
		if(root == null)
			return;
		System.out.println(root.data+" ");
		printPreorder(root.right);
		printPreorder(root.left);
	}
	void Preorder(){
		printPreorder(root);
	}
	
	public static void main(String args []){
		Tree t1 = new Tree();
		t1.root = new Node(5);
		t1.root.left = new Node(11);
		t1.root.right = new Node(15);
		t1.root.left.left = new Node(17);
		t1.root.left.right = new Node(20);
		
		t1.Preorder();
	}
}
*/
//--------------------------------------------
/*
/preorder traversal-root left right
class Tree{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	Tree(){
		root = null;
	}
	Tree(int d){
		root = new Node(d);
	}
	
	void printPreorder(Node root){
		if(root == null)
			return;
		System.out.println(root.data+" ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	void Preorder(){
		printPreorder(root);
	}
	
	public static void main(String args []){
		Tree t1 = new Tree();
		t1.root = new Node(5);
		t1.root.left = new Node(11);
		t1.root.right = new Node(15);
		t1.root.left.left = new Node(17);
		t1.root.left.right = new Node(20);
		
		t1.Preorder();
	}
}
*/
//--------------------------------------------
/*
//inorder traversal-right root left
class Tree{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	Tree(){
		root = null;
	}
	Tree(int d){
		root = new Node(d);
	}
	
	void printInorder(Node root){
		if(root == null)
			return;
		printInorder(root.right);
		System.out.println(root.data+" ");
		printInorder(root.left);
	}
	void Inorder(){
		printInorder(root);
	}
	
	public static void main(String args []){
		Tree t1 = new Tree();
		t1.root = new Node(5);
		t1.root.left = new Node(11);
		t1.root.right = new Node(15);
		t1.root.left.left = new Node(17);
		t1.root.left.right = new Node(20);
		
		t1.Inorder();
	}
}
*/
//--------------------------------------------
/*
//inorder traversal-Left root right
class Tree{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	Tree(){
		root = null;
	}
	Tree(int d){
		root = new Node(d);
	}
	
	void printInorder(Node root){
		if(root == null)
			return;
		printInorder(root.left);
		System.out.println(root.data+" ");
		printInorder(root.right);
	}
	void Inorder(){
		printInorder(root);
	}
	
	public static void main(String args []){
		Tree t1 = new Tree();
		t1.root = new Node(5);
		t1.root.left = new Node(11);
		t1.root.right = new Node(15);
		t1.root.left.left = new Node(17);
		t1.root.left.right = new Node(20);
		
		t1.Inorder();
	}
}
*/
//--------------------------------------------
/*
// basic program
class Tree{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	Tree(){
		root = null;
	}
	Tree(intd){
		root = new Node(d);
	}
	
	public static void main(String args []){
		Tree t1 = new Tree();
		t1.root = new Node(5);
		t1.root.left = new Node(11);
		t1.root.right = new Node(15);
	}
}
*/