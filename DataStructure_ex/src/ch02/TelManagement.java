package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {

	// 추가
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;
		String name, address, telephone;
		Scanner s = new Scanner(System.in);
		System.out.println("이름 >> : ");
		name = s.next();
		System.out.println("주소 >> : ");
		address = s.next();
		System.out.println("전화번호 >> : ");
		telephone = s.next();
		phone = new Phone(name, address, telephone);
		map.put(phone.name, phone);
	}

	// 삭제
	public static void delete(HashMap<String, Phone> map) {
		String delName;
		Scanner s = new Scanner(System.in);
		System.out.println("이름 >> ");
		delName = s.next();
		if (map.containsKey(delName)) {
			map.remove(delName);
		} else {
			System.out.println(delName + "은 등록되지 않은 사람입니다.");
		}
	}

	// 찾기
	public static void search(HashMap<String, Phone> map) {
		String searchName;
		Scanner s = new Scanner(System.in);
		System.out.println("이름 >>");
		searchName = s.next();
		if (map.containsKey(searchName)) {
			System.out.println(searchName + " " + map.get(searchName).telephone);
		} else {
			System.out.println(searchName + " 은 등록되지 않는 사람입니다.");
		}
	}

	// 전체보기
	public static void showInfo(HashMap<String, Phone> map) {
		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println(name + " " + person.telephone);
		}
	}

	public static void main(String[] args) {

		HashMap<String, Phone> map = new HashMap<String, Phone>();
		// 임시 데이터 만들어 놓기
//		map.put("홍길동", new Phone("홍길동", "부산시", " 010-1234-1234"));
//		map.put("이순신", new Phone("이순신", "서울시", " 010-1234-1234"));
		// 메서드 이용해보기
//		insert(map);
//		delete(map);
//		search(map);
//		showInfo(map);

		// 실행에 흐름 만들어 보기
		int menu;

		System.out.println("---------------------");
		System.out.println("전화번호 관리 프로그램");
		System.out.println("---------------------");

		// 스캐너 이용해서
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("추가 0, 삭제 1, 찾기 2, 전체보기 3, 종료 4");
			menu = scanner.nextInt();
			switch (menu) {
			case 0:
				insert(map);
				break;
			case 1:
				delete(map);
				break;
			case 2:
				search(map);
				break;
			case 3:
				showInfo(map);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력 해주세요");
			}
		}
	}
}
