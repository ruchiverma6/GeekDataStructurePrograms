
public class QueueUsingLinkedList {
Node front;
Node rear;

public void enqueue(int value) {
	Node node = new Node(value);
	
	if(front == null) {
		front = rear = node;
		return;
	}
	
	rear.next = node;
	rear = node;
}



public int dequeue() {
	if(front == null) {
		System.out.println("Queue is empty");
		return -1;
	}
	int poppedValue = front.value;
	front = front.next;
	return poppedValue;
	
}
}
