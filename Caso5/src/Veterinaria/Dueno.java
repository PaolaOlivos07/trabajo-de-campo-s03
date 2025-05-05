package Veterinaria;
import java.util.ArrayList;
public class Dueno {
	
	private String nombre;
	private int dni;
	private ArrayList<Mascota> mascotas=new ArrayList<>();
	
	public Dueno() {}

	public Dueno(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	public void mostrarDueno() {
		System.out.printf("El dueño %s, cuenta con el DNi: %d\n",nombre,dni);
	}
	public void agregarmascota(String nom, String tip, int eda) {
		Mascota nuevo=new Mascota(nom,tip,eda);
		mascotas.add(nuevo);	
	}

	public void mostrarMascotas() {
		for(Mascota e:mascotas) {
			e.mostrardatos();
		}
	}
	public void mayores(int may) {
		for(Mascota e:mascotas) {
			if(e.getEdad()>=may) {
				e.mostrardatos();
			}
		}
	}
}
