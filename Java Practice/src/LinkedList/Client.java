package LinkedList;

public class Client {

	public static void main(String[] args) throws Exception {
		
		LinkedList ll = new LinkedList();
		
		//Below code with throw exception
		//System.out.println(ll.getFirst());
		//System.out.println(ll.getLast());
		
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(10);
		ll.addLast(12);
		
		ll.display();
		
		System.out.println("Adding ELements at First Position");
		
		ll.addFirst(101);
		ll.addFirst(102);
		ll.addFirst(103);
		
		ll.display();
		
		System.out.println("At Index 2 -> " + ll.getAt(2));
		
		System.out.println("Adding 950 at index 2");
		
		ll.addAt(950, 2);
		
		System.out.println("At Index 2 -> " + ll.getAt(2));
		
		ll.display();
		
		System.out.println("Removing first Value " + ll.removeFirst());
		
		ll.display();
		
		System.out.println("Removing Last Value " + ll.removeLast());
		
		ll.display();
		
		System.out.println("Removing At index 2 -> " + ll.removeAt(2));
		
		ll.display();
		
		
		//Reversing the data in a LinkedList
		ll.reverseData();
		
		ll.display();
		
		ll.reversePointers();
		
		ll.display();
		
		System.out.println("Mid Value -> " + ll.getMid());

	}

}
