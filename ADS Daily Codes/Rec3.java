class Rec3 {
	 
	 static int sum(int n){
		 if(n>0)
			 return n+sum(n-1);
		else
			return 0;
				 
	 }
	
	public static void main(String args []){
	
		int result = sum(10);
		
		System.out.print( result );
		
	}
}
//through scanner
/*
import java.util.Scanner;
class Rec3 {
	 
	 static int sum(int n){
		 if(n>0)
			 return n+sum(n-1);
		else
			return 0;
				 
	 }
	
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();
		int result = sum(num);
		
		System.out.print( result );
		
	}            
}
*/