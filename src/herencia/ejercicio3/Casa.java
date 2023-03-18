package herencia.ejercicio3;

public abstract class Casa extends Vivienda{
	protected int cantidadPisos;
	
	protected Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
			int cantidadPisos, int valorMetroCuadrado) {
		super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, valorMetroCuadrado);
		this.cantidadPisos = cantidadPisos;
	}
}
