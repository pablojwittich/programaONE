public class EjemploCondicinales {
	public static void main(String[] args) {
		int edad = 17;
		int cantidadPersonas = 1;

		if (edad >= 18) {
			System.out.println("Puede ingresar");
		} else {
			if (cantidadPersonas >= 2) {
				System.out.println("Usted es menor de edad pero le es permitido entrar");
			}
		}
	}
}
