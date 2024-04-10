
class D4Que7{
	Node root;	
	static class Node{
		int data;
		Node left, right;	
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	D4Que7(){
		root = null;
	}
	D4Que7(int d){
		root = new Node(d);
	}	
	void printInorder(Node root){	//inorder traversal
		if(root == null)
			return;
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}
	void Inorder(){
		printInorder(root);
	}
	void printPreorder(Node root){	//preorder traversal
		if(root == null)
			return;
		System.out.print(root.data+" ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	void Preorder(){
		printPreorder(root);
	}
	void printPostorder(Node root){	//postorder traversal
		if(root == null)
			return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data+" ");
	}
	void Postorder(){
		printPostorder(root);
	}	
	public static void main(String args []){
		D4Que7 t1 = new D4Que7();
		t1.root = new Node(5);
		t1.root.left = new Node(11);
		t1.root.right = new Node(15);
		t1.root.left.left = new Node(17);
		t1.root.left.right = new Node(20);
		System.out.print("Inorder Traversal : ");
		t1.Inorder();
		System.out.println();
		System.out.print("Preorder Traversal : ");
		t1.Preorder();
		System.out.println();
		System.out.print("Postorder Traversal : ");
		t1.Postorder();
	}
}