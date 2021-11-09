package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		
		final int BANANA = 1; 
		final int PEACH = 2; 
		
		// 스캐너 
		// 사용자가 입력한 1, 2, 받은면 해당하는 객체에 정보를 
		// 화면에 출력해 주세요. 
		System.out.println("바나나 : 1, 복숭아 : 2");
		
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt(); 
		
		Fruit fruit; 
		
		if(userInput == BANANA) {
			fruit = new Banana();  // 업 캐스팅
		} else {
			fruit = new Peach();
		}
		
		fruit.showInfo();  // 1, 2  
		// 사용자가 입력한 값에 따라서 인스턴스를 쉽게 
		// 바꿔 줄 수 있다. 
		
		
		// 만약 1번이라면 바나나 객체를 생성하고 
		// showInfo 메서드를 호출해 주세요. 
		
		// 아니라면 복숭아를 생성해서 호출해 주세요. 
		

	}

}



