
class D1Que8 {
    static int divSum(int n){
        int result = 0;
        for (int i = 2; i <= Math.sqrt(n); i++){
        if (n % i == 0){
          if (i == (n / i))
              result += i;
          else
              result += (i + n / i);
            }
        }
        return (result + 1);
    }
    static boolean areAmicable(int x, int y){
        if (divSum(x) != y)
        return false;
     
        return (divSum(y) == x);
    }
     
    public static void main (String[] args){
        int x = 11, y = 22;
        if (areAmicable(x, y))
        System.out.println( "Yes");
        else
        System.out.println("No");
     
    }
} 