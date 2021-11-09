package ch04;

public class Bus {
	
	// 버스 번호 
	// 승객 수 
	// 수익금 
	int busNumber; 
	int passengerCount; 
	int money; 
	
	// 컴파일러가 기본 생성자를 만들어 준다. 
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
//		this.money = money + money;
		this.money += money; 
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + " 번 의 승객은 ");
		System.out.println(passengerCount + " 명 이고 ");
		System.out.println("현재 수익금은 : " + money + "원 입니다.");
	}
	
}
