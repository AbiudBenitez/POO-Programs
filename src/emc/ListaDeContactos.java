package emc;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ListaDeContactos extends JFrame implements ActionListener {

	JTextField TxtNum, TxtNom, TxtSNom, TxtTel;
	JButton BtnCrear, BtnGuardar, BtnEditar, BtnEliminar, BtnSalir, BtnCancelar, BtnPrimero, BtnUltimo, BtnSiguiente, BtnAnterior;
	JPanel PanelLista;
	ArrayList<Contactos> CG;
	
	public static void main(String[] args) {
		ListaDeContactos LDC = new ListaDeContactos();
		LDC.GUI();
		LDC.setSize(285,380);
		LDC.setVisible(true);
	}
	
	protected void GUI() {
		//Definimos el arrayList
		CG = new ArrayList<Contactos>();
		
		//Modificamos el contenido
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Lista de Contactos");
		Container frame = this.getContentPane();
		
		//Se modifica el frame
		frame.setLayout(new FlowLayout());
		
		//Instanciar Objetos
		JLabel LblNum = new JLabel("Numero de Contacto");
		JLabel LblNom = new JLabel("Nombre: ");
		JLabel LblSNom = new JLabel("Apellidos: ");
		JLabel LblTel = new JLabel("Telefono: ");
		
		TxtNum = new JTextField(20);
		TxtNom = new JTextField(20);
		TxtSNom = new JTextField(20);
		TxtTel = new JTextField(20);
		
		BtnCrear = new JButton("Nuevo");
		BtnGuardar = new JButton("Guardar");
		BtnEditar = new JButton("Editar");
		BtnEliminar = new JButton("Eliminar");
		BtnSalir = new JButton("Salir");
		BtnCancelar = new JButton("Cancelar");
		BtnPrimero = new JButton("Primero");
		BtnUltimo = new JButton("Ultimo");
		BtnSiguiente = new JButton("Siguiente");
		BtnAnterior = new JButton("Anterior");
		
		//Modificar Objetos
		BtnCrear.addActionListener(this);
		BtnGuardar.addActionListener(this);
		BtnEditar.addActionListener(this);
		BtnEliminar.addActionListener(this);
		BtnCancelar.addActionListener(this);
		BtnPrimero.addActionListener(this);
		BtnSiguiente.addActionListener(this);
		BtnAnterior.addActionListener(this);
		BtnUltimo.addActionListener(this);
		BtnSalir.addActionListener(this);
		
		BtnGuardar.setEnabled(false);
		BtnEditar.setEnabled(false);
		BtnEliminar.setEnabled(false);
		BtnCancelar.setEnabled(false);
		BtnPrimero.setEnabled(false);
		BtnSiguiente.setEnabled(false);
		BtnAnterior.setEnabled(false);
		BtnUltimo.setEnabled(false);
		TxtNum.setEditable(false);
		TxtNom.setEditable(false);
		TxtSNom.setEditable(false);
		TxtTel.setEditable(false);
		
		//Agregamos al container
		frame.add(BtnCrear);
		frame.add(BtnGuardar);
		frame.add(BtnEditar);
		frame.add(BtnEliminar);
		frame.add(BtnCancelar);
		
		frame.add(LblNum);
		frame.add(TxtNum);
		frame.add(LblNom);
		frame.add(TxtNom);
		frame.add(LblSNom);
		frame.add(TxtSNom);
		frame.add(LblTel);
		frame.add(TxtTel);
		
		//Menu de Navegacion
		frame.add(BtnPrimero);
		frame.add(BtnSiguiente);
		frame.add(BtnAnterior);
		frame.add(BtnUltimo);
		frame.add(BtnSalir);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == BtnCrear) {
			TxtNum.setEditable(true);
			TxtNom.setEditable(true);
			TxtSNom.setEditable(true);
			TxtTel.setEditable(true);
			BtnGuardar.setEnabled(true);
			BtnCancelar.setEnabled(true);
			BtnCrear.setEnabled(false);
			BtnSalir.setEnabled(false);
			BtnEditar.setEnabled(false);
			BtnEliminar.setEnabled(false);
			TxtNum.setText("");
			TxtNom.setText("");
			TxtSNom.setText("");
			TxtTel.setText("");
		}
		if(e.getSource() == BtnGuardar) {
			TxtNum.setEditable(false);
			TxtNom.setEditable(false);
			TxtSNom.setEditable(false);
			TxtTel.setEditable(false);
			BtnGuardar.setEnabled(false);
			BtnCancelar.setEnabled(false);
			BtnCrear.setEnabled(true);
			BtnEditar.setEnabled(true);
			BtnEliminar.setEnabled(true);
			BtnSalir.setEnabled(true);
			int num = Integer.parseInt(TxtNum.getText());
			String nom = TxtNom.getText();
			String snom = TxtSNom.getText();
			long tel = Long.parseLong(TxtTel.getText());
			CG.add(new Contactos(num, nom, snom, tel));
			if(CG.size() > 0) {
				BtnPrimero.setEnabled(true);
				BtnSiguiente.setEnabled(true);
				BtnAnterior.setEnabled(true);
				BtnUltimo.setEnabled(true);
			}
		}

		if(e.getSource() == BtnCancelar) {
			TxtNum.setEditable(false);
			TxtNom.setEditable(false);
			TxtSNom.setEditable(false);
			TxtTel.setEditable(false);
			BtnGuardar.setEnabled(false);
			BtnCancelar.setEnabled(false);
			BtnCrear.setEnabled(true);
			BtnEditar.setEnabled(true);
			BtnEliminar.setEnabled(true);
			BtnSalir.setEnabled(true);
		}
		
		if(e.getSource() == BtnPrimero) {
			TxtNum.setText(""+CG.get(0).num_con);
			TxtNom.setText(""+CG.get(0).nom_con);
			TxtSNom.setText(""+CG.get(0).snom_con);
			TxtTel.setText(""+CG.get(0).tel_con);
		}
		
		if(e.getSource() == BtnUltimo) {
			int n = CG.size() - 1;
			TxtNum.setText(""+CG.get(n).num_con);
			TxtNom.setText(""+CG.get(n).nom_con);
			TxtSNom.setText(""+CG.get(n).snom_con);
			TxtTel.setText(""+CG.get(n).tel_con);
		}
		
		if(e.getSource() == BtnSiguiente) {
			int n = Integer.parseInt(TxtNum.getText());
			for(int i = 0; i < CG.size(); i++) {
				if(CG.get(i).num_con == n) {
					TxtNum.setText(""+CG.get(i+1).num_con);
					TxtNom.setText(""+CG.get(i+1).nom_con);
					TxtSNom.setText(""+CG.get(i+1).snom_con);
					TxtTel.setText(""+CG.get(i+1).tel_con);
				}
			}
		}
		
		if(e.getSource() == BtnAnterior) {
			int n = Integer.parseInt(TxtNum.getText());
			for(int i = 0; i < CG.size(); i++) {
				if(CG.get(i).num_con == n) {
					TxtNum.setText(""+CG.get(i-1).num_con);
					TxtNom.setText(""+CG.get(i-1).nom_con);
					TxtSNom.setText(""+CG.get(i-1).snom_con);
					TxtTel.setText(""+CG.get(i-1).tel_con);
				}
			}
		}
		
		if(e.getSource() == BtnEditar) {2
			int n = Integer.parseInt(TxtNum.getText());
			for(int i = 0; i < CG.size(); i++) {
				if(CG.get(i).num_con == n) {
					int num = Integer.parseInt(TxtNum.getText());
					String nom = TxtNom.getText();
					String snom = TxtSNom.getText();
					long tel = Long.parseLong(TxtTel.getText());
					CG.get(i).num_con = num;
					CG.get(i).nom_con = nom;
					CG.get(i).snom_con = snom;
					CG.get(i).tel_con = tel;
				}
			}
		}
		
		if(e.getSource() == BtnSalir) {
			System.exit(0);
		}
	}

}
