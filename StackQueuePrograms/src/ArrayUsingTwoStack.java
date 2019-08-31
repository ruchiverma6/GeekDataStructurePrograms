
public class ArrayUsingTwoStack {
	private int top1;
	private int top2;
	private int[] arrData;
	public ArrayUsingTwoStack(int capacity) {
		top1 = -1;
		top2 = capacity;
		arrData = new int[capacity];
	}
	
	public void push1(int value) {
		if(top1<top2-1) {
		arrData[++top1] = value;
		}else {
			System.out.println("stack is full");
		}
	}
	
	
public void push2(int value) {
		if(top1<top2-1) {
		arrData[--top2] = value;
		}else {
			System.out.println("stack is full");
		}
}
		
		public int pop1() {
			if(top1>=0) {
			return arrData[top1--];
			}else {
				System.out.println("stack is empty");
				return -1;
			}
		}
		
		public  int pop2() {
			if(top2<arrData.length) {
			return arrData[top2++];
			}else {
				System.out.println("stack is empty");
				return -1;
			}
		}
	


	
	

}
