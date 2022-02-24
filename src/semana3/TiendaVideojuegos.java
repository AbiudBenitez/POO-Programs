package semana3;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaVideojuegos extends Main{

	ArrayList<Videojuegos> almacen;
	protected void capturarJuego(Scanner sc) {
		System.out.println("Cantidad de Videojuegos: ");
		int n = Integer.parseInt(sc.nextLine());
		almacen = new ArrayList<Videojuegos>();
		for(int i = 0; i < n; i++) {
			System.out.println("Clave: ");
			int cve = Integer.parseInt(sc.nextLine());
			cve = validar(cve, sc);
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
			almacen.add(new Videojuegos(cve,nom,gen,pre,inv,prov));
		}
	}
	
	protected void eliminarvideojuegos(Scanner sc) {
		System.out.print("Ingrese la clave del videojuego a eliminar: ");
		int busq = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < almacen.size(); i++) {
			if(almacen.get(i).cve_vid == busq) {
				almacen.remove(i);
			}
			else {
				System.out.println("ERROR: No se ha seleccionado un numero valido");
			}
		}
	}
	
	protected void editarjuego(Scanner sc) {
		System.out.print("Ingrese la clave del juego a editar: ");
		int edt = Integer.parseInt(sc.nextLine());
		for(Videojuegos v:almacen) {
			if(v.cve_vid == edt) {
				System.out.println("El juego seleccionado es: " + v.cve_vid);	
				int op;
				do {
					System.out.println("Elija el dato que desee modificar:\n 1.- Nombre\n2.- Genero\n3.- Precio\n4.- Inventario\n5.- Proveedor\n6.- Salir");
					op = Integer.parseInt(sc.nextLine());
					switch(op) {
						case 1:
							System.out.println("Ingrese el nuevo nombre: ");
							v.nom_vid = sc.nextLine();
						break;
						case 2:
							System.out.println("Ingrese el nuevo genero: ");
							v.gen_vid = sc.nextLine();
						break;
						case 3:
							System.out.println("Ingrese el nuevo precio: ");
							v.pre_vid = Float.parseFloat(sc.nextLine());
						break;
						case 4:
							System.out.println("Ingrese la cantidad de inventario: ");
							v.inv_vid = Integer.parseInt(sc.nextLine());
						break;
						case 5:
							System.out.println("Ingrese el nuevo proveedor: ");
							v.prov_vid = sc.nextLine();
						break;
						case 6:
						break;
						default:
							System.out.println("No se selecciono un valor valido.");
					}
					
				}while(op!=6);
			}
			else {
				System.out.println("ERROR: No se ha seleccionado un numero valido");
			}
		}
	}
	
	protected void imprmirvideojuegos() {
		System.out.println("Cve\t\tNombre\t\tGenero\t\tPrecio\t\tInv\t\tProveedor");
		for(Videojuegos v:almacen) {
			System.out.println(v.cve_vid+"\t\t"+v.nom_vid+"\t\t"+v.gen_vid+"\t\t"+v.pre_vid+"\t\t"+v.inv_vid+"\t\t"+v.prov_vid);
		}
	}
	
	private int validar(int cve, Scanner sc) {
		for(Videojuegos v:almacen) {
			do {
				if(cve == v.cve_vid) {
					System.out.println("CLAVE REPETIDA INGRESE OTRA: ");
					cve = Integer.parseInt(sc.nextLine());
				}
			}while(cve == v.cve_vid);
		}
		return cve;
	}

}
