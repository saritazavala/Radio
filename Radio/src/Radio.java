public class Radio implements iRadio{
	public boolean OnyOff = false;
	public boolean AMoFM = false;
	public double AMfreq = 530;
	public double FMfreq = 87.9;
	public int posicion = 0;
	public double [] favoritos = new double [12];
	
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
	
	public double subirFrecuencia() {
		if(!this.AMoFM && this.AMfreq < 1610) {
			this.AMfreq += 10;
			return this.AMfreq;
		}
		else if(!this.AMoFM && this.AMfreq > 1610) {
			this.AMfreq = 530;
			return this.AMfreq;
		}
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
	
	public void setFavorito(int posicion) {
		posicion -= 1;
		if(this.AMoFM) {
			favoritos[posicion] = this.FMfreq;
		}
		else if(!this.AMoFM) {
			favoritos[posicion] = this.AMfreq;
		}
	}
	
	public double getFavorito(int posicion) {
		posicion -= 1;
		if(!this.AMoFM && favoritos[posicion] < 1610 && favoritos[posicion] > 530) {
			this.AMfreq = favoritos[posicion];
			return this.AMfreq;
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
