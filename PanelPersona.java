import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//import jdk.nashorn.internal.ir.Labels;

public class PanelPersona extends JPanel implements ActionListener {

	private JButton btCalcular,
					btRegresar;
	private JTextField  tfNombre,
						tfRfc,
						tfMensual,
						tfAguinaldo,
						tfPrimaVac,
						tfMedico,
						tfFunerarios,
						tfSeguro,
						tfHipoteca,
						tfDonativos,
						tfSubCuenta,
						tfTranspEsc,
						tfColegiatura;
	private Label lbNombre,
					lbRfc,
					lbInstruc,
					lbMensual,
					lbAguinaldo,
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
	//private VentanaISR venISR;
	private JRadioButton rbSecundaria,
							rbPrepa,
							rbPrimaria,
							rbPreescolar,
							rbNinguno;
	private Persona per;
	private Deducciones dedus;


	public PanelPersona(VentanaPersona vp){
		super();
		//this.venISR= new VentanaISR();
		this.venPersona= vp;
		this.setPreferredSize(new Dimension(900,600));
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

		this.lbAguinaldo = new Label("Aguinaldo");
		this.lbAguinaldo.setPreferredSize(new Dimension(225,40));
		this.lbAguinaldo.setFont(new Font("Arial",Font.BOLD,20));

		this.tfAguinaldo = new JTextField(10);
		this.tfAguinaldo.setPreferredSize(new Dimension(225,20));
		this.add(this.lbAguinaldo);
		this.add(this.tfAguinaldo);

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

		this.lbColegiatura = new Label("Colegiatura",Label.RIGHT);
		this.lbColegiatura.setPreferredSize(new Dimension(225,40));
		this.lbColegiatura.setFont(new Font("Arial",Font.BOLD,20));

		this.tfColegiatura = new JTextField(20);
		this.tfColegiatura.setPreferredSize(new Dimension(225,20));
		this.add(this.lbColegiatura);
		this.add(this.tfColegiatura);

		this.lbNivelEdu = new Label("Nivel Educativo",Label.CENTER);
		this.lbNivelEdu.setPreferredSize(new Dimension(900,40));
		this.lbNivelEdu.setFont(new Font("Arial",Font.BOLD,20));
		this.add(this.lbNivelEdu);

		this.rbNinguno = new JRadioButton("Ninguno",true);
		this.rbNinguno.setBackground(Color.WHITE);
		this.rbNinguno.setPreferredSize(new Dimension(150,20));
		this.rbPreescolar = new JRadioButton("Preescolar");
		this.rbPreescolar.setPreferredSize(new Dimension(150,20));
		this.rbPreescolar.setBackground(Color.WHITE);
		this.rbPrimaria = new JRadioButton("Primaria");
		this.rbPrimaria.setPreferredSize(new Dimension(150,20));
		this.rbPrimaria.setBackground(Color.WHITE);
		this.rbSecundaria = new JRadioButton("Secundaria");
		this.rbSecundaria.setPreferredSize(new Dimension(150,20));
		this.rbSecundaria.setBackground(Color.WHITE);
		this.rbPrepa = new JRadioButton("Bachillerato");
		this.rbPrepa.setPreferredSize(new Dimension(150,20));
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

		this.btCalcular = new JButton("Calcular");
		this.btCalcular.setPreferredSize(new Dimension(225,40));
		this.btCalcular.setBackground(new Color(0,204,255));
		this.btCalcular.setBorderPainted(false);
		this.btCalcular.addActionListener(this);
		this.add(this.btCalcular);
		
		this.btRegresar = new JButton("Regresar");
		this.btRegresar.setPreferredSize(new Dimension(225,40));
		this.btRegresar.setBackground(new Color(0,204,255));
		this.btRegresar.setBorderPainted(false);
		this.btRegresar.addActionListener(this);
		this.add(this.btRegresar);
		

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btCalcular){
			this.per = new Persona();
			this.per.setNombre(this.tfNombre.getText());
			this.per.setRfc(this.tfRfc.getText());
			this.per.setSueldoMensual(Double.parseDouble(this.tfMensual.getText()));
			this.per.setAguinaldo(Double.parseDouble(this.tfAguinaldo.getText()));
			this.per.setAportacionRetiro(Double.parseDouble(this.tfSubCuenta.getText()));
			this.per.setColegiatura(Double.parseDouble(this.tfColegiatura.getText()));
			this.per.setDonativos(Double.parseDouble(this.tfDonativos.getText()));
			this.per.setFunerarios(Double.parseDouble(this.tfFunerarios.getText()));
			this.per.setHipotecarios(Double.parseDouble(this.tfHipoteca.getText()));
			this.per.setMedicos(Double.parseDouble(this.tfMedico.getText()));
			this.per.setPrimaVacacional(Double.parseDouble(this.tfPrimaVac.getText()));
			this.per.setSggm(Double.parseDouble(this.tfSeguro.getText()));
			this.per.setTransporte(Double.parseDouble(this.tfTranspEsc.getText()));
			if(this.rbNinguno.isSelected()){
				this.per.setNivelEducativo("Ninguno");
			}
			else if(this.rbPreescolar.isSelected()){
				this.per.setNivelEducativo("Preescolar");
			} 
			else if(this.rbPrepa.isSelected()){
				this.per.setNivelEducativo("Bachilerato");
			}
			else if(this.rbPrimaria.isSelected()){
				this.per.setNivelEducativo("Primaria");
			}
			else{
				this.per.setNivelEducativo("Secundaria");
			}
			this.dedus = new Deducciones(this.per);
			JOptionPane.showMessageDialog(null, "El ingreso anual es de "+ String.valueOf(this.dedus.ingresoAnual())+ 
												"\nEl aguinaldo excento es de: " + String.valueOf(this.dedus.aguinaldoExcento())+
												"\nEl agunaldo gravado es de: " + String.valueOf(this.dedus.aguinaldoGravado())+ 
												"\nLa prima vacacional excenta es de: "+ String.valueOf(this.dedus.primaVacacionalGravada())+
												"\nEl total de ingresos gravados es de: "+ String.valueOf(this.dedus.totalIngresosGravados())+
							"\nEl maximo a deducir de "+ per.getNivelEducativo()+" es de:" + String.valueOf(this.dedus.maximoDeducirColegiatura())+
							"\nEl total de deducciones sin ISR es de: "+ String.valueOf(this.dedus.totalDeduccionesSnR())+
							"\nEl total de deducciones permitidas es de: "+ String.valueOf(this.dedus.deduccionesPermitidas())+
							"\nEl monto sobre el cuál se calcula el ISR es de: "+ String.valueOf(this.dedus.montoSobreElCualSeCalculaISR())+
							"\nLa cuota fija a pagar es de: "+ String.valueOf(this.dedus.cuotaFija())+
							"\nEl porcentaje de ISR es de: "+ String.valueOf(this.dedus.porcentExedenteLimInf())+
							"\nEl limite inferior es de: "+String.valueOf(this.dedus.LimInf())+
							"\nEl pago excedente del limite inferior es de: "+ String.valueOf(this.dedus.pagoExcedenteLimInf())+
							"\nEl total que debe pagar "+per.getNombre()+" es de: "+ String.valueOf(this.dedus.totalPagar()), "Resultados", 3);
		}
		//else if(e.getSource() == this.btRegresar){
			//this.venISR.setVisible(true);
			//this.venPersona.setVisible(false);

		//}
	}

}
