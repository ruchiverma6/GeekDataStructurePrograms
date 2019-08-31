
public class BitLogicImpl {

	public static void main(String[] args) {
		//System.out.print(findFirstSetBit(18));
		System.out.print(findNumberOfBitsTobeFlipped(18,12));
		/*int setPos = SetBitAtSpecifiedPosition(10,3);
		int clearPos = ClearBitAtSpecifiedPosition(10,4);
		int toggleOutput = ClearBitAtSpecifiedPosition(10,4);
		boolean isSet = ChecjBitAtSpecifiedPositionIsSet(10,3);
		boolean isPowerOfTwo = checkWhetherNumberIsPowerOftwo(16);
		int data = countSetBitsInANumber(16);
		
		int result = getOddOccurences(new int[] {10,10,3,2,2,2,2});
		 char set[] = {'a', 'b'}; 
	        printSubsets(set); 
		System.out.println(result);
		
		System.out.println("maxConsecutiveOnes="+maxConsecutiveOnes(16));
		*/
	}
	
	
	
	public static int findNumberOfBitsTobeFlipped(int x1, int x2) {
		int x3 = x1^x2;
		int count = countSetBitsInANumber(x3);
		return count;
	}
	
	public static int findFirstSetBit(int number) {
		
		int pos = (int) (Math.log10(number & ~(number-1))/Math.log10(2)) + 1;
		
		
		
		return pos;
		
		
	}
	
	public static int findFirstDifferentBit(int num1, int num2) {
		int out1 = num1^num2;
		
		int result = (int) (Math.log10(out1 & ~(out1-1))/Math.log10(2)) + 1;
		
		return result;
	}
	
	public static int SetBitAtSpecifiedPosition(int number, int index){
	       int leftShift = 1 << (index-1);
	       //	System.out.println(leftShift);
	       	int position = leftShift ^ number;
	    
	       	return position;
	}

	public static int ClearBitAtSpecifiedPosition(int number, int index){
	       int leftShift = 1 << (index-1);
	       	//System.out.println(leftShift);
	       	int position = leftShift ^ number;
	    
	       	return position;
	}
	
	public static int ToogleBitAtSpecifiedPosition(int number, int index){
	       int leftShift = 1 << (index-1);
	       //	System.out.println(leftShift);
	       	int position = leftShift ^ number;
	    
	       	return position;
	}
	
	public static boolean ChecjBitAtSpecifiedPositionIsSet(int number, int index){
	       int leftShift = 1 << (index-1);
	       //	System.out.println(leftShift);
	       	int position = leftShift & number;
	    
	       	return position>0 ;
	}
	
	public static boolean checkWhetherNumberIsPowerOftwo(int number) {
		int output = number & (number-1);
		
		return output == 0;
	}
	
	public static int countSetBitsInANumber(int number) {
		int index = 0;
		while(number>0) {
			index++;
			number = number & (number-1);
		}
		return index;
	}
	
	public static int getOddOccurences(int[] arrayData) {
		int result = 0;
		
		for(int i=0;i<arrayData.length;i++) {
		result = result ^ arrayData[i];
		}
		
		
		return result;
		
	}
	
	static void printSubsets(char set[]) 
    { 
        int n = set.length; 
  
        // Run a loop for printing all 2^n 
        // subsets one by obe 
        for (int i = 0; i < (1<<n); i++) 
        { 
            System.out.print("{ "); 
  
            // Print current subset 
            for (int j = 0; j < n; j++) 
  
                // (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not 
                if ((i & (1 << j)) > 0) 
                    System.out.print(set[j] + " "); 
  
            System.out.println("}"); 
        } 
    } 
	
	static int maxConsecutiveOnes(int number) {
		int x =0;
		
		while(number!=0) {
			number = number & number<<1;
			x++;
		}
		return x;
	}
}
