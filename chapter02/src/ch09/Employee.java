package ch09;

public class Employee {
	
	public static int serialNum = 1000; 
	
	private int employeeId; 
	private String employeeName; 
	private String department; 
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	//  static 메서드 활용 
	public static int getSerialNum() {
		// 주의 : static 메서드 안에서는 멤버 변수를 사용할 수 없다. 
		// why : 객체가 만들어지기 전에 접근해서 사용할 수 있는 static 
		// 이기 때문입니다. 
		// 객체가 생성되기 전에 실행될 수 있는 메서드 
//		department = "개발팀";
		return serialNum;
	}
	
	
	
	
}
