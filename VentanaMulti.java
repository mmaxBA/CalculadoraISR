import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaMulti extends JFrame{
	private boolean visVentanaMult;
	
	public VentanaMulti(){
		super("Calculo Multiple");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//frame= new VentanaISR();
		this.visVentanaMult=false;
				
		PanelMulti pm = new PanelMulti(this);
		this.add(pm, BorderLayout.CENTER);
		WastePanel wpA = new WastePanel(900,250);
		this.add(wpA,BorderLayout.NORTH);
		WastePanel wpB = new WastePanel(900,250);
		this.add(wpB,BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(this.visVentanaMult);
	}

	public boolean isVisVentanaMult() {
		return this.visVentanaMult;
	}

	public void setVisVentanaMult(boolean visVentanaMult) {
		this.visVentanaMult = visVentanaMult;
	}

	
	
	
	
	public static void main(String[] args){
		VentanaISR isr=new VentanaISR();
		VentanaMulti win3= new VentanaMulti();
	}
	
}

