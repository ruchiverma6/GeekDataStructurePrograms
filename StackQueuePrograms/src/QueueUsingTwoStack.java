
public class QueueUsingTwoStack {
StackUsingArray stack1;
StackUsingArray stack2;
private int capacity;

public QueueUsingTwoStack(int capacity) {
	this.capacity = capacity;
	stack1 = new StackUsingArray(capacity);
	stack2 = new StackUsingArray(capacity);
}

public void enqueue(int value) {
	
	while(!stack2.isEmpty()) {
		int element = stack2.pop();
		stack1.push(element);
	}
	
	stack2.push(value);
	
	while(!stack1.isEmpty()) {
		int element = stack1.pop();
		stack2.push(element);
	}

}

public int dequeue() {
	return stack2.pop();
}
}
