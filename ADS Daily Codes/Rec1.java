 class Rec1 {
	static int fact( int n ){
		if( n<=1 )
			return 1;
		else
			//return n*fact(n-1);// tail recursion
			return fact(n-1)*n ;// head recursion
		
	}	

	public static void main(String args []){
		System.out.println(fact( 3 ));
	}
}