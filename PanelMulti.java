import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelMulti extends JPanel{
	private JButton btarchivo;
	private Persona[] personas;
	private JFrame ventana;
	
	public PanelMulti( VentanaMulti vm){
		super();
		this.ventana=vm;
		this.setPreferredSize(new Dimension(900,400));
		this.setBackground(Color.GRAY);
		
	}
}
