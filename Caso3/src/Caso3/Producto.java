package Caso3;


public class Producto {

	  private int codigo;
	  private String nombre;
	  private double precio;

    public Producto() {
		  
    }
	  
    
	public Producto(int codigo, String nombre, double precio){
      super();
	  this.codigo=codigo;
	  this.nombre=nombre;
	  this.precio=precio;
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
    public void mostrar(){
	    System.out.println("Código: "+ codigo+", Nombre: "+nombre+", Precio: "+precio);

    }
	  
	 
	  


	

}