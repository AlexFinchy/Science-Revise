package me.alexfinch;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	
	public static JFrame Frame = new JFrame("Science Revise");
	

	

	static JFrame reviseframe = new Revise();
	
	public static void main(String[] args) throws IOException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader(); //We need the class loader to get the image
		InputStream input = classLoader.getResourceAsStream("logo.jpg"); //Gets Logo image from files
		Image logo = ImageIO.read(input); //Reads the image and sets it to a image
		FlowLayout flow = new FlowLayout(); //Creates the flowlayout a simple layout for homepage of programme
		JButton test = new JButton("Test"); //Creates Test Button
        JButton revise = new JButton("Revise"); //Creates Revise Button
		Frame.setSize(200, 200); //Sets frame size to 200 by 200
		Frame.setIconImage(logo); //Sets icon to logo
		logo = logo.getScaledInstance(120, 120, Image.SCALE_SMOOTH); //Scales the image to fix the window
		JLabel JImage = new JLabel(new ImageIcon(logo)); //Casts the image into a Jlabel
		Frame.add(JImage); //Adds Logo
		Frame.add(revise); //Adds revise Button
		Frame.add(test); //Adds Test button
		Frame.setLayout(flow); //Sets layout to flowlayout
		Frame.setResizable(false); //Makes it not resizeable
		Frame.setLocationRelativeTo(null); //Centers
		revise.addActionListener(new ActionListener() { //Adds action listener.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				

				
				ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
				
				InputStream input = classLoader.getResourceAsStream("logo.jpg");
				
				try {
					Image logo = ImageIO.read(input);
					reviseframe.setIconImage(logo);
					reviseframe.setVisible(true);
				} catch (IOException e1) {
					System.out.println("Error file not fo und");
					e1.printStackTrace();
				}
				
                 				

				
			}
		});
		
		
		 test.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new Test();
				
				
				
				
			}
		});
		 
		 
		
		Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		Frame.setVisible(true);

		
		
		
		
		
	}

}
