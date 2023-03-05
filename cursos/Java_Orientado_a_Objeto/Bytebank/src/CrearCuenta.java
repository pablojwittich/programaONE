public class CrearCuenta {
	public static void main(String[] args) {
		
		Cuenta cuentaDiego = new Cuenta(332);
		
		cuentaDiego.setSaldo(121.320);
		cuentaDiego.setAgencia(001);
		cuentaDiego.setNumero(98765);
		cuentaDiego.retirar(200);
		
		// Con la nueva configuración se tendria que hacer lo siguiente.
		Cliente diegoCliente = new Cliente();
		cuentaDiego.setTitular(diegoCliente);
		
		diegoCliente.setNombre("Diego Nicolas"); 
		diegoCliente.setDocumento("123456789");
		diegoCliente.setTelefono("987654321");
		
		
		// Para ver que todo este ok realizamos lo sieguiente.
		System.out.println(cuentaDiego.getTitular().getTelefono());
		
		// Si imprime el numero de telefono esta todo ok.
		 
	}
}