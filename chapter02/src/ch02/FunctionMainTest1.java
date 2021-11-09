package ch02;

public class FunctionMainTest1 {

	public static void main(String[] args) {
		
		// 함수 사용 방법 (모양 맞추기) 
		int addResult1 = add(10, 77);
		System.out.println(addResult1);
		
		int addResult2 = add(10, 30);
		System.out.println(addResult2);
		
	
	} // end of main 
	
	
	// add 함수를 생성 
	public static int add(int num1, int num2) {
		
		int result; 
		result = num1 + num2; 
		
		return result; // 리턴 키워드를 만났을 때 실행에 제어권을 반환   
	}
	

}
