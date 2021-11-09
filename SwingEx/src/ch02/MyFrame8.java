package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 백그라운 연습2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
//			imageIcon1 = ImageIO.read(new File("among1.png"));
//			imageIcon1 = ImageIO.read(new File("temp1.gif"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);
		}

		imagePanel = new MyImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(imagePanel);
	}
	
	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();

				switch (keyCode) {
				case KeyEvent.VK_UP:
					yPoint -= 10;
					yPoint = (yPoint < 0) ? -10 : (yPoint > 400) ? 400 : yPoint;
					break;
				case KeyEvent.VK_LEFT:
					xPoint -= 10;
					xPoint = (xPoint < 0) ? -10 : (xPoint > 500) ? 500 : xPoint;
					break;
				case KeyEvent.VK_RIGHT:
					xPoint += 10;
					xPoint = (xPoint < 0) ? -10 : (xPoint > 430) ? 430 : xPoint;
					break;
				case KeyEvent.VK_DOWN:
					yPoint += 10;
					yPoint = (yPoint < 0) ? -10 : (yPoint > 400) ? 400 : yPoint;
					break;

				default:
					break;
				}
				repaint();
			}
		});
	}


//	private void addEventListener() {
//		this.addKeyListener(new KeyAdapter() {
//
//			@Override
//			public void keyPressed(KeyEvent e) {
//
//				// 삼항연산자로 사용해서 코드를 작성해주세요
//				int keyCode = e.getKeyCode();
//				if (keyCode == KeyEvent.VK_UP) {
//					yPoint = (yPoint < 0) ? 0 : yPoint - 10;
//				} else if (keyCode == KeyEvent.VK_DOWN) {
//					yPoint += 10;
//				} else if (keyCode == KeyEvent.VK_LEFT) {
//					xPoint -= 10;
//					if (xPoint < 0) {
//						xPoint = -10;
//					}
//					System.out.println("xPoint : " + xPoint);
//				} else if (keyCode == KeyEvent.VK_RIGHT) {
//					xPoint += 10;
//				}
//
//				repaint();
//
//			} // end of keyPressed
//
//		});
//	}

	// 내부 클래스
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);
		}
	}

} // end of class
