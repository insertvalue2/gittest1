package ex01;

// new 키워들 사용해서 메모리에 올리수 없다. 타입으로만 사용한다. 
public abstract class Unit {

	protected int power;
	protected int hp;
	protected String name;

	// 공격 당합니다. 
	public void beAttacked(int power) {
		this.hp -= power; 
		if(this.hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다.");
			this.hp = 0; 
		}
	}
	
	public String getName() {
		return this.name; 
	}
	
	public void attack(Unit unit) {
		String targetName = unit.getName(); 
		System.out.println(this.name +"이(가)" + targetName + "을 공격 합니다.");
		unit.beAttacked(this.power);
	}

	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("=========");
	}

}
