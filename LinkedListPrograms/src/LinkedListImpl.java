
public class LinkedListImpl {

	public static void main(String[] args) {
		LinkedList dataList = new LinkedList();
		/*dataList.insert(2);
		dataList.insert(4);
		dataList.insert(5);
		dataList.insert(7);
		*/
		//dataList.insert(9);
	
		//dataList.traverse();
		//System.out.println("Delete middle node");
		//dataList.deleteMiddle();
		//dataList.traverse();
		
		Node nodeOne = new Node(43);
		Node nodeTwo = new Node(12);
		
		Node nodeThree = new Node(13);
		
		Node nodeFour = new Node(14);
		
		Node nodeFive = new Node(21);
		
		Node nodeSix = new Node(33);
		//Node nodeSeven = new Node(7);
		dataList.insert(nodeOne);
		
		dataList.insert(nodeTwo);
		
		dataList.insert(nodeThree);
		dataList.insert(nodeFour);
		//dataList.insert(nodeTwo);
		
		//dataList.insert(nodeFour);
		
		dataList.insert(nodeFive);
		dataList.insert(nodeSix);
		//dataList.insert(nodeTwo);
		//dataList.insert(nodeOne);
		//dataList.traverse();
		//Node firstCyclin =dataList.findStartOfCyclicLoop();
		//int count = dataList.lengthOfLoop();
		//System.out.print(dataList.detectLoopInLinkedList());
		//System.out.println("count"+count);
		//dataList.detectAndRemoveLoop();
		//System.out.println(dataList.detectLoopInLinkedList());
		//System.out.println(dataList.lengthOfLoop());
		
		//System.out.println(dataList.findNthNodeFromEnd(2));
		//if(firstCyclin!=null) {
		//System.out.println(firstCyclin.value);
	//	}else {
	//		System.out.println("no loop");
	///	}
		
		//dataList.removeDuplicatesFromSortedList();
		//dataList.mergeTwoSortedList();
		dataList.swapKthNode(3);
		dataList.traverse();
	}
}
