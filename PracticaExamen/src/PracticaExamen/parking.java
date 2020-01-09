package PracticaExamen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parking {
	
	static Coche[][] arrayCoches;

	static InputStreamReader peticionEntrada = new InputStreamReader(System.in);
	static BufferedReader bufferLectura = new BufferedReader(peticionEntrada);

	public static void main(String[] args) throws IOException {

		int opcion = 0;

		System.out.println("que quieres hacer?");
		System.out.println("1: crear parking,2: crear coche, 3: buscar coche, 4: coche mas viejo, 5: mirar si esta lleno");
		opcion = Integer.parseInt(bufferLectura.readLine());
		switch (opcion) {
		case 1:
			crearParking(arrayCoches);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
		}
	}
	static private  void crearParking(Coche[][] inArrayCoches) throws IOException {
		
		int filas, columnas;
		
		System.out.println("cauntas filas?");
		filas = Integer.parseInt(bufferLectura.readLine());
		System.out.println("cauntas columnas?");
		columnas = Integer.parseInt(bufferLectura.readLine());
		
		arrayCoches = new Coche[filas][columnas];
		
	}
	
	static private void crearCoche(Coche[][] inArrayCoches) throws IOException {
		 for(int i=0;i < inArrayCoches.length;i++){
			 for(int j=0;j<inArrayCoches[i].length;j++) {
				 
			 }
		 }
	}
}
