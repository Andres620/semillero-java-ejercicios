package taller3.ejercicio4;

public class Main {

	public static void main(String[] args) {
		// Crear una cuenta de ahorro con un saldo de 5000 unidades y un propietario llamado Juan
        CuentaBancaria cuentaAhorros = new CuentaAhorros("001", 5000, "Andrés");
        
        // Depositar 2000 pesos
        try {
        	cuentaAhorros.depositar(2000);
        } catch (DepositoException e) {
            System.out.println(e.getMessage());
        }
        
        // Depositar 0 pesos
        try {
        	cuentaAhorros.depositar(0);
        } catch (DepositoException e) {
            System.out.println(e.getMessage());
        }
        
        // Retirar 6000 pesos
        try {
        	cuentaAhorros.retirar(6000);
        	cuentaAhorros.retirar(60);
        	cuentaAhorros.retirar(60);
        	cuentaAhorros.retirar(60);
        } catch (RetiroException e) {
            System.out.println(e.getMessage());
        }
        
        // Retirar 3000 pesos (saldo insuficiente)
        try {
        	cuentaAhorros.retirar(3000);
        } catch (RetiroException e) {
            System.out.println(e.getMessage());
        }
        
        // Retirar 0 pesos
        try {
        	cuentaAhorros.retirar(0);
        } catch (RetiroException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("------------------------------------------------");

		// Crear una cuenta de ahorro con un saldo de 5000 unidades y un propietario llamado Juan
        CuentaBancaria cuentaCorriente = new CuentaCorriente("002", 5000, "Andrés");
        
        // Depositar 2000 pesos
        try {
        	cuentaCorriente.depositar(2000);
        } catch (DepositoException e) {
            System.out.println(e.getMessage());
        }
        
        // Depositar 0 pesos
        try {
        	cuentaCorriente.depositar(0);
        } catch (DepositoException e) {
            System.out.println(e.getMessage());
        }
        
        // Retirar 1000 pesos 5 veces (Máximo cantidad de retiros)
        try {
        	cuentaCorriente.retirar(1000);
        	cuentaCorriente.retirar(1000);
        	cuentaCorriente.retirar(1000);
        	cuentaCorriente.retirar(1000);
        	cuentaCorriente.retirar(1000);
        } catch (RetiroException e) {
            System.out.println(e.getMessage());
        }
        
        // Retirar 1000 pesos (Sobrepasa el máximo de retiros posibles)
        try {
        	cuentaCorriente.retirar(1000);
        } catch (RetiroException e) {
            System.out.println(e.getMessage());
        }
        
        
        // Retirar 0 pesos
        try {
        	cuentaCorriente.retirar(0);
        } catch (RetiroException e) {
            System.out.println(e.getMessage());
        }
	}

}
