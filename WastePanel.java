import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class WastePanel extends JPanel{
	public WastePanel(int x, int y){
		super();
		this.setPreferredSize(new Dimension(x,y));
		this.setBackground(Color.WHITE);
	}
}
