
public class Rec10{
	
	static void display(String str, String res){
		if(str.length() == 0 ){
			System.out.println(res+" ");
			return;
		}
			for( int i=0; i<str.length(); i++ ){
				char ch = str.charAt(i);
				String ros = str.substring(0, i)+str.substring(i+1);
				display(ros, res+ch);
			}
		}
	
	public static void main(String args []){
		String s = "ABC";
		display(s,"");		
	}
}

//through scanner
/*
import java.util.Scanner;
public class Rec10{
	static void display(String str, String res){
	if(str.length() == 0 ){
		System.out.println(res+" ");
		return;
	}
		for( int i=0; i<str.length(); i++ ){
			char ch = str.charAt(i);
			String ros = str.substring(0, i)+str.substring(i+1);
			display(ros, res+ch);
		}
	}
	
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		display(s,"");		
	}
}
*/
