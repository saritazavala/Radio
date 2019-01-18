public class Radio implements iRadio{
	public boolean OnyOff = false;
	public boolean AMoFM = false;
	public double AMfreq = 530;
	public double FMfreq = 87.9;
	public int posicion = 0;
	public double [] favoritos = new double [12];
	
	public boolean getOnyOff() {
		return OnyOff;
	}
	
	public boolean getAMoFm() {
		return AMoFM;
	}
	
	public double getAMfreq() {
		return AMfreq;
	}
	
	public double getFMfreq() {
		return FMfreq;
	}
	
	public int getPosicion() {
		return posicion;
	}
	
	public boolean encendidoRadio() {
		boolean onoff=getOnyOff();
		if(onoff) {
			onoff = false;
		}
		else {
			onoff = true;
		}
		return onoff;
	}
	
	public boolean cambiarAmFm() {
		boolean amofm = getAMoFm();
		if(amofm) {
			amofm = false;
			return amofm;
		}
		else {
			amofm = true;
			return amofm;
		}
	}
	
	public double subirFrecuencia() {
		boolean amofm = getAMoFm();
		double amfreq = getAMfreq();
		double fmfreq = getFMfreq();
		if(amofm == false && amfreq < 1610) {
			amfreq += 10;
			return amfreq;
		}
		else if(!amofm && amfreq > 1610) {
			amfreq = 530;
			return amfreq;
		}
		else if(amofm && fmfreq < 107.9) {
			fmfreq += 0.2;
			return fmfreq;
		}
		else if(amofm && fmfreq > 107.9) {
			fmfreq = 87.9;
			return fmfreq;
		}
		else {
			return 69.69;
		}
		
	}
	
	public double bajarFrecuencia() {
		boolean amofm = getAMoFm();
		double amfreq = getAMfreq();
		double fmfreq = getFMfreq();
		if(!amofm && amfreq > 530) {
			amfreq -= 10;
			return amfreq;
		}
		else if(!amofm && amfreq < 530) {
			amfreq = 1610;
			return amfreq;
		}
		else if(amofm && fmfreq > 87.9) {
			fmfreq -= 0.2;
			return fmfreq;
		}
		else if(amofm && fmfreq < 87.9) {
			fmfreq = 107.9;
			return fmfreq;
		}
		else {
			return 420.42;
		}
	}
	
	public void setFavorito(int posicion) {
		boolean amofm = getAMoFm();
		double amfreq = getAMfreq();
		double fmfreq = getFMfreq();
		posicion -= 1;
		if(amofm) {
			favoritos[posicion] = fmfreq;
		}
		else if(!amofm) {
			favoritos[posicion] = amfreq;
		}
	}
	
	public double getFavorito(int posicion) {
		boolean amofm = getAMoFm();
		double amfreq = getAMfreq();
		double fmfreq = getFMfreq();
		posicion -= 1;
		if(!amofm && favoritos[posicion] < 1610 && favoritos[posicion] > 530) {
			amfreq = favoritos[posicion];
			return amfreq;
		}
		else if(amofm && favoritos[posicion] < 107.9 && favoritos[posicion] > 87.9){
			fmfreq = favoritos[posicion];
			return fmfreq;
		}
		else {
			return 3.33;
		}
	}
	
	
}
