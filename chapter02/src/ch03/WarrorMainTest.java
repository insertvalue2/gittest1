package ch03;

public class WarrorMainTest {

	public static void main(String[] args) {
		// 직접 코드를 실행 시켜 주세요.
		Warrior wo1 = new Warrior();

		wo1.WarriorHealth = 150;
		wo1.WarriorAttackPower = 15;
		wo1.WarriorName = "오크족장";
		wo1.WarriorSkil = "도끼 휘두르기";

		wo1.WoInfo();
		wo1.Attack();
		wo1.SkilPlay();

	}

}
