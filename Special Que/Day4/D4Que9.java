class D4Que9{
	Node root;	
	static class Node{
		int data;
		Node left, right;		
		Node(int d){
			data = d;
			left = right = null;
		}
	}	
	D4Que9(){
		root = null;
	}
	D4Que9(int d){
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
		D4Que9 t1 = new D4Que9();
		t1.root = new Node(11);
		t1.root.left = new Node(25);
		t1.root.right = new Node(5);
		t1.root.left.left = new Node(31);
		t1.root.left.right = new Node(17);
		
		t1.Inorder();
	}
}