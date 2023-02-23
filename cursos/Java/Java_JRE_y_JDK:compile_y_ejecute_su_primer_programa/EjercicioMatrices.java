public class EjercicioMatrices {
	public static void main(String[] args) {
		// MATRIZ CUADRADA DE 1OX10 EN *
		/*
		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna <= 10; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		} */
			
		// MATRIZ TRIANGULAR (RECTANGULO) EN *
		/*
		for (int fila = 0; fila <= 10; fila ++) {
			for (int columna = 0; columna < fila; columna ++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		} */
		
		// MATRIS TRIANGULAR (RECTANGULAR) CON BREAK; EN *
		for (int fila = 0; fila <= 10; fila ++) {
			for (int columna = 0; columna <= 10; columna ++) {
				if (columna >=fila) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
