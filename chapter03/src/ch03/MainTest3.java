package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		// 자동차를 생성해서 show info 호출해 주세요 
		
		Car car1 = new Car("제네시스", 5500);
		car1.showInfo();
		
		// 엔진에 정보를 출력해 주세요. 
		car1.engine.showInfo();		
		

	}

}
