package ch05;

import java.util.Scanner;

public class WhileMainTest2 {

	public static void main(String[] args) {
		// ����� ��� ���� ��ĳ�ʸ� ����ؼ� �ڵ带 ������ �ּ���. 
		System.out.println("���� ���� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		final int LIMIT_VLAUE = scanner.nextInt();
		int num = 1; 
		int sum = 0; 
		
		while(num <= LIMIT_VLAUE) {
			sum = sum + num; 
			num++; 
		}
		
		System.out.println("����� : " + sum);
		

	}

}
