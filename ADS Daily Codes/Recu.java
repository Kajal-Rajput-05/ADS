 
 class Recu {
	
	static int show(int n ){
		
		if ( n>22 )	//21>22-false,22>22-false,23>22-true
			return n; //23
		else			//came here
			return 2+show(n+1);//2+show(21+1)	
			//2+show(22)
			//2+n=> n=25 = 2+25=27
			//2+n=> n=23 = 2+23=25
}

	public static void main(String args []){
		System.out.println(show(21));
	}
}