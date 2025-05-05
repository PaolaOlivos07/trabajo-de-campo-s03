package Caso4;

import java.util.Scanner;

public class Main {

	  public static void main (String [] args){

	    Scanner sc= new Scanner(System.in);
	    
	    System.out.print("¿Cuántos estudiantes desea registrar? ");
	    int cantidadestudiantes=sc.nextInt();  
	    
	    System.out.print("¿Cuántas notas por estudiante? ");
	    int cantidadnotas=sc.nextInt();  
	    System.out.println();

	    

	    Estudiante[] estudiantes= new Estudiante[cantidadestudiantes];
	    

	     

	    for(int i=0; i< estudiantes.length; i++){
	    	
		  System.out.println("Estudiante "+(i+1)+":");

	      System.out.print("Nombre: ");

	      String nombre=sc.next();

	       

	      System.out.print("Edad:");

	      int edad=sc.nextInt();

	       
          double[] notas = new double[cantidadnotas];


	      
	      for(int j=0; j< cantidadnotas; j++){

		      System.out.print("N"+(j+1)+": ");

		      notas [j] =sc.nextDouble();
		      
	       
		    } 
	      System.out.println();
          estudiantes[i] = new Estudiante(nombre, edad, notas);

	    }

	    System.out.println("----Estudiantes aprobados (promedio>14)---- ");

	    
	    for (Estudiante e : estudiantes) {
	    	double prom = e.calcularPromedio();

	        if (prom > 14) {
	            e.mostrar();
	        }
	    }
	    
	   
	    
        
	}
	     
}
	


