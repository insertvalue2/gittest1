package ch03;

import java.util.Scanner;

// �ݸ� (ȣ����) 
public class MyArticle {
	
	String article; 
	WriteArticle hacker; 
	WriteArticle sbs; 
	
	// �ּҰ� ���� !!
	public MyArticle(WriteArticle hacker,  WriteArticle sbs) {
		this.hacker = hacker; 
		this.sbs = sbs; 
	}
	
	public void complete() {
		// ��ĳ�ʸ� ����ؼ� ����� �Է°��� �ް� �ݹ� �޼��带 ���� ���� �ּ���. 
		// nextLine 
		// 1. ��ĳ�� �����ϱ� 
		// 2. ����� �Է°� �ޱ� 
		// 3. �Է°��� ��� ���� article�� ��� 
		Scanner scanner = new Scanner(System.in);
		article = scanner.nextLine();
		
		hacker.printArticle(article);
		System.out.println("--------------------");
		sbs.printArticle(article);
		
	}
	
	
}








