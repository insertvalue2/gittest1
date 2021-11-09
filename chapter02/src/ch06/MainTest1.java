package ch06;

// 클래스를 사용하는 입장
public class MainTest1 {
	
	// 메인함수(코드의 시작점)
	public static void main(String[] args) {
		
		Student studentLee = new Student(1, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		studentLee.showStudentScore();
		
		// 학생 2 동작 총점
		Student studentKim = new Student(2, "kim");
		studentKim.setKoreaSubject("국어", 50);
		studentKim.setMathSubject("수학", 70);
		studentKim.showStudentScore();
		
		
		// 학생 3 동작 총점 
		Student studentCho = new Student(3, "cho");
		studentCho.setKoreaSubject("국어", 88);
		studentCho.setMathSubject("수학", 59);
		studentCho.showStudentScore();
		
		

	} // end of main 

} // end of class 
