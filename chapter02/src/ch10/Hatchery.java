package ch10;

public class Hatchery {
	
	// static ���� ���
	public static int zCnt = 1; 
	// ������� ���� 
	private String name; 
	// ������ ���� 
	public Hatchery(String name) {
		this.name = name; 
	}
	
	// ���۸��� �����ϴ� �޼��� ����� �ּ���
	public Zergling createZergling() {
		System.out.println("���۸��� ���� �մϴ�.");
		zCnt++; 
		return new Zergling("���۸�" + zCnt);
	}
}
