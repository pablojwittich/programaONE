public class TestReferencia {
	public static void main(String[] args) {
		
		Cuenta diegoCuenta = new Cuenta(01);
		diegoCuenta.depositar(100);
		
		Cuenta aluraCuenta = diegoCuenta;
		aluraCuenta.depositar(200);
	}
}
