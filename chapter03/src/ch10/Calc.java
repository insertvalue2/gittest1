package ch10;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999;
	
	
	// �߻� �޼��� 
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int  num2);
	int divide(int num1, int num2);

	// add, �Ű����� num1, num2 + -->
	// substract , �Ű����� num1, num2 
	// times �Ű����� num1, num2 *
	// divide �Ű����� num1, num2 /
	// ���� Ÿ���� int 

	// void showInfo(); 
}
