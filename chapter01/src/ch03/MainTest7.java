package ch03;

public class MainTest7 {

	public static void main(String[] args) {

		// 복합 대입 연산자
		// 대입 연산자와 다른 연산자가 함께 사용

		int num1 = 1;

//		num1 = num1 + 10;
		num1 += 10;
		System.out.println(num1);

		int num2 = 1;
//		num2 = num2 - 10;
// --> 복합 대입 연산자로 변경 
		num2 -= 10;
		System.out.println(num2);
		// num2 변수에 값이 현재 -9 이다.

		// num2 변수에 곱하기 2 를 해서 num2 변수 결과값을 담아 주세요.
		// 단, 복합 대입연산자를 사용
		num2 *= 2;
//		System.out.println(num2);
		num2 = num2 * 2;

		// num2 변수에 나누기 2 를 해서 num2 변수 결과값을 담아 주세요.
		// 단, 복합 대입연산자를 사용
		num2 /= 2;

		// num2 변수에 나머지연산자 2 를 해서 num2 변수 결과값을 담아 주세요.
		// 단, 복합 대입연산자를 사용
		num2 %= 2;

	}

}
