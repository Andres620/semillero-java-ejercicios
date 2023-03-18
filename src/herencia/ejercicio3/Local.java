package herencia.ejercicio3;

public abstract class Local extends Inmueble{

	protected enum tipoLocalizacion{interno, calle};
	protected tipoLocalizacion localizacion;
	
	protected Local(int identificadorInmobiliario, int area, String direccion, tipoLocalizacion localizacion, int valorMetroCuadrado) {
		super(identificadorInmobiliario, area, direccion, valorMetroCuadrado);
		this.localizacion = localizacion;
	}

}
