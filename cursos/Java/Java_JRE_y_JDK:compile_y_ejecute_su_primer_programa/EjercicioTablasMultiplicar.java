public class EjercicioTablasMultiplicar {

	public static void main(String[] args) {
		for(int contador = 0; contador <= 10; contador ++) {
			for(int multiplicar = 0; multiplicar <= 10; multiplicar ++) {
				System.out.print(contador * multiplicar);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
