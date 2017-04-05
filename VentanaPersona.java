import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class VentanaPersona extends JFrame {
	
	private boolean visVentanaPer;
	
	public VentanaPersona(VentanaISR frame){
		super("Calculo Individual");
		this.visVentanaPer=false;
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelPersona pd = new PanelPersona(this,frame);
		this.add(pd, BorderLayout.CENTER);
		WastePanel wpA = new WastePanel(900,50);
		this.add(wpA,BorderLayout.NORTH);
		WastePanel wpB = new WastePanel(900,50);
		this.add(wpB,BorderLayout.SOUTH);
		this.pack();
		this.setVisible(this.visVentanaPer);
	}

	public boolean isVisVentanaPer() {
		return this.visVentanaPer;
	}

	public void setVisVentanaPer(boolean visVentanaPer) {
		this.visVentanaPer = visVentanaPer;
	}
	
	
	/*public static void main(String[] args){
		VentanaPersona win2= new VentanaPersona();
	}
*/
}
