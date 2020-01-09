package PracticaExamen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	
	public static void main(String[] args) throws IOException {
		
		int numero = 0;
		int multiplicacion = 1;
		
		InputStreamReader peticionEntrada = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(peticionEntrada);
		
		System.out.println("De que numero quieres hacer el factorial");
		numero = Integer.parseInt(bufferLectura.readLine());
		
		for (int i=numero; i > 0; i--) {
			multiplicacion = multiplicacion * i;
			if (multiplicacion != numero) {
				System.out.println(multiplicacion);
			}
		}	
	}
}
