package GenericsClass;

public class car implements Comparable<car> {
	int speed;
	int price;
	String color;
	
	car(int speed, int price, String color){
		this.speed = speed;
		this.price = price;
		this.color = color;
	}
	
	public String toString() {
		return "S: " + this.speed + " P: " + this.price + " C: " + this.color;
	}
	
	public int compareTo(car other) {
		return this.speed - other.speed;
//		return other.speed - this.speed;
//		return this.price - other.price;
//		return other.price - this.price;
	}
	
}
