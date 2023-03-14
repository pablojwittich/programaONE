package bytebank_heredado;

public class Gerente extends Funcionario{
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean autenticar(String clave) {
		return clave == "AluraLatam";
	}
}