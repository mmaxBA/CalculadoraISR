import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class VentanaISR extends JFrame{
	
	public VentanaISR() {
		super("Calculador de ISR");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelDibujoISR pd = new PanelDibujoISR();
		this.add(pd);
		this.pack();
		this.setVisible(true);
		
		
	}
	public static void main(String []args){
		VentanaISR window = new VentanaISR();
		
	}
	
}
