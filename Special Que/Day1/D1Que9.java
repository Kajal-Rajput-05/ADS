
import java.util.*;
class D1Que9{
     
static Map<Integer, List<Integer>> ra1_dict;  
static void ramanujan_On4(int limit){
    for(int a = 0; a < limit; a++){
    for(int b = 0; b < limit; b++){
    for(int c = 0; c < limit; c++){
    for(int d = 0; d < limit; d++){
      if ((a != b) && (a != c) && (a != d) && 
       (b != c) && (b != d) && (c != d)){
        int x = (int)Math.pow(a, 3) + (int) Math.pow(b, 3);
        int y = (int)Math.pow(c, 3) + (int) Math.pow(d, 3);
           if ((x) == (y)){
           int number = (int)Math.pow(a, 3) + (int) Math.pow(b, 3);
           ra1_dict.put(number, new ArrayList<>(
           Arrays.asList(a, b, c, d)));
      } } } } } } }
	  
public static void main(String[] args){
    int L = 30;
     
    ra1_dict = new HashMap<>();
     
    ramanujan_On4(L);
    for(Map.Entry<Integer,List<Integer>> x: ra1_dict.entrySet()){
        System.out.print(x.getKey() + ": (");
        for(int i = x.getValue().size() - 1; i >= 0; i--){
            if (i == 0)
                System.out.print(x.getValue().get(i) + ")");
            else
                System.out.print(x.getValue().get(i) + ", ");    
			} 
			System.out.println();
		}
	}
}