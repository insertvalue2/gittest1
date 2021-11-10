package ch03;

public class MainTest {

	public static void main(String[] args) {
		
		// 해커 뉴스 객체 생성 
		HackerNews hackerNews = new HackerNews(); 
		SbsNews sbsNews = new SbsNews();
		
		// 기사 작성 1하나만 사용해서 만들어주세요 
		MyArticle article = new MyArticle(hackerNews, sbsNews);
		article.complete();

	}

}
