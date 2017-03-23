import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class PanelDibujoISR extends JPanel{
	
	private String saludo;

		public PanelDibujoISR(){
				super();
				this.setPreferredSize(new Dimension(1000,800));
				this.setBackground(Color.GRAY);
				this.saludo = "!Bienvenido a la calculadora del ISR¡";
				
		}
		public void componentes(Graphics g){
			

			super.paintComponent(g);
			
			g.setColor(Color.WHITE);
			g.drawString(saludo, 500, 600);
		}
}
