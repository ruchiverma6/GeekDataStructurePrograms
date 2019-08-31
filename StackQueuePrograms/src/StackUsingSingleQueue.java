
public class StackUsingSingleQueue {
private QueueUsingArray queue;
private int capacity;

public StackUsingSingleQueue(int capacity) {
	this.capacity = capacity;
	queue = new QueueUsingArray(capacity);
}

public void push(int value) {
	int size = queue.size();
	queue.enqueue(value);
	
	for(int i=0; i<size; i++) {
		int val = queue.dequeue();
		queue.enqueue(val);
	}
}

public int pop() {
	return queue.dequeue();
}
}
