package ch08;

public class Person {
	
	// this �� 
	//1. �ν��Ͻ�(��ü) �ڽſ� �޸𸮸� ����Ų��. 
	//2. �����ڿ��� �� �ٸ� �����ڸ� ȣ���� �� ����� �� �ִ�. 
	//3. �ڽ��� �ּ�(������, �ּҰ�)�� ��ȯ ��ų �� �ִ�. 
	
	String name;
	int age; 
	
	public Person(String name, int age) {
		// 1. �ڱ� �ڽ��� ����Ű�� this 
		this.name = name; 
		this.age = age; 
	}
	
	public Person() {
		// �⺻ �����ڿ��� �ٸ� �����ڸ� ȣ�� 
		this("�̸�����", 1); 
//		this.name = "�̸�����";
//		this.age = 1;
	}
	
	// �ڽ��� �ּҰ�(������)�� ��ȯ ��ų �� �ִ�. 
	// ���� ������ ����� �� �� �ִ�.. 
	public Person getPerson() {
		return this; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void shoInfo() {
		System.out.println("�̸� : " + name + " ���� :" + age );
	}
	
	
	// main
	public static void main(String[] args) {
		Person person1 = new Person();
//		person1.shoInfo();
		person1.setName("ȫ�浿");
		// �������� �޾Ƽ� �ٸ� �ν��Ͻ� ������ �ּҸ� �Ҵ��� ����. 
		Person person2 = person1.getPerson();
//		person2.shoInfo();
		person2.setName("�̼���");
		
		System.out.println(person1);
		System.out.println(person2);
		
		person1.shoInfo();
		person2.shoInfo();
		
	} // end of main 
	
	
} // end of class 



