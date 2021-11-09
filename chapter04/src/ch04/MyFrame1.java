package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame {

	MyPanel myPanel;

	// 생성자
	public MyFrame1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
	}

	// 내부 클래스, static (정적 내부 클래스), (인스턴스 , 내부 클래스)  
	static class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			g.drawLine(300, 100, 200, 200);
			g.drawRect(200, 200, 200, 200);
			g.drawLine(300, 100, 400, 200);
		}
	}

	// 메인함수 작성
	public static void main(String[] args) {
		new MyFrame1();
	}

}
