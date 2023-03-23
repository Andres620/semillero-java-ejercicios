package excepciones;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		CalculosNumericos calculos = new CalculosNumericos();		
		
		// cálculo de la raíz cuadrada
        try {
        	double raiz = CalculosNumericos.calcularRaizCuadrada(4);
			System.out.println("La raíz cuadrada de 4 es " + raiz);
			
			raiz = CalculosNumericos.calcularRaizCuadrada(-4);
			System.out.println("La raíz cuadrada de -4 es " + raiz);
        } catch (ArithmeticException e) {
            System.out.println("Error al calcular la raíz cuadrada: " + e.getMessage());
        }
        
     		
        // cálculo pendiente de recta
        try {
        	double pendiente = calculos.calcularPendienteRecta(1, 2, 3, 4);
			System.out.println("La pendiente de la recta es " + pendiente);
			
            pendiente = calculos.calcularPendienteRecta(1, 2, 1, 4);
            System.out.println("La pendiente de la recta que pasa por (1,2) y (3,4) es: " + pendiente);
        } catch (ArithmeticException e) {
            System.out.println("Error al calcular la pendiente de la recta: " + e.getMessage());
        }
        
        
        // cálculo punto medio
		try {
			double puntoMedio = calculos.calcularPuntoMedioRecta(1, 1, 3, 3);
			System.out.println("El punto medio de la recta es " + puntoMedio);
			puntoMedio = calculos.calcularPuntoMedioRecta(1, 1, 1, 1);
			System.out.println("El punto medio de la recta es " + puntoMedio);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		// cálculo reices ecuación cuadratica
        try {
            double[] raices = calculos.calcularRaicesEcuacionCuadratica(2, 2, -312);
            System.out.println("Las raíces de la ecuación son: " + "x1 = " + raices[0] + " y " + "x2 = " + raices[1]);
            raices = calculos.calcularRaicesEcuacionCuadratica(5, 2, 3);
            System.out.println("Las raíces de la ecuación son: " + "x1 = " + raices[0] + " y " + "x2 = " + raices[1]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        // cálculo cambio de base
        try {
        	int numero = 600;
            int base = 3;
            String resultado = calculos.cambiarBase(numero, base);
            System.out.println("El número " + numero + " en base " + base + " es: " + resultado);
            base = 1;
            resultado = calculos.cambiarBase(numero, base);
            System.out.println("El número " + numero + " en base " + base + " es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
		
	}

}
