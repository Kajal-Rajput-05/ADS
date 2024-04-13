class D5Que7 {
    static int MAX = 100;
    public static void sortStrings(String[] arr, int n){
        String temp;
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
       String[] arr = { "Kajal", "Rajput","CDAC", "Kharghar" };
        int n = arr.length;
        sortStrings(arr, n);
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}