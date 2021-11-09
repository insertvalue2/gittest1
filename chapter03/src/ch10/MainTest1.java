package ch10;

public class MainTest1 {

	// main 함수 
	public static void main(String[] args) {
		
		// 부모 타입 Calc 
		Calc calc = new CompleteCalc(); 
		
		int num1 = 10; 
		int num2 = 2; 
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, 0));
		
		// 오류를 해결해 봅시다. 
		//calc.showInfo();

	}

}
