package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DataStructureTest2 {

	public static void main(String[] args) {
		
		Set set0; 
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1); // 중복값 
		set1.add(2);
		set1.add(3);
		set1.add(3); // 중복값 
		
		System.out.println("set1 : " + set1);
		
		// 사이즈 값 
		System.out.println("사이즈 확인 : " + set1.size());
		
		// 삭제 
		set1.remove(1);
//		set1.clear();
		System.out.println(set1);
		
//		for (int i = 0; i < set1.size(); i++) {
//			System.out.println("set1값 확인 : " + i);
//		}
		
	     // while 문 사용 방법 
		 Iterator<Integer> iter = set1.iterator(); 
		while(iter.hasNext()) {
			System.out.println("값 확인 : " + iter.next());
		}
		
		// 내부에 값이 있는지 확인 
		System.out.println(set1.contains(3));
		
		
		HashSet<Integer> set2 = new HashSet<>(); 
		
		// set2 사이즈가 6개면 완료... 
		// 아니라고 하면 한번더 동작
		
		boolean flag = true; 
		while(flag) {
			set2.add(getRandomNumber());
			if(set2.size() == 6) {
				flag = false;
			}
		}
	
		System.out.println(set2);
		System.out.println(set2.size());

	} // end of main 
	
	public static int getRandomNumber() {
		Random random = new Random(); 
		int value = random.nextInt(45) + 1; 
		return value; 
	}
	

}







