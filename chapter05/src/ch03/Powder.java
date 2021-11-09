package ch03;

public class Powder extends Material {
	
	@Override
	public String toString() {
		return "재료는 powder";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 출력 합니다.");
	}
	
}
