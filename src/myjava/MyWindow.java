package myjava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow extends JFrame {

	private JPanel contentPane;
	private JTextField display;
	private String exp = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWindow frame = new MyWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		display = new JTextField();
		display.setText("0");
		display.setPreferredSize(new Dimension(280, 21));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(display);
		display.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Status");
		lblNewLabel.setPreferredSize(new Dimension(400, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "7";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("8");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "8";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "9";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "/";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_13);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "4";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "5";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "6";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_6);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "*";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_14);
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "1";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_5);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "2";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "3";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "-";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_12);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "0";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("c");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = "";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Number value = ScriptCalculator.calc(exp);
				display.setText(value.toString());
			}
		});
		panel_4.add(btnNewButton_11);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "+";
				display.setText(exp);
			}
		});
		panel_4.add(btnNewButton_15);
	}

}
