package ch05;

import java.util.Scanner;

public class WhileMainTest4 {

	public static void main(String[] args) {
		
		// ����ڰ� 0�� �Է��ϸ� ���α׷��� ���� ���Ѷ� 
		// ����ڰ� �Է��� ���� ��� �����ϴ� ���α׷����� ���� ���Ѷ� 
		
		
		// do ~ while 
		// ��ĳ�ʸ� ��� �ؼ� ����ڿ� �Է°��� �޾Ƽ� ���� ������ ���ּ���. 
		// ���꿡 ����� ȭ�鿡 ����ϴ� ���α׷��� ������ּ���. 
		
		Scanner scanner = new Scanner(System.in);
		
		int num; 
		int sum = 0;
		do {
			System.out.println("���� �Է��ϼ��� : ");
			num = scanner.nextInt();
			sum += num;
		}while(num != 0);
		
		System.out.println("������ ��� ���� " + sum + "�Դϴ�.");
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("���� �Է��ϼ��� : ");
//			num = scanner.nextInt();
//			sum += num;
//		}
//		
//		System.out.println("������ ��� ���� " + sum + "�Դϴ�.");

		
		
	} // end of main 

} // end of class 
