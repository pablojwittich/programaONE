
public class TipoVariale {
	public static void main (String[] args) {
		// int -> Soporta 32 bits es decir numeros entre +-2 ³¹
		int edad = 25;
		System.out.println("Mi edad es " + edad);
		
		double salario = 45.351;
		System.out.println("Mi sueldo por mes es de $" + salario);
		
		// Pasar un double a int - Metodo Cast
		
		int salarioNuevo = (int) salario;
		System.out.println("Mi salario nuevo es $" + salarioNuevo);
		
		// long soporta numeros entre +-2⁶³ (se tiene que especificar cuando se vaya a usar)
		long numeroMasGrande = 999999999999999999L;
		System.out.println("El número mas grande que puede soprotar java es " + numeroMasGrande);
		
		// Numero mas pequeño que int con -> Short -> Soportá +-2¹⁶
		short numeroMasPequeñoAInt = 1355;
		System.out.println("Un número mas pequeño que int con short " + numeroMasPequeñoAInt);
		
		// Con byte podemos establecer numeros mas pequeños que short porque soporta 8 bits de tamaño
		byte numeroAunMasPequeño = 123;
		System.out.println ("Numero mas pequeño que short con byte" + numeroAunMasPequeño);
		
		// Un Numero mas pequeño decimas con float (se tiene que especificar que es float con un F al final)
		float numeroDecimalMasPequeño = 0.2F;
		System.out.println("Numero decimal aun mas pequeño con float " + numeroDecimalMasPequeño);
		

		
		
	}
}
