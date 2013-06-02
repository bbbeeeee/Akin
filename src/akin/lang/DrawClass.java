//---Work in progress. Implement paintbrush, canvas, color, picture from java.awt  ---old file
//RANDOM JPANEL, GRAPHICS TESTING... PLEASE DISREGARD.
package akin.lang;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawClass extends JPanel{
	private Graphics g;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.blue);
		g.fillRect(25, 25, 100, 30);
	}
	
}