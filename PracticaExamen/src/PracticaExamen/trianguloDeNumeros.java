package PracticaExamen;

public class trianguloDeNumeros {
	public static void main(String[] args) {
		int numeroMaximo = 5;
		String cadenaNumeros = "";
		do{
			cadenaNumeros = "";
			for (int i=numeroMaximo;i>0;i--) {
				cadenaNumeros= cadenaNumeros + i + " ";
			}
			System.out.println(cadenaNumeros);
			numeroMaximo--;
		}while(numeroMaximo>0);
	}
}