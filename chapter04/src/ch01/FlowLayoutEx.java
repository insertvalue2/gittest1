package ch01;

 
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {

	
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	final int JBUTTONS_SIZE = 20; 
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("Flow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 10));
		
		for (int i = 0; i < JBUTTONS_SIZE; i++) {
			buttons.add(new JButton( (i + 1) + "번째 버튼"));
		}
		
	} // end of initData 
	
	private void setInitLayout() {
		setVisible(true);

		//  for문 변경
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));
		}
		
	} // end of setInitLayout
	
} // end of MyFrame2 

public class FlowLayoutEx {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
