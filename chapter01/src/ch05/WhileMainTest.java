package ch05;

public class WhileMainTest {

	public static void main(String[] args) {
		
		// 1 ~ 10 ���� ���� ���� 
		
		int num = 1; 
		int sum = 0; 
		
		while(num <= 10) {
			System.out.println(" ���� �� : " + num);
			sum += num; 
			num++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} // end of while 
		
		System.out.println("���꿡 ������� : " + sum + " �Դϴ�.");

	}

}
