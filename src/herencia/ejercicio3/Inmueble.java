package herencia.ejercicio3;

public abstract class Inmueble {
	protected int identificadorInmobiliario;
	protected int area;
	protected String direccion;
	protected int valorMetroCuadrado;
	
	protected Inmueble(int identificadorInmobiliario, int area, String direccion, int valorMetroCuadrado) {
		this.identificadorInmobiliario = identificadorInmobiliario;
		this.area = area;
		this.direccion = direccion;
		this.valorMetroCuadrado = valorMetroCuadrado;
	}
	
	
	public int obtenerValorDeCompra() {
		return area * valorMetroCuadrado;
	}
}
