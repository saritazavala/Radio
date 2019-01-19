/*Martin Ortega 18020
Sara Zavala 18893
Algoritmos y Estructuras de datos
Se corre todo el programa junto
Main.java
*/

import java.util.Scanner;
/**
 * @author user
 *
 */
public class Main {

	public static Radio radio = new Radio(); //Se crea nuevo objeto
	public static void main(String args[]) {
		boolean amofm = true;
		double fmfrec = 87.9;
		double amfrec = 530;
		Scanner teclado = new Scanner (System.in); //Scanner teclado
			System.out.println("============");
			System.out.println("Radio Apagado");
			System.out.println("============");

			System.out.println("Ingrese 1 si desea prender el radio");

			int prender = teclado.nextInt();
			teclado.nextLine();
			//ciclo para ir dando las opcines a elegir all usuario
			while (prender==1){
				//menu de opciones
				System.out.println("====================");
				System.out.println("Menu de opciones");
				System.out.println("====================");

				System.out.println("1. Cambiar AM o FM");
				System.out.println("2. Apagar Radio");
				System.out.println("3. Subir Frecuencia");
				System.out.println("4. Bajar Frecuencia");
				System.out.println("5. Marcar como Favorito");
				System.out.println("6. Buscar Favorito");
				System.out.println("===================================");

				System.out.println("Ingrese la opcion deseada");

				int opcion = teclado.nextInt();
				teclado.nextLine();
				//OPCION 1
				if (opcion==1) {
					amofm = radio.cambiarAmFm();
					if (!amofm) {
						System.out.println("AM");
					}

					else{
						System.out.println("PM");
					}
				}
				//OPCION 2
				if (opcion==2) {
					System.out.println("Adios");
					prender=2;
				}
				//OPCION 3
				if (opcion==3) {
					
					if(amofm){
						fmfrec = radio.subirFrecuencia();
						System.out.println(fmfrec);
					}
					else{
						amfrec = radio.subirFrecuencia();
						System.out.println(amfrec);
					}
					System.out.println("Frecuencia subida");

					
				}

				//OPCION 4
				if (opcion==4) {
					if(amofm){
						fmfrec = radio.bajarFrecuencia();
						System.out.println(fmfrec);
					}
					else{
						amfrec = radio.bajarFrecuencia();
						System.out.println(amfrec);
					}
					System.out.println("Frecuencia bajada");
				}

				//OPCION '5'
				if (opcion==5) {
					System.out.println("Ingrese posicion de la emisora que desea guardar (del 1 al 12).");
					int posicion = teclado.nextInt();
					teclado.nextLine();
					radio.setFavorito(posicion);
				}

				//OPCION 6
				if (opcion==6) {
					System.out.println("Ingrese posicion de la emisora que desea buscar (del 1 al 12).");
					int posicion = teclado.nextInt();
					teclado.nextLine();
					if(amofm){
						fmfrec = radio.getFavorito(posicion);
						
						System.out.println(fmfrec);
					}
					else{
						amfrec = radio.getFavorito(posicion);
						
						System.out.println(amfrec);
					}
					System.out.println("Frecuencia puesta.");
					
				}

				
					

				

			}
		}

	}

