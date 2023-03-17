package semillero.ejercicio3;

public class LocalComercial extends Local{
	private String centroComercial;
	
	public LocalComercial(int identificadorInmobiliario, int area, String direccion,
			tipoLocalizacion localizacion, String centroComercial) {
		super(identificadorInmobiliario, area, direccion, localizacion, 3000000);
		this.centroComercial = centroComercial;
	}
	
	public String getCentroComercial() {
		return centroComercial;
	}
	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}
}
