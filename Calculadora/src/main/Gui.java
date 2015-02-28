package main;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JTextField;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.HeadlessException;
import java.awt.Insets;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.SwingConstants;

public class Gui extends JFrame {
	private JTextField display;
	private String operation = "";
	private float lastValue = 0;

	/**
	 * @return the display
	 */
	public JTextField getDisplay() {
		return display;
	}

	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * @return the lastValue
	 */
	public float getLastValue() {
		return lastValue;
	}

	/**
	 * @param lastValue the lastValue to set
	 */
	public void setLastValue(int lastValue) {
		this.lastValue = lastValue;
	}

	/**
	 * @param lastValue
	 * @throws HeadlessException
	 */
	public Gui(int lastValue) throws HeadlessException {
		super();
		this.lastValue = lastValue;
	}

	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));

		display = new JTextField();
		display.setText("0");
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("Tahoma", Font.PLAIN, 20));
		display.setEditable(false);
		panel.add(display);
		display.setColumns(10);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		getContentPane().add(panel_1, gbc_panel_1);

		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {30, 50, 50, 50, 30, 30, 0};
		gbl_panel_1.rowHeights = new int[] { 23, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0};
		panel_1.setLayout(gbl_panel_1);

		JButton button_7 = new JButton("7");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.anchor = GridBagConstraints.CENTER;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 1;
		gbc_button_7.gridy = 0;
		panel_1.add(button_7, gbc_button_7);

		JButton button_8 = new JButton("8");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.anchor = GridBagConstraints.CENTER;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 2;
		gbc_button_8.gridy = 0;
		panel_1.add(button_8, gbc_button_8);

		JButton button_9 = new JButton("9");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.anchor = GridBagConstraints.CENTER;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 3;
		gbc_button_9.gridy = 0;
		panel_1.add(button_9, gbc_button_9);

		JButton button_cls = new JButton("CLS");
		button_cls.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_button_cls = new GridBagConstraints();
		gbc_button_cls.anchor = GridBagConstraints.EAST;
		gbc_button_cls.insets = new Insets(0, 0, 5, 5);
		gbc_button_cls.gridx = 5;
		gbc_button_cls.gridy = 0;
		panel_1.add(button_cls, gbc_button_cls);

		JButton button_4 = new JButton("4");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.anchor = GridBagConstraints.CENTER;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 1;
		gbc_button_4.gridy = 1;
		panel_1.add(button_4, gbc_button_4);

		JButton button_5 = new JButton("5");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.anchor = GridBagConstraints.CENTER;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 2;
		gbc_button_5.gridy = 1;
		panel_1.add(button_5, gbc_button_5);

		JButton button_6 = new JButton("6");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.anchor = GridBagConstraints.CENTER;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 3;
		gbc_button_6.gridy = 1;
		panel_1.add(button_6, gbc_button_6);
		
		JButton button_mult = new JButton("*");
		GridBagConstraints gbc_button_mult = new GridBagConstraints();
		gbc_button_mult.anchor = GridBagConstraints.EAST;
		gbc_button_mult.insets = new Insets(0, 0, 5, 5);
		gbc_button_mult.gridx = 4;
		gbc_button_mult.gridy = 1;
		panel_1.add(button_mult, gbc_button_mult);
		
		JButton button_div = new JButton("/");
		GridBagConstraints gbc_button_div = new GridBagConstraints();
		gbc_button_div.anchor = GridBagConstraints.EAST;
		gbc_button_div.insets = new Insets(0, 0, 5, 5);
		gbc_button_div.gridx = 5;
		gbc_button_div.gridy = 1;
		panel_1.add(button_div, gbc_button_div);

		JButton button_1 = new JButton("1");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.CENTER;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 2;
		panel_1.add(button_1, gbc_button_1);

		JButton button_2 = new JButton("2");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.CENTER;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 2;
		panel_1.add(button_2, gbc_button_2);

		JButton button_3 = new JButton("3");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.anchor = GridBagConstraints.CENTER;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 2;
		panel_1.add(button_3, gbc_button_3);

		JButton button_add = new JButton("+");
		GridBagConstraints gbc_button_add = new GridBagConstraints();
		gbc_button_add.anchor = GridBagConstraints.EAST;
		gbc_button_add.insets = new Insets(0, 0, 5, 5);
		gbc_button_add.gridx = 4;
		gbc_button_add.gridy = 2;
		panel_1.add(button_add, gbc_button_add);

		JButton button_subs = new JButton("-");
		GridBagConstraints gbc_button_subs = new GridBagConstraints();
		gbc_button_subs.anchor = GridBagConstraints.EAST;
		gbc_button_subs.insets = new Insets(0, 0, 5, 5);
		gbc_button_subs.gridx = 5;
		gbc_button_subs.gridy = 2;
		panel_1.add(button_subs, gbc_button_subs);

		JButton button_0 = new JButton("0");
		GridBagConstraints gbc_button_0 = new GridBagConstraints();
		gbc_button_0.anchor = GridBagConstraints.CENTER;
		gbc_button_0.insets = new Insets(0, 0, 5, 5);
		gbc_button_0.gridx = 2;
		gbc_button_0.gridy = 3;
		panel_1.add(button_0, gbc_button_0);

		JButton button_equal = new JButton("=");
		GridBagConstraints gbc_button_equal = new GridBagConstraints();
		gbc_button_equal.anchor = GridBagConstraints.EAST;
		gbc_button_equal.insets = new Insets(0, 0, 5, 5);
		gbc_button_equal.gridx = 5;
		gbc_button_equal.gridy = 3;
		panel_1.add(button_equal, gbc_button_equal);
		
		//BUTTON LISTENERS
		button_cls.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("0");
				
			}
		});
		
		button_add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setLastValue(Integer.parseInt(getDisplay().getText()));
				setOperation("+");
			}
		});
		
		button_subs.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setLastValue(Integer.parseInt(getDisplay().getText()));
				setOperation("-");
			}
		});
		
		button_mult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setLastValue(Integer.parseInt(getDisplay().getText()));
				setOperation("*");
			}
		});
		
		button_div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setLastValue(Integer.parseInt(getDisplay().getText()));
				setOperation("/");
			}
		});
		
		button_equal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(getOperation().equals("+")){
					getDisplay().setText(getLastValue()+Integer.parseInt(getDisplay().getText())+"");
				}
				if(getOperation().equals("-")){
					getDisplay().setText(getLastValue()-Integer.parseInt(getDisplay().getText())+"");
				}
				if(getOperation().equals("*")){
					getDisplay().setText(getLastValue()*Integer.parseInt(getDisplay().getText())+"");
				}
				if(getOperation().equals("/")){
					getDisplay().setText(getLastValue()/Integer.parseInt(getDisplay().getText())+"");
				}
			}
		});
		
		button_0.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("0");
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("1");
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("2");
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("3");
			}
		});
		
		button_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("4");
			}
		});
		
		button_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("5");
			}
		});
		
		button_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("6");
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("7");
			}
		});
		
		button_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("8");
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getDisplay().setText("9");
			}
		});
	}

}
