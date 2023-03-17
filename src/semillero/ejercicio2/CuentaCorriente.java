package semillero.ejercicio2;

public class CuentaCorriente extends Cuenta{
	private float sobregiro = 0.0f;
	
	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}

	@Override
	public void retirar(float cantidad) {
		float saldoRestante = saldo - cantidad;
		if(saldoRestante < 0) {
			this.sobregiro += saldoRestante;
			this.saldo = 0;
		}else {
			super.retirar(cantidad);			
		}
		
	}
	
	@Override
	public void consignar(float cantidad) {
		float valorSobregiro = this.sobregiro - cantidad;
		if(this.sobregiro > 0.0f) {
			if(valorSobregiro > 0) {
				this.sobregiro = valorSobregiro;
			}else {
				this.sobregiro = 0;
				this.saldo = -valorSobregiro;
			}
		}else {
			super.consignar(cantidad);			
		}
	}
	
	@Override
	public void extractoMensual() {
		super.extractoMensual();
	}

	@Override
	public void imprimir() {
        System.out.println("Saldo: $" + this.saldo + "\n");
        System.out.println("Comisión mensual: $" + this.comisionMensual + "\n");
        System.out.println("Número de transacciones: " + (this.numeroConsignaciones + this.numeroRetiros) + "\n");
        System.out.println("Valor del sobregiro: $" + this.sobregiro + "\n");
        System.out.println("-----------------------------" + "\n");
	}

}
