class Node{
	public int  value;
    public Node next;
	public Node(int value) {
		this.value = value;
	}
}
public class StackUsingLinkedList {
public Node head;


public void push(int value) {
	Node node = new Node(value);
	
		node.next = head;
		head = node;
	
}
	
	public int pop() {
		int poppedElement = -1;
		
		if(head == null) {
			System.out.print("Stack is empty");
		}else {
			poppedElement = head.value;
			head = head.next;
		}
		return poppedElement;
  
	}





}
