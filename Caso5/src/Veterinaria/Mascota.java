package Veterinaria;

public class Mascota {
	private String nombre;
	private String tipo;
	private int edad;

	public Mascota() {}

	public Mascota(String nombre, String tipo, int edad) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void mostrardatos() {
		System.out.printf("La mascota %s, del tipo %s, cuenta con %d anios \n",nombre,tipo,edad);
	}
}
