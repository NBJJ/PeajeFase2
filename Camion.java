
public class Camion extends Vehiculo{
	
	private int toneladas;

	public Camion(int ejes, int toneladas, String marca, int patente , int tipo) {
		super(ejes,toneladas, marca, patente , tipo);
		this.toneladas = toneladas;
	}
	

	public  int CalcularPeaje(int ejes , int toneladas) {
		
		int PagoTotal = 0; //Inicialisamos el acumulador a usar .
		//Condicionales dependiendo de cuantos ejes y toneladas tiene el camion. 
		if(ejes<=2) {   
    		PagoTotal=4400+600*toneladas; 
    	}else {
    		if(ejes>2){
    			PagoTotal=7800+600*toneladas;
    		}
    	}
		
		return PagoTotal; 
	
	}
}
