package semillero.ejercicio1;

public class Factura extends Precio{
	private String emisor;
    private String cliente;
    
    public Factura(double precio, String emisor, String cliente) {
		super(precio);
		this.emisor = emisor;
		this.cliente = cliente;
	}
    
    public void imprimirFactura() {
        System.out.println("Factura");
        System.out.println("Valor: " + precio);
        System.out.println("Emisor: " + emisor);
        System.out.println("Cliente: " + cliente);
    }
}
