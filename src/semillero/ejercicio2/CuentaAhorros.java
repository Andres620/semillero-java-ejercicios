package semillero.ejercicio2;

public class CuentaAhorros extends Cuenta{

	private boolean activa;
	
	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		if(saldo < 10000) {
			this.activa = false;
		}else {
			this.activa = true;
		}
		
		
	}
	
	@Override
	public void consignar(float cantidad) {
		if(activa) super.consignar(cantidad);
	}
	
	@Override
	public void retirar(float cantidad) {
		if(activa) super.retirar(cantidad);
	}
	
	@Override
	public void extractoMensual() {
		if(this.numeroRetiros > 4) this.comisionMensual += (this.numeroRetiros - 4) * 1000;
		super.extractoMensual();
		
		if(saldo < 10000) activa = false;
	}
	
	@Override
	public void imprimir() {
        System.out.println("Saldo: $" + this.saldo + "\n");
        System.out.println("Comisión mensual: $" + this.comisionMensual + "\n");
        System.out.println("Número de transacciones: " + (this.numeroConsignaciones + this.numeroRetiros) + "\n");
        System.out.println("-----------------------------" + "\n");
	}
}
