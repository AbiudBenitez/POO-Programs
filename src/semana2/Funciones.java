package semana2;

import java.util.Scanner;

public class Funciones {
	protected double[] qts() {
		double[] q = new double[3];
		Scanner sc = new Scanner(System.in);
	    System.out.print("Ingrese los datos de la variable A: ");
	    q[0] = sc.nextDouble();
	    System.out.print("Ingrese los datos de la variable B: ");
	    q[1] = sc.nextDouble();
	    System.out.print("Ingrese los datos de la variable C: ");
	    q[2] = sc.nextDouble();
	    sc.close();
	    return q;
	}
	protected double op1(double a, double b) {
		double x = Math.pow(a, 2) - 2d/b;
		return x;
	}
	protected double op2(double b, double c) {
		double y = ((2d/3d)*b)*(Math.pow(c, 3));
		return y;
	}
	protected double op3(double a, double b, double c) {
		double z = ((2d*Math.pow(b, 2))-(4d*a))/Math.sqrt(c);
		return z;
	}
}
