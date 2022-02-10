package semana2;

public class Tarea2 {
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
