package graficos;
import java.awt.event.*;
import javax.swing.JFrame;

public class FocoVentana extends JFrame implements WindowFocusListener{
	
	FocoVentana marco1;
	FocoVentana marco2;

	public static void main(String[] args) {
		FocoVentana miv = new FocoVentana();

		miv.iniciar();
	}

	public void iniciar(){
		marco1 = new FocoVentana();
		marco2 = new FocoVentana();

		marco1.setVisible(true);
		marco2.setVisible(true);

		marco1.setBounds(50,100,600,350);
		marco2.setBounds(650,100,600,350);

		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}

	public void windowGainedFocus(WindowEvent e){
		if(e.getSource()== marco1)
			marco1.setTitle("Tengo el Foco");
		else
			marco2.setTitle("Tengo el Foco");
	}

	public void windowLostFocus(WindowEvent e){
		if(e.getSource()== marco1)
			marco1.setTitle("");
		else
			marco2.setTitle("");
	}
}