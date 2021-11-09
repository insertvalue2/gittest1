package ch07;

public class Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;

	// get
	public String getName() {
		return name;
	}

	// set
	public void setName(String name) {
		// ����� �ڵ� �ۼ�
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("�߸��� �Է� �Դϴ�. �̸��� �ٽ� �ۼ��� �ּ���.");
		} else {
			this.name = name;
		}
	}

	// hp , defense, level
	// get, set �޼��带 ����� �ּ���
	// �޼��带 ���� �ϴ� �ڵ� �ۼ�
	
	public int getHP() {
		return hp;
	}

	public void setHP(int hp) {
		if (hp < 0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else {
			this.hp = hp;
		}
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		if (defense < 0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else {
			this.defense = defense;
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if (level < 0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else {
			this.level = level;
		}
	}

	// main �Լ�
	public static void main(String[] args) {

		// Hero ��ü ���� �� getter, setter �޼��带 ����� ������.
		Hero hero = new Hero();
		hero.setName("�߽���");
		String name = hero.getName();
		System.out.println("���� ���� �� : " + name);

	}

}
