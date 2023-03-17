package semillero.ejercicio3;

public class CasaConjuntoCerrado extends CasaUrbana{

	private int valorAdministracion;
	private boolean areasComunes;
	
	public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños, int cantidadPisos, int valorAdministracion, boolean areasComunes) {
		super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, cantidadPisos, 2500000);
		this.valorAdministracion = valorAdministracion;
		this.areasComunes = areasComunes;
	}

	
	public boolean isAreasComunes() {
		return areasComunes;
	}
	public void setAreasComunes(boolean areasComunes) {
		this.areasComunes = areasComunes;
	}
	public int getValorAdministracion() {
		return valorAdministracion;
	}
	public void setValorAdministracion(int valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	public int getValorMetroCuadrado() {
		return valorMetroCuadrado;
	}

	public void setValorMetroCuadrado(int valorMetroCuadrado) {
		this.valorMetroCuadrado = valorMetroCuadrado;
	}
}