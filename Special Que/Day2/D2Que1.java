
class D2Que1 {
    
    static void print(int n){
        if (n > 0) {
            print(n - 1);
            System.out.print(n + " ");
        }
        return;
    }

    public static void main(String[] args){
        int n = 10;
        print(n);
    }
}