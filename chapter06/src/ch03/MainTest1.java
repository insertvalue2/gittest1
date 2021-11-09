package ch03;

class Student {
	
}

abstract class Dog {
	
	
}


public class MainTest1 {

	public static void main(String[] args) {
		
		// 익명 클래스 , 익명 객체  -- 단지 이녀셕을 호출할 이름이 없다 . 
		new Student();
		new Student();
		new Student();
		new Student();
		
		//익명 구현 객체 
		// 방법 -> 익명 구현 클래스 
		Dog  dog  = new Dog() {
			
		}; 
	}
}
