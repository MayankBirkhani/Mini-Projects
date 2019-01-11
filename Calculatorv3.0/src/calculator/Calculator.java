package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	
	private JTextField txtDisplay;

	double firstnum;
	double secondnum;
	double result;
	String operations; 
	String answer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 339, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(21, 11, 289, 41);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//-------------This is for First Row-------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(23, 118, 63, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(96, 118, 63, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(169, 118, 63, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBounds(242, 118, 63, 50);
		frame.getContentPane().add(btnplus);
		
		//-----------------This is for second row------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(21, 179, 63, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(96, 179, 63, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(169, 179, 63, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(242, 179, 63, 50);
		frame.getContentPane().add(btnsub);
		
		//-----------------This is for Third row------------------------
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber=txtDisplay.getText() + btn1.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(23, 234, 63, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber=txtDisplay.getText() + btn2.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(96, 234, 63, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber=txtDisplay.getText() + btn3.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(169, 234, 63, 50);
				frame.getContentPane().add(btn3);
				
				JButton btnmul = new JButton("*");
				btnmul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="*";
					}
				});
				btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnmul.setBounds(242, 234, 63, 50);
				frame.getContentPane().add(btnmul);
		
		//-----------------This is for Fourth row------------------------
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber=txtDisplay.getText() + btn0.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(23, 295, 63, 50);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(96, 295, 63, 50);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("+-");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
						ops*=(-1);
						txtDisplay.setText(String.valueOf(ops));
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPM.setBounds(169, 295, 63, 50);
				frame.getContentPane().add(btnPM);
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="/";
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDiv.setBounds(242, 295, 63, 50);
				frame.getContentPane().add(btnDiv);	
				
			//-----------------This is for Fifth row------------------------
				JButton btnBack = new JButton("\uF0E7");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						String Backspace=null;
						if(txtDisplay.getText().length()>0)
						{
							StringBuilder strB=new StringBuilder(txtDisplay.getText());
							strB.deleteCharAt(txtDisplay.getText().length()-1);
							Backspace=strB.toString();
							txtDisplay.setText(Backspace);		
						}
					
					
					}
				});
				btnBack.setFont(new Font("Wingdings", Font.BOLD, 20));
				btnBack.setBounds(23, 63, 63, 50);
				frame.getContentPane().add(btnBack);
				
				JButton btnClear = new JButton("C");
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtDisplay.setText(null);
					}
				});
				btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnClear.setBounds(96, 63, 63, 50);
				frame.getContentPane().add(btnClear);
				
				JButton btnMod = new JButton("%");
				btnMod.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="%";
					}
				});
				btnMod.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMod.setBounds(169, 63, 63, 50);
				frame.getContentPane().add(btnMod);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						secondnum=Double.parseDouble(txtDisplay.getText());
					
						if(operations=="+")
						{
							result= firstnum + secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);
						}
						
						else if(operations=="-")
						{
							result= firstnum - secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);
						}
						
						else if(operations=="*")
						{
							result= firstnum * secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);
						}
						
						else if(operations=="/")
						{
							try {
							result= firstnum / secondnum;
							}
							catch(Exception e1) {
								txtDisplay.setText("Math Error");
							}
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);
						}
						
						else if(operations=="%")
						{
							result= firstnum % secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);
						}
						
						
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqual.setBounds(242, 63, 63, 50);
				frame.getContentPane().add(btnEqual);	
		
	}
}
