package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {

	JTextArea area;

	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}

	private void addEventListener() {

		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 위쪽 방향키 38
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					area.append("위쪽 방향키가 눌러졌습니다" + "\n");
				}
				// 아래쪽 방향키 40
				else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append("아래쪽 방향키가 눌러졌습니다" + "\n");
				}
				// 왼쪽 방향키 37
				else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append("왼쪽 방향키가 눌러졌습니다" + "\n");
				}
				// 오른쪽 방향키 39
				else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append("오른쪽 방향키가 눌러졌습니다" + "\n");
				}
			}
		});
	}
}
