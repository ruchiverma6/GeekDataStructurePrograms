import java.util.HashMap;

public class LinkedList {

	public Node head;
	public Node current;
	public void insert(int value) {
		Node node = new Node(value);
		
		if(head ==  null) {
			head = node;
			current = head;
		}else {
		
		current.next = node;
		current = current.next;
		}
		
	}
	
	public void insert(Node node) {
		//Node node = new Node(value);
		
		if(head ==  null) {
			head = node;
			current = head;
		}else {
		
		current.next = node;
		current = current.next;
		}
		
	}
	
	public void deleteMiddle() {
		if(head == null) {
			System.out.print("No elements in list");
			return;
		}
		Node slow = head;
		Node fast = head;
		Node prev = null;
		while(slow!=null && fast!=null && fast.next!=null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(prev == null) {
			head = null;
		}else {
		prev.next = slow.next;
		}
	}
	
	public void traverse() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public boolean detectLoopInLinkedList() {
		if(head == null) {
			System.out.print("No elements in list");
			return false;
		}
		Node slow = head;
		Node fast = head;
		
		if(fast.next!=null) {
		slow = slow.next;
		fast = fast.next.next;
		}else {
			return false;
		}
		
		while(slow!=fast && slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(slow == fast) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public Node findStartOfCyclicLoop() {
		if(head == null) {
			System.out.print("No elements in list");
			return null;
		}
		Node slow = head;
		Node fast = head;
		
		if(fast.next!=null) {
		slow = slow.next;
		fast = fast.next.next;
		}else {
			return null;
		}
		Node prev = null;
		while(slow!=fast && slow!=null && fast!=null && fast.next!=null) {
			prev = fast.next;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(slow == head && fast == head) {
			if(prev == null) {
				prev = head;
			}
			return prev;
		}
		if(slow == fast) {
			slow = head;
			return findStartOfLoop(slow, fast);
		}else {
			return null;
		}
		
		
	}

	private Node findStartOfLoop(Node slow, Node fast) {
		Node prev = null;
		while(slow!=fast && slow!=null && fast!=null) {
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		
		return prev;
	}
	
	public int lengthOfLoop() {
		if(head == null) {
			System.out.print("No elements in list");
			return -1;
		}
		Node slow = head;
		Node fast = head;
		
		if(fast.next!=null) {
		slow = slow.next;
		fast = fast.next.next;
		}else {
			return -1;
		}
		Node prev = null;
		while(slow!=fast && slow!=null && fast!=null && fast.next!=null) {
			prev = fast.next;
			slow = slow.next;
			fast = fast.next.next;
		}
		Node current = null;
		if(slow == fast) {
			current = slow;
			//slow = head;
			return findLengthOfLoop(current, slow);
		}else {
			return -1;
		}
	}

	private int findLengthOfLoop(Node current, Node slow) {
		int counter = 0;
		while(current.next!=slow) {
			
			counter++;
			current = current.next;
		}
		return ++counter;
	}
	
	public void detectAndRemoveLoop() {
		if(head == null) {
			System.out.print("No elements in list");
			return;
			//return null;
		}
		Node slow = head;
		Node fast = head;
		
		if(fast.next!=null) {
		slow = slow.next;
		fast = fast.next.next;
		}else {
			return;
		}
		Node prev = null;
		while(slow!=fast && slow!=null && fast!=null && fast.next!=null) {
			prev = fast.next;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(slow == head && fast == head) {
			if(prev == null) {
				prev = head;
			}
			 prev.next = null;
			 return;
		}
		if(slow == fast) {
			slow = head;
			Node loopNode = findStartOfLoop(slow, fast);
			loopNode.next = null;
		}else {
			return;
		}
		
		
	}
	
	
	public int findNthNodeFromEnd(int n) {
		if(head == null) {
			return -1;
		}
		Node refP = head;
		Node mainP = head;
		int count = 1;
		while(refP!=null && refP.next!=null) {
			count++;
			refP = refP.next;
			if(count == n) {
				break;
			}
		}
		
		if(count<n) {
			return -1;
		}
		
		while(refP!=null && refP.next!=null) {
			refP = refP.next;
			mainP = mainP.next;
		}
		return mainP.value;
	}
	public void DeleteNodeWithoutHeadPointer() {
		DeleteNodeWithoutHeadPointer(head);
	}
	public void DeleteNodeWithoutHeadPointer(Node current) {
		if(current==null) {
			return;
		}
		
		if(current.next == null) {
			System.out.println("this is last node cant be deleted without head");
			return;
		}
		Node temp = current.next;
		current.value = temp.value;
		current.next = temp.next;
	}
	
	public void removeDuplicatesFromSortedList() {
		removeDuplicatesFromSortedList(head);
	}
	
   public void removeDuplicatesFromSortedList(Node current) {
		if(head == null) {
			return;
		}
		//Node current = head;
		Node prev = null;
		
		while(current!=null) {

				if(prev!=null && current!=null && prev.value == current.value) {
					
					prev.next = current.next;
					current = current.next;
					
				}else {
					prev = current;
					current = current.next;
				}
			
			
		}
	}
   
   public void removeDuplicatesFromUnsortedList() {
	   removeDuplicatesFromUnsortedList(head);
   }

private void removeDuplicatesFromUnsortedList(Node head) {
    Node current = head; Node prev = null;
    HashMap<Integer, Integer> dataMap = new HashMap<Integer,Integer>();
    while(current!=null) {  	
    	if(dataMap.containsKey(current.value)) {
    		prev.next = current.next;
    	}else {
    	  dataMap.put(current.value, 1);
    	  prev = current;
    	}
    	current = current.next;
    }
	
}

public Node mergeTwoSortedList(Node h1, Node h2) {
	if(h1==null) {
		return h2;
	}else if(h2==null) {
		return h1;
	}
	if(h1.value<h2.value) {
		h1.next = mergeTwoSortedList(h1.next, h2);
		return h1;
	}else {
		h2.next = mergeTwoSortedList(h1, h2.next);
		return h2;
	}

}

public void mergeTwoSortedList() {
	Node head1 = new Node(1); 
    head1.next = new Node(3); 
    head1.next.next = new Node(5); 

    // 1.3.5 LinkedList created 

    Node head2 = new Node(0); 
    head2.next = new Node(2); 
    head2.next.next = new Node(4); 
    Node mergedhead = mergeTwoSortedList(head1, head2);
	
    while (mergedhead != null) { 
        System.out.printf("%d ", mergedhead.value); 
        mergedhead = mergedhead.next; 
    } 
}


public void swapKthNode(int k) {
	Node prevStart = null;
	Node prevEnd = null;
	
	Node mainPointer = head;
	Node refPOinter = head;
	
	for(int i=1; i<=k; i++) {
		if(i==k-1) {
			prevStart = refPOinter;
		}
		if(refPOinter!=null) {
		 refPOinter = refPOinter.next;
		}
		
	}
	
	while(refPOinter!=null && refPOinter.next!=null) {
		 refPOinter = refPOinter.next;
		 mainPointer = mainPointer.next;
		}
	
	prevEnd = mainPointer;
	
	Node tempStartNext = prevStart.next.next;
	Node tempEndNext = prevEnd.next.next;
	
	Node tempStart = prevStart.next;
	Node tempEnd = prevEnd.next;
	
	prevEnd.next = tempStart;
	prevEnd.next.next = tempEndNext;
	
	prevStart.next = tempEnd;
	prevStart.next.next = tempStartNext;
	

}
	
}
