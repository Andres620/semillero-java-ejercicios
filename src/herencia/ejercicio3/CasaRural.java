package herencia.ejercicio3;

public class CasaRural extends Casa{
	private int distanciaCabeceraMunicipal;
	private int altitudNivelMar;
	
	public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
			 int cantidadPisos, int distanciaCabeceraMunicipal, int altitudNivelMar) {
		super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, cantidadPisos, 1500000);
		this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
		this.altitudNivelMar = altitudNivelMar;
	}
	
	public int getDistanciaCabeceraMunicipal() {
		return distanciaCabeceraMunicipal;
	}
	public void setDistanciaCabeceraMunicipal(int distanciaCabeceraMunicipal) {
		this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
	}
	public int getAltitudNivelMar() {
		return altitudNivelMar;
	}
	public void setAltitudNivelMar(int altitudNivelMar) {
		this.altitudNivelMar = altitudNivelMar;
	}	
}
