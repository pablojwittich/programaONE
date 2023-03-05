public class TestReferencia2 {
	public static void main(String[] args) {
		// Creacion cliente nuevo
		Cliente ignacio = new Cliente();
		
		// Inicializando atributos de Cliente
		ignacio.setNombre("Jose Ignacio");
		ignacio.setDocumento("424561334");
		ignacio.setTelefono("381455681");
		
		// Creando cuenta nueva
		Cuenta iganacioCuenta = new Cuenta(321);
		
		// Referenciando la cuenta con el cliente
		iganacioCuenta.setTitular(ignacio);
		
		System.out.println(iganacioCuenta.getTitular());
		
	}
}
