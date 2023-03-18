package herencia.ejercicio3;

public class ApartamentoFamiliar extends Apartamento{
	private int valorAdministracion;

	public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños, int valorAdministracion) {
		super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, 2000000);
		this.valorAdministracion = valorAdministracion;
	}
	
	public int getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValorAdministracion(int valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}
}
