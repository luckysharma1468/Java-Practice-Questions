package stacks;

public class StacksUsingArraysClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StacksUsingArrays stack = new StacksUsingArrays(5);

		stack.push(5);
		stack.display();
		
		for(int i=1; i<=4; i++) {
			stack.push(i*10);
			stack.display();
		}
		
//		System.out.println(stack.pop());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
			stack.display();
		}
		
	}

}
