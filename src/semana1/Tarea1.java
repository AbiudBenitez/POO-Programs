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
		int h, m, s, i;
		h=m=s=0;
		System.out.printf("%02d:%02d:%02d\n", h, m, s);
		for(i=0;i<time;i++) {
			Thread.sleep(1000);
			s++;
			if(s==60) {
				m++;
				s = 0;
			}
			if(m==60) {
				h++;
				m=0;
			}
			System.out.printf("%02d:%02d:%02d\n", h, m, s);
		}
		System.out.println("Gracias por usar mi programa :)");
	}
}