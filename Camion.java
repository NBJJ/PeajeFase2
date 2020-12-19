
public class Camion extends Vehiculo{
	
	private int toneladas;

	public Camion(String marca,int ejes, int toneladas, int turno,  int patente , int tipo, int dia, int mes, int año) {
		super(marca,ejes, toneladas, turno, patente, tipo,dia, mes, año);
		this.toneladas = toneladas;
	}
	
	public Camion() {
		
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

