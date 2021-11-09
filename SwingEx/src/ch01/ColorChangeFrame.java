package ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyFrame implements ActionListener {

	final static int COUNT = 5;

	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;

	ArrayList<JButton> buttonList = new ArrayList<>();
	ArrayList<String> colorList = new ArrayList<>(); // ����� �ʱ�ȭ ����

	Color[] color = { Color.red, Color.orange, Color.yellow, Color.green, Color.blue };
	String[] stringColor = { "������", "��Ȳ��", "�����", "�ʷϻ�", "�Ķ���" };
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
		
	}

	@Override
	protected void initData() {
		super.initData();
		setTitle("�̺�Ʈ ������ ����3");
		setSize(500, 500);
		borderLayout = new BorderLayout();

		panel1 = new JPanel();
		panel2 = new JPanel();

		for (int i = 0; i < COUNT; i++) {
			colorList.add(stringColor[i]);
		}

		for (int i = 0; i < COUNT; i++) {
			buttonList.add(new JButton(colorList.get(i)));
		}
	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		setLayout(borderLayout);

		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500, 400));
		add(panel1, BorderLayout.NORTH);

		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500, 100));
		add(panel2);

		// for 
		for (int i = 0; i < COUNT; i++) {
			panel2.add(buttonList.get(i));
		}

	}

	@Override
	protected void addEventListener() {
		super.addEventListener();

		for (int i = 0; i < COUNT; i++) {
			buttonList.get(i).addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();

		for (int i = 0; i < COUNT; i++) {
			if (clickedButton.getText().equals(stringColor[i])) {
				panel1.setBackground(color[i]);
			}
		}

	}

//	BorderLayout borderLayout;
//	JPanel panel1;
//	JPanel panel2;
//	JButton button1;
//	JButton button2;
//	
//	
//	
//	public ColorChangeFrame() {
//		initData();
//		setInitLayout();
//		addEventListener();
//	}
//
//	@Override
//	protected void initData() {
//		super.initData();
//		setTitle("�̺�Ʈ ������ ���� 3");
//		setSize(500, 500);
//		borderLayout = new BorderLayout();
//
//		panel1 = new JPanel();
//		panel2 = new JPanel();
//
//		button1 = new JButton("������");
//		button2 = new JButton("�����");
//	}
//
//	@Override
//	protected void setInitLayout() {
//		super.setInitLayout();
//		setLayout(borderLayout);
//
//		panel1.setBackground(Color.gray);
//		panel1.setPreferredSize(new Dimension(500, 400));
//		add(panel1, BorderLayout.NORTH);
//
//		panel2.setBackground(Color.white);
//		panel2.setLayout(new FlowLayout());
//		panel2.setPreferredSize(new Dimension(500, 100));
//		add(panel2);
//
//		panel2.add(button1);
//		panel2.add(button2);
//	}
//
//	@Override
//	protected void addEventListener() {
//		super.addEventListener();
//		button1.addActionListener(this);
//		button2.addActionListener(this);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		// 1 ��ư�̴��� ������ panal1 ������ ���������� ���� 
//		// 2 ��ư�� ���� ������ panal1 ������ ��������� ���� 
//		JButton button = (JButton)e.getSource();
//		if(button.getText().equals(button1.getText())) {
//			panel1.setBackground(Color.red);
//		} else {
//			panel1.setBackground(Color.yellow);
//		}
//	}

	// �����Լ�
	public static void main(String[] args) {
		new ColorChangeFrame();
	}



} // end of class
