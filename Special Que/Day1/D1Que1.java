
 public class D1Que1 {
 
    static int gcd(int a, int b)
    {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
 
    public static void main(String[] args){
        int a = 11, b = 22;
        System.out.print("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}