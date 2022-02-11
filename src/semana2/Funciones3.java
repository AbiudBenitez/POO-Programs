package semana2;

import java.util.Scanner;

public class Funciones3 extends Funciones2 {
	protected double[] qtss(Scanner sc) {
		double[] r = new double[2];
		System.out.print("Ingrese los datos de la variable G: ");
		r[0] = sc.nextDouble();
		System.out.print("Ingrese los datos de la variable E: ");
		r[1] = sc.nextDouble();
		sc.close();
		return r;
	}
	protected double op6(double z, double a, double b) {
		double j = (Math.cbrt(z)/3d*a*b);
		return j;
	}
	protected double op7(double w, double m, double a, double b) {
		double k = (Math.pow(w + m, 2)/4d*a*Math.pow(b, 2));
		return k;
	}
	protected double op8(double g, double a, double e, double x, double w, double y) {
		double p = ((g*Math.pow(a, 3)-1d/3d*e)/Math.pow(x, 2)-(w*y));
		return p;
	}
}