 class D5Que4{
	void isort(int arr[]){
		int n = arr.length;
		for(int i = 1;i<n;i++){
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
	}
 	void display(int arr[]){
		int n =arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String args[]){
		D5Que4 h1 = new D5Que4();
		int arr[]={ 11, 55, 33, 88, 44, 22 }; 
		h1.display(arr);
		h1.isort(arr);
		System.out.println();
		h1.display(arr);	
	}
 }