package semillero.ejercicio3;

public abstract class Apartamento extends Vivienda{

	protected Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños, int valorMetroCuadrado) {
		super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, valorMetroCuadrado);
	}
}
