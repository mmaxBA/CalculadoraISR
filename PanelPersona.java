import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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

//import jdk.nashorn.internal.ir.Labels;

public class PanelPersona extends JPanel{
	
	private JButton btCalcular;
	private JTextField  tfNombre,
						tfRfc,
						tfMensual,
						tfPrimaVac,
						tfMedico,
						tfFunerarios,
						tfSeguro,
						tfHipoteca,
						tfDonativos,
						tfSubCuenta,
						tfTranspEsc,
						tfNivelEdu,
						tfColegiatura;
	private Label lbNombre,
					lbRfc,
					lbInstruc,
					lbMensual,
					lbPrimaVac,
					lbMedico,
					lbFunerarios,
					lbSeguro,
					lbHipoteca,
					lbDonativos,
					lbSubCuenta,
					lbTranspEsc,
					lbNivelEdu,
					lbColegiatura;
	private VentanaPersona venPersona;
	private JRadioButton rbSecundaria,
						rbPrepa,
						rbPrimaria,
						rbPreescolar,
						rbNinguno;
	
	public PanelPersona(VentanaPersona vp){
		super();
		this.venPersona=vp;
		this.setPreferredSize(new Dimension(900,420));
		this.setBackground(Color.WHITE);
		
		this.lbInstruc = new Label("Ingrese los valores numericos en los apartados correspondientes",Label.CENTER);
		this.setFont(new Font("Arial",Font.BOLD,25));
		this.lbInstruc.setForeground(Color.BLACK);
		this.lbInstruc.setBackground(Color.WHITE);
		this.lbInstruc.setPreferredSize(new Dimension(800,110));
		this.add(this.lbInstruc);
		
		this.lbNombre = new Label("Nombre");
		this.lbNombre.setPreferredSize(new Dimension(225,40));
		this.lbNombre.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfNombre = new JTextField(10);
		this.tfNombre.setPreferredSize(new Dimension(225,20));
		this.add(this.lbNombre);
		this.add(this.tfNombre);
		
		this.lbRfc = new Label("RFC");
		this.lbRfc.setPreferredSize(new Dimension(225,40));
		this.lbRfc.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfRfc = new JTextField(10);
		this.tfRfc.setPreferredSize(new Dimension(225,20));
		this.add(this.lbRfc);
		this.add(this.tfRfc);
		
		this.lbMensual = new Label("Ingreso Mensual");
		this.lbMensual.setPreferredSize(new Dimension(225,40));
		this.lbMensual.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfMensual = new JTextField(10);
		this.tfMensual.setPreferredSize(new Dimension(225,20));
		this.add(this.lbMensual);
		this.add(this.tfMensual);
		
		this.lbPrimaVac = new Label("Prima Vacacional");
		this.lbPrimaVac.setPreferredSize(new Dimension(225,40));
		this.lbPrimaVac.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfPrimaVac = new JTextField(10);
		this.tfPrimaVac.setPreferredSize(new Dimension(225,20));
		this.add(this.lbPrimaVac);
		this.add(this.tfPrimaVac);
		
		this.lbMedico = new Label("Gastos Medico");
		this.lbMedico.setPreferredSize(new Dimension(225,40));
		this.lbMedico.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfMedico = new JTextField(10);
		this.tfMedico.setPreferredSize(new Dimension(225,20));
		this.add(this.lbMedico);
		this.add(this.tfMedico);
		
		this.lbFunerarios = new Label("Gastos Funerarios");
		this.lbFunerarios.setPreferredSize(new Dimension(225,40));
		this.lbFunerarios.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfFunerarios = new JTextField(10);
		this.tfFunerarios.setPreferredSize(new Dimension(225,20));
		this.add(this.lbFunerarios);
		this.add(this.tfFunerarios);
		
		this.lbSeguro = new Label("Seguro");
		this.lbSeguro.setPreferredSize(new Dimension(225,40));
		this.lbSeguro.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfSeguro = new JTextField(10);
		this.tfSeguro.setPreferredSize(new Dimension(225,20));
		this.add(this.lbSeguro);
		this.add(this.tfSeguro);
		
		this.lbHipoteca = new Label("Hipoteca");
		this.lbHipoteca.setPreferredSize(new Dimension(225,40));
		this.lbHipoteca.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfHipoteca = new JTextField(10);
		this.tfHipoteca.setPreferredSize(new Dimension(225,20));
		this.add(this.lbHipoteca);
		this.add(this.tfHipoteca);
		
		this.lbDonativos = new Label("Donativos");
		this.lbDonativos.setPreferredSize(new Dimension(225,40));
		this.lbDonativos.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfDonativos = new JTextField(10);
		this.tfDonativos.setPreferredSize(new Dimension(225,20));
		this.add(this.lbDonativos);
		this.add(this.tfDonativos);
		
		this.lbSubCuenta = new Label("Subcuenta de Retiro");
		this.lbSubCuenta.setPreferredSize(new Dimension(225,40));
		this.lbSubCuenta.setFont(new Font("Arial",Font.BOLD,20));
				
		this.tfSubCuenta = new JTextField(10);
		this.tfSubCuenta.setPreferredSize(new Dimension(225,20));
		this.add(this.lbSubCuenta);
		this.add(this.tfSubCuenta);
		
		this.lbTranspEsc = new Label("Transporte Escolar");
		this.lbTranspEsc.setPreferredSize(new Dimension(225,40));
		this.lbTranspEsc.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfTranspEsc = new JTextField(10);
		this.tfTranspEsc.setPreferredSize(new Dimension(225,20));
		this.add(this.lbTranspEsc);
		this.add(this.tfTranspEsc);
		
		this.lbColegiatura = new Label("Colegiatura");
		this.lbColegiatura.setPreferredSize(new Dimension(225,40));
		this.lbColegiatura.setFont(new Font("Arial",Font.BOLD,20));
		
		this.tfColegiatura = new JTextField(10);
		this.tfColegiatura.setPreferredSize(new Dimension(225,20));
		this.add(this.lbColegiatura);
		this.add(this.tfColegiatura);
		
		this.lbNivelEdu = new Label("Nivel Educativo");
		this.lbNivelEdu.setPreferredSize(new Dimension(225,40));
		this.lbNivelEdu.setFont(new Font("Arial",Font.BOLD,20));
		
		this.rbNinguno = new JRadioButton("Ninguno",true);
		this.rbNinguno.setBackground(Color.WHITE);
		this.rbPreescolar = new JRadioButton("Preescolar");
		this.rbPreescolar.setBackground(Color.WHITE);
		this.rbPrimaria = new JRadioButton("Primaria");
		this.rbPrimaria.setBackground(Color.WHITE);
		this.rbSecundaria = new JRadioButton("Secundaria");
		this.rbSecundaria.setBackground(Color.WHITE);
		this.rbPrepa = new JRadioButton("Bachillerato");
		this.rbPrepa.setBackground(Color.WHITE);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(this.rbPreescolar);
		bg.add(this.rbPrepa);
		bg.add(this.rbPrimaria);
		bg.add(this.rbSecundaria);
		bg.add(this.rbNinguno);
		
		this.add(lbNivelEdu);
		this.add(this.rbNinguno);
		this.add(this.rbPreescolar);
		this.add(this.rbPrepa);
		this.add(this.rbPrimaria);
		this.add(this.rbSecundaria);
		
	}
}
