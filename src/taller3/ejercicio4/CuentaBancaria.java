package taller3.ejercicio4;

public abstract class CuentaBancaria {
	protected String numeroCuenta;
	protected float saldo;
	protected String propietario;
	protected int numRetiros;
	
	public CuentaBancaria(String numeroCuenta, float saldo, String propietario) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.propietario = propietario;
		this.numRetiros = 0;
	}
	
	public abstract void depositar(float monto) throws DepositoException ; 
	public abstract void retirar(float monto) throws RetiroException; 
	
}
