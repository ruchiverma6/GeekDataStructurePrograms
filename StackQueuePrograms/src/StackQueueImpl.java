import java.util.Stack;

public class StackQueueImpl {

	public static void main(String[] args) {
		
/*StackUsingArray stack = new StackUsingArray(5);
stack.push(2);
stack.push(3);
stack.push(5);
//ç
//System.out.println(stack.pop());
stack.push(7);
stack.push(17);
stack.push(27);
//System.out.println(stack.pop());
//System.out.println(stack.pop());
//System.out.println(stack.pop());
//System.out.println(stack.pop());
 */
 //


/*StackUsingLinkedList stackData = new StackUsingLinkedList(); 
stackData.push(2);
stackData.push(3);
stackData.push(5);
stackData.push(6);
System.out.println(stackData.pop());
System.out.println(stackData.pop());
System.out.println(stackData.pop());
System.out.println(stackData.pop());
stackData.push(16);
System.out.println(stackData.pop());
*/


/*QueueUsingArray queue = new QueueUsingArray(5);
queue.enqueue(3);
queue.enqueue(23);
queue.enqueue(333);
queue.enqueue(43);
queue.enqueue(73);
//queue.enqueue(13);
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
queue.enqueue(63);
queue.enqueue(93);
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
*/
		
		/*QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(21);
		queue.enqueue(22);
		queue.enqueue(23);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		//System.out.println(queue.dequeue());
		//System.out.println(queue.dequeue());
		queue.enqueue(24);
		System.out.println(queue.dequeue());
		*/
		
		/*StackUsingTwoQueue stackData = new StackUsingTwoQueue(5);
		stackData.push(2);
		stackData.push(3);
		stackData.push(5);
		stackData.push(6);
		stackData.push(7);
		System.out.println(stackData.pop());
		System.out.println(stackData.pop());
		System.out.println(stackData.pop());
		System.out.println(stackData.pop());
		System.out.println(stackData.pop());
		System.out.println(stackData.pop());
		*/
		
		
		/*QueueUsingTwoStack queue = new QueueUsingTwoStack(5);
		queue.enqueue(3);
		queue.enqueue(23);
		queue.enqueue(333);
		queue.enqueue(43);
		queue.enqueue(73);
		//queue.enqueue(13);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		*/
		
		/*StackUsingSingleQueue stack = new StackUsingSingleQueue(5);
		stack.push(23);
		stack.push(13);
		stack.push(53);
		stack.push(33);
		stack.push(323);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		*/
		//System.out.println(checkForBalancedParantheses("{{[({(1+2)+3)})]}}"));
		ArrayUsingTwoStack stack = new ArrayUsingTwoStack(5);
		stack.push1(21);
		stack.push1(22);
		stack.push2(32);
		stack.push2(42);
		System.out.println(stack.pop1());
		System.out.println(stack.pop2());
		System.out.println(stack.pop2());
		System.out.println(stack.pop2());
	}
	
	public static boolean checkForBalancedParantheses(String expression) {
		char[] arrayExpression = expression.toCharArray();
		StackUsingArray stack = new StackUsingArray(arrayExpression.length);
		for(int i=0; i<arrayExpression.length; i++) {
			if(arrayExpression[i] == '(' || arrayExpression[i] == '{' || arrayExpression[i] == '[' ) {
				stack.push(arrayExpression[i]);
			}else if(arrayExpression[i] == ')' || arrayExpression[i] == '}' || arrayExpression[i] == ']') {
				int data = stack.peek();
				if(matchData(data, arrayExpression[i])) {
					stack.pop();
				
				}else {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}

	private static boolean matchData(int topData, char currentExprChar) {
		if(topData == '{' && currentExprChar == '}') {
			return true;
		}else if(topData == '(' && currentExprChar == ')') {
			return true;
		}else if(topData == '[' && currentExprChar == ']') {
			return true;
		}
		return false;
		
	}

}
