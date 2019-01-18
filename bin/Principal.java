
import java.util.Scanner;
public class Principal {

	public static Radio radio = new Radio();
	public static void main(String args[]) {
		Scanner teclado = new Scanner (System.in);
			System.out.println("=============");
			System.out.println("Radio Apagado");
			System.out.println("============");

			System.out.println("Ingrese 1 si desea prender el radio");

			int prender = teclado.nextInt();
			teclado.nextLine();
			while (prender==1){

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

				if (opcion==1) {
					radio.cambiarAmFm();

					if (radio.AMoFM==false) {
						System.out.println("AM");
					}

					else{
						System.out.println("PM");
					}
				}

				if (opcion==2) {
					System.out.println("Adios");
					prender=2;
				}

				if (opcion==3) {
					System.out.println(radio.subirFrecuencia());
					System.out.println("Frecuencia subida");

					
				}

				if (opcion==4) {
					radio.bajarFrecuencia();
					System.out.println("Frecuencia bajada");
				}

				if (opcion==5) {
					System.out.println("Ingrese posicion de la emisora que desea guardar");
					int posicion = teclado.nextInt();
					teclado.nextLine();
					radio.setFavorito(posicion);
				}

				if (opcion==6) {
					System.out.println("Ingrese posicion de la emisora que desea buscar");
					int posicion = teclado.nextInt();
					teclado.nextLine();
					radio.getFavorito(posicion);
					
				}

				
					

				

			}
		}

	}

