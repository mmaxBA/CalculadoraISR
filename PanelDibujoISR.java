import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelDibujoISR extends JPanel implements ActionListener{
	
	private JButton btIndividual,
					btMultiples;
	private Label saludo;
	private Font txtBienvenida;
	
	private VentanaISR ventanaISR;
	private VentanaPersona ventanaPer;
	private VentanaMulti ventanaMulti;
	
	private boolean visVentanaISR,
					visVentanaPer,
					visVentanaMult;
	
		public PanelDibujoISR(VentanaISR frame){
				super();
				this.visVentanaISR=true;
				this.visVentanaPer=false;
				this.visVentanaMult=false;
				
				this.ventanaISR=frame;
				this.ventanaPer= new VentanaPersona();
								
				this.setPreferredSize(new Dimension(1000,400));
				this.setBackground(Color.BLUE);
				//this.setLayout(null);
			
				
				this.saludo= new Label("¡Bienvenido a la calculadora de ISR!",Label.CENTER);
				this.setFont(new Font("Arial",Font.BOLD,36));
				this.saludo.setForeground(Color.WHITE);
				this.saludo.setBackground(Color.BLUE);
				this.saludo.setPreferredSize(new Dimension(800, 200));
				this.add(saludo);
				
				
				this.btIndividual=new JButton("Individual");
				this.btIndividual.setFont(new Font("Calibri",Font.BOLD,26));
				this.btIndividual.setPreferredSize(new Dimension(300, 150));
				//this.btIndividual.setBounds(100,200,300,150);
				this.btIndividual.setBackground(Color.WHITE);
				this.btIndividual.setBorderPainted(false);
				this.btIndividual.addActionListener(this);
				this.add(btIndividual);
				
				
				this.btMultiples=new JButton("Multiples");
				this.btMultiples.setFont(new Font("Calibri",Font.BOLD,26));
				this.btMultiples.setPreferredSize(new Dimension(300, 150));
				//this.btMultiples.setBounds(600,200,300,150);
				this.btMultiples.setBackground(Color.WHITE);
				this.btMultiples.setBorderPainted(false);
				this.btMultiples.addActionListener(this);
				this.add(btMultiples);
				
				
		}
		/*public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.WHITE);
			g.setFont(new Font("Arial",Font.BOLD,36));
			g.drawString(saludo, (this.getWidth()/2)-280,(this.getHeight()/2)-80);
		}*/
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==this.btIndividual){
				this.visVentanaISR=false;
				this.visVentanaPer=true;
				this.ventanaISR.setVisible(visVentanaISR);
				this.ventanaPer.setVisible(visVentanaPer);
			}
			
			else if(e.getSource()==this.btMultiples){
				this.visVentanaISR=false;
				this.visVentanaMult=true;
				this.ventanaISR.setVisible(visVentanaISR);
			}
		}
		public boolean isVisibilidad() {
			return visVentanaISR;
		}
		public void setVisibilidad(boolean visibilidad) {
			this.visVentanaISR = visibilidad;
		}
		public boolean isVisVentanaPer() {
			return visVentanaPer;
		}
		public void setVisVentanaPer(boolean visVentanaPer) {
			this.visVentanaPer = visVentanaPer;
		}
		public boolean isVisVentanaMult() {
			return visVentanaMult;
		}
		public void setVisVentanaMult(boolean visVentanaMult) {
			this.visVentanaMult = visVentanaMult;
		}
		
		
}
