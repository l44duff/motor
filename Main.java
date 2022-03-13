public class Main{
	public static void main(String[] args){
		//Motor miMotor = new Motor();
		//Puerta miPuertaD = new Puerta();
		//Puerta miPuertaI = new Puerta();
		Coche audi = new Coche();

		audi.puertaAbrir(2);
		audi.ventanaPuertaAbrir(2);
		System.out.println(audi);
		/*
		miMotor.encender();

		System.out.println("El motor del coche: "+ miMotor.getEncendido());
		System.out.println(miPuerta.getEstado());
		System.out.println(miPuerta.getVentanaPuerta().getEstado());
		miPuertaD.abrir();
		System.out.println(miPuerta);*/

		//no hace falta cerrar una puerta ya cerrada 
		
		/*---------------
		miPuerta.getVentanaPuerta().abrir();
		System.out.println(miPuerta);
		System.out.println("puerta derecha" + miPuertaD);
		//---------------

		miMotor.encender();
		System.out.println(miMotor);*/
//--------------------------------------------------------------------------------------
		//para utilizar varias veces un objeto de una clase creo 
		//una variable para facilitar el uso y asi, jugar con ella.
		/*Ventana ventanaDerCoxe = new Ventana();
		ventanaDerCoxe = miCoche.getPuertaD().getVentana();
		ventanaDerCoxe.abrir();
		ventanaDerCoxe.cerrar();
		System.out.println(ventanaDerCoxe);*/

		//ver estado de motor 
		//System.out.println(audi.getMotor());

		//ver estado de la puerta derecha 
		//System.out.println(audi.getPuertaD());

		//abrir puerta derecha 
		//audi.getPuertaD().abrir();

		//ventana de la puerta derecha
		//System.out.println(audi.getPuertaD().getVentanaPuerta());

		/*esto es para acceder de otra manera a la ventana de la puerta derecha
		a traves de una funcion que esta en coche^`````````*/
		//audi.abrirVentanaDerecha();
		//crear desde coche una funcion que permita abrir la puerta que yo elija
		
	}
}