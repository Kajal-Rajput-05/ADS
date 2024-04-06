
class Rec7{
 
    static boolean pali(String str, int s, int e){
     
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return pali(str, s + 1, e - 1);
			return true;
    }
 
    static boolean palindrome(String str){
        int n = str.length(); 
        return pali(str, 0, n - 1);
    }
 
    public static void main(String args[]){
        String str = "abba";
 
        if (palindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

//through scanner
/*
import java.util.Scanner;
class Rec7{
 
    static boolean pali(String str, int s, int e){
     
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return pali(str, s + 1, e - 1);
			return true;
    }
 
    static boolean palindrome(String str){
        int n = str.length(); 
        return pali(str, 0, n - 1);
    }
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
 
        if (palindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
*/