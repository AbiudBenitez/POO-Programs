package semana1;

import java.util.Scanner;

public class Tarea1 {
		public static void main(String[] args) throws InterruptedException {
		int Ho, Mi, Se, time;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de horas que desee: ");
		Ho = sc.nextInt();
		while(Ho >= 24) {
			System.out.print("Ingrese una cantidad valida de horas: ");
			Ho = sc.nextInt();
		}
		time = Ho * 3600;
		System.out.print("Ingrese la cantidad de minutos que desee: ");
		Mi = sc.nextInt();
		while(Mi >= 60) {
			System.out.print("Ingrese una cantidad valida de minutos: ");
			Mi = sc.nextInt();
		}
		time = time + Mi * 60;
		System.out.print("Ingrese la cantidad de segundos que desee: ");
		Se = sc.nextInt();
		while(Se >= 60) {
			System.out.print("Ingrese una cantidad valida de segundos: ");
			Se = sc.nextInt();
		}
		time = time + Se;
		sc.close();
		System.out.printf("%02d:%02d:%02d\n", Ho, Mi, Se);
		int i;
		for(i=0;i<time;i++) {
			if(Se==0 && Mi!=0) {
				Mi--;
				Se=59;
				Thread.sleep(1000);
				System.out.printf("%02d:%02d:%02d\n", Ho, Mi, Se);
			}
			if(Mi==0 && Ho!=0) {
				Ho--;
				Mi=59;
				Se=59;
				Thread.sleep(1000);
				System.out.printf("%02d:%02d:%02d\n", Ho, Mi, Se);
			}
			if(Se!=0) {
				Se--;
				Thread.sleep(1000);
				System.out.printf("%02d:%02d:%02d\n", Ho, Mi, Se);
			}
		}
		System.out.println("Gracias por usar mi programa :)");
	}
}