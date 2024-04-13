 class D5Que3{
	void ssort(int arr[]){
	int n = arr.length;
	for(int i=0;i<n-1;i++){
		int min = i;
		for(int j=i+1;j<n;j++)
			if(arr[j] < arr[min])
				min = j;
		int temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
		
	}
}
	
	void display(int arr[]){
		int n =arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String args[]){
		D5Que3 h1 = new D5Que3();
		int arr[]={ 11, 55, 33, 88, 44, 22 }; 
		h1.display(arr);
		h1.ssort(arr);
		System.out.println();
		h1.display(arr);	
	}
}