package ch03;

public class WarrorMainTest {

	public static void main(String[] args) {
		// ���� �ڵ带 ���� ���� �ּ���.
		Warrior wo1 = new Warrior();

		wo1.WarriorHealth = 150;
		wo1.WarriorAttackPower = 15;
		wo1.WarriorName = "��ũ����";
		wo1.WarriorSkil = "���� �ֵθ���";

		wo1.WoInfo();
		wo1.Attack();
		wo1.SkilPlay();

	}

}
