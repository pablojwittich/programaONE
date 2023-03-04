public class CrearCuenta {
	public static void main(String[] args) {
		
		Cuenta cuentaDiego = new Cuenta();
		
		cuentaDiego.setSaldo(121.320);
		cuentaDiego.setAgencia(001);
		cuentaDiego.setNumero(98765);
		cuentaDiego.retirar(200);
		
		// Con la nueva configuración se tendria que hacer lo siguiente.
		Cliente diegoCliente = new Cliente();
		cuentaDiego.titular = diegoCliente;
		
		diegoCliente.nombre = "Diego Nicolas";
		diegoCliente.documento = "123456789";
		diegoCliente.telefono = "987654321";
		
		
		// Para ver que todo este ok realizamos lo sieguiente.
		System.out.println(cuentaDiego.titular.telefono);
		
		// Si imprime el numero de telefono esta todo ok.
		 
	}
}