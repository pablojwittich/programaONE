public class TestReferencia3 {
	public static void main(String[] args) {
		
		//Que pasaria si ...
		
		//CASO 1
		//Cuenta cuentaAndres = new Cuenta();
		//cuentaAndres.titular.nombre = "Andres";
		//System.out.println(cuentaAndres.titular.nombre); -> Exception por que en .titular ya es null y cuando pedimos nombre nos salta exception
		
		//CASO 2
		//Cuenta cuentaAndres = new Cuenta();
		//Cliente clienteAndres = new Cliente();
		//cuentaAndres.titular = clienteAndres;
		//System.out.println(cuentaAndres.titular.nombre); -> Null porque ahora titular existe pero nombre no
		
		
		
		//Forma para crar un nuevo objeto y crear un referencia dentro otro objeto
		
		// Forma 1
		//Cuenta cuentaAndres = new Cuenta(); -> Crea obj 1
		//Cliente clienteAndres = new Cliente(); -> Crea obj2
		//cuentaAndres.titular = clienteAndres; -> Se lo liga al obj1
		
		// Forma 2
		Cuenta cuentaAndres = new Cuenta(921); //Crea obj1
		cuentaAndres.setTitular(new Cliente());// Crea obj2 y lo liga al obj1 atra vez de titular
		
		System.out.println(cuentaAndres.getTitular()); // Imprime la id del cliente (obj)
		
		
		// ESTAS DOS FORMAS CREAN UNA IDENTIFICACIÓN EN LA MEMORIA DIFERENTES 
	}
}
