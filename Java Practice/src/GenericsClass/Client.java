package GenericsClass;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pair<Integer> p = new pair<>();
//		p.one = 10;
//		
//		pair2<Integer, String> p2 = new pair2<>();
//		p2.one = 10;
//		p2.two = "Hello";
//		
//		GenericLinkedList<car> list = new GenericLinkedList<>();
//		
//		list.addLast(new car(40, 1000, "yellow"));
//		list.addLast(new car(20, 2000, "blue"));
//		
//		list.display();
		
		GenericLinkedList<Integer> list = new GenericLinkedList<>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		System.out.println(list.find(30));
		
	}

}
