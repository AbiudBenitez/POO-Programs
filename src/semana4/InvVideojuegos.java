package semana4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import semana3.Videojuegos;

public class InvVideojuegos extends JFrame implements ActionListener {
	
	JPanel nav, ventana, edit, baja, table;
	JButton Btnprim, Btnant, Btnsig, Btnult, Btnnuev, Btnguard, Btnedit, Btncanc, Btnborrar, Btnsalir;
	JTextField Txtcve, Txtnom, Txtgen, Txtpre, Txtinv, Txtprov;
	int i = 0;
	
	ArrayList<Videojuegos> almacen;
	public static void main(String[] args) {
		InvVideojuegos Vid = new InvVideojuegos();
		Vid.GUI();
		Vid.setSize(500, 250);
		Vid.setResizable(false);
		Vid.setAutoRequestFocus(false);
		Vid.setVisible(true);
	}
	
	protected void GUI() {
		almacen = new ArrayList<Videojuegos>();
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
		
		Btnguard.setEnabled(false);
		Btnedit.setEnabled(false);
		Btncanc.setEnabled(false);
		Btnborrar.setEnabled(false);
		Btnprim.setEnabled(false);
		Btnant.setEnabled(false);
		Btnsig.setEnabled(false);
		Btnult.setEnabled(false);
		Txtcve.setEditable(false);
		Txtnom.setEditable(false);
		Txtgen.setEditable(false);
		Txtpre.setEditable(false);
		Txtinv.setEditable(false);
		Txtprov.setEditable(false);

		Btnnuev.addActionListener(this);
		Btnguard.addActionListener(this);
		Btnedit.addActionListener(this);
		Btncanc.addActionListener(this);
		Btnborrar.addActionListener(this);
		Btnsalir.addActionListener(this);
		Btnprim.addActionListener(this);
		Btnant.addActionListener(this);
		Btnsig.addActionListener(this);
		Btnult.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Btnnuev) {
			Txtcve.requestFocus();
			Txtcve.setEditable(true);
			Txtnom.setEditable(true);
			Txtgen.setEditable(true);
			Txtpre.setEditable(true);
			Txtinv.setEditable(true);
			Txtprov.setEditable(true);
			Btnguard.setEnabled(true);
			Btnnuev.setEnabled(false);
			Btnedit.setEnabled(false);
			Btnsalir.setEnabled(false);
			Btncanc.setEnabled(true);
			Btnprim.setEnabled(false);
			Btnsig.setEnabled(false);
			Btnant.setEnabled(false);
			Btnult.setEnabled(false);
			Btnborrar.setEnabled(false);
			Txtcve.setText("");
			Txtnom.setText("");
			Txtgen.setText("");
			Txtpre.setText("");
			Txtinv.setText("");
			Txtprov.setText("");
		}
		if(e.getSource()==Btnguard) {
			int cve = Integer.parseInt(Txtcve.getText());
			String nom = Txtnom.getText();
			String gen = Txtgen.getText();
			float pre = Float.parseFloat(Txtpre.getText());
			int inv = Integer.parseInt(Txtinv.getText());
			String prov = Txtprov.getText();
			almacen.add(new Videojuegos(cve,nom,gen,pre,inv,prov));
			for(Videojuegos v:almacen) {
				System.out.println(v.cve_vid+"\t\t"+v.nom_vid+"\t\t"+v.gen_vid+"\t\t"+v.pre_vid+"\t\t"+v.inv_vid+"\t\t"+v.prov_vid);
			}
			Btnguard.setEnabled(false);
			Btnnuev.setEnabled(true);
			Btnedit.setEnabled(true);
			Txtcve.setEditable(false);
			Txtnom.setEditable(false);
			Txtgen.setEditable(false);
			Txtpre.setEditable(false);
			Txtinv.setEditable(false);
			Txtprov.setEditable(false);
			Btnsalir.setEnabled(true);
			Btncanc.setEnabled(false);
			Btnborrar.setEnabled(true);
			if(almacen.size() > 1) {
				Btnprim.setEnabled(true);
				Btnant.setEnabled(true);
				Btnsig.setEnabled(true);
				Btnult.setEnabled(true);
			}			
		}
		
		if(e.getSource() == Btnedit) {
			Txtcve.requestFocus();
			Txtcve.setEditable(true);
			Txtnom.setEditable(true);
			Txtgen.setEditable(true);
			Txtpre.setEditable(true);
			Txtinv.setEditable(true);
			Txtprov.setEditable(true);
			Btnguard.setEnabled(true);
			Btnnuev.setEnabled(false);
			Btnsalir.setEnabled(false);
			Btncanc.setEnabled(true);
			Btnprim.setEnabled(false);
			Btnsig.setEnabled(false);
			Btnant.setEnabled(false);
			Btnult.setEnabled(false);
			Btnborrar.setEnabled(false);
			Btnedit.setEnabled(false);
		}
		
