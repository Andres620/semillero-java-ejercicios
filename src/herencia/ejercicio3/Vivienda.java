package herencia.ejercicio3;

public abstract class Vivienda extends Inmueble{
	protected int numeroHabitaciones;
	protected int numeroBaños;
	
	protected Vivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int valorMetroCuadrado) {
		super(identificadorInmobiliario, area, direccion, valorMetroCuadrado);
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBaños = numeroBaños;
	}
}
