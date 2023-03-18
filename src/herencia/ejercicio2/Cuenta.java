package herencia.ejercicio2;

	public class Cuenta {
		protected float saldo;
		protected int numeroConsignaciones = 0;
		protected int numeroRetiros = 0;
		protected float tasaAnual;
		protected float comisionMensual = 0.0f;
		
	public Cuenta(float saldo, float tasaAnual) {
	    this.saldo = saldo;
	    this.tasaAnual = tasaAnual;
	}	
	
    public void consignar(float cantidad) {
        saldo += cantidad;
        this.numeroConsignaciones++;
    }
    
    
    public void retirar(float cantidad) {
    	if (cantidad > 0 && cantidad <= this.saldo) {
    		this.saldo -= cantidad;
        	this.numeroRetiros++;
        }else {
        	System.out.println("no es posible retirar esa cantidad");
        }
        
    }
    
    public void calcularInteresMensual() {
        float interesMensual = this.saldo * (this.tasaAnual/12);
        this.saldo += interesMensual;
    }
    
    public void extractoMensual() {
    	this.saldo -= this.comisionMensual;
        calcularInteresMensual();
    }
    
    public void imprimir() {
        System.out.println("Saldo: $" + this.saldo + "\n");
        System.out.println("Comisión mensual: $" + this.comisionMensual + "\n");
        System.out.println("Tasa anual: " + this.tasaAnual + "\n");
        System.out.println("Número consignaciones: $" + this.numeroConsignaciones + "\n");
        System.out.println("Número retiros: $" + this.numeroRetiros + "\n");
    }

}


