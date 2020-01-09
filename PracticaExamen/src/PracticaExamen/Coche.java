package PracticaExamen;

public class Coche {
	
	private String matricula = "";
	private String numeroDeBastidor = "";
	private String marca = "";
	private int año = 0;
	
	public Coche() {
		super();
		this.matricula = "";
		this.numeroDeBastidor = "";
		this.marca = "";
		this.año = 0;
	}
	
	public Coche(String matricula, String numeroDeBastidor, String marca, int año) {
		super();
		this.matricula = matricula;
		this.numeroDeBastidor = numeroDeBastidor;
		this.marca = marca;
		this.año = año;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNumeroDeBastidor() {
		return numeroDeBastidor;
	}

	public void setNumeroDeBastidor(String numeroDeBastidor) {
		this.numeroDeBastidor = numeroDeBastidor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void mostrarInfo() {
		System.out.println("Coche");
		System.out.println("La matricula es: " + matricula);
		System.out.println("El numero de bastidor es: " + numeroDeBastidor);
		System.out.println("La marca es: " + marca);
		System.out.println("El año es: " + año);
	}
	
}
