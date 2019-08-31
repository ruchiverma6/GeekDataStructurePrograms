
public class StackUsingTwoQueue {
private int capacity;
QueueUsingArray queue1;// = new QueueUsingArray(5);
QueueUsingArray queue2;// = new QueueUsingArray(5);

public StackUsingTwoQueue(int capacity) {
	this.capacity = capacity;
	queue1 = new QueueUsingArray(capacity);
	 queue2 = new QueueUsingArray(capacity);
}

public void push(int value) {
	queue1.enqueue(value);
	
	while(!queue2.isEmpty()) {
		int val = queue2.dequeue();
		queue1.enqueue(val);
	}
	
	QueueUsingArray temp = queue1;
	queue1 = queue2;
	queue2 = temp;
}

public int pop() {
	
	return queue2.dequeue();
}

}
