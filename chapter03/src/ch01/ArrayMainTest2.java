package ch01;

public class ArrayMainTest2 {

	public static void main(String[] args) {
		// 연관된 데이터를 통으로 모아서 관리하기 위한 것 
		int[] nums = new int[12];
		
		// 질럿을 담을 수 있는 배열을 12칸 만들어 주세요 
		Zealot[] zealots = new Zealot[12];
		// 마린 12
		Marine[] marines = new Marine[12];
		// 저글링 12 
		Zergling[] zerglings = new Zergling[12];
		
		// 배열은 for문과 함께 많이 사용 
		for(int i = 0; i < zealots.length; i++) {
			zealots[i] = new Zealot("질럿" + (i + 1));
		} // end of for 
		
		// 1 문제 마린 생성 
		for (int i = 0; i < marines.length; i++) {
			marines[i] = new Marine("마린"+i);
		}
		
		// 2 문제 저글링 생성
		for (int i = 0; i < zerglings.length; i++) {
			zerglings[i] = new Zergling("저글링" + i);
		}
			
		
//		System.out.println(zealots[11].getName());
		// 3 질럿 12마리에 정보를 출력해 주세요. for문 사용 
		for (int i = 0; i < zealots.length; i++) {
			zealots[i].showInfo();
		}
	}
}



