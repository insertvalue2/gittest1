package ch01;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A'; // 정수값 65 저장 
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66; // 'A' , 'C' 
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		char ch3 = 67; 
		System.out.println(ch3);
		System.out.println((int)ch3);
		
		// 주의!!!  음수는 대입 불가 
		//char ch4 = -68;
		// 문제 
		// 1. 안, 녕, 하, 세, 요 ---> 각각 정수값 얼마 인가요? 
		
		System.out.print((int)'안');
		System.out.print((int)'녕');
		System.out.print((int)'하');
		System.out.print((int)'세');
		System.out.print((int)'요');
		
		
		
		
		
	}

}
