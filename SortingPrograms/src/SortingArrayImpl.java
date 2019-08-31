
public class SortingArrayImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bubbleSort(new int[]{12,13,14,34,32});
		//selectionSort(new int[]{112,13,14,34,32});
		int[] arrayData = new int[]{12, 11,2,17};
		//quickSort(arrayData, 0, arrayData.length-1);
		//mergeSort(0, arrayData.length-1,arrayData);
		selectionSortNew(arrayData);
		for(int i =0; i<arrayData.length ; i++) {
			System.out.println(arrayData[i]);
		}
		
		
		
	}
	
	public static void bubbleSort(int[] arrayData) {
		int n = arrayData.length ;
		int itr =0;
		boolean swap = false;
		for(int i =0; i<n ; i++) {
			swap = false;
			for(int j=0; j<n-i-1;j++) {
				if(arrayData[j]>arrayData[j+1]) {
					int temp = arrayData[j];
					arrayData[j]= arrayData[j+1];
					arrayData[j+1] = temp;
					swap = true;
				}
			}
			itr++;
			if(!swap) {
				break;
			}
		}
		for(int i =0; i<n ; i++) {
			System.out.println(arrayData[i]);
		}
		System.out.println(itr);
		
	}
	
	public static void selectionSortNew(int[] arrayData) {
		for(int i=arrayData.length-1;i>=0;i--) {
			int maxIndex = i;
			for(int j=i-1;j>=0;j--) {
				if(arrayData[maxIndex]<arrayData[j]) {
					maxIndex = j;
				}
			}
			
			int temp=arrayData[i];
			arrayData[i]=arrayData[maxIndex];
			arrayData[maxIndex] = temp;
		}
	}
	
	public static void selectionSort(int[] arrayData) {
		int n = arrayData.length;
		for(int i=0;i<n;i++) {
			int maxIndex =0;
			for(int j=1; j<n-i;j++) {
				if(arrayData[j]>arrayData[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arrayData[maxIndex];
			arrayData[maxIndex] = arrayData[n-1-i];
			arrayData[n-1-i] = temp;
		}
		
		for(int i =0; i<n ; i++) {
			System.out.println(arrayData[i]);
		}
	}
	
	public static void insertionSort(int[] arrayData) {
		int key=0;
		for(int i=1;i<arrayData.length;i++) {
			key = arrayData[i];
			int j=i-1;
			while(j>=0 && arrayData[j]>key) {
				arrayData[j+1]=arrayData[j];
				j--;
			}
			arrayData[j+1] = key;
		}
	}
	//int[] arrayData = new int[]{10,0,32,95};
	public static void quickSort(int[] arrayData,int low, int high) {
	
		if(low<high) {
		int partitionIndex = partitionNew(low, high, arrayData);
		quickSort(arrayData, low, partitionIndex-1);
		quickSort(arrayData, partitionIndex+1, high);
		}
		
	}

	private static int partitionNew(int low, int high, int[] arrayData) {
		int i = low-1;
		int pivot = arrayData[high];
		for(int j=low;j<high;j++) {
			if(arrayData[j]<pivot) {
				i++;
			swap(arrayData,i,j);	
			}
		}
		swap(arrayData,i+1,high);	
		return i+1;
		
	}
	private static void swap(int[] arrayData, int i, int j) {
		int temp = arrayData[i];
		arrayData[i] = arrayData[j];
		arrayData[j] = temp;
	}

	
	public static void mergeSort(int low, int high, int[] arrayData) {
		int mid = (low+high)/2;
		if(low<high) {
		mergeSort(low, mid, arrayData);
		mergeSort(mid+1, high, arrayData);
		
		merge(low,mid,high,arrayData);
		}
		
		
	}

	private static void merge(int low, int mid, int high, int[] arrayData) {
		int[] left = new int[mid-low+1];
		int[] right = new int[high-mid];
		
		for(int i=0;i<left.length;i++) {
			left[i]=arrayData[low+i];
		}
		
		for(int j=0;j<right.length;j++) {
			right[j]=arrayData[mid+1+j];
		}
		int i=0;int j=0; int k=low;
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arrayData[k]=left[i];
				i++;
				k++;
			}else {
				arrayData[k]=right[j];
				k++;
				j++;
			}
		}
		
		while(i<left.length) {
			arrayData[k]=left[i];
			i++;
			k++;
		}
		
		while(j<right.length) {
			arrayData[k]=right[j];
			j++;
			k++;
		}
	}

}
