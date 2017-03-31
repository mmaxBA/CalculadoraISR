import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class VentanaPersona extends JFrame {
	
	public VentanaPersona(){
		super();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelPersona pd = new PanelPersona(this);
		this.add(pd, BorderLayout.CENTER);
<<<<<<< HEAD
		WastePanel wpA = new WastePanel(900,100);
=======
		WastePanel wpA = new WastePanel(900,170);
>>>>>>> 160caf006691f6d6111695d4fad0b849d1f60346
		this.add(wpA,BorderLayout.NORTH);
		WastePanel wpB = new WastePanel(900,100);
		this.add(wpB,BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args){
		VentanaPersona win2= new VentanaPersona();
	}
}
