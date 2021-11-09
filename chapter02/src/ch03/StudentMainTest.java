package ch03;

// 클래스를 사용하는 입장 쪽 코딩 
public class StudentMainTest {

	public static void main(String[] args) {
		
		Student studnetLee = new Student(); 
		studnetLee.studentName = "이순신";
		studnetLee.address = "인천";
		
		studnetLee.showStudentInfo();
		studnetLee.takeTest();
		studnetLee.cleanUp();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		studentKim.showStudentInfo();
		
		// 메서드 사용 
		// 1. takeTest 실행 
		// 2. cleanUp 실행 
		studentKim.takeTest();
		studentKim.cleanUp();
		
		
		System.out.println("-----------------------");
		String name1 =  studentKim.getStudentName();
		System.out.println("name1 : " + name1);
		
		String name2 = studnetLee.getStudentName();
		System.out.println("name2 " + name2);
		
		
		
		

	} // end of main 

}
