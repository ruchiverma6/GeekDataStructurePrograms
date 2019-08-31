import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashingImpl {

	public static void main(String[] args) {
		//findMostFrequentElement();
		//boolean isSumZeoForSubArray = findWhetherSubArrayIsZeroSum(new int[]{5,11,-2,3,-4,-7});
		//System.out.print(isSumZeoForSubArray);
		
		boolean isSumX = findWhetherSubArrayIsSumX(new int[]{-5,5,-2,3,-4,-7}, 0);
		System.out.print(isSumX);
	}

	private static void findMostFrequentElement() {
	int[] arrayData = new int[] {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,8,3,6,8,5,6,6,6,6,7,7,7,7,7,7,7,7,7,7};
		HashMap<Integer, Integer> hashMapBucket = new HashMap<Integer, Integer>();
		for(int i=0; i<arrayData.length; i++) {
			int count = 0;
			if(hashMapBucket.containsKey(arrayData[i])) {
			count = ((int)hashMapBucket.get(arrayData[i]));
		
			}
			hashMapBucket.put(arrayData[i], ++count);
		
		}
		
		Iterator iterator=hashMapBucket.entrySet().iterator();
		int maxKey = arrayData[0]; int maxValue = hashMapBucket.get(arrayData[0]);
		while(iterator.hasNext()) {
			Map.Entry data= (Map.Entry)iterator.next();
			
			int dataValue = (int) data.getValue();
			
			if(dataValue>maxValue) {
				maxKey = (int) data.getKey();
				maxValue = dataValue;
			}
		}
		
		System.out.println(maxKey + ", " + maxValue);
		
	}
	
	public static boolean findWhetherSubArrayIsZeroSum(int[] arrayData) {
		int prefixSum = 0;
		HashSet<Integer> dataSet = new HashSet<Integer>();
		dataSet.add(0);
		for(int i = 0; i<arrayData.length ; i++) {
			prefixSum+=arrayData[i];
			
			if(dataSet.contains(prefixSum)) {
				return true;
			}
			dataSet.add(prefixSum);
		}
		return false;
	}
	
	public static boolean findWhetherSubArrayIsSumX(int[] arrayData, int x) {
		HashSet<Integer> dataSet = new HashSet<Integer>();
		int prefixSum = 0;
		dataSet.add(0);
		for(int i = 0; i<arrayData.length ; i++) {
			prefixSum+=arrayData[i];
			
			if(dataSet.contains(prefixSum-x)) {
				return true;
			}
			dataSet.add(prefixSum);
		}
		return false;
		
	}
}
