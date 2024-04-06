
 class Rec4{

	static float sumOfSeries(int i, int n, float s){

		if (i > n)
			return s;
		
		else{
			if (i % 2 == 0)	//for even substraction
				s -= (float)1 / i;
 
			else
				s += (float)1 / i;	//for odd addition
				
			return sumOfSeries(i + 1, n, s);
		}
	}
	public static void main(String[] args){
		
		float sum = sumOfSeries(1, 3, 0);
     
		System.out.printf("%f", sum);
	}
}

//through scanner
/*
 import java.util.Scanner;
 class Rec4{

	static float sumOfSeries(int i, int n, float s){

		if (i > n)
			return s;
		
		else{
			if (i % 2 == 0)	//for even substraction
				s -= (float)1 / i;
 
			else
				s += (float)1 / i;	//for odd addition
				
			return sumOfSeries(i + 1, n, s);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		float sum = sumOfSeries(1, sc.nextInt(), 0);
     
		System.out.printf("%f", sum);
	}
}
*/
