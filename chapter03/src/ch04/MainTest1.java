package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("전사", 100);
		Archer archer1 = new Archer("궁수", 100);
		Wizard wizard1 = new Wizard("마법사", 50);
		
		String name = warrior1.name;  // hero 
		int hp = warrior1.hp;  // hero 
		warrior1.attack();  // hero
		
		
		warrior1.comboAttack(); // warrior 

	}

}
