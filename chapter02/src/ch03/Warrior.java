package ch03;

public class Warrior {

	// 멤버 변수 설계
	public int WarriorHealth;
	public int WarriorAttackPower;
	public String WarriorName;
	public String WarriorSkil;

	// 멤버 함수
	public void WoInfo() {
		System.out.println(WarriorHealth + "," + WarriorAttackPower + "," + WarriorName + "," + WarriorSkil);
	}

	public void Attack() {
		System.out.println(WarriorName + " 이(가)" + WarriorAttackPower + " 데미지를 주었습니다.");
	}

	public void SkilPlay() {
		System.out.println(WarriorName + " 이(가)" + WarriorSkil + " 을 썼습니다.");
	}

}
