package emc;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Operaciones extends JFrame implements ActionListener {
	
	JTextField TxtNum1, TxtNum2, TxtRes;
	JButton BtnSumar, BtnRestar, BtnMultiplicar, BtnSalir;

	public static void main(String[] args) {
		Operaciones OP = new Operaciones(); 
		OP.GUI();
		OP.setSize(280, 200);
		OP.setResizable(false);
		OP.setVisible(true);
	}
	
	private void GUI() {
		//Modificar el contenedor maximo 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container frame = this.getContentPane();
		this.setTitle("Operaciones");

		//Modificar el frame
		frame.setLayout(new FlowLayout());
		
		//Instanciar objetos
		JLabel LblNum1 = new JLabel("Numero 1: ");
		JLabel LblNum2 = new JLabel("Numero 2: ");
		JLabel LblRes = new JLabel("Resultado: ");
		
		TxtNum1 = new JTextField(15);
		TxtNum2 = new JTextField(15);
		TxtRes = new JTextField(15);
		
		BtnSumar = new JButton("Sumar");
		BtnRestar = new JButton("Restar");
		BtnMultiplicar = new JButton("Multiplicar");
		BtnSalir = new JButton("Salir");
		
		//Modificar objetos
		BtnSumar.addActionListener(this);
		BtnRestar.addActionListener(this);
		BtnMultiplicar.addActionListener(this);
		BtnSalir.addActionListener(this);
		TxtRes.setEditable(false);
		
		//Agregar objetos al contenedor
		frame.add(LblNum1);
		frame.add(TxtNum1);
		frame.add(LblNum2);
		frame.add(TxtNum2);
		frame.add(LblRes);
		frame.add(TxtRes);
		frame.add(BtnSumar);
		frame.add(BtnRestar);
		frame.add(BtnMultiplicar);
		frame.add(BtnSalir);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == BtnSumar) {
			int num1 = Integer.parseInt(TxtNum1.getText());
			int num2 = Integer.parseInt(TxtNum2.getText());
			int res = num1 + num2;
			TxtRes.setText("" + res);
		}
		if(e.getSource() == BtnRestar) {
			int num1 = Integer.parseInt(TxtNum1.getText());
			int num2 = Integer.parseInt(TxtNum2.getText());
			int res = num1 - num2;
			TxtRes.setText("" + res);
		}
		if(e.getSource() == BtnMultiplicar) {
			int num1 = Integer.parseInt(TxtNum1.getText());
			int num2 = Integer.parseInt(TxtNum2.getText());
			int res = num1 * num2;
			TxtRes.setText("" + res);
		}
		if(e.getSource() == BtnSalir) {
			System.exit(0);
		}
	}
}
