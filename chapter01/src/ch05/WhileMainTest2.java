package ch05;

import java.util.Scanner;

public class WhileMainTest2 {

	public static void main(String[] args) {
		// 상수에 담는 값을 스캐너를 사용해서 코드를 수정해 주세요. 
		System.out.println("덧셈 값을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		final int LIMIT_VLAUE = scanner.nextInt();
		int num = 1; 
		int sum = 0; 
		
		while(num <= LIMIT_VLAUE) {
			sum = sum + num; 
			num++; 
		}
		
		System.out.println("결과값 : " + sum);
		

	}

}
