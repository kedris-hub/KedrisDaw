package PracticaExamen;

public class Coche {
	
	private String matricula = "";
	private String numeroDeBastidor = "";
	private String marca = "";
	private int a�o = 0;
	
	public Coche() {
		super();
		this.matricula = "";
		this.numeroDeBastidor = "";
		this.marca = "";
		this.a�o = 0;
	}
	
	public Coche(String matricula, String numeroDeBastidor, String marca, int a�o) {
		super();
		this.matricula = matricula;
		this.numeroDeBastidor = numeroDeBastidor;
		this.marca = marca;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public void mostrarInfo() {
		System.out.println("Coche");
		System.out.println("La matricula es: " + matricula);
		System.out.println("El numero de bastidor es: " + numeroDeBastidor);
		System.out.println("La marca es: " + marca);
		System.out.println("El a�o es: " + a�o);
	}
	
}
