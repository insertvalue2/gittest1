package ch08;

public class Zergling {

	private int power;
	private int hp;
	private String name;

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}

	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("=========");
	}

	// 공격 당합니다.
	public void beAttacked(int power) {
		this.hp -= power;
	}

//	// 1. 저글링이 질럿을 공격 합니다.
//	public void attackZealot(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(this.name + "이(가)" + targetName + "을 공격 합니다.");
//		zealot.beAttacked(this.power);
//	}
//
//	// 2. 저글링이 마린을 공격 합니다.
//	public void attackMarine(Marine marine) {
//		String targetName = marine.getName();
//		System.out.println(this.name + "이(가)" + targetName + "을 공격 합니다.");
//		marine.beAttacked(this.power);
//	}

	public String getName() {
		return name;
	}

	// 1. 메서드 오버로딩을 사용해 보자 2개 ~
	// 메서드 오버로딩을 사용해 보자.
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "이(가)" + targetName + "을 공격 합니다.");
		zealot.beAttacked(this.power);
	}

	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(this.name + "이(가)" + targetName + "을 공격 합니다.");
		marine.beAttacked(this.power);
	}

}
