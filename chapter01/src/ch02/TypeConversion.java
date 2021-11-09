package ch02;

public class TypeConversion {
	
	// 메인 함수(코드의 시작점)
	public static void main(String[] args) {
		// 데이터 형 변환 
		// int 자료형을 double로 변경하거나 
		// double 자료형을 int 변경하는 것을 말합니다. 
		int iNum1 = 100; 
		System.out.println(iNum1);
		
		// 자동 형변환 
		double dNum1 = iNum1; 
		System.out.println(dNum1);
		
		
		// 강제 형변환 
		double dNumber = 1.12345; 
//		int iNumber = dNumber;
		
		// 개발자가 컴파일러야 괜찮으니깐 그냥 강제로 넣어 
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
		
		
		// 연습 
		double aValue; 
		int bValue; 
		
		aValue = 0.5; 
		bValue = (int)10.1; 
		System.out.println(bValue);
		
		
		

	} // end of main 

} // end of class 
