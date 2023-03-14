package bytebank_heredado;

public class TestGerente {
	public static void main(String[] args) {

		Gerente belen = new Gerente();
		
		belen.setNombre("bella");
		belen.setDocumento("41232450");
		belen.setSalario(53000.324);
		belen.setTipo(0);
		belen.setClave("AluraLatam");
		
		System.out.println(belen.autenticar("AluraLatam"));
	}
}
