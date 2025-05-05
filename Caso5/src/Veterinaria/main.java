package Veterinaria;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Gestor gestor=new Gestor();
		int op;
		while(true) {
		gestor.Menu();
		op=scanner.nextInt();
		
		if(op==5) {
			break;
		}
		switch(op) {
		case 1:
			gestor.Agregardueno();
			break;
		case 2:
			gestor.AsignarDuena();
			break;
		case 3:
			gestor.Mostrartodo();
			break;
		case 4:
			gestor.Mostrarmayores();
			break;
		}
		}		
	}

}
