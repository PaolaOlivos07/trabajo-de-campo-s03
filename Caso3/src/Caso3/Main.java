package Caso3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
	    
	    System.out.print("¿Cuántos productos desea registrar? ");
	    int cantidadproductos=sc.nextInt();  
	    System.out.println();

	    

	    Producto[] productos= new Producto[cantidadproductos];
	    

	     

	    for(int i=0; i< cantidadproductos; i++){
	    	
		  System.out.println("Producto "+(i+1)+":");
	      System.out.print("Código: ");
	      int codigo=sc.nextInt();
	       
	      System.out.print("Nombre: ");
	      String nombre=sc.next();
	      
	      System.out.print("Precio: ");
	      double precio=sc.nextDouble();

	       
        
	      System.out.println();
	      productos[i] = new Producto(codigo, nombre, precio);

	    }
	    
	    Producto mayor=productos[0];
	    
	    for(Producto p:productos) {
	    	if(p.getPrecio() > mayor.getPrecio()) {
	    		mayor=p;
	    	}
	    }

	    System.out.println("Producto con el precio más alto:");
	    mayor.mostrar();

	
	   
	    sc.close();
	}

}