package ch04;

public class Student {

	// 생성자 - constructor
	// 객체를 생성할때 다음과 같은 모양으로 만들어라고 지시하는 것 (강제성 부여됨)

	int number;
	String name;
	int grade;

	// 기본 생성자 
	// 사용자 정의 생성자 없는 경우에는 
	// 컴파일러가 알아서 기본 생성자를 만들어 준다. 
	public Student() {
		
	}
	
	// 생성자 만들기 (개발자가 직접 정의 - 사용자 정의 생성자)
	// grade 넣고 코드를 정상 동작 하게 수정해주세요.
	public Student(int num, String name, int grade) {
		number = num;
		// 매개변수 이름과 멤버 변수 이름이 같다면 this. 키워드를
		// 사용해서 구분해 주어야 한다.
		this.name = name;
		this.grade = grade;
	}

	// 메서드 정의
	public void showInfo() {
		System.out.println(name + " 학생의 학번은 " 
	+ number + " 입니다." + "\n학년은 " + grade + " 입니다");
	}

}
