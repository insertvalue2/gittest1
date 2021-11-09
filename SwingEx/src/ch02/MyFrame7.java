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
		setTitle("Ű �̺�Ʈ ����");
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
				// ���� ����Ű 38
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					area.append("���� ����Ű�� ���������ϴ�" + "\n");
				}
				// �Ʒ��� ����Ű 40
				else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append("�Ʒ��� ����Ű�� ���������ϴ�" + "\n");
				}
				// ���� ����Ű 37
				else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append("���� ����Ű�� ���������ϴ�" + "\n");
				}
				// ������ ����Ű 39
				else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append("������ ����Ű�� ���������ϴ�" + "\n");
				}
			}
		});
	}
}
