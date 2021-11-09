package ch09;

public class NumberPrinter {
	
	private int id; 
	private int waitNumber  = 1; 
	
	public NumberPrinter(int id) {
		this.id = id; 
	}
	
	// 번호표를 찍어 주세요 
	public void printWaitNumber() {
		System.out.println(id + " 기기의 대기순번 : " + waitNumber);
		waitNumber++; 
	}
	
	
}
