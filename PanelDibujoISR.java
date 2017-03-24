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
	
	//private String saludo=;
	private JButton btIndividual,
					btMultiples;
	private Label saludo;
	private Font txtBienvenida;
	private Frame ventanaISR;
		public PanelDibujoISR(VentanaISR frame){
				super();
				this.ventanaISR=frame;
				this.setPreferredSize(new Dimension(1000,400));
				this.setBackground(Color.GRAY);
				//this.setLayout(null);
			
				
				this.saludo= new Label("¡Bienvenido a la calculadora de ISR!",Label.CENTER);
				this.setFont(new Font("Arial",Font.BOLD,36));
				this.saludo.setForeground(Color.WHITE);
				this.saludo.setBackground(Color.GRAY);
				this.saludo.setPreferredSize(new Dimension(800, 200));
				this.add(saludo);
				
				
				this.btIndividual=new JButton("Individual");
				this.btIndividual.setFont(new Font("Calibri",Font.BOLD,26));
				this.btIndividual.setPreferredSize(new Dimension(300, 150));
				//this.btIndividual.setBounds(100,200,300,150);
				this.btIndividual.setBackground(Color.WHITE);
				this.btIndividual.addActionListener(this);
				this.add(btIndividual);
				
				
				this.btMultiples=new JButton("Multiples");
				this.btMultiples.setFont(new Font("Calibri",Font.BOLD,26));
				this.btMultiples.setPreferredSize(new Dimension(300, 150));
				//this.btMultiples.setBounds(600,200,300,150);
				this.btMultiples.setBackground(Color.WHITE);
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
				this.ventanaISR.setVisible(false);
			}
			
		}
}
