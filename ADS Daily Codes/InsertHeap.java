
class InsertHeap {
		static void heapify(int arr[], int n, int i){
			int largest = i;
			int l = 2*i+1;
			int r = 2*i+2;
			
			if(l<n && arr[l]>arr[largest])
				largest = l;
			if(r<n && arr[r]>arr[largest])
				largest = r;
				
			if(largest != i){
				int temp = arr[i];
				arr[i] = arr[largest];
				arr[largest] = temp;
				
				heapify(arr, n, largest);
			}
		}
    static int insertNode(int[] arr, int n, int Key){    
        n = n + 1;
        arr[n - 1] = Key;
        heapify(arr, n, n - 1);
		return n;
    }
 
	static void display(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
	}

    public static void main(String args[]){
        int x = 10;
        int[] arr = new int[x];
        arr[0] = 11;
        arr[1] = 55;
        arr[2] = 33;
        arr[3] = 88;
        arr[4] = 44;
		
		int n=5;
        insertNode(arr, n, 77);
        display(arr);
		System.out.println();
		System.out.println("----------------------");
		n++;
		insertNode(arr, n, 99);
        display(arr);
		System.out.println();
		System.out.println("----------------------");
		n++;
		insertNode(arr, n, 22);
        display(arr);
    }
}