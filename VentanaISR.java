import javax.swing.JFrame;

import java.awt.BorderLayout;

public class VentanaISR extends JFrame{
	private boolean visibilidad,
					visVentanaPer,
					visVentanaMult;
	private PanelDibujoISR pd;
	
	
	public VentanaISR() {
		super("Calculador de ISR");
		
		
		//this.setLocationRelativeTo();
		//this.setPreferredSize(new Dimension(1000,800));
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pd = new PanelDibujoISR(this);
		this.add(pd,BorderLayout.CENTER);
		WastePanel wpA = new WastePanel(900,200);
		this.add(wpA,BorderLayout.NORTH);
		WastePanel wpB = new WastePanel(900,200);
		this.add(wpB,BorderLayout.SOUTH);
		this.setResizable(false);
		
		this.pack();
		this.setVisible(pd.isVisibilidad());
	}


	public boolean isVisibilidad() {
		return this.visibilidad;
	}


	public void setVisibilidad(boolean visibilidad) {
		this.visibilidad = visibilidad;
	}


	public boolean isVisVentanaPer() {
		return this.visVentanaPer;
	}


	public void setVisVentanaPer(boolean visVentanaPer) {
		this.visVentanaPer = visVentanaPer;
	}


	public boolean isVisVentanaMult() {
		return this.visVentanaMult;
	}


	public void setVisVentanaMult(boolean visVentanaMult) {
		this.visVentanaMult = visVentanaMult;
	}


	
	
	
	
	
	
	public static void main(String []args){
		VentanaISR window = new VentanaISR();
		
	}
	
}
