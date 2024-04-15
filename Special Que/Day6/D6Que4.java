
class D6Que4 {
 
    static void sort(int a[], int n){
        int x = 0;
        int y = n - 1;
        int mid = 0, temp = 0;
        while (mid <= y) {
            switch (a[mid]) {
            case 0: {
                temp = a[x];
                a[x] = a[mid];
                a[mid] = temp;
                x++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2: {
                temp = a[mid];
                a[mid] = a[y];
                a[y] = temp;
                y--;
                break;
            }
        }
     }
 }
    static void display(int arr[], int n){
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    public static void main(String[] args){
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2,  2, 0, 0, 0, 1 };
        int n = arr.length;
        sort(arr, n);
        display(arr, n);
    }
}