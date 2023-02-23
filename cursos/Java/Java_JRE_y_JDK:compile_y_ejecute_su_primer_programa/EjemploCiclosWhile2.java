public class EjemploCiclosWhile2 {
	public static void main(String[] args) {
		
		int contador = 0;
		int totalContador = 0; // Forma correcta
		
		while(contador <= 10) {
			// int total = 0; -> Forma incorrecta porque el total siempre por cada ciclo volbera a ser cero
			totalContador = totalContador + contador;
			contador ++;
		}
		System.out.println(totalContador); // Se lo pone afuera del scope de while para que pueda acceder a la variable totalContador
	}
}
