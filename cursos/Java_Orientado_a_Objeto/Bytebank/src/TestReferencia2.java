public class TestReferencia2 {
	public static void main(String[] args) {
		// Creacion cliente nuevo
		Cliente ignacio = new Cliente();
		
		// Inicializando atributos de Cliente
		ignacio.nombre = "Jose Ignacio";
		ignacio.documento = "424561334";
		ignacio.telefono = "381455681";
		
		// Creando cuenta nueva
		Cuenta iganacioCuenta = new Cuenta();
		
		// Referenciando la cuenta con el cliente
		iganacioCuenta.titular = ignacio; 
		
		// Probando...
		System.out.println(iganacioCuenta.titular.nombre);
		
	}
}
