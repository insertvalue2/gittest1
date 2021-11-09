package ch03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUs extends JFrame {

	BorderLayout borderLayout;
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	ImagePanel imagePanel; 
	JPanel bottomPanel;
	JButton button1; 
	JButton button2; 
	int xPoint = 200;
	int yPoint = 200;
	
	public AmongUs() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		
		setTitle("어몽어스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1= ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		borderLayout = new BorderLayout();
		imagePanel = new ImagePanel();
		bottomPanel = new JPanel();
		button1 = new JButton("start");
		button2 = new JButton("end");
		
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(borderLayout);
		
		imagePanel.setPreferredSize(new Dimension(600, 500));
		
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		bottomPanel.add(button1);
		bottomPanel.add(button2);
		
		
		this.add(imagePanel, BorderLayout.CENTER);
//		add(bottomPanel, BorderLayout.SOUTH);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
					
				// 삼항연산자로 사용해서 코드를 작성해주세요
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					yPoint = (yPoint < 0) ? 0 : yPoint - 10;
				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint += 10;
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint -= 10;
					if (xPoint < 0) {
						xPoint = -10;
					}
					System.out.println("xPoint : " + xPoint);
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint += 10;
				}
				repaint();
			}
		});
	}

	private class ImagePanel extends JPanel {

		@Override
		protected void printComponent(Graphics g) {
			super.printComponent(g);
				
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);
			
//			g.drawImage(backgroundImage, 0, 0, getWidth(), 500, null);
//			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);

		}
	}

}
