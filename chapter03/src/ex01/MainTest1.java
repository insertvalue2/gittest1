package ex01;

import java.util.Scanner;

public class MainTest1 {

	// �����Լ�
	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("����");
		Marine marine1 = new Marine("����1");
		Zergling zergling1 = new Zergling("���۸�1");
//
//		zealot1.showInfo();
//		marine1.showInfo();
//		zergling1.showInfo();
//
//		zealot1.attack(zergling1);
//		zealot1.attack(marine1);
//
//		marine1.showInfo();
//		zergling1.showInfo();

		// ��ĳ�ʸ� ����ؼ� ���࿡ �帧�� ����� ������ .
		// 1. ������ ������ �����Ѵ�.
		// 2. ������ ���۸� �����Ѵ�.
		// 3. ���۸� ���� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		boolean gameOver = false;
		int userInput = 0;
		final int ZEALOT_ACTION = 1; 
		final int GAME_END = 5; 
		
		//        ( !      false ) -> true  
		while (!(gameOver)) {

			System.out.println("1. ������ ������ ����");
			System.out.println("2. ������ ���۸��� ����");
			System.out.println("3. ���۸��� ������ ����");
			System.out.println("4. ���� ���� ����");
			System.out.println("5. ����");
			System.out.print("�Է� : ");

			userInput = sc.nextInt();
			
			if (userInput == ZEALOT_ACTION) {
				zealot1.attack(marine1);
			} else if (userInput == 2) {
				marine1.attack(zergling1);
			} else if (userInput == 3) {
				zergling1.attack(zealot1);
			} else if (userInput == 4) {
				zealot1.showInfo();
				marine1.showInfo();
				zergling1.showInfo();
			} else if (userInput == GAME_END) {
				System.out.println("������ �����մϴ�.");
				gameOver = true;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���.");
			}
			
		} // end of while 

	} // end of main

} // end of class
