package semana4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InvVideojuegos extends JFrame {
	
	JPanel nav, ventana, edit, baja, table;
	JButton Btnprim, Btnant, Btnsig, Btnult, Btnnuev, Btnguard, Btnedit, Btncanc, Btnborrar, Btnsalir;
	JTextField Txtcve, Txtnom, Txtgen, Txtpre, Txtinv, Txtprov;
	
	ArrayList<Videojuegos> almacen;
	public static void main(String[] args) {
		InvVideojuegos Vid = new InvVideojuegos();
		Vid.GUI();
		Vid.setSize(500, 250);
		Vid.setResizable(false);
		Vid.setAutoRequestFocus(false);
		Vid.setVisible(true);
	}
	
	private void GUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Videojuegos");
		Container frame = this.getContentPane();
		ventana = new JPanel();
		nav = new JPanel();
		nav.setLayout(new FlowLayout());
		edit = new JPanel();
		edit.setLayout(new BoxLayout(edit, BoxLayout.Y_AXIS));
		baja = new JPanel();
		baja.setLayout(new FlowLayout());
		table = new JPanel();
		table.setLayout(new GridLayout(6, 6));
		
		frame.setLayout(new BorderLayout());
		
		JLabel title = new JLabel("Consulta de Videojuegos");
		title.setHorizontalAlignment(JLabel.CENTER);
		
		
		Btnprim = new JButton("Primero");
		Btnant = new JButton("Anterior");
		Btnsig = new JButton("Siguiente");
		Btnult = new JButton("Ultimo");
		nav.add(Btnprim);
		nav.add(Btnant);
		nav.add(Btnsig);
		nav.add(Btnult);
		
		Btnnuev = new JButton("Nuevo");
		Btnnuev.setMaximumSize(new Dimension(200, 25));
		Btnguard = new JButton("Guardar");
		Btnguard.setMaximumSize(new Dimension(200, 25));
		Btnedit = new JButton("Editar");
		Btnedit.setMaximumSize(new Dimension(200, 25));
		Btncanc = new JButton("Cancelar");
		Btncanc.setMaximumSize(new Dimension(200, 25));
		edit.add(Btnnuev);
		edit.add(Btnguard);
		edit.add(Btnedit);
		edit.add(Btncanc);
		
		Btnborrar = new JButton("Borrar");
		Btnsalir = new JButton("Salir");
		baja.add(Btnborrar);
		baja.add(Btnsalir);
		
		JLabel cve = new JLabel("Clave: ");
		cve.setHorizontalAlignment(JLabel.RIGHT);
		Txtcve = new JTextField(10);
		JLabel nom = new JLabel("Nombre: ");
		nom.setHorizontalAlignment(JLabel.RIGHT);
		Txtnom= new JTextField(10);
		JLabel gen = new JLabel("Genero: ");
		gen.setHorizontalAlignment(JLabel.RIGHT);
		Txtgen = new JTextField(10);
		JLabel pre = new JLabel("Precio: ");
		pre.setHorizontalAlignment(JLabel.RIGHT);
		Txtpre = new JTextField(10);
		JLabel inv = new JLabel("Inventario: ");
		inv.setHorizontalAlignment(JLabel.RIGHT);
		Txtinv = new JTextField(10);
		JLabel prov = new JLabel("Proveedor: ");
		prov.setHorizontalAlignment(JLabel.RIGHT);
		Txtprov = new JTextField(10);
		table.add(cve);
		table.add(Txtcve);
		table.add(nom);
		table.add(Txtnom);
		table.add(gen);
		table.add(Txtgen);
		table.add(pre);
		table.add(Txtpre);
		table.add(inv);
		table.add(Txtinv);
		table.add(prov);
		table.add(Txtprov);

		frame.add(title, BorderLayout.NORTH);
		frame.add(nav, BorderLayout.SOUTH);		
		frame.add(edit, BorderLayout.WEST);
		frame.add(baja, BorderLayout.EAST);
		frame.add(table, BorderLayout.CENTER);
	}

}
