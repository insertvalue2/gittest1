package ch03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame01 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	BufferedImage imageIcon2;
	BufferedImage imageIcon3;

	MyImagePanel imagePanel;

	BorderLayout borderLayout;

	JPanel panel2;

	JButton button1;
	JButton button2;
	JButton button3;

	int xPoint = 200;
	int yPoint = 200;

	public MyFrame01() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {

			backgroundImage = ImageIO.read(new File("back.jpg"));
			imageIcon1 = ImageIO.read(new File("timo2.png"));
			imageIcon2 = ImageIO.read(new File("garen2.png"));
			imageIcon3 = ImageIO.read(new File("image3.png"));

		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);
		}

		imagePanel = new MyImagePanel();
		borderLayout = new BorderLayout();
		panel2 = new JPanel();

		button1 = new JButton("티모");
		button2 = new JButton("가렌");
		button3 = new JButton("럭스");
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(imagePanel);

		panel2.setBackground(Color.BLACK);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

		panel2.setPreferredSize(new Dimension(500, 100));
		add(panel2, borderLayout.SOUTH);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
	}
	
	  
	private void addEventListener() {
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				xPoint = e.getX();
				yPoint = e.getY();
				
				repaint();
			}
		});
		
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("e : " + e.getKeyCode());
				int keyCode = e.getKeyCode();

				switch (keyCode) {
				case KeyEvent.VK_UP:
					yPoint = (yPoint < 0) ? 0 : yPoint - 10;
					break;
				case KeyEvent.VK_LEFT:
					xPoint = (xPoint < 0) ? -10 : (xPoint > 500) ? 500 : xPoint;
					break;
				case KeyEvent.VK_RIGHT:
					xPoint = (xPoint < 0) ? -10 : (xPoint > 430) ? 430 : xPoint;
					break;
				case KeyEvent.VK_DOWN:
					yPoint = (yPoint < 0) ? -10 : (yPoint > 400) ? 400 : yPoint;
					break;
				default:
					break;
				}
				repaint(); // 다시 그림을 그려라
			}
		});
	}

	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 400, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 150, 150, null);
			g.drawImage(imageIcon2, 150, 150, 150, 150, null);
			g.drawImage(imageIcon3, 200, 100, 150, 150, null);

		}

	}

}
