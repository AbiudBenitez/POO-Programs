package semana2;

public class Funciones2 extends Funciones {
	protected double op4(double y, double c) {
		double w = Math.pow(y, 2) + (1d/4d)*c;
		return w;
	}
	protected double op5(double x, double b, double z, double y) {
		double m = ((2d*x)+3d*b)/(Math.pow(z, 2)+Math.pow(y, 3));
		return m;
	}
}