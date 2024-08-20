package Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton functionbutton = new JButton();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea(2, 10);

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();

	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton();

	JButton buttondot = new JButton();
	JButton buttonequal = new JButton();

	double number1, number2, number3, result;
	int addc = 0, mulc = 0, divc = 0, subc = 0;

	public Calculator() {
		frame.setSize(420, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calcultor Pro");
		frame.setLayout(null);
		// frame.setResizable(false);
		frame.add(panel);
		frame.add(textfield);

		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		panel.add(textarea);
		panel.setBackground(Color.blue);
		panel.add(textarea);

		Border border = BorderFactory.createLineBorder(Color.orange, 2);

		Border tborder = BorderFactory.createLineBorder(Color.darkGray, 2);

		Font font = new Font("inh Free", Font.BOLD, 30);

		textarea.setBackground(Color.BLACK);
		textarea.setBorder(tborder);
		textarea.setFont(font);
		textarea.setForeground(Color.white);
		textarea.setPreferredSize(new Dimension(1, 5));
		textarea.setLineWrap(true);

		textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);
		textfield.setFont(font);
		textfield.setEditable(false);

		button1.setPreferredSize(new Dimension(500, 500));
		button1.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\one1.png\\"));

		button2.setPreferredSize(new Dimension(500, 500));
		button2.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\two2.png\\"));

		button3.setPreferredSize(new Dimension(50, 100));
		button3.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\three3.png\\"));

		button4.setPreferredSize(new Dimension(50, 100));
		button4.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\four4.png\\"));

		button5.setPreferredSize(new Dimension(50, 100));
		button5.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\five5.png\\"));

		button6.setPreferredSize(new Dimension(50, 100));
		button6.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\six6.png\\"));

		button7.setPreferredSize(new Dimension(50, 100));
		button7.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\seven7.png\\"));

		button8.setPreferredSize(new Dimension(50, 100));
		button8.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\eight8.png\\"));

		button9.setPreferredSize(new Dimension(50, 100));
		button9.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\nine9.png\\"));

		button0.setPreferredSize(new Dimension(50, 100));
		button0.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\zero0.png\\"));

		buttondot.setPreferredSize(new Dimension(50, 100));
		buttondot.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\dot.png\\"));

		buttonsub.setPreferredSize(new Dimension(50, 100));
		buttonsub.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\sub.png\\"));

		buttonadd.setPreferredSize(new Dimension(50, 100));
		buttonadd.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\add.png\\"));
		buttondiv.setPreferredSize(new Dimension(50, 100));
		buttondiv.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\div.png\\"));
		buttonmul.setPreferredSize(new Dimension(50, 100));
		buttonmul.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\mul.png\\"));
		buttonequal.setPreferredSize(new Dimension(50, 100));
		buttonequal.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\equal.png\\"));
		buttonclear.setPreferredSize(new Dimension(50, 100));
		buttonclear.setIcon(new ImageIcon("C:\\Users\\komma\\Downloads\\Numbers\\another\\clear.png\\"));

		panel.add(button1);
		panel.add(button2);
		panel.add(buttonadd);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonsub);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonmul);
		panel.add(buttonclear);
		panel.add(buttondiv);
		panel.add(buttondot);
		panel.add(button0);
		panel.add(buttonequal);
		button0.addActionListener((ActionListener) this);
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		buttonadd.addActionListener((ActionListener) this);
		buttonclear.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttonequal.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == buttonclear) {
			number1 = 0.0;
			number2 = 0.0;
			textarea.setText("");
		}
		if (source == button1) {
			textarea.append("1");
		}
		if (source == button2) {
			textarea.append("2");
		}
		if (source == button3) {
			textarea.append("3");
		}
		if (source == button4) {
			textarea.append("4");
		}
		if (source == button5) {
			textarea.append("5");
		}
		if (source == button6) {
			textarea.append("6");
		}
		if (source == button7) {
			textarea.append("7");
		}
		if (source == button8) {
			textarea.append("8");
		}
		if (source == button9) {
			textarea.append("9");
		}
		if (source == button0) {
			textarea.append("0");
		}
		if (source == buttondot) {
			textarea.append(".");
		}
		if (source == buttonadd) {
			number1 = number_reader();
			textarea.setText("");
			addc = 1;
			divc = 0;
			subc = 0;
			mulc = 0;
		}
		if (source == buttondiv) {
			number1 = number_reader();
			textarea.setText("");
			addc = 0;
			divc = 1;
			subc = 0;
			mulc = 0;
		}
		if (source == buttonsub) {
			number1 = number_reader();
			textarea.setText("");
			addc = 0;
			divc = 0;
			subc = 1;
			mulc = 0;
		}
		if (source == buttonmul) {
			number1 = number_reader();
			textarea.setText("");
			addc = 0;
			divc = 0;
			subc = 0;
			mulc = 1;
		}
		if (source == buttonequal) {
			number2 = number_reader();
			if (addc > 0) {
				result = number1 + number2;
				textarea.setText(Double.toString(result));
			}
			if (subc > 0) {
				result = number1 - number2;
				textarea.setText(Double.toString(result));
			}
			if (mulc > 0) {
				result = number1 * number2;
				textarea.setText(Double.toString(result));
			}
			if (divc > 0) {
				result = number1 / number2;
				textarea.setText(Double.toString(result));
			}
		}
	}

	public double number_reader() {
		double num1;
		String s;
		s = textarea.getText();
		num1 = Double.valueOf(s);

		return num1;
	}

}
