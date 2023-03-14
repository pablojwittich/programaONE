package bytebank_heredado;

public class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;

// 	Constructor
	public Funcionario() {

	}

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
	
	public double getTipo() {
		return this.tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

//	Metodos
	public double getBonificacion() {
		// gerente = tipo 0
		// funcionario = tipo 1
		
		if (this.tipo == 0) {
			return this.salario;
		} else if (this.tipo == 1) {
			return this.salario * 0.1;
		} else {
			return 0;
		}
	}
}