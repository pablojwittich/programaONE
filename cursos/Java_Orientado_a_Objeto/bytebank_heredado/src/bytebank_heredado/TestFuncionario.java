package bytebank_heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario pablo = new Funcionario();
		
		pablo.setDocumento("412422543");
		pablo.setNombre("Pablo Javer");
		pablo.setSalario(45000.32);
		
		System.out.println(pablo.getSalario());
		System.out.println(pablo.getBonificacion());
	}
}
