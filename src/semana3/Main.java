package semana3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TiendaVideojuegos TV = new TiendaVideojuegos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Tienda de VideoJuegos");
		System.out.println("Elija la opcion que desee: \n1.- Listar Videojuegos\n 2.- Agregar un VideoJuego\n 3.- Borrar un VideoJuego\n 4.- Modificar un VideoJuego\n 5.- Salir.");
		int op = Integer.parseInt(sc.nextLine());
		do {
			switch(op) {
				case 1: 
					TV.imprmirvideojuegos();	
				break;
				case 2: 
					TV.capturarJuego(sc);
				break;
				case 3: 
					TV.eliminarvideojuegos(sc);
				break;
				case 4: 
					TV.editarjuego(sc);
				break;
				case 5: 
					System.exit(0);
				break;
				default:
				System.out.println("ERROR");
			}
			System.out.println("Elija la opcion que desee: \n1.- Listar Videojuegos\n 2.- Agregar un VideoJuego\n 3.- Borrar un VideoJuego\n 4.- Modificar un VideoJuego\n 5.- Salir.");
			op = Integer.parseInt(sc.nextLine());
		}while(op!=5);
		sc.close();
	}

}
