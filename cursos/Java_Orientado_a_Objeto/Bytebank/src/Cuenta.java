public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();
	
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public void depositar (double valorDepositar) {
		setSaldo(valorDepositar);
		System.out.println("Su saldo actual es de $" + getSaldo());
	}
	
	public boolean retirar (double valorRetirar) {
		if (getSaldo() >= valorRetirar) {
			setSaldo(- valorRetirar);		
			System.out.println("Extracción existosa! Su saldo acutal es de $" + getSaldo());
			return true;
		} else {
			System.out.println("Saldo insuficiente");
		}
		return false;
	}
	
	public boolean transferir(double valorTransferir) {
		if (getSaldo() >= valorTransferir) {
			setSaldo(- valorTransferir);
			System.out.println("Transferiencia exitosa! Saldo actual es de $" + getSaldo());
			return true;
		} else {
			System.out.println("Saldo insuficiente");
		}
		return false;
	}
}