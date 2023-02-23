
public class EjemploCondicionales1 {
	public static void main(String[] args) {
		int edad = 18;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja == true;
		
		System.out.println("El valor de la condición es: " + esPareja);
		
		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no puede entrar");
		}
	}
}
