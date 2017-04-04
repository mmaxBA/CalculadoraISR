import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelMulti extends JPanel implements ActionListener{
	private JButton btArchivo,
	btCalcular,
	btDestino;
	private Label lbInstruc;
	private JFileChooser fcR,
	fcD;
	private String linea,
	archivo,
	destino;

	private Frame ventanaMulti;
	private Deducciones deducir;

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

		this.fcR=new JFileChooser("C:\\Users\\Daniela Parrales\\Documents\\Escuela\\Universidad\\2do Semestre\\POO");
		this.fcD=new JFileChooser("C:\\Users\\Daniela Parrales\\Documents\\Escuela\\Universidad\\2do Semestre\\POO");
		/*this.fc.setPreferredSize(new Dimension(800,300));
		this.add(this.fc);
		 */
		this.btArchivo = new JButton("Seleccionar un archivo");
		this.btArchivo.setPreferredSize(new Dimension(300,30));
		this.btArchivo.setBackground(new Color(204,255,255));
		this.btArchivo.setBorderPainted(false);
		this.btArchivo.addActionListener(this);
		this.add(this.btArchivo);

		this.btDestino = new JButton("Seleccionar un archivo");
		this.btDestino.setPreferredSize(new Dimension(300,30));
		this.btDestino.setBackground(new Color(204,255,255));
		this.btDestino.setBorderPainted(false);
		this.btDestino.addActionListener(this);
		this.add(this.btDestino);

		this.btCalcular = new JButton("Calcular");
		this.btCalcular.setPreferredSize(new Dimension(600,40));
		this.btCalcular.setBackground(new Color(0,204,255));
		this.btCalcular.setBorderPainted(false);
		this.btCalcular.addActionListener(this);
		this.add(this.btCalcular);

		this.linea = "";
		this.archivo="";
		this.destino="";

		//		this.deducir=new Deducciones();
	}

	public void lector(String ruta,String destino){

		try {
			BufferedReader bf = new BufferedReader(new FileReader(ruta));
			//PrintWriter pw = new PrintWriter(new File(destino));
			PrintWriter pw=new PrintWriter(new FileWriter(destino));

			while((linea=bf.readLine())!=null){

				Persona a = new Persona();

				String[] linea=this.linea.split(",");

				a.setNombre(linea[0]);
				System.out.println(a.getNombre());
				a.setRfc(linea[1]);
				a.setNivelEducativo(linea[12]);

				a.setSueldoMensual(Double.parseDouble(linea [2]));
				a.setAguinaldo(Double.parseDouble(linea[3]));
				a.setPrimaVacacional(Double.parseDouble(linea[4]));
				a.setMedicos(Double.parseDouble(linea[5]));
				a.setFunerarios(Double.parseDouble(linea[6]));
				a.setSggm(Double.parseDouble(linea[7]));
				a.setHipotecarios(Integer.parseInt(linea[8]));
				a.setDonativos(Double.parseDouble(linea[9]));
				a.setAportacionRetiro(Double.parseDouble(linea[10]));
				a.setTransporte(Double.parseDouble(linea[11]));
				a.setColegiatura(Double.parseDouble(linea[13]));
				System.out.println("persona seteada");

				Deducciones d=new Deducciones(a);

				pw.write(a.getNombre()+","+a.getRfc()+","+a.getSueldoMensual()+","+d.ingresoAnual()+","+a.getAguinaldo()+","+d.aguinaldoExcento()+","+d.aguinaldoGravado()+","+a.getPrimaVacacional()+","+d.primaVacacionalExcenta()+","+d.primaVacacionalGravada()+","+d.totalIngresosGravados()+","+a.getMedicos()+","+a.getFunerarios()+","+a.getSggm()+","+a.getHipotecarios()+","+a.getDonativos()+","+a.getAportacionRetiro()+","+a.getTransporte()+","+a.getNivelEducativo()+","+d.maximoDeducirColegiatura()+","+a.getColegiatura()+","+d.totalDeduccionesSnR()+","+d.deduccionesPermitidas()+","+d.montoSobreElCualSeCalculaISR()+","+d.cuotaFija()+","+d.porcentExedenteLimInf()+","+d.pagoExcedenteLimInf()+","+d.totalPagar()+"\n");
				System.out.println("listo");
			}
			bf.close();
			pw.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado ");
		} 
		catch (IOException e) {
			System.out.println("Error al intentar leer el archivo"+e);
		}
	}

	public void Escritor(String destino,Persona a){
		/*try {


		} catch (IOException e) {
			System.out.println("Error al intentar escribir el archivo"+e);
		}
		 */
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==this.btArchivo){
			int resp=this.fcR.showOpenDialog(this);
			if(resp==JFileChooser.APPROVE_OPTION){
				this.archivo =this.fcR.getSelectedFile().toString();
				System.out.println("Archivo: "+this.archivo);
			}
		}
		else if(e.getSource()==this.btDestino){
			int resp=this.fcD.showSaveDialog(this);
			if(resp==JFileChooser.APPROVE_OPTION){
				this.destino =this.fcD.getSelectedFile().toString();
				System.out.println("Ruta: "+this.destino);
			}
		}
		else if(e.getSource()==this.btCalcular){
			lector(archivo,destino);  
		}

	}
}
