
public class Motocicleta extends Vehiculo {

	public Motocicleta(String marca,int ejes, int toneladas, int turno,  int patente , int tipo,int dia, int mes, int año ) {
		super(marca,ejes, toneladas, turno, patente, tipo,dia, mes, año);
		
	}

	public Motocicleta() {
		
	}
	
	public  int CalcularPeaje() {
		
		int PagoTotal = 0; 
		PagoTotal = 4400; 
		
		return PagoTotal; 
	
	}

	@Override
	public int CalcularPeaje(int ejes, int toneladas) {
		// TODO Auto-generated method stub
		return 0;
	}
}
