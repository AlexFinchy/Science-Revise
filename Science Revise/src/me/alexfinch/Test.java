package me.alexfinch;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Test extends JFrame {

	public static Boolean TestActive = false;
	
	public static int Score;
	
	public static int QuestionNumber = 0;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static JFrame Frame;
	
	public Test() {

	Frame = this;	

		
		
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				Main.Frame.setVisible(false);
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				
					
					int reply = JOptionPane.showConfirmDialog(null, "Do you want to quit to main menu?", "Do you want to quit?", JOptionPane.YES_NO_OPTION);
					
					if(reply == JOptionPane.YES_OPTION) {
						dispose();
						
						Main.Frame.setVisible(true);
					}
				
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		//So i can test Login
		
		
		GridBagLayout gridbagLayout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(gridbagLayout);
		setSize(500,600);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JButton starttest = new JButton("Start Test");
		add(starttest, c);
				
		
		starttest.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				TestStarted();
				
				
				
				
				
				
				
				
			}
		});
				
		
		
		
	}
	
	
	
	public static void Login() {
		
		GridBagLayout gridbagLayout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		JFrame login = new JFrame("Login");
		
		
		
		login.setLayout(gridbagLayout);
		login.setSize(300,200);
		login.setLocationRelativeTo(null);
		login.setVisible(true);
		
		JTextField username = new JTextField(10);
		JPasswordField password = new JPasswordField(10);
		JButton Login = new JButton("Login");
		
		login.add(username, c);
		c.gridy = 1;
		login.add(password, c);
		c.gridy = 2;
		login.add(Login, c);
		

		
		
		
	}
	
	public static void TestStarted() {
		

		
		if(TestActive) {
			
		} else {
			
			TestActive = true;
			
			Score = 0;
			
			final JFrame TestFrame = new JFrame("Test");
			
			TestFrame.setSize(400, 200);
			
			TestFrame.setLocationRelativeTo(null);
			
			TestFrame.setVisible(true);

			
			
			
			
			
			
			
			
			NextQuestion(TestFrame);
			
			

		}
		
		
		

		
		
		
		
		
		
	}
	
	public static void NextQuestion(final JFrame TestFrame) {
		QuestionNumber ++;
		
		switch (QuestionNumber) {
		case 1:
			
			TestFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			TestFrame.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							TestFrame.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			Question1(TestFrame);
			
			
			break;
		case 2:
			TestFrame.dispose();
			
			final JFrame newframe = new JFrame("Question " + QuestionNumber);
			newframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			newframe.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							newframe.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			Question2(newframe);
			break;
		case 3:
			
			TestFrame.dispose();
			final JFrame newframe1 = new JFrame("Question " + QuestionNumber);
			newframe1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			newframe1.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							newframe1.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			Question3(newframe1);
			
			break;
		case 4:
			TestFrame.dispose();
			final JFrame newframe2 = new JFrame("Question " + QuestionNumber);
			newframe2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			newframe2.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							newframe2.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			
			
			Question4(newframe2);
			break;
		case 5:
			TestFrame.dispose();
			final JFrame newframe3 = new JFrame("Question " + QuestionNumber);
			newframe3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			
			newframe3.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							newframe3.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			
			Question5(newframe3);
			
			
			
			break;
		case 6:
			TestFrame.dispose();
			final JFrame newframe4 = new JFrame("Question " + QuestionNumber);
			newframe4.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			
			newframe4.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							newframe4.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			
			Question6(newframe4);
			break;
		case 7:
			TestFrame.dispose();
			final JFrame newframe5 = new JFrame("Question " + QuestionNumber);
			newframe5.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			newframe5.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							newframe5.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			
			
			Question7(newframe5);
			break;
		case 8:
			TestFrame.dispose();
			final JFrame newframe6 = new JFrame("Question " + QuestionNumber);
			newframe6.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			Question8(newframe6);
			
			newframe6.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							newframe6.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			
			break;
		case 9:
			
			
			
			
			
			TestFrame.dispose();
			final JFrame newframe7 = new JFrame("Question " + QuestionNumber);
			newframe7.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			
			newframe7.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							newframe7.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			Question9(newframe7);
			break;	
		case 10:
			
			
			TestFrame.dispose();
			final JFrame newframe8 = new JFrame("Question " + QuestionNumber);
			newframe8.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			
			newframe8.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {
					Frame.setVisible(false);
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					if(TestActive) {
						int reply = JOptionPane.showConfirmDialog(null, "Leaving the test early will delete all progress are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							newframe8.dispose();
							
							TestActive = false;
							Score = 0;
							QuestionNumber = 0;
							
							Frame.setVisible(true);
							
						} else {
							
						}
					}

					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			Question10(newframe8);
			break;
				

		default:
			break;
		}
		
		
	}
	
	public static void Question1(final JFrame TestFrame) {
		
		GridLayout layout = new GridLayout(0,1);
		//Question 1
		Random rnd = new Random();
		
		int number = rnd.nextInt(4 - 1 + 1) + 1;
		
		
		TestFrame.setLayout(layout);

		TestFrame.setTitle("Question 1");
		TestFrame.setResizable(false);
		
		JLabel question = new JLabel();
		
		final JCheckBox Element1 = new JCheckBox();
		
		final JCheckBox Element2 = new JCheckBox();
		
		ButtonGroup bg1 = new ButtonGroup( );
		
		JButton Submit = new JButton("Submit");
		
		bg1.add(Element1);
		
		bg1.add(Element2);
		
		TestFrame.add(question);
		
		TestFrame.add(Element1);
		
		TestFrame.add(Element2);
		
		TestFrame.add(Submit);
		
		
		switch (number) {
		case 1:
			question.setText("Which is more reactive Hydrogen or Helium?" );
			
			Element1.setText("Helium");
			
			Element2.setText("Hydrogen");
			
			Submit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(Element1.isSelected() | Element2.isSelected() ) {
						if(Element2.isSelected()) {
							Score ++;
							JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						} else {
							JOptionPane.showMessageDialog(TestFrame, "Incorrect, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						}
						

					} else {
						JOptionPane.showMessageDialog(TestFrame, "Please Select a Answer");
					}
					
				}
			});
			
			break;
		case 2:
			question.setText("Which is more reactive Francinium or Lithium?" );
			
			Element1.setText("Francinium");
			
			Element2.setText("Lithium");
			
			Submit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(Element1.isSelected() | Element2.isSelected() ) {
						if(Element1.isSelected()) {
							Score ++;
							JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						} else {
							JOptionPane.showMessageDialog(TestFrame, "Incorrect, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						}
						

					} else {
						JOptionPane.showMessageDialog(TestFrame, "Please Select a Answer");
					}
					
				}
			});
			
			
			break;
			
		case 3:
			question.setText("Which is more reactive Neon or Sulfur?" );
			
			Element1.setText("Neon");
			
			Element2.setText("Sulfur");
			
			Submit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(Element1.isSelected() | Element2.isSelected() ) {
						if(Element2.isSelected()) {
							Score ++;
							JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						} else {
							
							JOptionPane.showMessageDialog(TestFrame, "Incorrect, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						}
						

					} else {
						JOptionPane.showMessageDialog(TestFrame, "Please Select a Answer");
					}
				}
			});
			
			
			break;
			
		case 4:
			question.setText("Which is more reactive Neon or Sodium?" );
			
			Element1.setText("Neon");
			
			Element2.setText("Sodium");
			
			Submit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(Element1.isSelected() | Element2.isSelected() ) {
						if(Element2.isSelected()) {
							Score ++;
							JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						} else {
							JOptionPane.showMessageDialog(TestFrame, "Incorrect, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						}
						

					} else {
						JOptionPane.showMessageDialog(TestFrame, "Please Select a Answer");
					}
					
					
				}
			});
			
			
			break;
			
		
		default:
			break;
		}
	}
	public static void Question2(final JFrame TestFrame) {
		
		GridBagLayout layout = new GridBagLayout();
		FlowLayout flow = new FlowLayout();
		TestFrame.setSize(400, 150);
		TestFrame.setLayout(flow);
		TestFrame.setLocationRelativeTo(null);
		TestFrame.setResizable(false);
		GridBagConstraints c = new GridBagConstraints();
		JLabel Question = new JLabel();

		JButton Submit = new JButton("Submit");
		
		final JCheckBox Element1 = new JCheckBox();
		Element1.setHorizontalTextPosition(SwingConstants.LEFT);
		final JCheckBox Element2 = new JCheckBox();
		Element2.setHorizontalTextPosition(SwingConstants.LEFT);
		final JCheckBox Element3 = new JCheckBox();
		Element3.setHorizontalTextPosition(SwingConstants.LEFT);
		final JCheckBox Element4 = new JCheckBox();
		Element4.setHorizontalTextPosition(SwingConstants.LEFT);
		final JCheckBox Element5 = new JCheckBox();
		Element5.setHorizontalTextPosition(SwingConstants.LEFT);
		ButtonGroup group = new ButtonGroup();
		
		
		
		group.add(Element1);
		group.add(Element2);
		group.add(Element3);
		group.add(Element4);
		group.add(Element5);
		TestFrame.add(Question);
		TestFrame.add(Element1);
		TestFrame.add(Element2);
		TestFrame.add(Element3);
		TestFrame.add(Element4);
		TestFrame.add(Element5);
		TestFrame.add(Submit);
		TestFrame.setVisible(true);
		
		Random rnd = new Random();
		
		int Number = rnd.nextInt(4 - 1 + 1) + 1;
		Number = 1;
		switch (Number) {
		case 1:
			
			
			Question.setText("<html><h2>What is the odd element out in this list?<h2/><html/>");
			Element1.setText("Lithium");
			Element2.setText("Sodium");
			Element3.setText("Sulfur");
			Element4.setText("Rubidum");
			Element5.setText("Caesium");
			
			Submit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(Element1.isSelected() | Element2.isSelected() | Element3.isSelected() | Element4.isSelected() | Element5.isSelected()) {
						if(Element3.isSelected()) {
							Score ++;
							JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						} else {
							JOptionPane.showMessageDialog(TestFrame, "Incorrect, Score is " + String.valueOf(Score) );
							NextQuestion(TestFrame);
						}
						

					} else {
						JOptionPane.showMessageDialog(TestFrame, "Please Select a Answer");
					}
					
				}
			});
			
			
			
			
			
			break;
		case 2:
			
			break;	
		case 3:
			
			break;
		case 4:
			
			break;	
		default:
			break;
		}
		
	}
	public static void Question3(final JFrame TestFrame) {
		TestFrame.setSize(350,350);
		FlowLayout flow = new FlowLayout();
		TestFrame.setLayout(flow);
		TestFrame.setResizable(false);
		
		JLabel Question = new JLabel(); //Creates The Question Label
		

		
		Question.setText("Click the atomic structure for Argon");
		
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader(); //Class loader :)
		
		InputStream Element1Image = classLoader.getResourceAsStream("carbon.jpg");
		
		InputStream Element2Image = classLoader.getResourceAsStream("argon.jpg");
		
		InputStream Element3Image = classLoader.getResourceAsStream("magnesium.png");
		
		InputStream Element4Image = classLoader.getResourceAsStream("boron.png");
		
		
		
		try {
			Image ImageElement1 = ImageIO.read(Element1Image);
			
			ImageElement1 = ImageElement1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
			
			ImageIcon ImageIconElement1 = new ImageIcon(ImageElement1);
			
			Image ImageElement2 = ImageIO.read(Element2Image);
			
			ImageElement2 = ImageElement2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
			
			ImageIcon ImageIconElement2 = new ImageIcon(ImageElement2);
			
			Image ImageElement3 = ImageIO.read(Element3Image);
			
			ImageElement3 = ImageElement3.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
			
			ImageIcon ImageIconElement3 = new ImageIcon(ImageElement3);
			
			Image ImageElement4 = ImageIO.read(Element4Image);
			
			ImageElement4 = ImageElement4.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
			
			ImageIcon ImageIconElement4 = new ImageIcon(ImageElement4);
			
			
			
			JLabel Element1 = new JLabel(ImageIconElement1); //Creates Element Lables
			final JLabel Element2 = new JLabel(ImageIconElement2);
			JLabel Element3 = new JLabel(ImageIconElement3);
			JLabel Element4 = new JLabel(ImageIconElement4);
			
			TestFrame.add(Question);
			TestFrame.add(Element1);
			TestFrame.add(Element2);
			TestFrame.add(Element3);
			TestFrame.add(Element4);
			
			Element1.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					JOptionPane.showMessageDialog(TestFrame, "Incorrect, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
				}
			});
			
			
			Element2.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					Score ++;
					JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
					
				}
			});
			
			Element3.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					JOptionPane.showMessageDialog(TestFrame, "Incorrect, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
					
				}
			});
			
			
			Element4.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					JOptionPane.showMessageDialog(TestFrame, "Incorrect, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
					
				}
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		TestFrame.setLocationRelativeTo(null);
		
		TestFrame.setVisible(true);
		
		
		
		
	}
	public static void Question4(final JFrame TestFrame) {
		
		GridBagLayout layout = new GridBagLayout() ;
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel Question = new JLabel();
		TestFrame.setLayout(layout);
		TestFrame.setSize(200,200);
		TestFrame.setResizable(false);
		
		
		Question.setText("Name a Element in group 1");
		
		final JTextField Input = new JTextField();
		

		
		JButton Submit = new JButton();
		
		Submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String InputText = Input.getText();
				
				if(InputText.equalsIgnoreCase("lithium")) {
					Score ++;
					JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
				} else if(InputText.equalsIgnoreCase("sodium")) {
					Score ++;
					JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
				} else if(InputText.equalsIgnoreCase("potassium")) {
					Score ++;
					JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
				} else if(InputText.equalsIgnoreCase("rubidium")) {
					Score ++;
					JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
				} else if(InputText.equalsIgnoreCase("caesium")) {
					Score ++;
					JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
				} else if(InputText.equalsIgnoreCase("francinum")) {
					Score ++;
					JOptionPane.showMessageDialog(TestFrame, "Correct, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
				} else {
					JOptionPane.showMessageDialog(TestFrame, "Incorrect, Score is " + String.valueOf(Score) );
					NextQuestion(TestFrame);
				}
				
			}
		});
		
		c.gridx = 0;
		c.weightx = 0;
		c.weighty = 0;
		TestFrame.add(Question, c);
		TestFrame.add(Input, c);
		TestFrame.add(Submit, c);
		
		TestFrame.setLocationRelativeTo(null);
		
		TestFrame.setVisible(true);
		
	}
	public static void Question5(final JFrame TestFrame) {
	}
	public static void Question6(final JFrame TestFrame) {
	}
	public static void Question7(final JFrame TestFrame) {
	}
	public static void Question8(final JFrame TestFrame) {
	}
	public static void Question9(final JFrame TestFrame) {
	}
	public static void Question10(final JFrame TestFrame) {
	}
	
	
	
}
