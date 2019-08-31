
public class BinarySearchImpl {

	public static void main(String[] args) {
		//int[] data = {1,3,6,7,9,11};
		//System.out.print(findIndexOfElement(data, 0 , data.length-1, 7));
		
		//int[] data1 = {7,7,7,7,9,11,11};
		//System.out.print(findLeftMost(data1, 0 , data1.length-1, 11));
	
		int[] data2 = {7,7,7,7,9,11,11};
		System.out.print(findOccurrences(data2, 0 , data2.length-1, 11));
	}
	
	public static int findIndexOfElement(int[] data, int low, int high, int num) {
		if(low>high) {
			return -1;
		}
			int mid = (low+(high-low)/2); //to avoid number overflow;
		if(data[mid]==num) {
			return mid;
		}else if (low<high && data[mid]>num) {
			return findIndexOfElement(data, low , mid-1, num);
		}else if (low<high && data[mid]<num) {
			return findIndexOfElement(data, mid+1 , high, num);
		}else {
			return -1;
		}
	}
	
	public static int findLeftMost(int[] data, int low, int high, int num) {
		if(low>high) {
			return -1;
		}
			int mid = (low+(high-low)/2); //to avoid number overflow;
		if(data[mid]==num && (data[mid-1]!=num || mid==0)) {
			return mid;
		}else if (data[mid]>=num) {
			return findLeftMost(data, low , mid-1, num);
		}else{
			return findLeftMost(data, mid+1 , high, num);
		}
	}
	
	public static int findRightMost(int[] data, int low, int high, int num) {
		if(low>high) {
			return -1;
		}
			int mid = (low+(high-low)/2); //to avoid number overflow;
		if(data[mid]==num && (mid== data.length-1 || data[mid+1]!=num )) {
			return mid;
		}else if (data[mid]<=num) {
			return findRightMost(data, mid+1 , high, num);
			
		}else{
			return findRightMost(data, low , mid-1, num);
		}
	}
	
	
	
	public static int findOccurrences(int[] data, int low, int high, int num) {
		int leftMost = findLeftMost(data, 0, data.length-1, num);
		int rightMost = findRightMost(data, 0, data.length-1, num);
		
		return (rightMost-leftMost)+1;
	}

}
