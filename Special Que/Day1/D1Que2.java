
class D1Que2 {
   
    public static void main(String[] args){
        int a = 11, b = 22;
        int ans = (a > b) ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        System.out.println("LCM of " + a + " and " + b + " : " + ans);
    }
}