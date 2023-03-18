package excepciones;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CalculosNumericos calculos = new CalculosNumericos();
		System.out.println("Cálculo raíz cuadrada");
		System.out.println("ingresar radicando = ");
		double radicando = scanner.nextInt();
		double raiz = CalculosNumericos.calcularRaizCuadrada(radicando);
		System.out.println(raiz);
		
		System.out.println("Cálculo pendiente de recta");
		System.out.println("ingresar x1 ");
		double x1 = scanner.nextInt();
		System.out.println("ingresar y1 ");
		double y1 = scanner.nextInt();
		System.out.println("ingresar x2 ");
		double x2 = scanner.nextInt();
		System.out.println("ingresar y2 ");
		double y2 = scanner.nextInt();
		double pendiente = calculos.calcularPendienteRecta(x1, y1, x2, y2);
		System.out.println(pendiente);
		
		
		System.out.println("Cálculo punto medio");
		System.out.println("ingresar x1 ");
		x1 = scanner.nextInt();
		System.out.println("ingresar y1 ");
		y1 = scanner.nextInt();
		System.out.println("ingresar x2 ");
		x2 = scanner.nextInt();
		System.out.println("ingresar y2 ");
		y2 = scanner.nextInt();
		double puntoMedio = calculos.calcularPuntoMedioRecta(x1, y1, x2, y2);
		System.out.println(puntoMedio);
		
		
		System.out.println("Cálculo raices ecuación cuadratica");
		System.out.println("ingresar a ");
		double a = scanner.nextInt();
		System.out.println("ingresar b ");
		double b = scanner.nextInt();
		System.out.println("ingresar c ");
		double c = scanner.nextInt();
		double[] raicesCuadraticas = calculos.calcularRaicesEcuacionCuadratica(a, b, c);
		System.out.println(raicesCuadraticas);
		
		System.out.println("Cálculo cambio de base");
		System.out.println("ingresar número ");
		int numero = scanner.nextInt();
		System.out.println("ingresar base ");
		int base = scanner.nextInt();
		String cambioBase = calculos.cambiarBase(numero, base);
		System.out.println(cambioBase);
	}

}
