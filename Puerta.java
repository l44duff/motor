public class Puerta{
	private boolean estado;
	private Ventana ventanaPuerta;
//constructor 
	public Puerta(){
		this.estado = false;
		this.ventanaPuerta = new Ventana();
	}

	public boolean getEstado(){
		return this.estado;
	}
	public Ventana getVentanaPuerta(){
		return this.ventanaPuerta;
	}

	//funciones 
	public void abrir(){
		this.estado = true;
	}
	public void cerrar(){
		this.estado = false;
	}
	public String toString(){
		String resultado = "Puerta : Cerrada";
		if(this.estado){
			resultado = "Puerta : Abierta";
		}
		return resultado + " | "  +this.ventanaPuerta;
	}

}
/*una clase ventana metida en una clase puerta, como si fuese la puerta del coche*/
/*crea una clase que se llame coche con los atributos de puerta izquierda derecha 
ventana derecha e izquierda y el motor */