package me.alexfinch;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class Periodictable extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	public Periodictable() {
		
		
		Button exit = new Button("Exit");
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				java.awt.Toolkit.getDefaultToolkit().beep();
				int reply = JOptionPane.showConfirmDialog(null, "Do you want to quit to main menu?", "Do you want to quit?", JOptionPane.YES_NO_OPTION);
				
				if(reply == JOptionPane.YES_OPTION) {
					Main.reviseframe.dispose();
					
					Main.Frame.setVisible(true);
					
				} else {
					
				}
				
			}
		});
		

		
		
		List<JButton> buttonlist = new ArrayList<JButton>();
		
		//Group 1 Elements
		
		final List<JButton> Group1Elements = new ArrayList<JButton>();
		
		final JLabel Group1 = new JLabel("<html> <h1>1<h1/> <html/>");

		JButton Lithium = new JButton("<html> Li <center> <small> 7 <br> 3<small/> <center/> <html/> ");
		JButton Sodium = new JButton("<html> Na <center> <small> 23<br> 11<small/> <center/> <html/> ");
		JButton Potassium = new JButton("<html>K<center><small> 39 <br> 19<small/> <center/> <html/> ");
		JButton Rubidium = new JButton("<html>Rb<center><small> 85 <br> 37<small/> <center/> <html/> ");
		JButton Caesium = new JButton("<html>Cs<center><small> 133 <br> 55<small/> <center/> <html/> ");
		JButton Francium = new JButton("<html>Fr<center><small> [223] <br> 87<small/> <center/> <html/> ");
		Group1Elements.add(Lithium);
		Group1Elements.add(Sodium);
		Group1Elements.add(Potassium);
		Group1Elements.add(Rubidium);
		Group1Elements.add(Caesium);
		Group1Elements.add(Francium);
		
		//Group 2 Elements
		final JLabel Group2 = new JLabel("<html> <h1>2<h1/> <html/>");
		List<JButton> Group2Elements = new ArrayList<JButton>();
		JButton Beryllium = new JButton("<html> <center> Be <center> <small> 9 <br> 4<small/> <center/> <html/> ");
		JButton Magnesium = new JButton("<html><center>  Mg <center> <small> 24<br> 12<small/> <center/> <html/> ");
		JButton Calcium = new JButton("<html> <center> Ca <center><small> 40 <br> 20<small/> <center/> <html/> ");
		JButton Strontium = new JButton("<html><center>  Sr <center><small> 88 <br> 38<small/> <center/> <html/> ");
		JButton Barium = new JButton("<html> <center> Ba <center><small> 137 <br> 56<small/> <center/> <html/> ");
		JButton Radium = new JButton("<html> <center> Ra <center><small> [226] <br> 88<small/> <center/> <html/> ");
		//Group 3 Elements
		JButton Scandium = new JButton("<html> <center> Sc <center> <small> 45 <br> 21<small/> <center/> <html/> ");
		JButton Yttrium = new JButton("<html> <center> Y <center> <small> 89<br> 39<small/> <center/> <html/> ");
		JButton Lanthanum = new JButton("<html><center>  La <center><small> 139 <br> 57<small/> <center/> <html/> ");
		JButton Actinum = new JButton("<html><center>  Ac <center><small> [227] <br> 89<small/> <center/> <html/> ");
		//TODO this is a lot of elements poor you Alex!
		JButton Titanium = new JButton("<html><center>  Ti <center> <small> 48 <br> 22<small/> <center/> <html/> ");
		JButton Zirconium = new JButton("<html> <center> Zr <center> <small> 91<br> 40<small/> <center/> <html/> ");
		JButton Hafnium = new JButton("<html> <center> Hf <center><small> 178 <br> 72<small/> <center/> <html/> ");
		JButton Rutherfordium = new JButton("<html> Rf <center><small> [261] <br> 104<small/> <center/> <html/> ");
		
		JButton Vanadium = new JButton("<html> <center> V <center> <small> 51 <br> 23<small/> <center/> <html/> ");
		JButton Niobium = new JButton("<html> <center> Nb <center> <small> 93<br> 41<small/> <center/> <html/> ");
		JButton Tantalum = new JButton("<html> <center> Ta <center><small> 181 <br> 73<small/> <center/> <html/> ");
		JButton Dubnium = new JButton("<html> <center> Db <center><small> [268] <br> 105<small/> <center/> <html/> ");
		
		JButton Chromium = new JButton("<html><center>  Cr <center> <small> 52 <br> 24<small/> <center/> <html/> ");
		JButton Molybdenum = new JButton("<html><center>  Mo <center> <small> 96<br> 42<small/> <center/> <html/> ");
		JButton Tungsten = new JButton("<html> W <center> <center><small> 184 <br> 74<small/> <center/> <html/> ");
		JButton Seaborgium = new JButton("<html><center>  Sg <center><small> [271] <br> 106<small/> <center/> <html/> ");
		
		JButton Manganese = new JButton("<html> <center> Mn <center> <small> 55 <br> 25<small/> <center/> <html/> ");
		JButton Technetium = new JButton("<html> <center> Tc <center> <small> [98]<br> 43<small/> <center/> <html/> ");
		JButton Rhenium = new JButton("<html><center>  Re <center><small> 186 <br> 75<small/> <center/> <html/> ");
		JButton Bohrium = new JButton("<html> <center> Bh <center><small> [264] <br> 107<small/> <center/> <html/> ");
		
		JButton Iron = new JButton("<html> <center> Fe <center> <small> 56 <br> 26<small/> <center/> <html/> ");
		JButton Ruthenium = new JButton("<html><center>  Ru <center> <small> 101<br> 44<small/> <center/> <html/> ");
		JButton Osmium = new JButton("<html><center>  Os <center><small> 190 <br> 76<small/> <center/> <html/> ");
		JButton Hassium = new JButton("<html> <center> Hs <center><small> [269] <br> 108<small/> <center/> <html/> ");
		
		JButton Cobalt = new JButton("<html> <center> Co <center> <small> 59 <br> 27<small/> <center/> <html/> ");
		JButton Rhodium = new JButton("<html> <center> Rh <center> <small> 103<br> 45<small/> <center/> <html/> ");
		JButton Iridium = new JButton("<html><center> Ir<center><small> 192 <br> 77<small/> <center/> <html/> ");
		JButton Meitnerium = new JButton("<html> <center> Mt <center><small> [278] <br> 109<small/> <center/> <html/> ");

		JButton Nickel = new JButton("<html> <center> Ni <center> <small> 59 <br> 28<small/> <center/> <html/> ");
		JButton Palladium = new JButton("<html><center>  Pd <center> <small> 106<br> 46<small/> <center/> <html/> ");
		JButton Platinum = new JButton("<html><center> Pt<center><small> 195 <br> 78<small/> <center/> <html/> ");
		JButton Darmstadtium = new JButton("<html> <center> Ds <center><small> [281] <br> 110<small/> <center/> <html/> ");
	
		JButton Copper = new JButton("<html> <center> Cu <center> <small> 63.5 <br> 29<small/> <center/> <html/> ");
		JButton Silver = new JButton("<html> <center> Ag <center> <small> 108<br> 47<small/> <center/> <html/> ");
		JButton Gold = new JButton("<html><center> Au<center><small> 197 <br> 79<small/> <center/> <html/> ");
		JButton Roentgenium = new JButton("<html><center>  Rg <center><small> [281] <br> 111<small/> <center/> <html/> ");
		
		JButton Zinc = new JButton("<html> <center> Zn <center> <small> 65 <br> 30<small/> <center/> <html/> ");
		JButton Cadmium = new JButton("<html> <center> Cd <center> <small> 112<br> 48<small/> <center/> <html/> ");
		JButton Mercury = new JButton("<html><center> Hg<center><small> 201 <br> 80<small/> <center/> <html/> ");
		JButton Copernicium = new JButton("<html><center> Cn<center><small> [285] <br> 112<small/> <center/> <html/> ");
		//Group 3
		final JLabel Group3 = new JLabel("<html> <h1>3<h1/> <html/>");
		
		JButton Boron = new JButton("<html><center>  B <center> <small> 11 <br> 5<small/> <center/> <html/> ");
		JButton Aluminium = new JButton("<html> <center> Al <center> <small> 27<br> 13<small/> <center/> <html/> ");
		JButton Gallium = new JButton("<html><center> Ga<center><small> 70 <br> 31<small/> <center/> <html/> ");
		JButton Indium = new JButton("<html> <center> In <center> <small> 115 <br> 49<small/> <center/> <html/> ");
		JButton Thallium = new JButton("<html><center>  Tl <center> <small> 204<br> 81<small/> <center/> <html/> ");
		
		final JLabel Group4 = new JLabel("<html> <h1>4<h1/> <html/>");
		
		JButton Carbon = new JButton("<html><center>  C <center> <small> 12 <br> 6<small/> <center/> <html/> ");
		JButton Silicon = new JButton("<html><center>  Si <center> <small> 28<br> 14<small/> <center/> <html/> ");
		JButton Germanium = new JButton("<html><center> Ge<center><small> 73 <br> 32<small/> <center/> <html/> ");
		JButton Tin = new JButton("<html><center>  Sn <center> <small> 119<br> 50<small/> <center/> <html/> ");
		JButton Lead = new JButton("<html> <center> Pb <center> <small> 207<br> 82<small/> <center/> <html/> ");
		
		final JLabel Group5 = new JLabel("<html> <h1>5<h1/> <html/>");
		
		JButton Nitrogen = new JButton("<html> <center> N <center> <small> 14 <br> 7<small/> <center/> <html/> ");
		JButton Phosphorus = new JButton("<html><center>  P <center> <small> 31<br> 15<small/> <center/> <html/> ");
		JButton Arsenic = new JButton("<html><center> As<center><small> 75 <br> 33<small/> <center/> <html/> ");
		JButton Antimony = new JButton("<html> <center> Sb <center> <small> 122<br> 51<small/> <center/> <html/> ");
		JButton Bismuth = new JButton("<html><center>  Bi <center> <small> 209<br> 83<small/> <center/> <html/> ");
		
		final JLabel Group6 = new JLabel("<html> <h1>6<h1/> <html/>");
		
		JButton Oxygen = new JButton("<html><center>  O <center> <small> 16 <br> 8<small/> <center/> <html/> ");
		JButton Sulfur = new JButton("<html><center> S <center> <small> 32<br> 16<small/> <center/> <html/> ");
		JButton Selenium = new JButton("<html><center> Se<center><small> 79 <br> 34<small/> <center/> <html/> ");
		JButton Tellurium = new JButton("<html><center>  Te <center> <small> 128<br> 52<small/> <center/> <html/> ");
		JButton Polonium = new JButton("<html><center>  Po <center> <small> [209]<br> 84<small/> <center/> <html/> ");
		
		final JLabel Group7 = new JLabel("<html> <h1>7<h1/> <html/>");
		
		JButton Fluorine = new JButton("<html><center>  F <center> <small> 19 <br> 9<small/> <center/> <html/> ");
		JButton Chlorine = new JButton("<html><center>  Cl <center> <small> 35<br> 17<small/> <center/> <html/> ");
		JButton Bromine = new JButton("<html><center> Br<center><small> 80 <br> 35<small/> <center/> <html/> ");
		JButton Iodine = new JButton("<html><center>  I <center> <small> 127<br> 53<small/> <center/> <html/> ");
		JButton Astatine = new JButton("<html> <center> At <center> <small> [210]<br> 85<small/> <center/> <html/> ");
		
		final JLabel Group0 = new JLabel("<html> <h1>0<h1/> <html/>");
		
		JButton Helium = new JButton("<html><center>  He <center> <small> 4 <br> 2<small/> <center/> <html/> ");
		JButton Neon = new JButton("<html> <center> Ne <center> <small> 20<br> 10<small/> <center/> <html/> ");
		JButton Argon = new JButton("<html><center> Ar<center><small> 40 <br> 18<small/> <center/> <html/> ");
		JButton Krypton = new JButton("<html><center>  Kr <center> <small> 84<br> 36<small/> <center/> <html/> ");
		JButton Xenon = new JButton("<html> <center> Xe <center> <small> 131<br> 54<small/> <center/> <html/> ");
		JButton Radon = new JButton("<html><center>  Rn <center> <small> [222]<br> 86<small/> <center/> <html/> ");
		
		JButton Hydrogen = new JButton("<html> H <center> <small> 1<br> 1<small/> <center/> <html/>");

		
		
		Group1.setForeground(Color.black);
		Group2.setForeground(Color.black);
		Group3.setForeground(Color.black);
		Group4.setForeground(Color.black);
		Group5.setForeground(Color.black);
		Group6.setForeground(Color.black);	
		Group7.setForeground(Color.black);
		Group0.setForeground(Color.black);
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		
		Color palegreen = new Color(4,213,66);
		
		//Colours
		Hydrogen.setBackground(palegreen);
		Carbon.setBackground(palegreen);
		Nitrogen.setBackground(palegreen);
		Oxygen.setBackground(palegreen);
		Phosphorus.setBackground(palegreen);
		Sulfur.setBackground(palegreen);
		Selenium.setBackground(palegreen);
		
		Color lime = Color.green;
		
		Scandium.setBackground(lime);
		Titanium.setBackground(lime);
		Vanadium.setBackground(lime);
		Chromium.setBackground(lime);
		Manganese.setBackground(lime);
		Iron.setBackground(lime);
		Cobalt.setBackground(lime);
		Nickel.setBackground(lime);
		Copper.setBackground(lime);
		Zinc.setBackground(lime);
		Yttrium.setBackground(lime);
		Zirconium.setBackground(lime);
		Niobium.setBackground(lime);
		Molybdenum.setBackground(lime);
		Technetium.setBackground(lime);
		Ruthenium.setBackground(lime);
		Rhodium.setBackground(lime);
		Palladium.setBackground(lime);
		Silver.setBackground(lime);
		Cadmium.setBackground(lime);
		Hafnium.setBackground(lime);
		Tantalum.setBackground(lime);
		Tungsten.setBackground(lime);
		Rhenium.setBackground(lime);
		Osmium.setBackground(lime);
		Iridium.setBackground(lime);
		Platinum.setBackground(lime);
		Gold.setBackground(lime);
		Mercury.setBackground(lime);
		Copernicium.setBackground(lime);
		
		Color Sulfurcolor = new Color(153, 102, 255);
		Beryllium.setBackground(Sulfurcolor);
		Magnesium.setBackground(Sulfurcolor);
		Calcium.setBackground(Sulfurcolor);
		Strontium.setBackground(Sulfurcolor);
		Barium.setBackground(Sulfurcolor);
		Radium.setBackground(Sulfurcolor);
		
		Color Tangerine = new Color(153, 102, 0);
		
		Lanthanum.setBackground(Tangerine);
		
		Color Orange = new Color(255, 154, 0);
		
		Lithium.setBackground(Orange);
		Sodium.setBackground(Orange);
		Potassium.setBackground(Orange);
		Rubidium.setBackground(Orange);
		Caesium.setBackground(Orange);
		Francium.setBackground(Orange);
		
		Actinum.setBackground(Color.red);
		
		Color cyan = Color.magenta;
		Aluminium.setBackground(cyan);
		Boron.setBackground(cyan);
		Silicon.setBackground(cyan);
		Germanium.setBackground(cyan);
		Arsenic.setBackground(cyan);
		Antimony.setBackground(cyan);
		Tellurium.setBackground(cyan);
		Polonium.setBackground(cyan);
		
		Color lightblue = Color.cyan;
		
		Aluminium.setBackground(lightblue);
		Gallium.setBackground(lightblue);
		Indium.setBackground(lightblue);
		Tin.setBackground(lightblue);
		Thallium.setBackground(lightblue);
		Lead.setBackground(lightblue);
		Bismuth.setBackground(lightblue);
		
		Color blue = Color.blue;
		
		Helium.setBackground(blue);
		Neon.setBackground(blue);
		Argon.setBackground(blue);
		Krypton.setBackground(blue);
		Xenon.setBackground(blue);
		Radon.setBackground(blue);
		
		Color grey = Color.gray;
		
		Fluorine.setBackground(grey);
		Chlorine.setBackground(grey);
		Bromine.setBackground(grey);
		Iodine.setBackground(grey);
		Astatine.setBackground(grey);
		
		Color purple = new Color(95,13,236);
		
		Rutherfordium.setBackground(purple);
		Dubnium.setBackground(purple);
		Seaborgium.setBackground(purple);
		Bohrium.setBackground(purple);
		Hassium.setBackground(purple);
		Meitnerium.setBackground(purple);
		Darmstadtium.setBackground(purple);
		Roentgenium.setBackground(purple);
		
		
		for(int j = 0; j<getComponents().length; j++) {
			Component c = getComponent(j);
			c.setForeground(Color.black);
		}
 		

		
		
		
		
		//Create Key
		
		
		
		
		
		
		Dimension dim = new Dimension(50, 50);
		//TODO Probably a quicker way to do this but i'm too lazy :C
		Lithium.setPreferredSize(dim);
		Sodium.setPreferredSize(dim);
		Potassium.setPreferredSize(dim);
		Rubidium.setPreferredSize(dim);
		Caesium.setPreferredSize(dim);
		Francium.setPreferredSize(dim);
		Beryllium.setPreferredSize(dim);
		Magnesium.setPreferredSize(dim);
		Calcium.setPreferredSize(dim);
		Strontium.setPreferredSize(dim);
		Barium.setPreferredSize(dim);
		Radium.setPreferredSize(dim);
		Scandium.setPreferredSize(dim);
		Yttrium.setPreferredSize(dim);
		Lanthanum.setPreferredSize(dim);
		Actinum.setPreferredSize(dim);
		Titanium.setPreferredSize(dim);
		Zirconium.setPreferredSize(dim);
		Hafnium.setPreferredSize(dim);
		Rutherfordium.setPreferredSize(dim);
		Vanadium.setPreferredSize(dim);
		Niobium.setPreferredSize(dim);
		Tantalum.setPreferredSize(dim);
		Dubnium.setPreferredSize(dim);
		Chromium.setPreferredSize(dim);
		Molybdenum.setPreferredSize(dim);
		Tungsten.setPreferredSize(dim);
		Seaborgium.setPreferredSize(dim);
		Manganese.setPreferredSize(dim);
		Technetium.setPreferredSize(dim);
		Rhenium.setPreferredSize(dim);
		Bohrium.setPreferredSize(dim);
		Iron.setPreferredSize(dim);
		Ruthenium.setPreferredSize(dim);
		Osmium.setPreferredSize(dim);
		Hassium.setPreferredSize(dim);
		Cobalt.setPreferredSize(dim);
		Rhodium.setPreferredSize(dim);
		Iridium.setPreferredSize(dim);
		Meitnerium.setPreferredSize(dim);
		Nickel.setPreferredSize(dim);
		Palladium.setPreferredSize(dim);
		Platinum.setPreferredSize(dim);
		Darmstadtium.setPreferredSize(dim);
		Copper.setPreferredSize(dim);
		Silver.setPreferredSize(dim);
		Gold.setPreferredSize(dim);
		Roentgenium.setPreferredSize(dim);
		Zinc.setPreferredSize(dim);
		Cadmium.setPreferredSize(dim);
		Mercury.setPreferredSize(dim);
		Boron.setPreferredSize(dim);
		Aluminium.setPreferredSize(dim);
		Gallium.setPreferredSize(dim);
		Indium.setPreferredSize(dim);
		Thallium.setPreferredSize(dim);
		Carbon.setPreferredSize(dim);
		Silicon.setPreferredSize(dim);
		Germanium.setPreferredSize(dim);
		Tin.setPreferredSize(dim);
		Lead.setPreferredSize(dim);
		Nitrogen.setPreferredSize(dim);
		Phosphorus.setPreferredSize(dim);
		Arsenic.setPreferredSize(dim);
		Antimony.setPreferredSize(dim);
		Bismuth.setPreferredSize(dim);
		Oxygen.setPreferredSize(dim);
		Sulfur.setPreferredSize(dim);
		Selenium.setPreferredSize(dim);
		Tellurium.setPreferredSize(dim);
		Polonium.setPreferredSize(dim);
		Fluorine.setPreferredSize(dim);
		Chlorine.setPreferredSize(dim);
		Bromine.setPreferredSize(dim);
		Iodine.setPreferredSize(dim);
		Astatine.setPreferredSize(dim);
		Helium.setPreferredSize(dim);
		Neon.setPreferredSize(dim);
		Argon.setPreferredSize(dim);
		Krypton.setPreferredSize(dim);
		Xenon.setPreferredSize(dim);
		Radon.setPreferredSize(dim);
		Hydrogen.setPreferredSize(dim);
		Copernicium.setPreferredSize(dim);
		

		GridBagLayout layout = new GridBagLayout() ;
		GridBagConstraints c = new GridBagConstraints();
		
		add(Hydrogen);
		
		//Predefine Grid
		c.gridx = 0;
		c.weightx = 0;
		c.weighty = 0;
		//Group 1
		setLayout(layout);
		c.gridy = 0;
		add(Group1, c);
		c.gridy = 1;
		add(Hydrogen,c );	
		c.gridy = 2;
		add(Lithium, c);
		c.gridy = 3;
		add(Sodium, c);
		c.gridy = 4;
		add(Potassium, c);
		c.gridy = 5;
		add(Rubidium, c);
		c.gridy = 6;
		add(Caesium, c);
		c.gridy = 7;
		add(Francium, c);
		//Group 2
		c.gridx = 1;
		c.weightx = 0;
		c.weighty = 0;
		c.gridy = 0;
		add(Group2, c);
		c.gridy = 2;
		add(Beryllium, c);
		c.gridy = 3;
		add(Magnesium,c );
		c.gridy = 4;
		add(Calcium,c );
		c.gridy = 5;
		add(Strontium,c );
		c.gridy = 6;
		add(Barium,c );
		c.gridy = 7;
		add(Radium,c );
		//new Row
		c.gridx = 2;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Scandium, c);
		c.gridy = 5;
		add(Yttrium,c );
		c.gridy = 6;
		add(Lanthanum, c);
		c.gridy = 7;
		add(Actinum,c );
		//new Row
		c.gridx = 3;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Titanium, c);
		c.gridy = 5;
		add(Zirconium,c );
		c.gridy = 6;
		add(Hafnium, c);
		c.gridy = 7;
		add(Rutherfordium,c );
		//new Row
		c.gridx = 4;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Vanadium, c);
		c.gridy = 5;
		add(Niobium,c );
		c.gridy = 6;
		add(Tantalum, c);
		c.gridy = 7;
		add(Dubnium,c );
		//New Row
		c.gridx = 5;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Chromium, c);
		c.gridy = 5;
		add(Molybdenum,c );
		c.gridy = 6;
		add(Tungsten, c);
		c.gridy = 7;
		add(Seaborgium,c );
		//New Row
		c.gridx = 6;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Manganese, c);
		c.gridy = 5;
		add(Technetium,c );
		c.gridy = 6;
		add(Rhenium, c);
		c.gridy = 7;
		add(Bohrium,c );
		//New Row
		c.gridx = 7;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Iron, c);
		c.gridy = 5;
		add(Ruthenium,c );
		c.gridy = 6;
		add(Osmium, c);
		c.gridy = 7;
		add(Hassium,c );
		//New Row
		c.gridx = 8;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Cobalt, c);
		c.gridy = 5;
		add(Rhodium,c );
		c.gridy = 6;
		add(Iridium, c);
		c.gridy = 7;
		add(Meitnerium,c );
		//New Row
		c.gridx = 9;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Nickel, c);
		c.gridy = 5;
		add(Palladium,c );
		c.gridy = 6;
		add(Platinum, c);
		c.gridy = 7;
		add(Darmstadtium,c );
		//New Row
		c.gridx = 10;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Copper, c);
		c.gridy = 5;
		add(Silver,c );
		c.gridy = 6;
		add(Gold, c);
		c.gridy = 7;
		add(Roentgenium,c );
		//New Row
		c.gridx = 11;
		c.gridy = 4;
		c.weightx = 0;
		c.weighty = 0;
		add(Zinc, c);
		c.gridy = 5;
		add(Cadmium,c );
		c.gridy = 6;
		add(Mercury, c);
		c.gridy = 7;
		add(Copernicium,c);
		
		//Group 3
		c.gridx = 12;
		c.gridy = 0;
		c.weightx = 0;
		c.weighty = 0;
		add(Group3, c);
		c.gridy = 2;
		add(Boron,c );
		c.gridy = 3;
		add(Aluminium, c);
		c.gridy = 4;
		add(Gallium, c);
		c.gridy = 5;
		add(Indium, c);
		c.gridy = 6;
		add(Thallium, c);
		//Group 4
		c.gridx = 13;
		c.gridy = 0;
		c.weightx = 0;
		c.weighty = 0;
		add(Group4, c);
		c.gridy = 2;
		add(Carbon,c );
		c.gridy = 3;
		add(Silicon, c);
		c.gridy = 4;
		add(Germanium, c);
		c.gridy = 5;
		add(Tin, c);
		c.gridy = 6;
		add(Lead, c);
		//Group 5
		c.gridx = 14;
		c.gridy = 0;
		c.weightx = 0;
		c.weighty = 0;
		add(Group5, c);
		c.gridy = 2;
		add(Nitrogen,c );
		c.gridy = 3;
		add(Phosphorus, c);
		c.gridy = 4;
		add(Arsenic, c);
		c.gridy = 5;
		add(Antimony, c);
		c.gridy = 6;
		add(Bismuth, c);
		//Group 6
		c.gridx = 15;
		c.gridy = 0;
		c.weightx = 0;
		c.weighty = 0;
		add(Group6, c);
		c.gridy = 2;
		add(Oxygen,c );
		c.gridy = 3;
		add(Sulfur, c);
		c.gridy = 4;
		add(Selenium, c);
		c.gridy = 5;
		add(Tellurium, c);
		c.gridy = 6;
		add(Polonium, c);
		//Group 7
		c.gridx = 16;
		c.gridy = 0;
		c.weightx = 0;
		c.weighty = 0;
		add(Group7, c);
		c.gridy = 2;
		add(Fluorine,c );
		c.gridy = 3;
		add(Chlorine, c);
		c.gridy = 4;
		add(Bromine, c);
		c.gridy = 5;
		add(Iodine, c);
		c.gridy = 6;
		add(Astatine, c);
		//Group 0
		c.gridx = 17;
		c.gridy = 0;
		c.weightx = 0;
		c.weighty = 0;
		add(Group0, c);
		c.gridy = 1;
		add(Helium,c );
		c.gridy = 2;
		add(Neon, c);
		c.gridy = 3;
		add(Argon, c);
		c.gridy = 4;
		add(Krypton, c);
		c.gridy = 5;
		add(Xenon, c);
		c.gridy = 6;
		add(Radon, c);
		
		c.gridy = 11;
		c.gridx = 0;
		c.gridwidth = 10;
		//TODO KEY
		JLabel key = new JLabel("<html> <p style=font-size:20px>  Key<p/> ");
		JLabel Nonmetals = new JLabel("<html> <p style=font-size:15px> Nonmetals<p/>");
		Nonmetals.setForeground(palegreen);

		JLabel TransitionMetals = new JLabel("<html> <p style=font-size:15px>Transition Metals<p/>");
		TransitionMetals.setForeground(lime);
		JLabel AlkaliMetals = new JLabel("<html> <p style=font-size:15px>Alkali Metals<p/>");
		AlkaliMetals.setForeground(Orange);
		JLabel Halogens = new JLabel("<html> <p style=font-size:15px>Halogens<p/>");
		Halogens.setForeground(grey);
		JLabel NobelGases = new JLabel("<html> <p style=font-size:15px>Noble Gases<p/>");
		NobelGases.setForeground(blue);
		JLabel AlkalineEarthMetals = new JLabel("<html> <p style=font-size:15px>Alkaline Earth Metals<p/>");
		AlkalineEarthMetals.setForeground(Sulfurcolor);
		JLabel Metaloids = new JLabel("<html> <p style=font-size:15px>Metaloids<p/>");
		Metaloids.setForeground(cyan);
		JLabel PostTranitionMetals = new JLabel("<html> <p style=font-size:15px>Post-Transition Metals<p/>");
		PostTranitionMetals.setForeground(lightblue);
		JLabel Transactinides = new JLabel("<html> <p style=font-size:15px>Transactinides<p/>");
		Transactinides.setForeground(purple);
		JLabel Lanthanides = new JLabel("<html> <p style=font-size:15px>Lanthanides<p/>");
		Lanthanides.setForeground(Tangerine);
		JLabel Actinides = new JLabel("<html> <p style=font-size:15px>Actinides<p/>");
		Actinides.setForeground(Color.red);
		add(Nonmetals,c);
		c.gridx = 4;
		add(TransitionMetals, c);
		c.gridx = 8;
		add(AlkaliMetals,c);
		c.gridx = 0;
		c.gridy = 13;
		add(NobelGases,c);
		c.gridx = 5;
		add(AlkalineEarthMetals,c);
		c.gridx = 10;
		add(Metaloids,c);
		c.gridy = 15;
		c.gridx = 2;
		add(PostTranitionMetals,c);
		c.gridx = 7;
		add(Transactinides,c);
		c.gridy = 16;
		c.gridx = 0;
		add(Lanthanides,c);
		c.gridx = 4;
		add(Actinides,c);
		c.gridx = 7;
		add(Halogens,c);
		
		
		
		
		
		
		add(exit);
		setSize(width, height);
		setBorder(new EmptyBorder(100, 100, 100, 100));
		
		
		//Action Listeners
		
		//Groups
		
		Group1.addMouseListener(new MouseListener() {
			
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
				Group1.setText("<html> <h1>1<h1/> <html/>");
				Group1.setForeground(Color.BLACK);
				

				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Group1.setForeground(Color.blue);
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Group2.addMouseListener(new MouseListener() {
			
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
				Group2.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Group2.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Group3.addMouseListener(new MouseListener() {
			
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
				Group3.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Group3.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		Group4.addMouseListener(new MouseListener() {
			
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
				Group4.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Group4.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Group5.addMouseListener(new MouseListener() {
			
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
				Group5.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Group5.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		Group6.addMouseListener(new MouseListener() {
			
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
				Group6.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Group6.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		Group7.addMouseListener(new MouseListener() {
			
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
				Group7.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Group7.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Group0.addMouseListener(new MouseListener() {
			
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
				Group0.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Group0.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		
		//Get Image Icons and add button listeners
		
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		
		InputStream input = classLoader.getResourceAsStream("Hydrogen.png");
		
		try {
			Image logo = ImageIO.read(input);
			String HydrogenInfo = "Hydrogen is the most abundant element in the universe, Hydrogen goes round in twos, H2,";
			AddInfo(Hydrogen, "Hydrogen", -253, -259, false, 1, 1, "Gas", logo, HydrogenInfo);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("helium.png");
		
		try {
			Image logo = ImageIO.read(input);
			String HeliumInfo = "";
			AddInfo(Helium, "Helium", -269, -272, false, 4, 2, "Gas", logo, HeliumInfo);
			
			
		} catch (IOException e2) {
			
			e2.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("lithium.png");
		
		try {
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String LithiumInfo = "";
			AddInfo(Lithium, "Lithium", 181, 1342, false, 7, 3, "Solid", logo, LithiumInfo );
			
			
		} catch (IOException e3) {
			e3.printStackTrace();
			
		}
		
		input = classLoader.getResourceAsStream("beryllium.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String BerylliumInfo = "";
			AddInfo(Beryllium, "Beryllium", 1287, 2469, false, 9, 4, "Solid", logo, BerylliumInfo);
			
			
			
		} catch (IOException e4) {
			e4.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("boron.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String BoronInfo = "";
			AddInfo(Boron, "Boron", 2076, 3927, false, 11, 5, "Solid", logo, BoronInfo);
			
			
			
		} catch (IOException e5) {
			e5.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("carbon.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String carbonInfo = "";
			AddInfo(Carbon, "Carbon", 3550, 3825, false, 12, 6, "Solid", logo, carbonInfo);
			
			
			
		} catch (IOException e6) {
			e6.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("nitrogen.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String NitrogenInfo = "";
			AddInfo(Nitrogen, "Nitrogen", -210, -196, false, 14, 7, "Gas", logo, NitrogenInfo);
			
			
			
		} catch (IOException e7) {
			e7.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("oxygen.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String OxygenInfo = "";
			AddInfo(Oxygen, "Oxygen", -219, -183, false, 16, 8, "Gas", logo, OxygenInfo);
			
			
			
		} catch (IOException e8) {
			e8.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("fluorine.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String FluorineInfo = "";
			AddInfo(Fluorine, "Fluorine", -220, -188, false, 19, 9, "Gas", logo, FluorineInfo);
			
			
			
		} catch (IOException e9) {
			e9.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("neon.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String NeonInfo = "";
			AddInfo(Neon, "Neon", -249, -246, false, 20, 10, "Gas", logo, NeonInfo);
			
			
			
		} catch (IOException e10) {
			e10.printStackTrace();
		}
		
		
		input = classLoader.getResourceAsStream("sodium.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String SodiumInfo = "";
			AddInfo(Sodium, "Sodium", 98, 883, false, 23, 11, "Solid", logo, SodiumInfo);
			
			
			
			
		} catch (IOException e11) {
			e11.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("magnesium.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String MagnesiumInfo = "";
			AddInfo(Magnesium, "Magnesium", 650, 1091, false, 20, 12, "Solid", logo, MagnesiumInfo);
			
			
			
		} catch (IOException e12) {
			e12.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("Aluminium.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String AluminiumInfo = "";
			AddInfo(Aluminium, "Aluminium", 660, 2519, false, 27, 13, "Solid", logo, AluminiumInfo);
			
			
			
		} catch (IOException e13) {
			e13.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("silicon.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(300, 200 , Image.SCALE_SMOOTH);
			
			String SiliconInfo = "";
			AddInfo(Silicon, "Silicon", 1414, 3265, false, 28, 14, "Solid", logo, SiliconInfo);
			
			
			
		} catch (IOException e14) {
			e14.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("phosphorus.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String PhosphorusInfo = "";
			AddInfo(Phosphorus, "Phosphorus", 44, 281, false, 31, 15, "Solid", logo, PhosphorusInfo);
			
			
			
		} catch (IOException e15) {
			e15.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("sulfur.png");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String SulfurInfo = "";
			AddInfo(Sulfur, "Sulfur", 115, 445, false, 32, 16, "Solid", logo, SulfurInfo);
			
			
			
		} catch (IOException e16) {
			e16.printStackTrace();
		}
		
		
		input = classLoader.getResourceAsStream("chlorine.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String ChlorineInfo = "";
			AddInfo(Chlorine, "Chlorine", -34, -101, false, 35, 17, "Gas", logo, ChlorineInfo);
			
			
			
			
		} catch (IOException e17) {
			e17.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("argon.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String ArgonInfo = "";
			AddInfo(Argon, "Argon", -189, -186, false, 40, 18, "Gas", logo, ArgonInfo);
			
		} catch (IOException e18) {
			e18.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("Potassium.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String PotassiumInfo = "";
			AddInfo(Potassium, "Potassium", 63, 774, false, 39, 19, "Solid", logo, PotassiumInfo);
			
		} catch (IOException e19) {
			e19.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("Calcium.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String CalciumInfo = "";
			AddInfo(Calcium, "Calcium", 842, 1484, false, 40, 20, "Solid", logo, CalciumInfo);
			
		} catch (IOException e20) {
			e20.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("Scandium.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String ScandiumInfo = "";
			AddInfo(Scandium, "Scandium", 1541, 2836, false, 45, 21, "Solid", logo, ScandiumInfo);
			
		} catch (IOException e21) {
			e21.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("Titanium.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String TitaniumInfo = "";
			AddInfo(Titanium, "Titanium", 1670, 3287, false, 48, 22, "Solid", logo, TitaniumInfo);
			
		} catch (IOException e22) {
			e22.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("Vanadium.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String VanadiumInfo = "";
			AddInfo(Vanadium, "Vanadium", 1910, 3407, false, 51, 23, "Solid", logo, VanadiumInfo);
			
		} catch (IOException e23) {
			e23.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("Chromium.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String ChromiumInfo = "";
			AddInfo(Chromium, "Chromium", 1907, 2672, false, 52, 24, "Solid", logo, ChromiumInfo);
			
		} catch (IOException e24) {
			e24.printStackTrace();
		}
		
		input = classLoader.getResourceAsStream("Manganese.jpg");
		
		try {
			
			Image logo = ImageIO.read(input);
			logo = logo.getScaledInstance(200, 200 , Image.SCALE_SMOOTH);
			
			String ManganeseInfo = "";
			AddInfo(Manganese, "Manganese", 1247, 2061, false, 55, 25, "Solid", logo, ManganeseInfo);
			
		} catch (IOException e25) {
			e25.printStackTrace();
		}
		//End Icons and elements

		
		
		
		
		
		
	}
	
	public static void AddInfo(JButton Button, final String Elementname,final Integer BoilingPoint,final Integer MeltingPoint,final Boolean Radioactive,final Integer AtomicMass,final Integer AtomicNumber,final String Phase, final Image Atomimage, final String AboutElement) {
			//we create this to make adding the information Frame to button easier.
		
		Button.addMouseListener(new MouseListener() {
			
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
				

				
				
				GridLayout layout = new GridLayout(0,1) ;
				GridBagConstraints c = new GridBagConstraints();
				layout.setVgap(2);
				
				
				final JFrame frame = new JFrame(Elementname);
				
				
				//TODO add ELement Info
				JPanel panel = new JPanel();
				panel.setLayout(layout);
				/*
				JLabel Name = new JLabel("<html> <p style=font-size:15px>" + Elementname +  "<p/>");
				JLabel MeltingPointLabel = new JLabel("Melting point: " + MeltingPoint);
				JLabel BoilingPointLabel = new JLabel("Boiling Point: " + BoilingPoint );
				JLabel AtomicWeightLabel = new JLabel("Atomic Weight: " + AtomicMass);
				JLabel AtomicNumberLabel = new JLabel("Atomic Number " + AtomicNumber);
				*/ // Yeah hey i know all this code is messed up i cant bring myself to remove it though
				
				
				String IsRadioactive;
				
				if(Radioactive) {
					IsRadioactive = "Yes";
				} else {
					IsRadioactive = "No";
				}

				JLabel ElementNameLabel = new JLabel("<html><p style=font-size:20px>" + Elementname + "<p/> <html/>");
				JLabel AboutElementLabel = new JLabel("<html><br>" +  AboutElement + "<html/>");
				
				JLabel AllInfo = new JLabel("<html> Melting point: " + MeltingPoint + "<br>" + "Boiling Point: " + BoilingPoint + "<br>" + "Atomic Mass: " + AtomicMass + "<br>" + "Atomic Number: " + AtomicNumber + "<br>" + "Radioactive: " + IsRadioactive + "<html/>");
				
				ImageIcon Atomicon = new ImageIcon(Atomimage); 
				
				
				
				JLabel atomimage = new JLabel(Atomicon);

				c.weighty = 1;
				c.weightx = 1;
				c.gridx = 1;
				c.gridheight = 1;
				c.gridwidth = 1;
				
				ElementNameLabel.setHorizontalAlignment(JLabel.CENTER);
				AboutElementLabel.setVerticalAlignment(JLabel.TOP);
				AboutElementLabel.setHorizontalAlignment(JLabel.CENTER);
				AllInfo.setVerticalAlignment(JLabel.TOP);
				atomimage.setVerticalAlignment(JLabel.TOP);
				
				panel.add(ElementNameLabel);
				panel.add(AboutElementLabel);
				panel.add(AllInfo);
				panel.add(atomimage);
				
				
				Border margin = new EmptyBorder(20,20,20,20);
				panel.setBorder(margin);
				
				
				frame.addWindowListener(new WindowListener() {
					
					@Override
					public void windowOpened(WindowEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void windowIconified(WindowEvent e) {
						frame.setState(JFrame.NORMAL);
						
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
						// TODO Auto-generated method stub
						
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
				
				frame.setSize(400, 600);
				frame.add(panel);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setAlwaysOnTop(true);
				frame.setResizable(false);
				
				
				
			}
		});
		
		
		
	}
		
	
	
}




