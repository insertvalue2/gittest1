package ch04;

public class SubwayMainTest {

	public static void main(String[] args) {
		// subway  객체 3개 생성 
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		// 각각  take 메서드 실행 후
		subway1.take(1300);
		subway2.take(1300);
		subway3.take(1300);
		
		// showInfo  메서드 실행 시켜 주세요.
		subway1.showInfo();
		subway2.showInfo();
		subway3.showInfo();

	}

}
