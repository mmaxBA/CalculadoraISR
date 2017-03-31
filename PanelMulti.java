import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelMulti extends JPanel{
	private JButton btarchivo;
	private Persona[] personas;
	private JFrame ventana;
	private Label lbinstruc;
	
	public PanelMulti( VentanaMulti vm){
		super();
		this.ventana=vm;
		this.setPreferredSize(new Dimension(900,400));
		this.setBackground(Color.GRAY);
		
		this.lbinstruc = new Label("Selecciona el archivo con la información",Label.CENTER);
		this.setFont(new Font("Arial",Font.BOLD,20));
		this.lbinstruc.setForeground(Color.WHITE);
		this.lbinstruc.setBackground(Color.GRAY);
		this.lbinstruc.setPreferredSize(new Dimension(800,200));
		
		this.add(this.lbinstruc);
		
		this.btarchivo = new JButton("Browse");
		this.btarchivo.setPreferredSize(new Dimension(100,40));
		this.add(this.btarchivo);
	}
}
