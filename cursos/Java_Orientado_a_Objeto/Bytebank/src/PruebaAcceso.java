public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta nanoCuenta = new Cuenta(123);
		Cliente nanoCliente = new Cliente();
		
		nanoCliente.setNombre("Nano");
		nanoCliente.setDocumento("124985343");
		nanoCliente.setTelefono("4213184");
		
		nanoCuenta.setTitular(nanoCliente); // Referenciamos la cuenta a un titular
		
		System.out.println(nanoCliente.getNombre());
		System.out.println(nanoCuenta.getTitular().getNombre()); // Comprobamos que ambos tengan el mismo titual
	}
}