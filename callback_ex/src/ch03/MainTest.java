package ch03;

public class MainTest {

	public static void main(String[] args) {
		
		// ��Ŀ ���� ��ü ���� 
		HackerNews hackerNews = new HackerNews(); 
		SbsNews sbsNews = new SbsNews();
		
		// ��� �ۼ� 1�ϳ��� ����ؼ� ������ּ��� 
		MyArticle article = new MyArticle(hackerNews, sbsNews);
		article.complete();

	}

}
