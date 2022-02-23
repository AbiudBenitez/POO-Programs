package semana3;

import java.util.Scanner;

public class TiendaVideojuegos {

	Videojuegos[] almacen;
	public static void main(String[] args) {
		TiendaVideojuegos TV = new TiendaVideojuegos();
	}
	private void capturarJuego() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cantidad de Videojuegos: ");
		int n = Integer.parseInt(sc.nextLine());
		almacen = new Videojuegos[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Clave: ");
			int cve = Integer.parseInt(sc.nextLine());
			System.out.println("Nombre: ");
			String nom = sc.nextLine();
			System.out.println("Genero: ");
			String gen = sc.nextLine();
			System.out.println("Precio: ");
			float pre = Float.parseFloat(sc.nextLine());
			System.out.println("Inventario: ");
			int inv = Integer.parseInt(sc.nextLine());
			System.out.println("Proveedor: ");
			String prov = sc.nextLine();
			almacen[i] = new Videojuegos(cve,nom,gen,pre,inv,prov);
		}
	}
	private void imprmirvideojuegos() {
		System.out.println("Cve\t\tNombre\t\tGenero\t\tPrecio\t\tInv\t\tProveedor");
		for(Videojuegos v:almacen) {
			System.out.println(v.cve_vid+"\t\t"+v.nom_vid+"\t\t"+v.gen_vid+"\t\t"+v.pre_vid+"\t\t"+v.inv_vid+"\t\t"+v.prov_vid);
		}
	}

}
