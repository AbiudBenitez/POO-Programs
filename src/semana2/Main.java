package semana2;

public class Main extends Funciones3 {
	public static void main(String[] args) {; 
		double x, y, z, w, m;
		Funciones3 fun = new Funciones3();
		double[] q = fun.qts(fun.scn());
		double[] r = fun.qtss(fun.scn());
		x = fun.op1(q[0], q[1]);
		y = fun.op2(q[1], q[2]);
		z = fun.op3(q[0], q[1], q[2]);
		w = fun.op4(y, q[2]);
		m = fun.op5(x, q[1], z, y);
		System.out.println("El resultado de X es: " + x);
		System.out.println("El resultado de Y es: " + y);
		System.out.println("El resultado de Z es: " + z);
		System.out.println("El resultado de W es: " + w);
		System.out.println("El resultado de M es: " + m);
		System.out.println("El resultado de J es: " + fun.op6(z, q[0], q[1]));
		System.out.println("El resultado de K es: " + fun.op7(w, m, q[0], q[1]));
		System.out.println("El resultado de J es: " + fun.op8(r[0], q[0], r[1], x, w, y));
	}
}