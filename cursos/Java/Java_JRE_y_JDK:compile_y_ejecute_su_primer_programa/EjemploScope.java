
public class EjemploScope {
	public static void main(String[] args) {
		
		//Ejemplo 1
		int edad = 18; 
		int cantidadPersonas = 2;
		// Variables con un scope mayor (global) 
		
		if (cantidadPersonas > 1) {
			boolean esPareja = true; // variable con scope de if 
		} else {
			boolean esPareja = false; //variable con scope de else y distinta al de if
		}
		
		System.out.println(esPareja); // Aparece error porque la variable no esta definida en un contexto mayor, si no que en el if y en el else
		
		
		
	
		// Ejemplo 2
		//int edad = 18;
		//int cantidadPersonas = 2;
		 //boolean esPareja;
		 //if (cantidadPersonas > 1) {
			 //esPareja = true;
		 //} else {
			 //esPareja = false;
		 //}
		 
		 //System.out.println(esPareja);
		 /*
		  Aca compila el codigo por que la variable esPareja esta
		  en un contexto o scope mayor que el if y el else 
		  */
	}
}
