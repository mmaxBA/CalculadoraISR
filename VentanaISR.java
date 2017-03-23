import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class VentanaISR extends JFrame{
	
	public VentanaISR() {
		super("Calculador de ISR");
		//this.setLocationRelativeTo();
		//this.setPreferredSize(new Dimension(1000,800));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelDibujoISR pd = new PanelDibujoISR(this);
		this.add(pd,BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
				
	}
	public static void main(String []args){
		VentanaISR window = new VentanaISR();
		
	}
	
}
