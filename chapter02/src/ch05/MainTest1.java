package ch05;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ���� ����� 
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		
		Student student1 = new Student("ȫ�浿", 10_000);
		Student student2 = new Student("�߽���", 50_000);
		Student student3 = new Student("Ƽ��", 20_000);
		
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		
		
//		
//		// �л��� ������ ź��. 
//		student1.takeBus(bus100);
//		
//		// ����â Ȯ�� 
//		student1.showInfo();
//		// 
//		System.out.println("------------------");
//		bus100.showInfo();
//		
//		System.out.println("------------------");
//		student2.takeBus(bus100);
//		student2.showInfo();
//		
//		System.out.println("------------------");
//		bus100.showInfo();
//		/////////////////////////////////////////
//		// �л����� ��ġ�� ���� ���ϴ�. 
//		
//		// s1 ����ö�� ž�ϴ�. 
//		student1.takeSubway(subway1);
//		System.out.println("=============");
//		student1.showInfo();
//		subway1.showInfo();
//		System.out.println("=============");
//		

	}

}
