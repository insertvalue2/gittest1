package ch04;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame4 extends JFrame {
	
	BufferedImage backgroundImage; 
	BufferedImage imageIcon; 
	//1. 3���̻� ���� ȭ�鿡 �÷� �ּ��� 
	
	// 2. �ݺ����� �κ� ���̸� �迭, ArrayList ��� 
	
	MyImagePanel myImagePanel; 
	
	// ������ 
	public MyFrame4() {
		initData();
		setInitLayout();
	}
	// initData 
	private void initData() {
		setTitle("�̹��� ��׶��� ����");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		
		// myImagePanel ���� 
		myImagePanel = new MyImagePanel();
	}
	
	// setInitLayout
	private void setInitLayout() {
		setVisible(true);
		add(myImagePanel);
	}
	
	private class MyImagePanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 80, 80, null);
			
		}
	} // end of inner class 
	
	// �����Լ� 
	public static void main(String[] args) {
		new MyFrame4();

	} // end of main 

} // end of class 
