package ch05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		
		// 예약어 continue 
		// 무시하고 진행하는 continue 
		// 스캐너 이용해서 MAX 값 ,
		// MULTIPLE값 받아서 프로그램을 완성해 주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("MAX 값 입력 : ");
		final int MAX = sc.nextInt();
		System.out.println("배수값 입력 : ");
		final int MULTIPLE = sc.nextInt();
		final int MIN = 1;
		
		int num; 
		int count = 0; 
		
		for(num = MIN; num < MAX; num++) {
			// 3에 배수이면 출력하지 마시오. 
			if (num % MULTIPLE == 0) {
				count++; 
				continue;
			} // end of if 
			
		} // end of for 

//		System.out.println("출력 값 : " + num);
		System.out.println(MULTIPLE + "의 배수의 개수 : " + count);
		
	} 
}





