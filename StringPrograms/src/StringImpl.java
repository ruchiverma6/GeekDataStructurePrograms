import java.util.Arrays;

public class StringImpl {

	public static void main(String[] args) {
		
		//boolean isPermutation = checkIfSecondStringIsPermutationOfFirst("geekforgeeks", "l");
		
		//System.out.print(isPermutation);
		
		//boolean isAnagram = checkIfTwoStringsAreAnagrams("gfgdeA", "ggfdeA");
		//System.out.println(isAnagram);
		
		//int repeatingData = firstNONRepeatingCharacter("iizaabbcczp");
		//System.out.print((char)repeatingData);
		
		//boolean isPermutation = findPermutationOfString("geekforgeeks","eekg");
		//System.out.print(isPermutation);
		
		boolean isRotation = checkIfRotationOfEachOther("ABCD","BCDA");
		System.out.print(isRotation);
		
		findPatternMatching("ACDEBCDE","CDE");
	}
	
	private static boolean checkIfSecondStringIsPermutationOfFirst(String str1, String str2) {
		int[] count1 = new int[256];
		int[] count2 = new int[256];
	
		for(int i=0;i<str2.length();i++) {
			count2[str2.charAt(i)]++;
		}
		
		for(int i =0; i<str1.length(); i++) {
			for(int j=i; j<(i+str2.length()); j++) {
				if(j== str2.length()) {
					break;
				}
				count1[str1.charAt(j)]++;
			}
			if(matchTwoString(count1, count2, str2)) {
				return true;
			}
			count1[str1.charAt(i)]--;
		}
		
		return false;
	}

	private static boolean matchTwoString(int[] count1, int[] count2, String str2) {
		boolean isMatch = false;
		for(int i = 0; i <str2.length(); i++) {
			if(count1[str2.charAt(i)] == count2[str2.charAt(i)]) {
				isMatch = true;
			}else {
				isMatch = false;
				break;
			}
		}
		return isMatch;
	}
	
	public static boolean checkIfTwoStringsAreAnagrams(String str1, String str2) {
		int[] count1 = new int[256];
		int[] count2 = new int[256];
		////gfg //ggf
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		for(int i=0; i<str1.length(); i++) {
			count1[str1.charAt(i)]++;
			
		}
		
		for(int i=0; i<str2.length(); i++) {
			count1[str2.charAt(i)]--;		
		}
		boolean isAnagram = false;
		for(int i=0; i<str1.length();i++) {
			if(count1[str1.charAt(i)]==0) {
				isAnagram = true;
			}else {
				isAnagram = false;
				return isAnagram;
			}
		}
			
		return isAnagram;
	}
	
	public static int firstRepeatingCharacter(String str1){
		//zazbbcz//
		
		int[] count1 = new int[256];
		int result = Integer.MAX_VALUE;
		Arrays.fill(count1, -1);
		for(int i=0; i<str1.length(); i++)
		{
			if(count1[str1.charAt(i)]==-1) {
			count1[str1.charAt(i)] = i;
			}else {
				result = Math.min(result, count1[str1.charAt(i)] );
			}
			
			
			
		}
		
		return result;
		
	
		
	}
	
	
	
	public static int firstNONRepeatingCharacter(String str1){
		//zazbbcz//
		
		int[] count1 = new int[256];
		int result = Integer.MAX_VALUE;
		Arrays.fill(count1, -1);
		for(int i=0; i<str1.length(); i++)
		{
			if(count1[str1.charAt(i)]==-1) {
			count1[str1.charAt(i)] = i;
			}else {
				count1[str1.charAt(i)]=-2;
			}				
		}
		
		for(int i=0;i<256;i++) {
			if(count1[i]>=0) {
				result = Math.min(result, count1[i])	;
			}
		}
		if(result==Integer.MAX_VALUE) {
			result=-1;
		}
		return result;
		
	
		
	}
	
	public static boolean findPermutationOfString(String str1, String pattern) {
		int[] countStr = new int[256];
		int[] patternStr = new int[256];
		
		for(int i=0;i<pattern.length();i++) {
		
			patternStr[pattern.charAt(i)]++;
		}
		
		for(int i=0;i<pattern.length();i++) {
			countStr[str1.charAt(i)]++;
		}
		
		for(int j= pattern.length();j<str1.length();j++) {
			if(matchTwoString(countStr,patternStr,pattern)) {
				return true;
			}else {
				countStr[str1.charAt(j)]++;
				countStr[str1.charAt(j-pattern.length())]--;
			}
		}
		
		return false;
	}
	
	public static boolean checkIfRotationOfEachOther(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		String result = str1+str1;
		
		if(result.contains(str2)) {
			return true;
		}
		return false;
	}
	
	//Naive algorithm
	public static void findPatternMatching(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		int i=0;
		for(i=0;i<=n-m;i++) {
			int j=0;
			for(j=0;j<m;j++) {
				if(str1.charAt(i+j)!=str2.charAt(j)){
					break;
				}else {
					continue;
				}
			}
			if(j==m) {
				System.out.println(i);
			}
		}
	}

	
	

}
