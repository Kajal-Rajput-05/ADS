
class D2Que7{
	    private static int length(String str){
        if (str.equals(""))
            return 0;
        else
            return length(str.substring(1)) + 1;
    }
    public static void main(String[] args){      
        String str ="Kajal Rajput";
        System.out.println(length(str));
    }
}