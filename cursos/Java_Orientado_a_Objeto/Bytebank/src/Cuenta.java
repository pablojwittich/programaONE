public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();

// 	Constructor
	public static int totalCuenta = 0; // Variable estatica

// 	Agencia
	public Cuenta(int agencia) {
		if (agencia <= 0) {
			this.agencia = 1;
			System.out.println("No se permiten numeros negativos ni cero");
		} else {
			this.agencia = agencia;
		}
		totalCuenta++; // Incrementa de a 1 cada vez que se crea una cuenta
		//System.out.println("Se van creando " + totalCuenta + " cuentas");
	}

// 	Getter & setter

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotalCuenta() {
		return Cuenta.totalCuenta;
	}

// 	Métodos

	// Depositar
	public void depositar(double valorDepositar) {
		setSaldo(valorDepositar);
		System.out.println("Su saldo actual es de $" + getSaldo());
	}

	// Retirar
	public boolean retirar(double valorRetirar) {
		if (getSaldo() >= valorRetirar) {
			setSaldo(-valorRetirar);
			System.out.println("Extracción existosa! Su saldo acutal es de $" + getSaldo());
			return true;
		} else {
			System.out.println("Saldo insuficiente");
		}
		return false;
	}

	// Transferir
	public boolean transferir(double valorTransferir) {
		if (getSaldo() >= valorTransferir) {
			setSaldo(-valorTransferir);
			System.out.println("Transferiencia exitosa! Saldo actual es de $" + getSaldo());
			return true;
		} else {
			System.out.println("Saldo insuficiente");
		}
		return false;
	}
}