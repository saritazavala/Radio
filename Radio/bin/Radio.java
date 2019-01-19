/*Martin Ortega 18020
Sara Zavala 18893
Algoritmos y Estructuras de datos
Clase crea objeto tipo Radio
Radio.java
*/

public class Radio implements iRadio{
	//Atributos
	public boolean OnyOff = false; // Variable para prender radio
	public boolean AMoFM = false; // Variable para cambiar estación
	public double AMfreq = 530; // Cambiar frecuencia AM
	public double FMfreq = 87.9; //Cambiar frecuencia PM
	public int posicion = 0; // Posicion para lista de favoritas
	public double [] favoritos = new double [12]; // lista de favoritas
	
	//Cada variable se instancea
	public boolean encendidoRadio() {
		if(this.OnyOff) {
			this.OnyOff = false;
		}
		else {
			this.OnyOff = true;
		}
		return this.OnyOff;
	}
	
	public boolean cambiarAmFm() {
		if(this.AMoFM) {
			this.AMoFM = false;
			return this.AMoFM;
		}
		else {
			this.AMoFM = true;
			return this.AMoFM;
		}
	}
	
	//M E T O D O S

	// Subir frecuencia
	public double subirFrecuencia() {
		if(!this.AMoFM && this.AMfreq < 1610) {
			this.AMfreq += 10;
			return this.AMfreq;
		}// Mientras este dentro del rango establecido en AM 
		// se va ir sumando 10 a cada frecuencia
		else if(!this.AMoFM && this.AMfreq > 1610) {
			this.AMfreq = 530;
			return this.AMfreq;
		}// Mientras este dentro del rango establecido en FM 
		// se va ir sumando 0.2 a cada frecuencia

		else if(this.AMoFM && this.FMfreq < 107.9) {
			this.FMfreq += 0.2;
			return this.FMfreq;
		}
		else if(this.AMoFM && this.FMfreq > 107.9) {
			this.FMfreq = 87.9;
			return this.FMfreq;
		}
		else {
			return 69.69;
		}
		
	}
	
	// ES IGUAL QUE EL METODO DE SUBIR FRECUENCIA. ESTOS SE DIFERENCIAN
	//YA QUE AQUI LA FRECUENCIA VA DISMINUYENDO
	public double bajarFrecuencia() {
		if(!this.AMoFM && this.AMfreq > 530) {
			this.AMfreq -= 10;
			return this.AMfreq;
		}
		else if(!this.AMoFM && this.AMfreq < 530) {
			this.AMfreq = 1610;
			return this.AMfreq;
		}
		else if(this.AMoFM && this.FMfreq > 87.9) {
			this.FMfreq -= 0.2;
			return this.FMfreq;
		}
		else if(this.AMoFM && this.FMfreq < 87.9) {
			this.FMfreq = 107.9;
			return this.FMfreq;
		}
		else {
			return 420.42;
		}
	}

	// C O L O C A R   C O M O    F A V O R I T O
	// Se le pedirá introducir  un int para la comletacion de este metodo
	/* (non-Javadoc)
	 * @see iRadio#setFavorito(int)
	 */
	public void setFavorito(int posicion) {
		posicion -= 1;
		if(this.AMoFM) {
			favoritos[posicion] = this.FMfreq; //Si el radop se encuentra en FM
			// La posicion se guardará con la estacion FM dicha
		}
		else if(!this.AMoFM) {
			favoritos[posicion] = this.AMfreq;
			//Si el radop se encuentra en FM
			// La posicion se guardará con la estacion AM dicha
		}
	}
	

	//O B T E N E R  F A V O R I T O
	// Se le pedirá introducir  un int para la comletacion de este metodo
	public double getFavorito(int posicion) {
		posicion -= 1;
		if(!this.AMoFM && favoritos[posicion] < 1610 && favoritos[posicion] > 530) {
			this.AMfreq = favoritos[posicion];
			return this.AMfreq;
			// Se retornará el valor que se encuentra en la lista de favoritos
		//en el espacio dicho previamente dentro del rango, ya sea FM o AM.
		}
		else if(this.AMoFM && favoritos[posicion] < 107.9 && favoritos[posicion] > 87.9){
			this.FMfreq = favoritos[posicion];
			return this.FMfreq;
		}
		else {
			return 87.9;
		}
	}	
}
