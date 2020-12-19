
public class Auto extends Vehiculo {

	public Auto(String marca,int ejes, int toneladas, int turno,  int patente , int tipo,int dia, int mes, int año  ) {
		super(marca,ejes, toneladas, turno, patente, tipo,dia, mes, año);
		
	}
	
	public Auto() {
		
	}
	
	public  int CalcularPeaje() {
		
		int PagoTotal = 0; //Inicialisamos el acumulador a usar .
		//Condicionales dependiendo de cuantos ejes y toneladas tiene el camion. 
		PagoTotal = 4400;
		
		return PagoTotal; 
	
	}

	@Override
	public int CalcularPeaje(int ejes, int toneladas) {
		// TODO Auto-generated method stub
		return 0;
	}
}
