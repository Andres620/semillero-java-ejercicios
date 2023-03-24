package taller3.ejercicio4;

public class CuentaAhorros extends CuentaBancaria {
	private static final double PORCENTAJE_RETIROS = 0.01;
	private static final int MAX_NUM_RETIROS = 3;
	private static final double PORCENTAJE_DEPOSITO = 0.005;
	private int numDepositos;

	public CuentaAhorros(String numeroCuenta, float saldo, String propietario) {
		super(numeroCuenta, saldo, propietario);
	}

	@Override
	public void depositar(float monto) throws DepositoException {
		if (monto <= 0) {
            throw new DepositoException("El monto a depositar debe ser mayor a cero");
        }
		if (numDepositos > 2) {
			monto += monto * PORCENTAJE_DEPOSITO;
            numDepositos++;
		}
		super.saldo += monto;
		System.out.println("Se depositaron " + monto + " - Nuevo saldo: " + super.saldo);
	}

	@Override
	public void retirar(float monto) throws RetiroException {
        if (monto <= 0) {
            throw new RetiroException("El monto a retirar debe ser mayor a cero");
        }
		if (super.saldo < monto) {
			throw new RetiroException("Saldo insuficiente para realizar el retiro.");
		}
        if (super.numRetiros > MAX_NUM_RETIROS - 1) {
            monto += monto * PORCENTAJE_RETIROS;
        }
        
        super.saldo -= monto;
        super.numRetiros++;
        System.out.println("Se retiraron " + monto + " - Nuevo saldo: " + super.saldo);
	}

}
