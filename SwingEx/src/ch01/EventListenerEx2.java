package ch01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends SuperMyFrame implements ActionListener {

	JButton button1; 
	JButton button2; 
	JButton button3; 
	JButton button4; 
	JButton button5; 
	
	Color[] colors = new Color[5];
	
	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	@Override
	protected void initData() {
		setTitle("�̺�Ʈ ������ ����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		button1 = new JButton("�̺�Ʈ ��ư 1");
		button2 = new JButton("�̺�Ʈ ��ư 2");
		
	}
	
	@Override
	protected void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
	}
	
	@Override
	protected void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("��ư�� ���� �����ϴ�.");
		JButton clickedButton = (JButton)e.getSource();
		System.out.println(clickedButton.getText());
		
		// ���ڿ��� �� �ؼ� 
		// 1�� ��ư�� Ŭ�� �Ǿ����ϴ�. 
		// 2�� ��ư�� Ŭ�� �Ǿ����ϴ�.
		if(clickedButton.getText().equals(button1.getText())) {
			System.out.println("1��ư�� Ŭ�� �Ǿ����ϴ�.");
		} else {
			System.out.println("2��ư�� Ŭ�� �Ǿ����ϴ�.");
		}
	}
}


public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame2();

	}

}
