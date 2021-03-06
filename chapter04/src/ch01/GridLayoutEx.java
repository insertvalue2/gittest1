package ch01;

//import java.awt.GridLayout;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	private ArrayList<JButton> buttons = new ArrayList<>();
	private final int MAX_COUNT = 6; 
	
	
	public GridLayoutEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("GridLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		for (int i = 0; i < MAX_COUNT; i++) {
			buttons.add(new JButton( (i + 1) + ""));
		}
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(3, 2));
		
		// JFame에 더한다 
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));
		}
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
	
}




