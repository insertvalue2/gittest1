package ch01;


public class WarriorMainTest {
	
	// 설계된 클래스를 사용하는 쪽 코딩 
	public static void main(String[] args) {
		
		int height; 
		
		Warrior w1 = new Warrior(); 
		w1.height = 200;
		w1.power = 100; 
		w1.name = "전사1";
		w1.color = "초록색";
		
		System.out.println(w1.height);
		System.out.println(w1.power);
		System.out.println(w1.name);
		System.out.println(w1.color);
		
		Warrior w2 = new Warrior();
		w2.height = 100; 
		w2.power = 50; 
		w2.name = "작은전사1";
		w2.color = "빨간색";
		
		System.out.println(w2.height);
		System.out.println(w2.power);
		System.out.println(w2.name);
		System.out.println(w2.color);
				
		

	} // end of main 

} // end of class 
