
public class EjemploCaracteres {
	public static void main(String[] args) {
		char caracteres1 = 'a'; // se deben utilizar comillas simples
		System.out.println(caracteres1);
		
		char caracteres2 = 1; // Devolverá lo que represente 1 en la tabla Ascii
		System.out.println(caracteres2);
		
		String palabra1 = "Hola Mundo!"; // La palabra String no es una palabra reservada como variable... Si no es un objeto
		System.out.println(palabra1);
		
		palabra1 = palabra1 + "Soy Pablo";// No se modifica la cadena... Si no que se crea otro objeto
		System.out.println(palabra1);
		
		
		
	}

}
