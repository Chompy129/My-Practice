import java.util.Scanner;
import java.util.Random;
/**
 * Testea el funcionamiento de Adivinar
 * 
 * @author Chompy129
 * @version 1.0
 */
public class Adivinar{
    public static void main(String [] args){
        Random aleatorio= new Random();
        int numeroMaquina= aleatorio.nextInt(100);
        Scanner entradaS= new Scanner(System.in);
        int numeroUsuario= 0;
        int intentos= 0;
        
        System.out.println("Inicia el juego. Tienes 10 intentos.");
        System.out.print("Elige un número: ");
        while(numeroUsuario != numeroMaquina && intentos < 10){
            numeroUsuario= Integer.parseInt(entradaS.nextLine());            
            intentos++;
			
            if(intentos == 10){
				System.out.println("Ha superado el número de intentos.");
			}    
            else if(numeroUsuario == numeroMaquina){
                System.out.println("¡Has acertado!"); 
            }
            else if(numeroUsuario > numeroMaquina){
                System.out.print("El número es muy alto. Intente con uno mas bajo: ");
            }
            else if(numeroUsuario < numeroMaquina){
                System.out.print("El número es muy bajo. Intente con uno mas alto: ");
            }            
        }
		System.out.println("Gracias por jugar");
    }
}