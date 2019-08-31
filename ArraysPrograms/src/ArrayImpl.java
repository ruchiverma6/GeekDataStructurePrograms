import java.util.HashMap;

public class ArrayImpl {

	public static void main(String[] args) {
	
		//reverseArray(new int[] {7,3,1,15,9});
		//findLeaderOfArray(new int[] {17,3,221,15,9}, 5);
		//findTrapsOfWater(new int[] {3, 0, 0, 2, 0, 4}, 6);
		//findTrapsOfWaterWithSpaceOptimization(new int[] {3, 0, 0, 0, 0, 3}, 6);
		//findMaximumSumForConsecutiveTerms(new int[] {100, 200, 300, 400} , 3);
		//findPrefixSumArray(new int[] {10, 20, 10, 5, 15});
		
		//stockBuyAndCell(new int[] {400,300,200,100,600,700}, 6);
		
		//System.out.print(findMaximumAppearingElementInRange(new int[]{1,4,4}, new int[]{5,5,7}));
		
		//System.out.print(checkWhetherSubArrayIsZeroSum(new int[] {-1,-2,3,4}));
		
	findLongestSubArrayWithZeroSum(new int[] {1,0,0,0,0,0});
	}
	
	private static void reverseArray(int[] array) {
		for(int i=0;i<(array.length/2);i++) {
			int temp = array[array.length-i-1];
			array[array.length-i-1] = array[i];
			array[i] = temp;
		}
		
		for(int i=0;i<(array.length);i++) {
		System.out.println(array[i]);
		}
	}
		
		private static void findLeaderOfArray(int[] data, int n) {
			int rightMax=data[n-1];
			System.out.println(rightMax);
			for(int i=1; i<data.length; i++) {
				if(data[n-1-i]>rightMax) {
					rightMax = data[n-1-i];
					System.out.println(rightMax);
				}
			}
		}
		
		private static void findTrapsOfWater(int[] data, int n) {
			int[] left = new int[n];
			int[] right = new int[n];
			int result =0;
			left[0] = data[0];
			
			for(int i=1; i<data.length; i++) {
				left[i]=Math.max(left[i-1], data[i]);
			}
			
			right[n-1] = data[n-1];
			
			for(int i=n-2;i>=0;i--) {
				right[i]=Math.max(right[i+1], data[i]);
			}
			
			for(int i=0; i<n; i++) {
				result +=(Math.min(left[i], right[i])-data[i]);
			}
			System.out.println(result);
		}
		
		private static void findTrapsOfWaterWithSpaceOptimization(int[] data, int n) {
			int low = 0;
			int high = n-1;
			int leftMax =0;
			int rightMax = 0;
			int result = 0;
			while(low<=high) {
				if(data[low]<data[high]) {
					if(data[low]>leftMax) {
						leftMax = data[low];
					}else {
						result+= (leftMax-data[low]);
					}
					low++;
				}else {
					if(data[high]>rightMax) {
						rightMax = data[high];
					}else {
						result+= (rightMax-data[high]);
					}
					high--;
				}
			}
			System.out.println(result);
			
		}
		
		public static void stockBuyAndCell(int[] data, int n) {
			int low =0; int high = n-1; int PI = low+1;
			int result = 0;
		
				while(low<=high && PI<=high) {
					if(data[low]<data[PI]  && data[PI-1]<data[PI]) {
						PI++;
					}else if(data[low]>data[PI]) {
						PI++;
					}
					else {
						result+=(data[PI-1]-data[low]);
						low = PI;
						PI++;
					}
				}
				if(PI<=n && data[PI-1]>data[low]) {
				result+= (data[PI-1]-data[low]);
				}
			System.out.print(result);
		}
		
		public static void findMaximumSumForConsecutiveTerms(int[] data, int k) {
			int n = data.length;
			
			if(n<k) {
				System.out.println("not valid input");
			}
			int result = 0;
			
			for(int i=0; i <k ; i++) {
				result+=data[i];
			}
			int sum = result;
			for(int i=k;i<n;i++) {
				sum += (data[i] - data[i-k]);
				result = Math.max(result, sum);
				
			}
			System.out.println(result);
		}
		
		public static void findPrefixSumArray(int[] data) {
			int sum = 0;
			for(int i =0; i< data.length ; i++) {
				sum+= data[i];
				System.out.println(sum);
			}
		}
		
		public static int findMaximumAppearingElementInRange(int[] LI, int[] RI) {
			int[] arr = new int[1000];
			
			for(int i=0;i<LI.length;i++) {
				arr[LI[i]]= (arr[LI[i]]+1);
				arr[RI[i]+1]= (arr[RI[i]+1]-1);
			}
			int sum=0; int max =0, maxIn = -1;
			for(int i=0; i<arr.length; i++) {
				sum+=arr[i];
				if(sum>max) {
					max = sum;
					maxIn = i+1;
				}
			}
			return maxIn;
		}
		
		public static boolean checkWhetherSubArrayIsZeroSum(int[] arr) {
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
				
				if(arr[i]==0 || sum==0 || map.get(sum)!=null) {
					return true;
				}
				map.put(sum, i);
			}
			return false;
		}
		
		public static void findLongestSubArrayWithZeroSum(int[] arr) {
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			
			map.put(0, -1);
			int sum = 0;
			int len = 0; int endIndex = 0;
			
			for(int i=0;i<arr.length;i++) {
				sum+=(arr[i]==0?-1:1);
				
				if(map.containsKey(sum)) {
					len = i-map.get(sum);
					endIndex = i;
				}else {
				map.put(sum, i);
				}
			}
			
			System.out.print("["+(endIndex-len+1) +","+(endIndex)+"]");
		}

	}


