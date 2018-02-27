package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class PruebaDibujo {
	public static void main(String[] args) {
		MarcoConDibujos mimarco = new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConDibujos extends JFrame{
	public MarcoConDibujos(){
		setTitle("Prueba de Dibujo");
		setSize(400,400);
		LaminaConFiguras milamina = new LaminaConFiguras();
		add(milamina);
		milamina.setBackground(SystemColor.window);
	}
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//g.drawRect(50,50,200,200);
		// g.drawLine(100,100,300,200);
		// g.drawArc(50, 100,100,200,250,350);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rectagulo = new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.RED);
		g2.fill(rectagulo);

		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectagulo);
		// g2.setPaint(Color.BLUE);

		Color micolor = new Color(125,189,200);

		g2.setPaint(micolor);
		g2.fill(elipse);

		// g2.draw(new Line2D.Double(100,100,300,250));

		// double CentroenX = rectagulo.getCenterX();
		// double CentroenY = rectagulo.getCenterY();
		// double radio = 150;

		// Ellipse2D circulo = new Ellipse2D.Double();
		// circulo.setFrameFromCenter(CentroenX,CentroenY,CentroenX+radio, CentroenY+radio);
		// g2.draw(circulo);


	}
}