package ch03;

import java.util.Scanner;

// 콜리 (호출자) 
public class MyArticle {
	
	String article; 
	WriteArticle hacker; 
	WriteArticle sbs; 
	
	// 주소값 연결 !!
	public MyArticle(WriteArticle hacker,  WriteArticle sbs) {
		this.hacker = hacker; 
		this.sbs = sbs; 
	}
	
	public void complete() {
		// 스캐너를 사용해서 사용자 입력값을 받고 콜백 메서드를 실행 시켜 주세요. 
		// nextLine 
		// 1. 스캐너 선언하기 
		// 2. 사용자 입력값 받기 
		// 3. 입력값을 멤버 변수 article에 담기 
		Scanner scanner = new Scanner(System.in);
		article = scanner.nextLine();
		
		hacker.printArticle(article);
		System.out.println("--------------------");
		sbs.printArticle(article);
		
	}
	
	
}








