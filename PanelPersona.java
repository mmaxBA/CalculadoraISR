import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//import jdk.nashorn.internal.ir.Labels;

public class PanelPersona extends JPanel implements ActionListener{
	
	private JButton btcalcular;
	private JTextField  tfnombre,
						tfrfc,
						tfmensual,
						tfaguinaldo,
						tfprimavac,
						tfmedico,
						tffunerarios,
						tfseguro,
						tfhipoteca,
						tfdonativos,
						tfsubcuenta,
						tftranspesc,
						tfcolegiatura;
	private Label lbnombre,
					lbrfc,
					lbinstruc,
					lbmensual,
					lbaguinaldo,
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
	private Persona per;
	
	public PanelPersona(VentanaPersona vp){
		super();
		this.ventana=vp;
		this.setPreferredSize(new Dimension(900,500));
		this.setBackground(Color.BLUE);
		
		this.lbinstruc = new Label("Ingrese los valores numericos a los apartados correspondientes",Label.CENTER);
		this.setFont(new Font("Arial",Font.BOLD,20));
		this.lbinstruc.setForeground(Color.WHITE);
		this.lbinstruc.setBackground(Color.BLUE);
		this.lbinstruc.setPreferredSize(new Dimension(800,110));
		this.add(this.lbinstruc);
		
		this.lbnombre = new Label("Nombre");
		this.lbnombre.setForeground(Color.WHITE);
		this.lbnombre.setPreferredSize(new Dimension(225,40));
		this.tfnombre = new JTextField(10);
		this.tfnombre.setPreferredSize(new Dimension(225,20));
		this.add(this.lbnombre);
		this.add(this.tfnombre);
		
		this.lbrfc = new Label("RFC");
		this.lbrfc.setForeground(Color.WHITE);
		this.lbrfc.setPreferredSize(new Dimension(225,40));
		this.tfrfc = new JTextField(10);
		this.tfrfc.setPreferredSize(new Dimension(225,20));
		this.add(this.lbrfc);
		this.add(this.tfrfc);
		
		this.lbmensual = new Label("Ingreso Mensual");
		this.lbmensual.setForeground(Color.WHITE);
		this.lbmensual.setPreferredSize(new Dimension(225,40));
		this.tfmensual = new JTextField(10);
		this.tfmensual.setPreferredSize(new Dimension(225,20));
		this.add(this.lbmensual);
		this.add(this.tfmensual);
		
		this.lbaguinaldo = new Label("Aguinaldo");
		this.lbaguinaldo.setForeground(Color.WHITE);
		this.lbaguinaldo.setPreferredSize(new Dimension(225,40));
		this.tfaguinaldo = new JTextField(10);
		this.tfaguinaldo.setPreferredSize(new Dimension(225,20));
		this.add(this.lbaguinaldo);
		this.add(this.tfaguinaldo);
		
		this.lbprimavac = new Label("Prima Vacacional");
		this.lbprimavac.setForeground(Color.WHITE);
		this.lbprimavac.setPreferredSize(new Dimension(225,40));
		this.tfprimavac = new JTextField(10);
		this.tfprimavac.setPreferredSize(new Dimension(225,20));
		this.add(this.lbprimavac);
		this.add(this.tfprimavac);
		
		this.lbmedico = new Label("Gastos Medico");
		this.lbmedico.setForeground(Color.WHITE);
		this.lbmedico.setPreferredSize(new Dimension(225,40));
		this.tfmedico = new JTextField(10);
		this.tfmedico.setPreferredSize(new Dimension(225,20));
		this.add(this.lbmedico);
		this.add(this.tfmedico);
		
		this.lbfunerarios = new Label("Gastos Funerarios");
		this.lbfunerarios.setForeground(Color.WHITE);
		this.lbfunerarios.setPreferredSize(new Dimension(225,40));
		this.tffunerarios = new JTextField(10);
		this.tffunerarios.setPreferredSize(new Dimension(225,20));
		this.add(this.lbfunerarios);
		this.add(this.tffunerarios);
		
		this.lbseguro = new Label("Seguro");
		this.lbseguro.setForeground(Color.WHITE);
		this.lbseguro.setPreferredSize(new Dimension(225,40));
		this.tfseguro = new JTextField(10);
		this.tfseguro.setPreferredSize(new Dimension(225,20));
		this.add(this.lbseguro);
		this.add(this.tfseguro);
		
		this.lbhipoteca = new Label("Hipoteca");
		this.lbhipoteca.setForeground(Color.WHITE);
		this.lbhipoteca.setPreferredSize(new Dimension(225,40));
		this.tfhipoteca = new JTextField(10);
		this.tfhipoteca.setPreferredSize(new Dimension(225,20));
		this.add(this.lbhipoteca);
		this.add(this.tfhipoteca);
		
		this.lbdonativos = new Label("Donativos");
		this.lbdonativos.setForeground(Color.WHITE);
		this.lbdonativos.setPreferredSize(new Dimension(225,40));
		this.tfdonativos = new JTextField(10);
		this.tfdonativos.setPreferredSize(new Dimension(225,20));
		this.add(this.lbdonativos);
		this.add(this.tfdonativos);
		
		this.lbsubcuenta = new Label("Subcuenta de Retiro");
		this.lbsubcuenta.setForeground(Color.WHITE);
		this.lbsubcuenta.setPreferredSize(new Dimension(225,40));
		this.tfsubcuenta = new JTextField(10);
		this.tfsubcuenta.setPreferredSize(new Dimension(225,20));
		this.add(this.lbsubcuenta);
		this.add(this.tfsubcuenta);
		
		this.lbtranspesc = new Label("Transporte Escolar");
		this.lbtranspesc.setForeground(Color.WHITE);
		this.lbtranspesc.setPreferredSize(new Dimension(225,40));
		this.tftranspesc = new JTextField(10);
		this.tftranspesc.setPreferredSize(new Dimension(225,20));
		this.add(this.lbtranspesc);
		this.add(this.tftranspesc);
		
		this.lbcolegiatura = new Label("Colegiatura");
		this.lbcolegiatura.setForeground(Color.WHITE);
		this.lbcolegiatura.setPreferredSize(new Dimension(430,40));
		this.tfcolegiatura = new JTextField(10);
		this.tfcolegiatura.setPreferredSize(new Dimension(430,20));
		this.add(this.lbcolegiatura);
		this.add(this.tfcolegiatura);
		
		this.lbniveledu = new Label("Nivel Educativo");
		this.lbniveledu.setForeground(Color.WHITE);
		this.lbniveledu.setPreferredSize(new Dimension(350,40));
		this.rbpreescolar = new JRadioButton("Preescolar");
		this.rbpreescolar.setPreferredSize(new Dimension(100,40));
		this.rbpreescolar.setForeground(Color.WHITE);
		this.rbpreescolar.setBackground(Color.BLUE);
		this.rbprimaria = new JRadioButton("Primaria");
		this.rbprimaria.setPreferredSize(new Dimension(100,40));
		this.rbprimaria.setForeground(Color.WHITE);
		this.rbprimaria.setBackground(Color.BLUE);
		this.rbsecundaria = new JRadioButton("Secundaria");
		this.rbsecundaria.setPreferredSize(new Dimension(100,40));
		this.rbsecundaria.setForeground(Color.WHITE);
		this.rbsecundaria.setBackground(Color.BLUE);
		this.rbprepa = new JRadioButton("Bachillerato");
		this.rbprepa.setPreferredSize(new Dimension(100,40));
		this.rbprepa.setForeground(Color.WHITE);
		this.rbprepa.setBackground(Color.BLUE);
		this.rbninguno = new JRadioButton("Ninguno",true);
		this.rbninguno.setPreferredSize(new Dimension(100,40));
		this.rbninguno.setForeground(Color.WHITE);
		this.rbninguno.setBackground(Color.BLUE);
		
		
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
		
		this.btcalcular = new JButton("Calcular");
		this.btcalcular.setPreferredSize(new Dimension(200,20));
		this.add(this.btcalcular);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.per = new Persona();
		this.per.setNombre(this.tfnombre.getText());
		this.per.setRfc(this.tfrfc.getText());
		this.per.setSueldoMensual(Double.parseDouble(this.tfmensual.getText()));
		this.per.setAguinaldo(Double.parseDouble(this.tfaguinaldo.getText()));
		this.per.setAportacionRetiro(Double.parseDouble(this.tfsubcuenta.getText()));
		this.per.setColegiatura(Double.parseDouble(this.tfcolegiatura.getText()));
		this.per.setDonativos(Double.parseDouble(this.tfdonativos.getText()));
		this.per.setFunerarios(Double.parseDouble(this.tffunerarios.getText()));
		this.per.setHipotecarios(Double.parseDouble(this.tfhipoteca.getText()));
		this.per.setMedicos(Double.parseDouble(this.tfmedico.getText()));
		this.per.setPrimaVacacional(Double.parseDouble(this.tfprimavac.getText()));
		this.per.setSggm(Double.parseDouble(this.tfseguro.getText()));
		this.per.setTransporte(Double.parseDouble(this.tftranspesc.getText()));
		if(this.rbninguno.isSelected()){
			this.per.setNivelEducativo("Ninguno");
		}
		else if(this.rbpreescolar.isSelected()){
			this.per.setNivelEducativo("Preescolar");
		}
		else if(this.rbprepa.isSelected()){
			this.per.setNivelEducativo("Bachilerato");
		}
		else if(this.rbprimaria.isSelected()){
			this.per.setNivelEducativo("Primaria");
		}
		else{
			this.per.setNivelEducativo("Secundaria");
		}
	}
}
