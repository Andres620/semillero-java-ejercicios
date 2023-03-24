package taller3.ejercicio4;

public class CuentaCorriente extends CuentaBancaria {
	private static final int MAX_NUM_RETIROS = 5;

	public CuentaCorriente(String numeroCuenta, float saldo, String propietario) {
		super(numeroCuenta, saldo, propietario);
	}

	@Override
	public void depositar(float monto) throws DepositoException {
		if (monto <= 0) {
            throw new DepositoException("El monto a depositar debe ser mayor a cero");
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
			throw new RetiroException("Se ha alcanzado el máximo de retiros permitidos.");
		}

		saldo -= monto;
		super.numRetiros++;
		System.out.println("Se retiraron " + monto + " - Nuevo saldo: " + super.saldo);
	}

}
