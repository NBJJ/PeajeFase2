import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Peaje extends Vehiculo{
	
	private int valorPeaje[] = new int [4];
	private int registroPeaje[] = new int [4];
	private int totales = 0 ;
	private int aux1=0,aux2=0,aux3=0;
	
	final static String ruta = "C:\\camion1.txt";
	 static Map<Integer, Vehiculo> mapFileContents = new HashMap<Integer, Vehiculo>();
	
	public  Peaje( Map<Integer, Vehiculo> mapFileContents) {
		this.mapFileContents = mapFileContents; 
	}
	
	public Peaje(String marca, int ejes, int toneladas,int turno, int patente, int tipo,int dia, int mes , int año ) {
		super(marca , ejes, toneladas, turno, patente , tipo,dia, mes, año);
		this.valorPeaje = valorPeaje;
	
	}
	public Peaje() {
	 
	}
	 
		public static Map<Integer, Vehiculo> GuardarDatosHashmap( ){
        
		Vehiculo objetos[] = new Vehiculo[10]; 
       // Map<Integer, Vehiculo> mapFileContents = new HashMap<Integer, Vehiculo>();
        BufferedReader br = null;
        
        try{
            
            //Crea objecto File
            File file = new File(ruta);
            
            //Crea el BufferedReader
            br = new BufferedReader( new FileReader(file) );
            
            String line = "";
           
           
         
            
            while ( (line = br.readLine()) != null){
  
                //Guardar en el arreglo parts todo lo que esté antes del ;
                String[] parts = line.split(";");
                
                //Guarda en las variables lo que lee del txt
                String marca = parts[0].trim();
                Integer ejes = Integer.parseInt( parts[1].trim());
                Integer toneladas = Integer.parseInt( parts[2].trim() );
                Integer turno  = Integer.parseInt( parts[3].trim() );
                Integer patente = Integer.parseInt(parts[4].trim());
                Integer tipo = Integer.parseInt(parts[5].trim());
                Integer dia = Integer.parseInt(parts[6].trim());
                Integer mes = Integer.parseInt(parts[7].trim());
                Integer año = Integer.parseInt(parts[8].trim());
               
                //agrega patente, atributos en HashMap si no están vacías
                   
               if(tipo == 1 ) {
            	    Camion c = new Camion(marca , ejes, toneladas, turno, patente , tipo,dia, mes, año);
            	    mapFileContents.put(patente, c);
            	   //System.out.println("Camion => " + mapFileContents.get(patente));
            	 
               }else if
            	   (tipo == 2) {
            		   Auto a = new Auto(marca, ejes, toneladas, turno, patente, tipo,dia, mes, año);
            		   
            		   mapFileContents.put(patente, a);
            		  //System.out.println("Auto => " + mapFileContents.get(patente));
            		   
            	   }else if(tipo == 3) {
            			   Motocicleta m = new Motocicleta(marca, ejes, toneladas, turno, patente,dia, tipo, mes, año);
            			   mapFileContents.put(patente, m);
            			  // System.out.println("Motocicleta => " + mapFileContents.get(patente));
            	   }
            }
             
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            
            //Cierre de BufferedReader
            if(br != null){
                try { 
                    br.close(); 
                }catch(Exception e){};
            }
        } 
    
        return mapFileContents;
        
    }
@Override
public int CalcularPeaje(int ejes , int toneladas) {
	// TODO Auto-generated method stub
	return 0;
}


	public void Turnos( int turno ) {
		Peaje a = new Peaje(); 
		
		System.out.println("Vehiculos del turno "+ turno +":");
		for(Entry<Integer, Vehiculo> entry : a.GuardarDatosHashmap().entrySet()){
			
			
			if(entry.getValue().getturno() == turno) {
				//System.out.println(entry.getValue().getMarca());
				System.out.println( entry.getKey() + " => " + entry.getValue().getMarca() + " " + entry.getValue().getturno());		
		    }
	    }	
	}

		public void mostrarRecaudacion(int turno , int opcion ) {
			Peaje a = new Peaje(); 
			int sumaTotal=0; 
			int sumaTotal1=0; 
			int sumaTotal2=0; 
			int sumaTotal3=0; 
			int j = 0;
			int autos=0;
			int motos=0; 
			int z = 0 ;
			for(Entry<Integer, Vehiculo> entry : a.GuardarDatosHashmap().entrySet()){
				
				Auto a1 = new Auto();
				Camion c1 = new Camion();
				Motocicleta m1 = new Motocicleta();
				if(opcion == 1) {
				//System.out.println(entry.getValue().getturno());
				
				if(entry.getValue().getturno() == turno) {
					
					if(entry.getValue().getTipo()== 1 ) { //Camion
						
						sumaTotal1 = sumaTotal1 + c1.CalcularPeaje(entry.getValue().getEjes(), entry.getValue().getToneladas()) ;
						//System.out.println(sumaTotal1);
						j++;
					}else if(entry.getValue().getTipo()==2) { //Auto
						sumaTotal2 = a1.CalcularPeaje() + sumaTotal2; 
						//System.out.println(sumaTotal2);
						autos++;
					}else if(entry.getValue().getTipo()==3) {//Motocicleta 
						sumaTotal3 = m1.CalcularPeaje() + sumaTotal3;
						//System.out.println(sumaTotal3);
						motos++;
					}
				}
			
			sumaTotal= (sumaTotal1 + sumaTotal2 + sumaTotal3) ; //suma total peajes de un turno
			valorPeaje[turno]=sumaTotal;
			registroPeaje[turno] =sumaTotal + registroPeaje[turno];
		
		}
			}
			if (opcion == 2){//Cerrar opc 1 
			System.out.println("La Recaudacion total fue : $"+ valorPeaje[turno] );
			System.out.println("**CERRANDO TURNO**");
			if(aux1 == 0 && turno == 1) {
				totales = totales + valorPeaje[turno];
				aux1++;
			}if(aux2 == 0 && turno == 2) {
				totales = totales + valorPeaje[turno];
				aux2++;
			}else if(aux3 == 0 && turno == 3) {
				totales = totales + valorPeaje[turno];
				aux3++;
			}
			
			
			valorPeaje[turno]=0;
			}else {
				
			
			System.out.println("Suma Total: "+sumaTotal2+"  han pasado "+autos+" Autos");//suma total de peajes auto
			System.out.println("Suma Total: "+sumaTotal3+"  han pasado "+motos+" Motos");//suma total de peajes motos
			System.out.println("Suma Total: "+sumaTotal1 + " han pasado " +j+ " Camiones");//suma total de peajes camiones
			valorPeaje[turno]=sumaTotal;
			System.out.println("Suma Total turno "+ turno + " es : $"+sumaTotal);
			}
			
			}
		
		
		public void Estadisticas() {
			
			Peaje a = new Peaje(); 
			System.out.println("---------------");
			System.out.print("Total Recaudado : ");
			System.out.println(totales);
			System.out.println("---------------");
			System.out.println();
			System.out.println("Registro Vehiculos dia/mes/año");
			System.out.println();
			for(Entry<Integer, Vehiculo> entry : a.GuardarDatosHashmap().entrySet()){
				
				System.out.println();
				System.out.println(entry.getValue().getMarca() + "=>" + entry.getValue().getdia() + "/" + entry.getValue().getmes() + "/" + entry.getValue().getaño()  );
				
			
			
			
			}
			
		}
		
		public void buscarPatente(int patente) {
			Peaje a = new Peaje();
			int aux = 0 ;
			for(Entry<Integer, Vehiculo> entry : a.GuardarDatosHashmap().entrySet()){
				if(entry.getValue().getPatente()==patente) {
					System.out.println("Marca Vehiculo => " +  entry.getValue().getMarca()  + " Patente => " + entry.getValue().getPatente());
					aux = 1;
			
				
				}
			}
			if(aux == 0 ) {
				System.out.println("La patente no fue encontrada");
			}
		}
		
		
		
		
}
