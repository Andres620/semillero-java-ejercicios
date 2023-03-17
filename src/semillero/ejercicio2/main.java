package semillero.ejercicio2;

public class main {

	public static void main(String[] args) {
		System.out.println("------------Cuenta Ahorros-----------" + "\n");
		CuentaAhorros cuentaAhorros = new CuentaAhorros(20000, 0.1f);
		cuentaAhorros.consignar(1000);
		cuentaAhorros.imprimir();
		cuentaAhorros.retirar(5000);
		cuentaAhorros.imprimir();
		cuentaAhorros.consignar(1000);
		cuentaAhorros.retirar(5000);
		cuentaAhorros.retirar(500);
		cuentaAhorros.retirar(500);
		cuentaAhorros.retirar(5000);
		cuentaAhorros.extractoMensual();
		cuentaAhorros.imprimir();
		
		System.out.println("------------Cuenta Corriente-----------" + "\n");
		CuentaCorriente cuentaCorriente = new CuentaCorriente(12000, 0.2f);
		cuentaCorriente.consignar(1000);
		cuentaCorriente.imprimir();
		cuentaCorriente.retirar(5000);
		cuentaCorriente.imprimir();
		cuentaCorriente.consignar(1000);
		cuentaCorriente.retirar(5000);
		cuentaCorriente.retirar(500);
		cuentaCorriente.retirar(500);
		cuentaCorriente.retirar(5000);
		cuentaCorriente.extractoMensual();
		cuentaCorriente.imprimir();

	}

}
