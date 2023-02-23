
public class EjemploValoresVariables {
	public static void main(String[] args) {
		int numero1 = 1;
		int numero2 = 0;
		System.out.println(numero2); // numero2 = 0
		
		numero2 = numero1;
		System.out.println(numero2); // numero2 = 1
		
		numero1 = 2;
		System.out.println(numero2); // numero2 = 1
		/*
		 En algunos lenguajes pasa mucho lo que son punteros desde la variable no al valor, si no a la dirección 
		 de memoria de esta variable. En el caso de java no es asi; en Java al guardar el valor de una variable
		 apunta al valor NO a la variable
		 */
		
	}
}
