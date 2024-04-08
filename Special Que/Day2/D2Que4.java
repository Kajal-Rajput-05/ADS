
class D2Que4{
   static int find(int decimal){
        if (decimal == 0) 
            return 0;  
        else   
        return (decimal % 2 + 10 * 
                find(decimal / 2));
    }
	
	public static void main(String args[]){
		int decimal = 6;
		System.out.println(find(decimal));
	}	 
}
