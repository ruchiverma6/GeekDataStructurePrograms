import java.util.Vector;

public class RecursiveImpl {

	public static void main(String[] args) {
	
		//SubsetsOfSets subSetsOfSet = new SubsetsOfSets();
		//subSetsOfSet.findSubsetsOfSets("ABC", 0, "");
		//subSetsOfSet.findSumSubsetsOfSets(new int[] {1,2,3,8,2}, 0, 0, 4, "");
		
		TowerOfHanoiImpl toh = new TowerOfHanoiImpl();
		toh.TOH(3, 'A', 'C', 'B');
	}

}
