class Cuenta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular = new Cliente();

// Metodos sin retorno
	public void depositar(double valor) {
		this.saldo = +valor;
		// System.out.println("Su saldo actual es de $" + this.salario);
	}

// Metodos que retornan valor -> Retirar
	public boolean retirar(double valorRetirar) {
		if (this.saldo >= valorRetirar) {
			this.saldo = -valorRetirar;
			System.out.println("Extración exitosa. Saldo acutal de $" + this.saldo);
			return true;
		} else {
			if (this.saldo < valorRetirar)
				System.out.println("Saldo insuficiente");
		}
		return false;
	}

// Metodos que retornan valor -> Transferir
	public boolean transferir(double valorTransferir, Cuenta cuenta) {
		if (this.saldo >= valorTransferir) {
			this.saldo = -valorTransferir;
			cuenta.depositar(valorTransferir);
			System.out.println("Transferiencia exitosa! A " + cuenta + " se le transfirio $" + valorTransferir
					+ " Tu saldo es de $" + this.saldo);
			return true;
		} else {
			if (this.saldo < valorTransferir) {
				System.out.println("Saldo insuficiente");
			}
			return false;
		}
	}
}