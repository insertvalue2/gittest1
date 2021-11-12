package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {

	// �߰�
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;
		String name, address, telephone;
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� >> : ");
		name = s.next();
		System.out.println("�ּ� >> : ");
		address = s.next();
		System.out.println("��ȭ��ȣ >> : ");
		telephone = s.next();
		phone = new Phone(name, address, telephone);
		map.put(phone.name, phone);
	}

	// ����
	public static void delete(HashMap<String, Phone> map) {
		String delName;
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� >> ");
		delName = s.next();
		if (map.containsKey(delName)) {
			map.remove(delName);
		} else {
			System.out.println(delName + "�� ��ϵ��� ���� ����Դϴ�.");
		}
	}

	// ã��
	public static void search(HashMap<String, Phone> map) {
		String searchName;
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� >>");
		searchName = s.next();
		if (map.containsKey(searchName)) {
			System.out.println(searchName + " " + map.get(searchName).telephone);
		} else {
			System.out.println(searchName + " �� ��ϵ��� �ʴ� ����Դϴ�.");
		}
	}

	// ��ü����
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
		// �ӽ� ������ ����� ����
//		map.put("ȫ�浿", new Phone("ȫ�浿", "�λ��", " 010-1234-1234"));
//		map.put("�̼���", new Phone("�̼���", "�����", " 010-1234-1234"));
		// �޼��� �̿��غ���
//		insert(map);
//		delete(map);
//		search(map);
//		showInfo(map);

		// ���࿡ �帧 ����� ����
		int menu;

		System.out.println("---------------------");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("---------------------");

		// ��ĳ�� �̿��ؼ�
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("�߰� 0, ���� 1, ã�� 2, ��ü���� 3, ���� 4");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է� ���ּ���");
			}
		}
	}
}
