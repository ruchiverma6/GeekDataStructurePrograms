
public class QueueUsingArray {
private int arrayData[];
private int front = -1;
private int rear;
int size = 0;
private int capacity;
	public QueueUsingArray(int capacity) {
		arrayData = new int[capacity];
		this.capacity = capacity;
		rear = capacity-1;
	}
	
	public void enqueue(int value) {
		if(!isFull()) {
			 rear = (rear+1)%capacity;
		arrayData[rear] = value;
		size = size+1;
		}else {
			System.out.println("Queue is full");
		}
	}
	
	private boolean isFull() {
		
		return size>=capacity;
		
	}

	public int dequeue() {
		if(!isEmpty()) {
			front = (front+1)%capacity;
		//arrayData[pos] = -1;
		size = size -1; 
		return arrayData[front];
		}else {
			System.out.print("Queue is empty");
			return -1;
		}
	}
	
	public void remove() {
		if(size>0) {
		front = (front+1)%capacity;
		size = size-1;
		}else {
			System.out.println("queue is empty");
		}
	}

	boolean isEmpty() {
		
		return size==0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
}
