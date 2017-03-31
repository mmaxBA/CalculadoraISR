import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaMulti extends JFrame{
	private boolean visVentanaISR,
					visVentanaPer,
					visVentanaMult;
	
	public VentanaMulti(VentanaISR frame){
		super();
		frame= new VentanaISR();
		this.visVentanaMult=false;
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		PanelMulti pm = new PanelMulti(this);
		this.add(pm, BorderLayout.CENTER);
		WastePanel wpA = new WastePanel(900,100);
		this.add(wpA,BorderLayout.NORTH);
		WastePanel wpB = new WastePanel(900,100);
		this.add(wpB,BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(this.isVisVentanaMult());
	}

	public boolean isVisVentanaISR() {
		return visVentanaISR;
	}

	public void setVisVentanaISR(boolean visibilidad) {
		this.visVentanaISR = visibilidad;
	}

	public boolean isVisVentanaPer() {
		return visVentanaPer;
	}

	public void setVisVentanaPer(boolean visVentanaPer) {
		this.visVentanaPer = visVentanaPer;
	}

	public boolean isVisVentanaMult() {
		return visVentanaMult;
	}

	public void setVisVentanaMult(boolean visVentanaMult) {
		this.visVentanaMult = visVentanaMult;
	}
	
	
	
	/*
	public static void main(String[] args){
		VentanaMulti win3= new VentanaMulti();
	}
	*/
}

