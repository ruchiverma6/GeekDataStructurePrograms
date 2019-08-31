
public class StackUsingArray {
	
	
private int capacity;
int arrData[];
int top = -1;
public StackUsingArray(int capacity) {
	this.capacity = capacity;
	arrData = new int[capacity];
}


public void push(int value) {
	if(top < capacity-1) {
	arrData[++top] = value;
	}else {
		System.out.print("Stack is full");
	}
}

public int pop() {
	if(top>=0) {
	return arrData[top--];
	}else {
		return -1;
	}
}

public int size() {
	return top+1;
}


public boolean isEmpty() {
	// TODO Auto-generated method stub
	return top<0;
}


public int peek() {
	if(top>=0) {
	return arrData[top];
	}else {
		return -1;
	}
	
}


}
