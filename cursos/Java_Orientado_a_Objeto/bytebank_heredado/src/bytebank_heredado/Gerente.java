package bytebank_heredado;

public class Gerente {
	private String nombre; 
	private String documento;
	private double salario;
	
// 	Getter & Setter	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return this.documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
// Metodos
	
	public double getBonificación() {
		return this.salario * 2;
	}
	
	
	
	

}
