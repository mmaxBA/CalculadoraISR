import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import jdk.nashorn.internal.ir.Labels;

public class PanelPersona extends JPanel{
	
	private JButton btcalcular;
	private JTextField tfmensual,
						tfprimavac,
						tfmedico,
						tffunerarios,
						tfseguro,
						tfhipoteca,
						tfdonativos,
						tfsubcuenta,
						tftranspesc,
						tfniveledu,
						tfcolegiatura;
	private Label lbinstruc,
					lbmensual,
					lbprimavac,
					lbmedico,
					lbfunerarios,
					lbseguro,
					lbhipoteca,
					lbdonativos,
					lbsubcuenta,
					lbtranspesc,
					lbniveledu,
					lbcolegiatura;
	private JFrame ventana;
	private JRadioButton rbsecundaria,
						rbprepa,
						rbprimaria,
						rbpreescolar,
						rbninguno;
	
	public PanelPersona(VentanaPersona vp){
		super();
		this.ventana=vp;
		this.setPreferredSize(new Dimension(900,400));
		this.setBackground(Color.GRAY);
		
		this.lbinstruc = new Label("Ingrese los valores numericos a los apartados correspondientes",Label.CENTER);
		this.setFont(new Font("Arial",Font.BOLD,20));
		this.lbinstruc.setForeground(Color.WHITE);
		this.lbinstruc.setBackground(Color.GRAY);
		this.lbinstruc.setPreferredSize(new Dimension(800,200));
		this.add(this.lbinstruc);
		
		this.lbmensual = new Label("Ingreso Mensual");
		this.lbmensual.setPreferredSize(new Dimension(225,20));
		this.tfmensual = new JTextField(10);
		this.tfmensual.setPreferredSize(new Dimension(225,20));
		this.add(this.lbmensual);
		this.add(this.tfmensual);
		
		this.lbprimavac = new Label("Prima Vacacional");
		this.lbprimavac.setPreferredSize(new Dimension(225,20));
		this.tfprimavac = new JTextField(10);
		this.tfprimavac.setPreferredSize(new Dimension(225,20));
		this.add(this.lbprimavac);
		this.add(this.tfprimavac);
		
		this.lbmedico = new Label("Gastos Medico");
		this.lbmedico.setPreferredSize(new Dimension(225,20));
		this.tfmedico = new JTextField(10);
		this.tfmedico.setPreferredSize(new Dimension(225,20));
		this.add(this.lbmedico);
		this.add(this.tfmedico);
		
		this.lbfunerarios = new Label("Gastos Funerarios");
		this.lbfunerarios.setPreferredSize(new Dimension(225,20));
		this.tffunerarios = new JTextField(10);
		this.tffunerarios.setPreferredSize(new Dimension(225,20));
		this.add(this.lbfunerarios);
		this.add(this.tffunerarios);
		
		this.lbseguro = new Label("Seguro");
		this.lbseguro.setPreferredSize(new Dimension(225,20));
		this.tfseguro = new JTextField(10);
		this.tfseguro.setPreferredSize(new Dimension(225,20));
		this.add(this.lbseguro);
		this.add(this.tfseguro);
		
		this.lbhipoteca = new Label("Hipoteca");
		this.lbhipoteca.setPreferredSize(new Dimension(225,20));
		this.tfhipoteca = new JTextField(10);
		this.tfhipoteca.setPreferredSize(new Dimension(225,20));
		this.add(this.lbhipoteca);
		this.add(this.tfhipoteca);
		
		this.lbdonativos = new Label("Donativos");
		this.lbdonativos.setPreferredSize(new Dimension(225,20));
		this.tfdonativos = new JTextField(10);
		this.tfdonativos.setPreferredSize(new Dimension(225,20));
		this.add(this.lbdonativos);
		this.add(this.tfdonativos);
		
		this.lbsubcuenta = new Label("Subcuenta de Retiro");
		this.lbsubcuenta.setPreferredSize(new Dimension(225,20));
		this.tfsubcuenta = new JTextField(10);
		this.tfsubcuenta.setPreferredSize(new Dimension(225,20));
		this.add(this.lbsubcuenta);
		this.add(this.tfsubcuenta);
		
		this.lbtranspesc = new Label("Transporte Escolar");
		this.lbtranspesc.setPreferredSize(new Dimension(225,20));
		this.tftranspesc = new JTextField(10);
		this.tftranspesc.setPreferredSize(new Dimension(225,20));
		this.add(this.lbtranspesc);
		this.add(this.tftranspesc);
		
		this.lbcolegiatura = new Label("Colegiatura");
		this.lbcolegiatura.setPreferredSize(new Dimension(225,20));
		this.tfcolegiatura = new JTextField(10);
		this.tfcolegiatura.setPreferredSize(new Dimension(225,20));
		this.add(this.lbcolegiatura);
		this.add(this.tfcolegiatura);
		
		this.lbniveledu = new Label("Nivel Educativo");
		this.lbniveledu.setPreferredSize(new Dimension(225,20));
		this.rbpreescolar = new JRadioButton("Preescolar");
		this.rbprimaria = new JRadioButton("Primaria");
		this.rbsecundaria = new JRadioButton("Secundaria");
		this.rbprepa = new JRadioButton("Bachillerato");
		this.rbninguno = new JRadioButton("Ninguno",true);
		
		//GridLayout grid = new GridLayout(0,2,10,10);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(this.rbpreescolar);
		bg.add(this.rbprepa);
		bg.add(this.rbprimaria);
		bg.add(this.rbsecundaria);
		bg.add(this.rbninguno);
		
		this.add(lbniveledu);
		this.add(this.rbninguno);
		this.add(this.rbpreescolar);
		this.add(this.rbprepa);
		this.add(this.rbprimaria);
		this.add(this.rbsecundaria);
		
	}
}
