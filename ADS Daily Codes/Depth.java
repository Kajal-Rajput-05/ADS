
//------------------------------------------------------------
//Depth of tree from 1

class Depth{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	int depth(Node n){
		if ( n == null )
			return 0;
		else{
			int ld = depth( n.left );
			int rd = depth( n.right);
			
			if( ld > rd )
				return ( ld + 1 );
			else
				return ( rd + 1 );
		}
	}
	public static void main(String args []){
		Depth tree = new Depth();
		
		tree.root = new Node(5);
        tree.root.left = new Node(11);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(17);
		tree.root.left.right = new Node(20);
		tree.root.left.left.right = new Node(25);
 
        System.out.println("Depth : " + tree.depth(tree.root));
		
	}

}

//------------------------------------------------------------
//Depth of tree from 0
/*
class Depth{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	int depth(Node n){
		if ( n == null )
			return -1;
		else{
			int ld = depth( n.left );
			int rd = depth( n.right);
			
			if( ld > rd )
				return ( ld + 1 );
			else
				return ( rd + 1 );
		}
	}
	public static void main(String args []){
		Depth tree = new Depth();
		
		tree.root = new Node(5);
        tree.root.left = new Node(11);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(17);
		tree.root.left.right = new Node(20);
		tree.root.left.left.right = new Node(25);
 
        System.out.println("Depth : " + tree.depth(tree.root));
		
	}

}
*/
//------------------------------------------------------------
//Depth of tree
/*
 int depth(Node n){

	if ( n == null )
		return 0;
	else{
		int ld = depth( n.left );
		int rd = depth( n.right);
		
		if( ld > rd )
			return ( ld + 1 );
		else
			return ( rd + 1 );
	}
}
*/