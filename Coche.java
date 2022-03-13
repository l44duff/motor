public class Coche{
	private Puerta puertaD;
	private Puerta puertaI;
	private Puerta puertaICop;
	private Puerta puertaDCop;
	private Motor motorCoche;

	public Coche(){
		this.puertaD = new Puerta();
		this.puertaI = new Puerta();
		this.puertaICop = new Puerta();
		this.puertaDCop = new Puerta();
		this.motorCoche = new Motor();
	}
	public Puerta getPuertaD(){
		return this.puertaD;
	}
	public Puerta getPuertaI(){
		return this.puertaI;
	}
	public Puerta getPuertaICop(){
		return this.puertaICop;
	}	
	public Puerta getPuertaDCop(){
		return this.puertaDCop;
	}
	public Motor getMotor(){
		return this.motorCoche;
	}
	//funcion ^```````
	public void abrirVentanaDerecha(){
		this.puertaD.getVentanaPuerta().abrir();
	}
	public void puertaAbrir(int numeroPuerta){
		if(numeroPuerta==1){
			this.puertaI.abrir();
		}else if(numeroPuerta==2){
			this.puertaD.abrir();
		}else if(numeroPuerta==3){
			this.puertaICop.abrir();
		}else {
			this.puertaDCop.abrir();
		}			
	}
	public void ventanaPuertaAbrir(int numeroVentana){
		if(numeroVentana==1){
			this.puertaI.getVentanaPuerta().abrir();
		}else if(numeroVentana==2){
			this.puertaD.getVentanaPuerta().abrir();				
		}
	}
	public String toString(){
		return this.motorCoche + "\nIzquierda " + this.puertaI + "\nDerecha " + this.puertaD + "\nCopiloto Izquierda " + this.puertaICop + "\nCopiloto Derecha " + this.puertaDCop;
	}
}