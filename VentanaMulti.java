import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaMulti extends JFrame{
	
	public VentanaMulti(){
		super();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelMulti pm = new PanelMulti(this);
		this.add(pm, BorderLayout.CENTER);
		WastePanel wpA = new WastePanel(900,200);
		this.add(wpA,BorderLayout.NORTH);
		WastePanel wpB = new WastePanel(900,200);
		this.add(wpB,BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args){
		VentanaMulti win3= new VentanaMulti();
	}
}

