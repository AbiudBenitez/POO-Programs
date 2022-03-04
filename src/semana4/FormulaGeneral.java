package semana4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormulaGeneral extends JFrame implements ActionListener {

	JTextField txtA, txtB, txtC, txtX1, txtX2;
	JButton btnCalcular;
	public static void main(String[] args) {
		FormulaGeneral FG = new FormulaGeneral();
		FG.crearGUI();
		FG.setSize(280, 200);
		FG.setAutoRequestFocus(false);
		FG.setVisible(true);
	}
	
	private void crearGUI() {
		//Modificar el contenedor maximo 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container frame = this.getContentPane();
		
		//Modificar el frame
		frame.setLayout(new FlowLayout());
		
		//Instanciar objetos
		JLabel lbA = new JLabel("A: ");
		JLabel lbB = new JLabel("C: ");
		JLabel lbC = new JLabel("B: ");
		JLabel lbX1 = new JLabel("X1: ");
		JLabel lbX2 = new JLabel("X2: ");
		
		txtA = new JTextField(20);
		txtB = new JTextField(20);
		txtC = new JTextField(20);
		txtX1 = new JTextField(20);
		txtX2 = new JTextField(20);
		
		btnCalcular = new JButton("Calcular");
		
		//Modificar objetos
		btnCalcular.addActionListener(this);
		txtX1.setEditable(false);
		txtX2.setEditable(false);
		
		//Agregar objetos al contenedor 
		frame.add(lbA);
		frame.add(txtA);
		frame.add(lbB);
		frame.add(txtB);
		frame.add(lbC);
		frame.add(txtC);
		frame.add(lbX1);
		frame.add(txtX1);
		frame.add(lbX2);
		frame.add(txtX2);
		frame.add(btnCalcular);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double A = Double.parseDouble(txtA.getText());
		Double B = Double.parseDouble(txtB.getText());
		Double C = Double.parseDouble(txtC.getText());
		
		double disc = Math.pow(B, 2) - (4*A*C);
		if(disc > 0) {
			double raiz = Math.sqrt(disc);
			
			double X1 = (-B+raiz) / (2*A);
			double X2 = (-B-raiz) / (2*A);
		
			txtX1.setText(""+X1);
			txtX2.setText(""+X2);
		}else {
			double raiz = Math.sqrt(disc*-1);
			
			double X1 = (-B+raiz) / (2*A);
			double X2 = (-B-raiz) / (2*A);
		
			txtX1.setText(""+X1+"i");
			txtX2.setText(""+X2+"i");
		}
	}
}
