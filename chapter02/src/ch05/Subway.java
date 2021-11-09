package ch05;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("지하철 "+ lineNumber + " 번 호선의 ");
		System.out.println(passengerCount + " 명 이고 ");
		System.out.println("현재 수익금은 : " + money + "원 입니다.");
	}

}