		if(e.getSource() == Btnprim) {
			i = 0;
			if (almacen.size() >= 0) {
				Txtcve.setText(""+almacen.get(i).cve_vid);
				Txtnom.setText(almacen.get(i).nom_vid);
				Txtgen.setText(almacen.get(i).gen_vid);
				Txtpre.setText(""+almacen.get(i).pre_vid);
				Txtinv.setText(""+almacen.get(i).inv_vid);
				Txtprov.setText(almacen.get(i).prov_vid);
				Btnprim.setEnabled(false);
				Btnant.setEnabled(false);
				Btnsig.setEnabled(true);
				Btnult.setEnabled(true);
			}
		}
		if(e.getSource() == Btnsig) {
			if (i < almacen.size()-1) {
				i++;
				Btnprim.setEnabled(true);
				Btnant.setEnabled(true);
				Txtcve.setText(""+almacen.get(i).cve_vid);
				Txtnom.setText(almacen.get(i).nom_vid);
				Txtgen.setText(almacen.get(i).gen_vid);
				Txtpre.setText(""+almacen.get(i).pre_vid);
				Txtinv.setText(""+almacen.get(i).inv_vid);
				Txtprov.setText(almacen.get(i).prov_vid);
			}
			else {
				Btnsig.setEnabled(false);
				Btnult.setEnabled(false);
				Btnprim.setEnabled(true);
				Btnant.setEnabled(true);
			}
		}
		if(e.getSource() == Btnant) {
			if(i > 0) {
				i--;
				Btnsig.setEnabled(true);
				Btnult.setEnabled(true);
				Txtcve.setText(""+almacen.get(i).cve_vid);
				Txtnom.setText(almacen.get(i).nom_vid);
				Txtgen.setText(almacen.get(i).gen_vid);
				Txtpre.setText(""+almacen.get(i).pre_vid);
				Txtinv.setText(""+almacen.get(i).inv_vid);
				Txtprov.setText(almacen.get(i).prov_vid);
			}
			else {
				Btnprim.setEnabled(false);
				Btnant.setEnabled(false);
				Btnsig.setEnabled(true);
				Btnult.setEnabled(true);			
			}
		}
		if(e.getSource() == Btnult) {
				i = almacen.size()-1;
				Btnsig.setEnabled(false);
				Btnult.setEnabled(false);
				Btnprim.setEnabled(true);
				Btnant.setEnabled(true);
				Txtcve.setText(""+almacen.get(i).cve_vid);
				Txtnom.setText(almacen.get(i).nom_vid);
				Txtgen.setText(almacen.get(i).gen_vid);
				Txtpre.setText(""+almacen.get(i).pre_vid);
				Txtinv.setText(""+almacen.get(i).inv_vid);
				Txtprov.setText(almacen.get(i).prov_vid);
			
		}
		if(e.getSource() == Btnborrar) {
			int busq = Integer.parseInt(Txtcve.getText());
			System.out.println(busq);
			for(int j = 0; j < almacen.size(); j++) {
				if(almacen.get(j).cve_vid == busq) {
					almacen.remove(j);
					if(almacen.size() > 0) {
						j = almacen.size()-1;
						Txtcve.setText(""+almacen.get(j).cve_vid);
						Txtnom.setText(almacen.get(j).nom_vid);
						Txtgen.setText(almacen.get(j).gen_vid);
						Txtpre.setText(""+almacen.get(j).pre_vid);
						Txtinv.setText(""+almacen.get(j).inv_vid);
						Txtprov.setText(almacen.get(j).prov_vid);
					}
					else {
						Txtcve.setText("");
						Txtnom.setText("");
						Txtgen.setText("");
						Txtpre.setText("");
						Txtinv.setText("");
						Txtprov.setText("");				
					}
				}
			}
		}
		if(e.getSource() == Btncanc) {
			Txtcve.setText("");
			Txtnom.setText("");
			Txtgen.setText("");
			Txtpre.setText("");
			Txtinv.setText("");
			Txtprov.setText("");
			Btnguard.setEnabled(false);
			Btnnuev.setEnabled(true);
			Txtcve.setEditable(false);
			Txtnom.setEditable(false);
			Txtgen.setEditable(false);
			Txtpre.setEditable(false);
			Txtinv.setEditable(false);
			Txtprov.setEditable(false);
			Btnsalir.setEnabled(true);
			Btncanc.setEnabled(false);
			Btnedit.setEnabled(true);
			if(almacen.size() > 0) {
				Btnprim.setEnabled(true);
				Btnant.setEnabled(true);
				Btnsig.setEnabled(true);
				Btnult.setEnabled(true);
				int j = almacen.size()-1;
				Txtcve.setText(""+almacen.get(j).cve_vid);
				Txtnom.setText(almacen.get(j).nom_vid);
				Txtgen.setText(almacen.get(j).gen_vid);
				Txtpre.setText(""+almacen.get(j).pre_vid);
				Txtinv.setText(""+almacen.get(j).inv_vid);
				Txtprov.setText(almacen.get(j).prov_vid);
				i = almacen.size()-1;
			}
		}
		
		if(e.getSource() == Btnsalir) {
			System.exit(0);
		}
	}
}
