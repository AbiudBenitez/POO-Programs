package semana2;

public class Main extends Funciones2 {
	public static void main(String[] args) {; 
		double x, y, z, w, m;
		Funciones fun = new Funciones();
		Funciones2 fun2 = new Funciones2();
		double []q = fun.qts();
		x = fun.op1(q[0], q[1]);
		y = fun.op2(q[1], q[2]);
		z = fun.op3(q[0], q[1], q[2]);
		w = fun2.op4(y, q[2]);
		m = fun2.op5(x, q[1], z, y);
		System.out.println("El resultado de X es: " + x);
		System.out.println("El resultado de Y es: " + y);
		System.out.println("El resultado de Z es: " + z);
		System.out.println("El resultado de W es: " + w);
		System.out.println("El resultado de M es: " + m);
	}
}