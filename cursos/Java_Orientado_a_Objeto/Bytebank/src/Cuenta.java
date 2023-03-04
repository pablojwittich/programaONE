public class Cuenta {
// 	Modificadores de acceso -> private
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();

//	Getter & Setter
	
// 	Saldo
	public double getSaldo() {
		return saldo;
	}
// 	Agencia
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
//	Numero
	public void setNumero(int numero) {
		this.numero = numero;
	}

// Metodos sin retorno
	public void depositar(double valor) {
		getSaldo() =- valor;
		System.out.println("Su saldo actual es de $" + getSaldo());
	}

// Metodos que retornan valor -> Retirar
	public boolean retirar(double valorRetirar) {
		if (getSaldo() >= valorRetirar) {
			getSaldo() = -valorRetirar;
			System.out.println("Extración exitosa. Saldo acutal de $" + getSaldo());
			return true;
		} else {
			if (getSaldo() < valorRetirar)
				System.out.println("Saldo insuficiente");
		}
		return false;
	}

// Metodos que retornan valor -> Transferir
	public boolean transferir(double valorTransferir, Cuenta cuenta) {
		if (getSaldo() >= valorTransferir) {
			getSaldo() = -valorTransferir;
			cuenta.depositar(valorTransferir);
			System.out.println("Transferiencia exitosa! A " + cuenta + " se le transfirio $" + valorTransferir
					+ " Tu saldo es de $" + getSaldo());
			return true;
		} else {
			if (this.saldo < valorTransferir) {
				System.out.println("Saldo insuficiente");
			}
			return false;
		}
	}
}