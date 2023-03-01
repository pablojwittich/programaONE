class Cuenta {
	double salario;
	int agencia;
	int numero;
	Cliente titular;

// Metodos sin retorno
	public void depositar(double valor) {
		this.salario = this.salario + valor;
		//System.out.println("Su saldo actual es de $" + this.salario);
	}
	
// Metodos que retornan valor -> Retirar
	public boolean retirar(double valorRetirar) {
		if (this.salario >= valorRetirar) {
			this.salario = this.salario - valorRetirar;
			System.out.println("Extración exitosa. Saldo acutal de $" + this.salario);
			return true;
		} else {
			if (this.salario < valorRetirar)
			System.out.println("Saldo insuficiente");
		}
		return false;
	}
// Metodos que retornan valor -> Transferir
	public boolean transferir(double valorTransferir, Cuenta cuenta) {
		if (this.salario >= valorTransferir) {
			this.salario = this.salario - valorTransferir;
			cuenta.depositar(valorTransferir);
			System.out.println("Transferiencia exitosa! A " + cuenta + " se le transfirio $" + valorTransferir 
					+ " Tu saldo es de $" + this.salario);
			return true;
		} else {
			if (this.salario < valorTransferir) {
				System.out.println("Saldo insuficiente");
			}
			return false;
		}
	}
}