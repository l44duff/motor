public class Motor{
	private boolean encendido;

//constructores
	public Motor(){
		// es mejor poner estado en vez de encendido
		//ya que los otros metodos tmb son con la palabra "estado"
		//se liaria la maquina si no tendria el "this"
		this.encendido = false;
	}
//gets y sets 

	public boolean getEncendido(){
		return this.encendido;
	}
//métodos
	public void encender(){
		this.encendido = true;
	}

	public void apagar(){
		this.encendido = false;
	}
	public String toString(){
		String resultado = "Motor : Apagado";
		if(this.encendido){
			resultado = "Motor : Encendido";
		}
		return resultado;
	}
}