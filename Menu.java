import java.util.Scanner;
import java.util.Map; 
public class Menu {


	
	public  void menu(){
		int opc = 0 ;
		Peaje cliente = new Peaje(); 
		do {
		
		System.out.println("Bienvenido al programa");
		 System.out.println("1 : Acceder a un turno : ");
		 System.out.println("2 : Mostrar Estadistica mes/año: ");
		 System.out.println("3 : Buscar por patente");
		 System.out.println("4 : **Finalizar programa**");
		 Scanner teclado = new Scanner(System.in);
		 opc = teclado.nextInt();  //Lectura desde el teclado
		 
		 
		 
		 switch (opc) {
		 
		 case 1 : // Acceder al turno  : 
			 System.out.println("Ingrese turno para acceder : ");
			  int opc1 = 0;
				opc1 = teclado.nextInt(); 
				
			  if(opc1 == 1) {
				  cliente.Turnos(opc1); 
				  int opc2 = 0 ;
				  do {
				  System.out.println();
				  System.out.println("1 ) Ver recaudacion total de turno 1: ");
				  System.out.println("2 ) Cerrar turno");
				 
				  opc2 = teclado.nextInt();
				  if(opc2 == 1) {
					  cliente.mostrarRecaudacion(1,opc2);
					  
				  }else {
					  if(opc2 == 2) {
						  System.out.println("Cerrando turno : ");
						 cliente.mostrarRecaudacion(1, opc2);
						 
					  }
				  }
				  } while(opc2 != 2);
				  //turno 2
			  }else if(opc1 == 2 ) {
						
								  cliente.Turnos(opc1); 
								  int opc2 = 0 ;
								  do {
								  System.out.println();
								  System.out.println("1 ) Ver recaudacion total de turno 2: ");
								  System.out.println("2 ) Cerrar turno");
								 
								  opc2 = teclado.nextInt();
								  if(opc2 == 1) {
									  cliente.mostrarRecaudacion(2,opc2);
									  
								  }else {
									  if(opc2 == 2) {
										  System.out.println("Cerrando turno : ");
										 cliente.mostrarRecaudacion(2, opc2);
										 
									  }
								  }
								  } while(opc2 != 2);
								  
		
					
			  }
				 else if(opc1 == 3 ) {
						
					  cliente.Turnos(opc1); 
					  int opc2 = 0 ;
					  do {
					  System.out.println();
					  System.out.println("1 ) Ver recaudacion total de turno 3: ");
					  System.out.println("2 ) Cerrar turno");
					 
					  opc2 = teclado.nextInt();
					  if(opc2 == 1) {
						  cliente.mostrarRecaudacion(3,opc2);
						  
					  }else {
						  if(opc2 == 2) {
							  System.out.println("Cerrando turno : ");
							 cliente.mostrarRecaudacion(3, opc2);
							 
						  }
					  }
					  } while(opc2 != 2);
				 }  
				break; 
				
				case 2: 
					cliente.Estadisticas();
					
				break;
				
				case 3:
					int patente = 0 ;
					System.out.println("Ingrese la Patente a buscar");
					 patente =  teclado.nextInt();
					cliente.buscarPatente(patente);
					break;
					
				case 4 : 
					System.out.println("Finalizando programa...");
					
					break;
					
				
			 } //SWITCH
		}while(opc != 4); 
	}
}

		
	

