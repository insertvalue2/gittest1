package ch05;

public class DownCastingTest {

	public static void main(String[] args) {

		// 1.  바나나에 origin 멤버 변수를 추가 
		
		Fruit fruit = new Banana(); 
		
//		fruit.oring;
		// 컴파일러는 부모타입 인스턴스 변수 타입을
		
		// 다운 캐스팅을 사용한다면 가능 
		// (컴파일러에게 자식 객체 타입으로 바라 보라고 명시 ) 
		String origin = ((Banana)fruit).origin; 
		System.out.println("원산지 : " + origin);
		
		
		// 바라보고 있는 상태
		
		// 컴파일 타임 
		
		// 런타임 
		

	} // end of main 

} // end of class 
