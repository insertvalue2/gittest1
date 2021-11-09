package ch02;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		// 함수 사용하는 방법 (모양 맞추기)
		int num1 = 10;
		int num2 = 20;

		double total = addNum(42.123, 10.5);
		System.out.println("total : " + total);

		sayHello("반갑습니다");

		int sum = calcSum();
		System.out.println("sum : " + sum);
		
		System.out.println("---------------------");
		// 함수 사용해보기 4, 5, 6 
		
		// 4 
		int result1 =  intAdd(10, 20, 30);
		System.out.println("result1 : " + result1);
		
		// 5 
		double result2 = doubleAdd(10.5, 0.5);
		System.out.println(result2);
		
		printArticle("기사 제목 : 날씨 좋음!!!!");
		
		
		
	} // end of main
	
	
	// 1. 반환 값이 없는 함수 설계하기
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}

	// 2. 매개 변수가 없는 함수 만들기 -> 반환 값 있음
	public static int calcSum() {
		int sum = 0;
		int i;
		for (i = 0; i <= 100; i++) {
//			sum = sum + i; 
			sum += i;
		}
		return sum;
	}

	// 3. 반환값이 있고 매개변수를 받는 함수 만들기
	public static double addNum(double n1, double n2) {
		double result = 0.0;
		result = n1 + n2;
		return result;
	}

	// 함수를 만들어 봅시다.

	// 4. 리턴값 int, 매개변수 n1,n2,n3, 이름 -> intAdd
	public static int intAdd(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	// 5. 리턴값 double 매개변수 d1,d2 이름 -> doubleAdd
	public static double doubleAdd(double d1, double d2) {
		double sum = d1 + d2;
		return sum;
	}

	// 6. 리턴값 없음, 매개변수 String article 이름 -> printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}

}
