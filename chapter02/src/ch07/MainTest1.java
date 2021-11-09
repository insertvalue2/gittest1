package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bank bank = new Bank(); 
		// 멤버 변수에 성질 확인 
		// int balance --> 0 
		// double   --> 0.0
		// String  --> null
		
		bank.deposit(10_000);
		bank.showInfo();

		// 출금을 합니다. 
		int money = bank.withdraw(5_000); 
		System.out.println("돌려 받은 금액 : " + money);
		bank.showInfo();
		
		// 신입이 실수 멤버 변수에 바로 접근해서 잔액을 수정 함 
		//bank.balance = 100_000; 
		bank.showInfo();
		
		// 
		// getter, setter
		// read only 
		int returnMoney = bank.getBalance(); 
		System.out.println(returnMoney);
		
		// setter 사용해보기 
		bank.setBalance(-10000);
		bank.showInfo();
		
		// 접근 제어 지시자 
		// 4 
		// public - 누구나 접근을 허용하게 한다. 
		// default - 같은 패키지 내에서 접근을 허용한다. 
		// protected - 상속관계에서 접근을 허용 한다. 
		// private - 같은 클래스 에서만 접근을 허용한다. 
		
	}

}





