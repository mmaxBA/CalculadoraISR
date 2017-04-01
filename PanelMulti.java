import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelMulti extends JPanel implements ActionListener{
	private JButton btArchivo;
	private Persona[] personas;
	private Frame ventanaMulti;
	private Label lbInstruc;
	private JFileChooser fc;
	private String linea;
	private String texto;
	private String ruta;
	
	public PanelMulti(Frame vm){
		super();
		this.ventanaMulti=vm;
		this.setPreferredSize(new Dimension(900,400));
		this.setBackground(Color.WHITE);
		
		this.lbInstruc = new Label("Selecciona el archivo con la información",Label.CENTER);
		this.lbInstruc.setFont(new Font("Arial",Font.BOLD,20));
		this.lbInstruc.setForeground(Color.BLACK);
		this.lbInstruc.setBackground(Color.WHITE);
		this.lbInstruc.setPreferredSize(new Dimension(800,50));
		this.add(this.lbInstruc);
		
		this.fc=new JFileChooser();
		/*this.fc.setPreferredSize(new Dimension(800,300));
		this.add(this.fc);
		*/
		this.btArchivo = new JButton("Seleccionar un archivo");
		this.btArchivo.setPreferredSize(new Dimension(300,70));
		this.btArchivo.setBackground(Color.CYAN);
		this.btArchivo.setBorderPainted(false);
		this.btArchivo.addActionListener(this);
		this.add(this.btArchivo);
		
		this.linea="";
		this.texto="";
		this.ruta="";
		
	}

	public String lector(String ruta){

		try {
			BufferedReader bf = new BufferedReader(new FileReader(ruta));
			while((linea=bf.readLine())!=null){
				texto += linea+"\n";
			}
			System.out.println(texto);
			bf.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado ");
			//		+e);
			//		e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("Error al intentar leer el archivo"+e);
		}
		return texto;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.btArchivo){
			int resp=this.fc.showOpenDialog(this);
			if(resp==JFileChooser.APPROVE_OPTION){
				String archivoSel =this.fc.getSelectedFile().toString();
				System.out.println(archivoSel);
				System.out.println(lector(this.ruta));
			}
		}
		
	}
}
