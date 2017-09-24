import java.util.Scanner;
/**
 * Pequeño sistema de adivinación.
 * 
 * @author Chompy129 
 * @version 1.0
 */
public class AdivinaMes{
	
    public static void main(String[] args){
		String[] meses= {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		String mesSecreto= meses[2];
		Scanner entradaS= new Scanner(System.in);
		String entradaUser= "";
		
		System.out.println("Inicia el programa: \"Adivinar mes\"");
		System.out.print("Adivine el mes secreto. Introduzca el nombre del mes: ");
		while(!entradaUser.equalsIgnoreCase(mesSecreto)){
			entradaUser= entradaS.nextLine();
			
			if(!entradaUser.equalsIgnoreCase(mesSecreto)){
				System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
			}
			else{
				System.out.println("¡Has acertado!");
			}
		}
	}
}
