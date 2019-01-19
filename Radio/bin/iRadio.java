/*Martin Ortega 18020
Sara Zavala 18893
Algoritmos y Estructuras de datos
interface con los respectivos meotdos a itilizar
iRadio.java
*/

/**
 * @author user
 *
 */
public interface iRadio {
	public boolean encendidoRadio(); // metodo para encender radio
	public double subirFrecuencia(); // metodo para subir frecuencia
	public double bajarFrecuencia(); // metodo para bajar fracencia
	public void setFavorito(int posicion);//Metodo para agregar favorito
	public double getFavorito(int posicion);// metodo para obtener favorito de la lusta segun los listas
	public boolean cambiarAmFm();// metedo para cmambiar de FM A PM
}
