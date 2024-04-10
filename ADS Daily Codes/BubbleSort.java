
class BubbleSort{
		void bsort(int arr[]){
		int n = arr.length;
		boolean flag;
		for(int i=0;i<n-1;i++){
			flag = false;
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=true;
				}
			}
		}		
	}
	void display(int arr[]){
		int n =arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String args[]){
		BubbleSort h1 = new BubbleSort();
		int arr[]={ 11, 55, 33, 88, 44, 22 }; 
		h1.display(arr);
		h1.bsort(arr);
		System.out.println();
		h1.display(arr);	
	}
}

//----------------------------------------------------
/*
class BubbleSort { 
    void bubbleSort(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
		} 

    void display(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    public static void main(String args[]){ 
        BubbleSort ob = new BubbleSort(); 
        int arr[] = { 11, 55, 33, 88, 44, 22 }; 
		ob.display(arr);
        ob.bubbleSort(arr); 
        ob.display(arr); 
    } 
}
*/