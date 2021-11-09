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
		// 방어적 코드 작성
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("잘못된 입력 입니다. 이름을 다시 작성해 주세요.");
		} else {
			this.name = name;
		}
	}

	// hp , defense, level
	// get, set 메서드를 만들어 주세요
	// 메서드를 설계 하는 코드 작성
	
	public int getHP() {
		return hp;
	}

	public void setHP(int hp) {
		if (hp < 0) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			this.hp = hp;
		}
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		if (defense < 0) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			this.defense = defense;
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if (level < 0) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			this.level = level;
		}
	}

	// main 함수
	public static void main(String[] args) {

		// Hero 객체 생성 후 getter, setter 메서드를 사용해 보세요.
		Hero hero = new Hero();
		hero.setName("야스오");
		String name = hero.getName();
		System.out.println("돌려 받은 값 : " + name);

	}

}
