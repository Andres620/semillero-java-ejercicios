package semillero.ejercicio3;

public class Oficina extends Local{
	private boolean gobierno;
	
	public Oficina(int identificadorInmobiliario, int area, String direccion,
			tipoLocalizacion localizacion, boolean gobierno) {
		super(identificadorInmobiliario, area, direccion, localizacion, 3500000);
		this.gobierno = gobierno;
	}
	
	public boolean isGobierno() {
		return gobierno;
	}

	public int getValorMetroCuadrado() {
		return valorMetroCuadrado;
	}

	public void setValorMetroCuadrado(int valorMetroCuadrado) {
		this.valorMetroCuadrado = valorMetroCuadrado;
	}

	
	
}
