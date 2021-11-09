package ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class ImagePanel extends JPanel {

	// Ctrl + Shift + O
	private Image image;
	// 멤버변수 선언 이미지명을 받는 녀석 
	
	public ImagePanel(String imagName) {
		image = new ImageIcon(imagName).getImage(); 
	}
	
	public ImagePanel() {
		image = new ImageIcon("image1.jpg").getImage();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
	
}
/////////////////////////////////////////////////////////


public class MyFrame3 extends JFrame {
	
	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;
	private JButton button; 
	// 추가 
	// 수정 
	public MyFrame3() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("Jpanel 에 이미지 넣기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		imagePanel2 = new ImagePanel("image1.jpg");
		button = new JButton("버튼입니다.");
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 1));
		add(imagePanel); 
		add(imagePanel2);
		
		imagePanel.add(button);
	}
	
	public static void main(String[] args) {
		new MyFrame3();
	}// end of main
	
} // end of class 






