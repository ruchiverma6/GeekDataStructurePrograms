import java.util.Vector;

public class SubsetsOfSets {
	
	public void findSubsetsOfSets(String str, int index, String currentSub) {
		if(index == (str.length())) {
			System.out.println("{"+currentSub+"}");
			return;
		}
		
		findSubsetsOfSets(str, index+1, currentSub + str.charAt(index));
		findSubsetsOfSets(str, index+1, currentSub);
	}
	
	public void findSumSubsetsOfSets(int[] array, int index, int sum, int totalSumOutput, String str) {
		if(index == (array.length)) {
			if(sum== totalSumOutput) {
				System.out.println("{");
				for(int i = 0 ; i<str.length() ; i++) {
					System.out.println(str.charAt(i));
				}	
				System.out.println("}");
			}
			return;
		}

		findSumSubsetsOfSets(array, index+1, sum + array[index], totalSumOutput, str+array[index]);
		
		findSumSubsetsOfSets(array, index+1, sum, totalSumOutput, str);
	}

}
