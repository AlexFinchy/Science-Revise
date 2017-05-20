package me.alexfinch;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.OptionPaneUI;

import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventTarget;

public class Revise extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	public Revise() {
		
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				Main.Frame.setVisible(false);
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// Not used
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// Not used
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// Not used
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				int reply = JOptionPane.showConfirmDialog(null, "Do you want to quit to main menu?", "Do you want to quit?", JOptionPane.YES_NO_OPTION);
				
				if(reply == JOptionPane.YES_OPTION) {
					dispose();
					Main.Frame.setVisible(true);
				} else {
					
				}

			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// Not used
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// Not used
				
			}
		});
		
		
		

		
		
		
		
		Button exit = new Button("Exit");
		
		 exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int reply = JOptionPane.showConfirmDialog(null, "Do you want to quit to main menu?", "Do you want to quit?", JOptionPane.YES_NO_OPTION);
				
				if(reply == JOptionPane.YES_OPTION) {
					dispose();
					Main.Frame.setVisible(true);
				} else {
					
				}
				
			}
		});
		
		 
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		add(new Periodictable());
		setLocationRelativeTo(null);		
				
		
	}
	
	
}




