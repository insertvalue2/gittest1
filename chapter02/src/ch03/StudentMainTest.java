package ch03;

// Ŭ������ ����ϴ� ���� �� �ڵ� 
public class StudentMainTest {

	public static void main(String[] args) {
		
		Student studnetLee = new Student(); 
		studnetLee.studentName = "�̼���";
		studnetLee.address = "��õ";
		
		studnetLee.showStudentInfo();
		studnetLee.takeTest();
		studnetLee.cleanUp();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		studentKim.showStudentInfo();
		
		// �޼��� ��� 
		// 1. takeTest ���� 
		// 2. cleanUp ���� 
		studentKim.takeTest();
		studentKim.cleanUp();
		
		
		System.out.println("-----------------------");
		String name1 =  studentKim.getStudentName();
		System.out.println("name1 : " + name1);
		
		String name2 = studnetLee.getStudentName();
		System.out.println("name2 " + name2);
		
		
		
		

	} // end of main 

}
