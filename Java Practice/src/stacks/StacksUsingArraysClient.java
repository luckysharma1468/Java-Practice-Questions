package stacks;

public class StacksUsingArraysClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StacksUsingArrays stack = new StacksUsingArrays(5);
		
		for(int i=1; i<=5; i++) {
			stack.push(i*10);
		}
		
		stack.display();

		stack = reverseStack(stack);
		
		stack.display();
		
	}
	
	public static StacksUsingArrays reverseStack(StacksUsingArrays stack1) throws Exception {
		
		StacksUsingArrays stack2 = new StacksUsingArrays(stack1.size());
		
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		
		return stack2;
	}

}
