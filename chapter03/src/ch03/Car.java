package ch03;

public class Car {
	
	String name; 
	int price; 
	// 포함관계 has a 
	Engine engine; 
	
	public Car(String name, int price) {
		this.name = name; 
		this.price = price; 
		engine = new Engine("GDI", 500);
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("price : " + price);
	}
	
}


