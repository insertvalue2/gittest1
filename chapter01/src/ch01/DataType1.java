package ch01;

public class DataType1 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		// ������ Ÿ�� ����
		// 1. �⺻ �ڷ���(primitive data type)
		// 2. ���� Ÿ��(Reference Type)
		// �⺻ �ڷ���
		// ������ ������ �Ǽ��� ������(4���� ����)
		// ������ ( 1, 10, 100)
		byte b; // 1����Ʈ (8��Ʈ)
		short s; // 2����Ʈ (16��Ʈ)
		int i; // 4����Ʈ (32��Ʈ)
		long l; // 8����Ʈ (64��Ʈ)
		b = 127;
		// b = 128;
		b = -128;
		// int �� ���� ǥ�� ����
		i = 2100000000;
		i = -2100000000;
		l = 2200000000L; // ���̻� (�빮�� L �Ǵ� l �� ����� �� �ִ�.)
		i = 10;
		System.out.println(i);
		i = 300;
		System.out.println(i);
	} // end of main

} // end of class