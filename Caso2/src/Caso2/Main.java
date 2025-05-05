package Caso2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
	    
	    System.out.print("¿Cuántas citas desea registrar? ");
	    int cantidadcitas=sc.nextInt();  
	    System.out.println();

	    

	    CitaMedica[] citas= new CitaMedica[cantidadcitas];
	    

	     

	    for(int i=0; i< cantidadcitas; i++){
	    	
		  System.out.println("Cita "+(i+1)+":");
	      System.out.print("Paciente: ");
	      String paciente=sc.next();
	       
	      System.out.print("Doctor: ");
	      String doctor=sc.next();
	      
	      System.out.print("Hora: ");
	      String hora=sc.next();

	       
        
	      System.out.println();
	      citas[i] = new CitaMedica(paciente, doctor, hora);

	    }
	  
	    System.out.println("Ingrese el nombre del paciente para buscar la cita:");
	    String buscar=sc.next();
	    System.out.println();

	    for (CitaMedica c : citas) {
            if (buscar.equals(c.getPaciente())) {
                System.out.println("Cita encontrada:");
                c.mostrar();
            }
        }
	    
	    
	    sc.close();

	}

}
