package ch04;

public class Subway {

	// 호선 번호
	// 승객수
	// 수익금

	// 생성자 - 호선번호를 받는 생성자

	// 메서드 take , showInfo

	// 버스 번호
	// 승객 수
	// 수익금
	int lineNumber;
	int passengerCount;
	int money;

	// 컴파일러가 기본 생성자를 만들어 준다.
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
//			this.money = money + money;
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("지하철 "+ lineNumber + " 번 호선의 ");
		System.out.println(passengerCount + " 명 이고 ");
		System.out.println("현재 수익금은 : " + money + "원 입니다.");
	}

}
