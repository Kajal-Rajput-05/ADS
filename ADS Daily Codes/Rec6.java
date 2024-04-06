
class Rec6{

	static String recursiveFun(int n){
		if (n == 1)
			return "int";
		
		return "gcd(int, " + 
			recursiveFun(n - 1) + ")";
	}
	
	public static void main(String [] arg){
		int n = 5;
		System.out.println(recursiveFun(n));
	}
}

//through scanner
/*
import java.util.Scanner;

class Rec6{

	static String recursiveFun(int n){
		if (n == 1)
			return "int";
		
		return "gcd(int, " + 
			recursiveFun(n - 1) + ")";
	}
	
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		System.out.println(recursiveFun(n));
	}
}
*/