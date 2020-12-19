

public abstract class Vehiculo {
	
	protected String marca;
	protected int ejes;
	protected int toneladas;
	protected int turno ;
	protected int patente;
	protected int tipo; 
	protected int dia; 
	protected int mes ; 
	protected int año; 
	
    public Vehiculo(String marca , int ejes, int  toneladas, int turno,  int patente , int tipo, int dia, int mes , int año) {
    	this.marca = marca;
		this.ejes = ejes;
		this.toneladas = toneladas;
		this.turno = turno ; 
		this.patente = patente;
		this.tipo = tipo; 
		this.dia = dia;
		this.mes = mes ; 
		this.año = año ; 
		
	}
    public Vehiculo() {
    	
    }
	
	//Metodos utilis como get y set . 
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getToneladas() {
		return toneladas;
	}
	public void setToneladas(int toneladas) {
		this.toneladas = toneladas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPatente() {
		return patente;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo; 
	}
	public int getTipo() {
		return tipo;
	}
	
	public void setturno(int turno) {
		this.turno = turno; 
	}
	public int getturno() {
		return turno;
	}
	
	public void setdia(int dia) {
		this.dia = dia; 
	}
	public int getdia() {
		return dia;
	}
	
	public void setmes(int mes) {
		this.mes = mes; 
	}
	public int getmes() {
		return mes;
	}
	
	public void setaño(int año) {
		this.año = año; 
	}
	public int getaño() {
		return año;
	}
	
	
	
	public abstract int CalcularPeaje(int ejes , int toneladas);
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", ejes=" + ejes + ", toneladas=" + toneladas + ", turno=" + turno
				+ ", patente=" + patente + ", tipo=" + tipo + ", mes=" + mes + ", año=" + año + "]";
	}
	
	
	
	
	
	
	
}


