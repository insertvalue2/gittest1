package ch03;

public class Warrior {

	// ��� ���� ����
	public int WarriorHealth;
	public int WarriorAttackPower;
	public String WarriorName;
	public String WarriorSkil;

	// ��� �Լ�
	public void WoInfo() {
		System.out.println(WarriorHealth + "," + WarriorAttackPower + "," + WarriorName + "," + WarriorSkil);
	}

	public void Attack() {
		System.out.println(WarriorName + " ��(��)" + WarriorAttackPower + " �������� �־����ϴ�.");
	}

	public void SkilPlay() {
		System.out.println(WarriorName + " ��(��)" + WarriorSkil + " �� ����ϴ�.");
	}

}
