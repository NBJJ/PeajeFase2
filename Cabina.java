import java.util.*;
import java.util.Map.Entry;

//MAIN DEL PROYECTO

public class Cabina {
	public static void main(String arg[]){
		
		//Creamos un objeto peaje para enviar los parámetros iniciales 
		Peaje peaje1 = new Peaje();
		Menu menu = new Menu();
		menu.menu();
		peaje1.GuardarDatosHashmap();
	
		
	}	
	
}
