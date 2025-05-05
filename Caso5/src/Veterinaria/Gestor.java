package Veterinaria;
import java.util.Scanner;
import java.util.ArrayList;
public class Gestor {
	static Scanner scanner=new Scanner(System.in);
	private ArrayList<Dueno>duenos=new ArrayList<>();
	public Gestor() {}
	
	public void Menu() {
		System.out.println("\n--- Menú Veterinaria ---");
		System.out.println("1. Agregar dueño");
		System.out.println("2. Registrar mascota a un dueño");
		System.out.println("3. Mostrar todos los dueños con sus mascotas");
		System.out.println("4. Mostrar mascotas mayores a cierta edad");
		System.out.println("5. Salir");
		System.out.print("Opción: ");

	}
	public void Agregardueno() {
		scanner.nextLine();
		System.out.print("Ingrese nombre del dueno");
		String dueaux=scanner.nextLine().trim();
		System.out.print("Ingrese DNI nombre del dueno");
		int dniaux=scanner.nextInt();
		Dueno nuevo=new Dueno(dueaux,dniaux);
		duenos.add(nuevo);
		System.out.println("Dueno agregada");
	}

	public void AsignarDuena() {
		scanner.nextLine();
		System.out.println("Ingrese nombre del dueño");
		System.out.println("Debe ser uno de la siguiente lista:");
			for(Dueno e:duenos) {
				e.mostrarDueno();
			}
		scanner.nextLine();
		String aux=scanner.nextLine().trim();
		for(int i=0;i<duenos.size();i++) {
			if(duenos.get(i).getNombre().equals(aux))
			{
				System.out.println("Ingrese nombre de la mascota");
				String masaux=scanner.nextLine();
				System.out.println("Ingrese tipo de la mascota");
				String tipaux=scanner.nextLine();
				System.out.println("Ingrese anios de la mascota");
				int anaux=scanner.nextInt();
				duenos.get(i).agregarmascota(masaux, tipaux, anaux);
				System.out.println("Mascota agregada");
			}
		}
		}

	public void Mostrartodo() {
		for(Dueno e:duenos) {
			e.mostrarDueno();
			System.out.println("Cuenta con las siguientes mascotas:");
			e.mostrarMascotas();
		}
	}
	public void Mostrarmayores() {
		System.out.println("Apartir de que edad quiere ver a las mascotas: ");
		int mayores=scanner.nextInt();
		for(Dueno e:duenos) {
			e.mayores(mayores);
		}
	}
	
}
