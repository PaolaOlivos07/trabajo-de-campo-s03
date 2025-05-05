package Caso4;


public class Estudiante {

	  private String nombre;
	  private int edad;
	  private double[] nota;

	  public Estudiante(String nombre, int edad,double[] nota){
	  this.nombre=nombre;
	  this.edad=edad;
	  this.nota=nota;
	  }


	  public String getNombre() {
	    return nombre;
	  }



	  public void setNombre(String nombres) {
	    this.nombre = nombres;
	  }


	  public int getEdad() {
	    return edad;
	  }



	  public void setEdad(int edad) {
	    this.edad = edad;
	  }


	  public double[] getNota() {
	    return nota;
	  }



	  public void setNota(double[] nota) {
	    this.nota = nota;
	  }

	  

	  public void mostrar(){
	    System.out.println("Nombre: "+ nombre+", Edad: "+edad+", Promedio: "+calcularPromedio());
	  }
	  
	  
	  public double calcularPromedio() {
	        double suma = 0;

	        for (double notas : nota) {
	            suma += notas;
	        }
	        return suma / nota.length;
	    }

	   



	}