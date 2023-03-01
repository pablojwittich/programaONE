public class CrearCuenta {
	public static void main(String[] args) {
		
		Cuenta cuentaDiego = new Cuenta();
		
		cuentaDiego.salario = 100.54;
		cuentaDiego.agencia = 01;
		cuentaDiego.numero = 98765;
		//Aparece error por que Diego no es un objeto. Como piede que sea ahora Cuenta
		//cuentaDiego.titular = "Diego";
		
		
		// Con la nueva configuración se tendria que hacer lo siguiente
		Cliente diegoCliente = new Cliente();
		cuentaDiego.titular = diegoCliente;
		
		diegoCliente.nombre = "Diego Nicolas";
		diegoCliente.documento = "123456789";
		diegoCliente.telefono = "987654321";
		
		
		// Para ver que todo este ok realizamos lo sieguiente
		System.out.println(cuentaDiego.titular.telefono);
		
		 
	}
}